/**
 *
 */
package eu.europa.ema.phv.messagehandler;

import eu.europa.ema.phv.common.exception.UnexpectedResultException;
import eu.europa.ema.phv.common.util.JmsCamelUrl;
import eu.europa.ema.phv.messagehandler.constants.MessageConstants;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spring.SpringRouteBuilder;
import org.xml.sax.SAXParseException;

import javax.inject.Inject;

/**
 * Route definition for the Message Handler component.  This defines the main workflow for the incoming messages
 * This Router 	reads the messages from source interface like JMS or file system
 * a transaction is used or started
 * messaged is parsed into JAXB objects, which are basically ICSR2 entity classes
 * On parsing exception the messages is rerouted to invalid message handling which extracts meta data using reg exp and sends nack
 * the valid message is enriched by adding required headers like receiverid, received date, validation status etc
 * the enriched message is routed to two parallel routes 1. message persistence 2. ADR Parser destination
 * if routes cannot be determined an excpetion is thrown
 *
 * @author Vinay Rao
 * @version $Revision: 1.1 $ (cvs revision)
 * @revisionDate $Date: 2003/12/19 10:51:34 12 Jun 2014 $
 * @since 12 Jun 2014 (creation date)
 */
public class MessageHandlerRouter extends SpringRouteBuilder {

    // Component internal camel route
    private static final String VALID_EP = "direct:valid";

    private static final String INVALID_EP = "direct:invalid";

    private static final String MESSAGE_STORE_EP = "direct:messageStore";

    private static final String CONTINUE_ROUTING_EP = "direct:continueRouting";

    //the header used for web trader/evhuman routing
    private static final String HEADER_REROUTING_RECEIVER = "receiver";

    //destination url conatainer
    @Inject
    private JmsCamelUrl camelUrl;

    /**
     * The main route configurer called by the camel context
     */
    @Override
    public void configure() throws Exception {
        //the JAXB object root creation
        JaxbDataFormat jaxb = new JaxbDataFormat("eu.europa.ema.phv.common.model.adrhuman.icsrr2");
        //jaxb.setSchema("schema/icsr21xml.dtd"); //point to the correct dtd instead of embedded dtd
        //    	jaxb.setEncoding("iso-10646-1"); //ICSR2 messages are utf-16 encoded

        //reroute to invalid message handler on any parser exception
        onException(SAXParseException.class).handled(true).to(INVALID_EP);

        //@formatter:off
    	//starting route
    	from(camelUrl.getGatewayHumanAdr())
            .transacted()
            //add UUID and other intial headers that will be used by both valid and invalid path
            .processRef("HeaderProcessor")
            .unmarshal(jaxb)
            .log("Jaxb Validation and transformation complete ")
            .to(VALID_EP);
        //@formatter:on

        //call these methods to configure alternative routes
        invalidXmlBranch();
        validXmlBranch();
    }

    /**
     * Configures the invalid message route
     */
    private void invalidXmlBranch() {
        //@formatter:off        
        from(INVALID_EP)
            .transacted()
            .log("Jaxb parsing failed.. extracting meta data from the payload")
            .processRef("MetadataExtractor")
            .log("Meta data extracted from the invlaid message")
            .to(MESSAGE_STORE_EP)
            .beanRef("AckTranslator", true)
        .to(camelUrl.getOutboundMessage());
        //@formatter:on        
    }

    /**
     * Configures the valid message route
     * enriches the message, persists it and delivers to the next configures stage
     */
    private void validXmlBranch() {
        //@formatter:off        
        from(VALID_EP)
            .transacted().log("Message is valid.. enriching")
            .beanRef("MetadataEnricher", true) //add some headers for valid message rerouting 
            .log("Routing enriched message ...")
            .multicast()
                .to(MESSAGE_STORE_EP)
                .to(CONTINUE_ROUTING_EP);
        //@formatter:on

        //@formatter:off
        //the message persistent route
        from(MESSAGE_STORE_EP)
            .transacted()
            .beanRef("MessageToEntityMapper", "mapMessageToEntity",true)
            .log("Persisting the message meta data")
         .to("jpa://?persistenceUnit=messageJTA");
        // @formatter:on

        //@formatter:off        
        from(CONTINUE_ROUTING_EP).log("Message received for rerouting")
             .filter().method("MessageFilterHelper", "isNotWebTrader") //add a processor to check with db to see if the receiver is not web trader
             .log("Messsage filtered to exclude WebTrader messages")
             .choice()
                .when(header(MessageConstants.MESSAGE_HEADER_RECEIVER).isEqualTo(MessageConstants.MESSAGE_RECEIVER_EVHUMAN)) //EMA
                    .beanRef("MessageEnricher", true)
                	.log("Routing the valid enriched message to Human ADR Parser for receiever "+ header(MessageConstants.MESSAGE_HEADER_RECEIVER) )
                	.to(camelUrl.getAdrParserHuman())
                .when(header(MessageConstants.MESSAGE_HEADER_RECEIVER).isNotEqualTo(MessageConstants.MESSAGE_RECEIVER_EVHUMAN)) // NCA and other receivers
                    .beanRef("RoutingTranslator", true)
                    .log("Routing web trader messages to storage handler for receiver " + header(MessageConstants.MESSAGE_HEADER_RECEIVER))
                    .to(camelUrl.getOutboundMessage())
                .otherwise()
                	.log("Exception") //as we have filtered we should not reach here
                    .throwException(new UnexpectedResultException("Message not recognized by the router"))
                .endChoice()
                .end();
        // @formatter:on
    }

}

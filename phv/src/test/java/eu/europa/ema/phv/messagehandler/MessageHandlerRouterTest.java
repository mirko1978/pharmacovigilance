package eu.europa.ema.phv.messagehandler;

import static org.junit.Assert.*;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.inject.Inject;

import org.apache.camel.CamelContext;
import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.util.FileUtil;
import org.apache.cxf.helpers.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import eu.europa.ema.phv.adrparserhuman.AdrParserHumanRouter;
import eu.europa.ema.phv.common.util.JmsCamelUrl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/camel-context-test.xml")
public class MessageHandlerRouterTest  extends AbstractJUnit4SpringContextTests {
	
    @Inject
    private JmsCamelUrl camelUrl;

    @Inject
    private MessageHandlerRouter router;

    @Inject
    private CamelContext context;

    @EndpointInject(uri = "mock:outbound")
    protected MockEndpoint outboundEndpoint;
    
    @EndpointInject(uri = "mock:adrParser")
    protected MockEndpoint adrParserEndpoint;
    

    @Produce(uri = "direct:start")
    protected ProducerTemplate template;


    
    @BeforeClass
    public static void springProfile() {
        System.setProperty("spring.profiles.active", "dev");
    }


	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		context.stop();
	}

	private void readSingleMessage() throws Exception{
		camelUrl.setGatewayHumanAdr("file:/devtools/GitLocalRepo/pharmacovigilance/phv/src/test/resources/data?fileName=icsr-single.xml&delete=false");
		camelUrl.setOutboundMessage("mock:outbound");
		camelUrl.setAdrParserHuman("mock:adrParser");
		context.addRoutes(router);
		context.start();        
	}
	
	private void readMultipleReportsMessage() throws Exception{
		camelUrl.setGatewayHumanAdr("file:/devtools/GitLocalRepo/pharmacovigilance/phv/src/test/resources/data?fileName=icsr-multiple.xml&delete=false&consumer.delay=10000&consumer.useFixedDelay=true");
		camelUrl.setOutboundMessage("mock:outbound");
		camelUrl.setAdrParserHuman("mock:adrParser");
		context.addRoutes(router);
		context.start();        
	}
	
    @Test
    @DirtiesContext
	public void testSingleReport() throws Exception {
    	readSingleMessage();
		adrParserEndpoint.setMinimumExpectedMessageCount(1);
	}

    //@Test
    @DirtiesContext
	public void testMultipleReports() throws Exception {
    	readMultipleReportsMessage();
		adrParserEndpoint.setMinimumExpectedMessageCount(12);
	}
    
}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.20 at 05:38:27 PM BST 
//


package eu.europa.ema.phv.common.model.adrhuman.icsrr2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messagetype",
    "messageformatversion",
    "messageformatrelease",
    "messagenumb",
    "messagesenderidentifier",
    "messagereceiveridentifier",
    "messagedateformat",
    "messagedate"
})
@XmlRootElement(name = "ichicsrmessageheader")
public class Ichicsrmessageheader
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lang;
    @XmlElement(required = true)
    protected Messagetype messagetype;
    @XmlElement(required = true)
    protected Messageformatversion messageformatversion;
    @XmlElement(required = true)
    protected Messageformatrelease messageformatrelease;
    @XmlElement(required = true)
    protected Messagenumb messagenumb;
    @XmlElement(required = true)
    protected Messagesenderidentifier messagesenderidentifier;
    @XmlElement(required = true)
    protected Messagereceiveridentifier messagereceiveridentifier;
    @XmlElement(required = true)
    protected Messagedateformat messagedateformat;
    @XmlElement(required = true)
    protected Messagedate messagedate;

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the messagetype property.
     * 
     * @return
     *     possible object is
     *     {@link Messagetype }
     *     
     */
    public Messagetype getMessagetype() {
        return messagetype;
    }

    /**
     * Sets the value of the messagetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Messagetype }
     *     
     */
    public void setMessagetype(Messagetype value) {
        this.messagetype = value;
    }

    /**
     * Gets the value of the messageformatversion property.
     * 
     * @return
     *     possible object is
     *     {@link Messageformatversion }
     *     
     */
    public Messageformatversion getMessageformatversion() {
        return messageformatversion;
    }

    /**
     * Sets the value of the messageformatversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Messageformatversion }
     *     
     */
    public void setMessageformatversion(Messageformatversion value) {
        this.messageformatversion = value;
    }

    /**
     * Gets the value of the messageformatrelease property.
     * 
     * @return
     *     possible object is
     *     {@link Messageformatrelease }
     *     
     */
    public Messageformatrelease getMessageformatrelease() {
        return messageformatrelease;
    }

    /**
     * Sets the value of the messageformatrelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link Messageformatrelease }
     *     
     */
    public void setMessageformatrelease(Messageformatrelease value) {
        this.messageformatrelease = value;
    }

    /**
     * Gets the value of the messagenumb property.
     * 
     * @return
     *     possible object is
     *     {@link Messagenumb }
     *     
     */
    public Messagenumb getMessagenumb() {
        return messagenumb;
    }

    /**
     * Sets the value of the messagenumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Messagenumb }
     *     
     */
    public void setMessagenumb(Messagenumb value) {
        this.messagenumb = value;
    }

    /**
     * Gets the value of the messagesenderidentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Messagesenderidentifier }
     *     
     */
    public Messagesenderidentifier getMessagesenderidentifier() {
        return messagesenderidentifier;
    }

    /**
     * Sets the value of the messagesenderidentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Messagesenderidentifier }
     *     
     */
    public void setMessagesenderidentifier(Messagesenderidentifier value) {
        this.messagesenderidentifier = value;
    }

    /**
     * Gets the value of the messagereceiveridentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Messagereceiveridentifier }
     *     
     */
    public Messagereceiveridentifier getMessagereceiveridentifier() {
        return messagereceiveridentifier;
    }

    /**
     * Sets the value of the messagereceiveridentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Messagereceiveridentifier }
     *     
     */
    public void setMessagereceiveridentifier(Messagereceiveridentifier value) {
        this.messagereceiveridentifier = value;
    }

    /**
     * Gets the value of the messagedateformat property.
     * 
     * @return
     *     possible object is
     *     {@link Messagedateformat }
     *     
     */
    public Messagedateformat getMessagedateformat() {
        return messagedateformat;
    }

    /**
     * Sets the value of the messagedateformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Messagedateformat }
     *     
     */
    public void setMessagedateformat(Messagedateformat value) {
        this.messagedateformat = value;
    }

    /**
     * Gets the value of the messagedate property.
     * 
     * @return
     *     possible object is
     *     {@link Messagedate }
     *     
     */
    public Messagedate getMessagedate() {
        return messagedate;
    }

    /**
     * Sets the value of the messagedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Messagedate }
     *     
     */
    public void setMessagedate(Messagedate value) {
        this.messagedate = value;
    }

}

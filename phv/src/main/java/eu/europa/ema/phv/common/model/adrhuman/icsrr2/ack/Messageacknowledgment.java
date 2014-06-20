//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.20 at 01:13:21 PM BST 
//


package eu.europa.ema.phv.common.model.adrhuman.icsrr2.ack;

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
    "icsrmessagenumb",
    "localmessagenumb",
    "icsrmessagesenderidentifier",
    "icsrmessagereceiveridentifier",
    "icsrmessagedateformat",
    "icsrmessagedate",
    "transmissionacknowledgmentcode",
    "parsingerrormessage"
})
@XmlRootElement(name = "messageacknowledgment")
public class Messageacknowledgment {

    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lang;
    @XmlElement(required = true)
    protected Icsrmessagenumb icsrmessagenumb;
    protected Localmessagenumb localmessagenumb;
    @XmlElement(required = true)
    protected Icsrmessagesenderidentifier icsrmessagesenderidentifier;
    @XmlElement(required = true)
    protected Icsrmessagereceiveridentifier icsrmessagereceiveridentifier;
    @XmlElement(required = true)
    protected Icsrmessagedateformat icsrmessagedateformat;
    @XmlElement(required = true)
    protected Icsrmessagedate icsrmessagedate;
    @XmlElement(required = true)
    protected Transmissionacknowledgmentcode transmissionacknowledgmentcode;
    protected Parsingerrormessage parsingerrormessage;

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
     * Gets the value of the icsrmessagenumb property.
     * 
     * @return
     *     possible object is
     *     {@link Icsrmessagenumb }
     *     
     */
    public Icsrmessagenumb getIcsrmessagenumb() {
        return icsrmessagenumb;
    }

    /**
     * Sets the value of the icsrmessagenumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Icsrmessagenumb }
     *     
     */
    public void setIcsrmessagenumb(Icsrmessagenumb value) {
        this.icsrmessagenumb = value;
    }

    /**
     * Gets the value of the localmessagenumb property.
     * 
     * @return
     *     possible object is
     *     {@link Localmessagenumb }
     *     
     */
    public Localmessagenumb getLocalmessagenumb() {
        return localmessagenumb;
    }

    /**
     * Sets the value of the localmessagenumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Localmessagenumb }
     *     
     */
    public void setLocalmessagenumb(Localmessagenumb value) {
        this.localmessagenumb = value;
    }

    /**
     * Gets the value of the icsrmessagesenderidentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Icsrmessagesenderidentifier }
     *     
     */
    public Icsrmessagesenderidentifier getIcsrmessagesenderidentifier() {
        return icsrmessagesenderidentifier;
    }

    /**
     * Sets the value of the icsrmessagesenderidentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Icsrmessagesenderidentifier }
     *     
     */
    public void setIcsrmessagesenderidentifier(Icsrmessagesenderidentifier value) {
        this.icsrmessagesenderidentifier = value;
    }

    /**
     * Gets the value of the icsrmessagereceiveridentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Icsrmessagereceiveridentifier }
     *     
     */
    public Icsrmessagereceiveridentifier getIcsrmessagereceiveridentifier() {
        return icsrmessagereceiveridentifier;
    }

    /**
     * Sets the value of the icsrmessagereceiveridentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Icsrmessagereceiveridentifier }
     *     
     */
    public void setIcsrmessagereceiveridentifier(Icsrmessagereceiveridentifier value) {
        this.icsrmessagereceiveridentifier = value;
    }

    /**
     * Gets the value of the icsrmessagedateformat property.
     * 
     * @return
     *     possible object is
     *     {@link Icsrmessagedateformat }
     *     
     */
    public Icsrmessagedateformat getIcsrmessagedateformat() {
        return icsrmessagedateformat;
    }

    /**
     * Sets the value of the icsrmessagedateformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Icsrmessagedateformat }
     *     
     */
    public void setIcsrmessagedateformat(Icsrmessagedateformat value) {
        this.icsrmessagedateformat = value;
    }

    /**
     * Gets the value of the icsrmessagedate property.
     * 
     * @return
     *     possible object is
     *     {@link Icsrmessagedate }
     *     
     */
    public Icsrmessagedate getIcsrmessagedate() {
        return icsrmessagedate;
    }

    /**
     * Sets the value of the icsrmessagedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Icsrmessagedate }
     *     
     */
    public void setIcsrmessagedate(Icsrmessagedate value) {
        this.icsrmessagedate = value;
    }

    /**
     * Gets the value of the transmissionacknowledgmentcode property.
     * 
     * @return
     *     possible object is
     *     {@link Transmissionacknowledgmentcode }
     *     
     */
    public Transmissionacknowledgmentcode getTransmissionacknowledgmentcode() {
        return transmissionacknowledgmentcode;
    }

    /**
     * Sets the value of the transmissionacknowledgmentcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transmissionacknowledgmentcode }
     *     
     */
    public void setTransmissionacknowledgmentcode(Transmissionacknowledgmentcode value) {
        this.transmissionacknowledgmentcode = value;
    }

    /**
     * Gets the value of the parsingerrormessage property.
     * 
     * @return
     *     possible object is
     *     {@link Parsingerrormessage }
     *     
     */
    public Parsingerrormessage getParsingerrormessage() {
        return parsingerrormessage;
    }

    /**
     * Sets the value of the parsingerrormessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parsingerrormessage }
     *     
     */
    public void setParsingerrormessage(Parsingerrormessage value) {
        this.parsingerrormessage = value;
    }

}

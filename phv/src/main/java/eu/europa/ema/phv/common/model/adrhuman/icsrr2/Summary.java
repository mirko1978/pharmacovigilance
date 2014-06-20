//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.20 at 01:10:30 PM BST 
//


package eu.europa.ema.phv.common.model.adrhuman.icsrr2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "narrativeincludeclinical",
    "reportercomment",
    "senderdiagnosismeddraversion",
    "senderdiagnosis",
    "sendercomment"
})
@XmlRootElement(name = "summary")
public class Summary {

    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lang;
    protected Narrativeincludeclinical narrativeincludeclinical;
    protected Reportercomment reportercomment;
    protected Senderdiagnosismeddraversion senderdiagnosismeddraversion;
    protected Senderdiagnosis senderdiagnosis;
    protected Sendercomment sendercomment;

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
     * Gets the value of the narrativeincludeclinical property.
     * 
     * @return
     *     possible object is
     *     {@link Narrativeincludeclinical }
     *     
     */
    public Narrativeincludeclinical getNarrativeincludeclinical() {
        return narrativeincludeclinical;
    }

    /**
     * Sets the value of the narrativeincludeclinical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Narrativeincludeclinical }
     *     
     */
    public void setNarrativeincludeclinical(Narrativeincludeclinical value) {
        this.narrativeincludeclinical = value;
    }

    /**
     * Gets the value of the reportercomment property.
     * 
     * @return
     *     possible object is
     *     {@link Reportercomment }
     *     
     */
    public Reportercomment getReportercomment() {
        return reportercomment;
    }

    /**
     * Sets the value of the reportercomment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reportercomment }
     *     
     */
    public void setReportercomment(Reportercomment value) {
        this.reportercomment = value;
    }

    /**
     * Gets the value of the senderdiagnosismeddraversion property.
     * 
     * @return
     *     possible object is
     *     {@link Senderdiagnosismeddraversion }
     *     
     */
    public Senderdiagnosismeddraversion getSenderdiagnosismeddraversion() {
        return senderdiagnosismeddraversion;
    }

    /**
     * Sets the value of the senderdiagnosismeddraversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Senderdiagnosismeddraversion }
     *     
     */
    public void setSenderdiagnosismeddraversion(Senderdiagnosismeddraversion value) {
        this.senderdiagnosismeddraversion = value;
    }

    /**
     * Gets the value of the senderdiagnosis property.
     * 
     * @return
     *     possible object is
     *     {@link Senderdiagnosis }
     *     
     */
    public Senderdiagnosis getSenderdiagnosis() {
        return senderdiagnosis;
    }

    /**
     * Sets the value of the senderdiagnosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Senderdiagnosis }
     *     
     */
    public void setSenderdiagnosis(Senderdiagnosis value) {
        this.senderdiagnosis = value;
    }

    /**
     * Gets the value of the sendercomment property.
     * 
     * @return
     *     possible object is
     *     {@link Sendercomment }
     *     
     */
    public Sendercomment getSendercomment() {
        return sendercomment;
    }

    /**
     * Sets the value of the sendercomment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sendercomment }
     *     
     */
    public void setSendercomment(Sendercomment value) {
        this.sendercomment = value;
    }

}

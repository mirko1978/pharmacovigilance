//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.20 at 01:32:03 PM BST 
//


package eu.europa.ema.phv.common.model.adrhuman.icsrr2.master;

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
    "patientdeathreportmeddraversion",
    "patientdeathreport"
})
@XmlRootElement(name = "patientdeathcause")
public class Patientdeathcause {

    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lang;
    protected Patientdeathreportmeddraversion patientdeathreportmeddraversion;
    protected Patientdeathreport patientdeathreport;

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
     * Gets the value of the patientdeathreportmeddraversion property.
     * 
     * @return
     *     possible object is
     *     {@link Patientdeathreportmeddraversion }
     *     
     */
    public Patientdeathreportmeddraversion getPatientdeathreportmeddraversion() {
        return patientdeathreportmeddraversion;
    }

    /**
     * Sets the value of the patientdeathreportmeddraversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Patientdeathreportmeddraversion }
     *     
     */
    public void setPatientdeathreportmeddraversion(Patientdeathreportmeddraversion value) {
        this.patientdeathreportmeddraversion = value;
    }

    /**
     * Gets the value of the patientdeathreport property.
     * 
     * @return
     *     possible object is
     *     {@link Patientdeathreport }
     *     
     */
    public Patientdeathreport getPatientdeathreport() {
        return patientdeathreport;
    }

    /**
     * Sets the value of the patientdeathreport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Patientdeathreport }
     *     
     */
    public void setPatientdeathreport(Patientdeathreport value) {
        this.patientdeathreport = value;
    }

}
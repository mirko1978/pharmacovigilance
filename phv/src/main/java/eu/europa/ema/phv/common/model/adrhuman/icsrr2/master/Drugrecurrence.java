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
    "drugrecuractionmeddraversion",
    "drugrecuraction"
})
@XmlRootElement(name = "drugrecurrence")
public class Drugrecurrence {

    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lang;
    protected Drugrecuractionmeddraversion drugrecuractionmeddraversion;
    @XmlElement(required = true)
    protected Drugrecuraction drugrecuraction;

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
     * Gets the value of the drugrecuractionmeddraversion property.
     * 
     * @return
     *     possible object is
     *     {@link Drugrecuractionmeddraversion }
     *     
     */
    public Drugrecuractionmeddraversion getDrugrecuractionmeddraversion() {
        return drugrecuractionmeddraversion;
    }

    /**
     * Sets the value of the drugrecuractionmeddraversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Drugrecuractionmeddraversion }
     *     
     */
    public void setDrugrecuractionmeddraversion(Drugrecuractionmeddraversion value) {
        this.drugrecuractionmeddraversion = value;
    }

    /**
     * Gets the value of the drugrecuraction property.
     * 
     * @return
     *     possible object is
     *     {@link Drugrecuraction }
     *     
     */
    public Drugrecuraction getDrugrecuraction() {
        return drugrecuraction;
    }

    /**
     * Sets the value of the drugrecuraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Drugrecuraction }
     *     
     */
    public void setDrugrecuraction(Drugrecuraction value) {
        this.drugrecuraction = value;
    }

}
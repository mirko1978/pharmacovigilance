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
    "drugreactionassesmeddraversion",
    "drugreactionasses",
    "drugassessmentsource",
    "drugassessmentmethod",
    "drugresult"
})
@XmlRootElement(name = "drugreactionrelatedness")
public class Drugreactionrelatedness {

    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lang;
    protected Drugreactionassesmeddraversion drugreactionassesmeddraversion;
    protected Drugreactionasses drugreactionasses;
    protected Drugassessmentsource drugassessmentsource;
    protected Drugassessmentmethod drugassessmentmethod;
    protected Drugresult drugresult;

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
     * Gets the value of the drugreactionassesmeddraversion property.
     * 
     * @return
     *     possible object is
     *     {@link Drugreactionassesmeddraversion }
     *     
     */
    public Drugreactionassesmeddraversion getDrugreactionassesmeddraversion() {
        return drugreactionassesmeddraversion;
    }

    /**
     * Sets the value of the drugreactionassesmeddraversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Drugreactionassesmeddraversion }
     *     
     */
    public void setDrugreactionassesmeddraversion(Drugreactionassesmeddraversion value) {
        this.drugreactionassesmeddraversion = value;
    }

    /**
     * Gets the value of the drugreactionasses property.
     * 
     * @return
     *     possible object is
     *     {@link Drugreactionasses }
     *     
     */
    public Drugreactionasses getDrugreactionasses() {
        return drugreactionasses;
    }

    /**
     * Sets the value of the drugreactionasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Drugreactionasses }
     *     
     */
    public void setDrugreactionasses(Drugreactionasses value) {
        this.drugreactionasses = value;
    }

    /**
     * Gets the value of the drugassessmentsource property.
     * 
     * @return
     *     possible object is
     *     {@link Drugassessmentsource }
     *     
     */
    public Drugassessmentsource getDrugassessmentsource() {
        return drugassessmentsource;
    }

    /**
     * Sets the value of the drugassessmentsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Drugassessmentsource }
     *     
     */
    public void setDrugassessmentsource(Drugassessmentsource value) {
        this.drugassessmentsource = value;
    }

    /**
     * Gets the value of the drugassessmentmethod property.
     * 
     * @return
     *     possible object is
     *     {@link Drugassessmentmethod }
     *     
     */
    public Drugassessmentmethod getDrugassessmentmethod() {
        return drugassessmentmethod;
    }

    /**
     * Sets the value of the drugassessmentmethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Drugassessmentmethod }
     *     
     */
    public void setDrugassessmentmethod(Drugassessmentmethod value) {
        this.drugassessmentmethod = value;
    }

    /**
     * Gets the value of the drugresult property.
     * 
     * @return
     *     possible object is
     *     {@link Drugresult }
     *     
     */
    public Drugresult getDrugresult() {
        return drugresult;
    }

    /**
     * Sets the value of the drugresult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Drugresult }
     *     
     */
    public void setDrugresult(Drugresult value) {
        this.drugresult = value;
    }

}

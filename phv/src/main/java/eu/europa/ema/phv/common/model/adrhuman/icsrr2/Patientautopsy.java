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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "patientdetermautopsmeddraversion",
    "patientdetermineautopsy"
})
@XmlRootElement(name = "patientautopsy")
public class Patientautopsy
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lang;
    protected Patientdetermautopsmeddraversion patientdetermautopsmeddraversion;
    protected Patientdetermineautopsy patientdetermineautopsy;

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
     * Gets the value of the patientdetermautopsmeddraversion property.
     * 
     * @return
     *     possible object is
     *     {@link Patientdetermautopsmeddraversion }
     *     
     */
    public Patientdetermautopsmeddraversion getPatientdetermautopsmeddraversion() {
        return patientdetermautopsmeddraversion;
    }

    /**
     * Sets the value of the patientdetermautopsmeddraversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Patientdetermautopsmeddraversion }
     *     
     */
    public void setPatientdetermautopsmeddraversion(Patientdetermautopsmeddraversion value) {
        this.patientdetermautopsmeddraversion = value;
    }

    /**
     * Gets the value of the patientdetermineautopsy property.
     * 
     * @return
     *     possible object is
     *     {@link Patientdetermineautopsy }
     *     
     */
    public Patientdetermineautopsy getPatientdetermineautopsy() {
        return patientdetermineautopsy;
    }

    /**
     * Sets the value of the patientdetermineautopsy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Patientdetermineautopsy }
     *     
     */
    public void setPatientdetermineautopsy(Patientdetermineautopsy value) {
        this.patientdetermineautopsy = value;
    }

}

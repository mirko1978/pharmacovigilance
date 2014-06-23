//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.20 at 05:38:27 PM BST 
//

package eu.europa.ema.phv.common.model.adrhuman.icsrr2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "", propOrder = { "patientdeathdateformat", "patientdeathdate", "patientautopsyyesno",
        "patientdeathcause", "patientautopsy" })
@XmlRootElement(name = "patientdeath")
public class Patientdeath implements Serializable {

    private final static long serialVersionUID = 1L;

    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lang;

    protected Patientdeathdateformat patientdeathdateformat;

    protected Patientdeathdate patientdeathdate;

    protected Patientautopsyyesno patientautopsyyesno;

    protected List<Patientdeathcause> patientdeathcause;

    protected List<Patientautopsy> patientautopsy;

    /**
     * Gets the value of the lang property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the patientdeathdateformat property.
     * 
     * @return possible object is {@link Patientdeathdateformat }
     * 
     */
    public Patientdeathdateformat getPatientdeathdateformat() {
        return patientdeathdateformat;
    }

    /**
     * Sets the value of the patientdeathdateformat property.
     * 
     * @param value allowed object is {@link Patientdeathdateformat }
     * 
     */
    public void setPatientdeathdateformat(Patientdeathdateformat value) {
        this.patientdeathdateformat = value;
    }

    /**
     * Gets the value of the patientdeathdate property.
     * 
     * @return possible object is {@link Patientdeathdate }
     * 
     */
    public Patientdeathdate getPatientdeathdate() {
        return patientdeathdate;
    }

    /**
     * Sets the value of the patientdeathdate property.
     * 
     * @param value allowed object is {@link Patientdeathdate }
     * 
     */
    public void setPatientdeathdate(Patientdeathdate value) {
        this.patientdeathdate = value;
    }

    /**
     * Gets the value of the patientautopsyyesno property.
     * 
     * @return possible object is {@link Patientautopsyyesno }
     * 
     */
    public Patientautopsyyesno getPatientautopsyyesno() {
        return patientautopsyyesno;
    }

    /**
     * Sets the value of the patientautopsyyesno property.
     * 
     * @param value allowed object is {@link Patientautopsyyesno }
     * 
     */
    public void setPatientautopsyyesno(Patientautopsyyesno value) {
        this.patientautopsyyesno = value;
    }

    /**
     * Gets the value of the patientdeathcause property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the patientdeathcause property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getPatientdeathcause().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Patientdeathcause }
     * 
     * 
     */
    public List<Patientdeathcause> getPatientdeathcause() {
        if (patientdeathcause == null) {
            patientdeathcause = new ArrayList<Patientdeathcause>();
        }
        return this.patientdeathcause;
    }

    /**
     * Gets the value of the patientautopsy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the patientautopsy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getPatientautopsy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Patientautopsy }
     * 
     * 
     */
    public List<Patientautopsy> getPatientautopsy() {
        if (patientautopsy == null) {
            patientautopsy = new ArrayList<Patientautopsy>();
        }
        return this.patientautopsy;
    }

}

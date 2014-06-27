//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.20 at 05:38:27 PM BST 
//

package eu.europa.ema.phv.common.model.adrhuman.icsrr2.xml;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "ichicsrmessageheader", "safetyreport" })
@XmlRootElement(name = "ichicsr")
public class Ichicsr implements Serializable {

    private final static long serialVersionUID = 1L;

    @XmlAttribute(name = "lang", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lang;

    @XmlElement(required = true)
    protected Ichicsrmessageheader ichicsrmessageheader;

    @XmlElement(required = true)
    protected List<Safetyreport> safetyreport;

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
     * Gets the value of the ichicsrmessageheader property.
     * 
     * @return possible object is {@link Ichicsrmessageheader }
     * 
     */
    public Ichicsrmessageheader getIchicsrmessageheader() {
        return ichicsrmessageheader;
    }

    /**
     * Sets the value of the ichicsrmessageheader property.
     * 
     * @param value allowed object is {@link Ichicsrmessageheader }
     * 
     */
    public void setIchicsrmessageheader(Ichicsrmessageheader value) {
        this.ichicsrmessageheader = value;
    }

    /**
     * Gets the value of the safetyreport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the safetyreport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSafetyreport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Safetyreport }
     * 
     * 
     */
    public List<Safetyreport> getSafetyreport() {
        if (safetyreport == null) {
            safetyreport = new ArrayList<Safetyreport>();
        }
        return this.safetyreport;
    }

}

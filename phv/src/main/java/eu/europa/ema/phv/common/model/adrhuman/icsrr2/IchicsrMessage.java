package eu.europa.ema.phv.common.model.adrhuman.icsrr2;

import eu.europa.ema.phv.common.xmladapter.EvDateAdapter;
import eu.europa.ema.phv.common.xmladapter.EvMessageTypeAdapter;
import org.eclipse.persistence.oxm.annotations.XmlPath;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the I_ICHICSRMESSAGE database table.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ichicsr")
@Entity
@Table(name="I_ICHICSRMESSAGE")
@NamedQuery(name="IchicsrMessage.findAll", query="SELECT i FROM IchicsrMessage i")
public class IchicsrMessage implements Serializable {

    private static final long serialVersionUID = 1382010238440221655L;

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PK_ICHICSRMESSAGE", unique=true, nullable=false, precision=10)
	@XmlTransient
	private long pkIchicsrmessage;

	@Temporal(TemporalType.DATE)
	@XmlTransient
	private Date ackgendate;

	@Temporal(TemporalType.DATE)
	@XmlTransient
	private Date acksenddate;

	@Column(precision=1)
	@XmlTransient
	private BigDecimal archived;

	@Column(precision=8)
	@XmlTransient
	private BigDecimal contextsequenceid;

	@Column(precision=3)
    @XmlPath("ichicsrmessageheader/messagetype/text()")
    @XmlJavaTypeAdapter(EvMessageTypeAdapter.class)
	private BigDecimal documenttype;

	@Column(name="FK_QIOFFICIALRECEIVEDATE", precision=10)
	@XmlTransient
	private BigDecimal fkQiofficialreceivedate;

	@Column(precision=1)
	@XmlTransient
	private BigDecimal ismessagereceivedatechanged;

	@Temporal(TemporalType.DATE)
	@XmlTransient
	private Date mdnackreceivedate;

	@Temporal(TemporalType.DATE)
	@XmlPath("ichicsrmessageheader/messagedate/text()")
	@XmlJavaTypeAdapter(EvDateAdapter.class)
	private Date messagedate;
		
	@Column(length=3)
	@XmlPath("ichicsrmessageheader/messageformatversion/text()")
	private String messageformatversion;

	@Column(length=255)
	@XmlTransient
	private String messageid;

	@Column(length=2)
	@XmlAttribute(name = "lang", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String messagelang;

	@Column(nullable=false, length=100)	
	@XmlPath("ichicsrmessageheader/messagenumb/text()")
	private String messagenumber;

	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	@XmlTransient
	private Date messagereceivedate;

	@Column(length=3)
	@XmlPath("ichicsrmessageheader/messageformatrelease/text()")
	private String messagereleaseversion;

	@Column(nullable=false, precision=2)
	@XmlTransient
    /** This field is obsolete. Now they are using document type */
    @Deprecated
	private BigDecimal messagetype;

	@Temporal(TemporalType.DATE)
	@XmlTransient
	private Date officialreceivedate;

	@Column(precision=1)
	@XmlTransient
	private BigDecimal officialreceivedatemrec;

	@Column(precision=10)
	@XmlTransient
	private BigDecimal originalackref;

	@Column(precision=10)
	@XmlTransient
	private BigDecimal originalmessageref;

	@Column(nullable=false, length=60)	
	@XmlPath("ichicsrmessageheader/messagesenderidentifier/text()")
	private String senderid;
	
	@Transient
	@XmlPath("ichicsrmessageheader/messagereceiveridentifier/text()")
	private String receiverid;
	
	@Transient
	@XmlPath("ichicsrmessageheader/messagedateformat/text()")
	private String messageDateFormat;

	//bi-directional one-to-one association to MessageAck
	@OneToOne(mappedBy="IIchicsrmessage")
	@XmlTransient
	private MessageAck IMessageack;

	//bi-directional many-to-one association to SafetyReports
	@OneToMany(mappedBy= "ichicsrMessage")
	@XmlElement(name="safetyreport")
	private List<SafetyReports> safetyReports;

	public IchicsrMessage() {
	}

	public long getPkIchicsrmessage() {
		return this.pkIchicsrmessage;
	}

	public void setPkIchicsrmessage(long pkIchicsrmessage) {
		this.pkIchicsrmessage = pkIchicsrmessage;
	}

	public Date getAckgendate() {
		return this.ackgendate;
	}

	public void setAckgendate(Date ackgendate) {
		this.ackgendate = ackgendate;
	}

	public Date getAcksenddate() {
		return this.acksenddate;
	}

	public void setAcksenddate(Date acksenddate) {
		this.acksenddate = acksenddate;
	}

	public BigDecimal getArchived() {
		return this.archived;
	}

	public void setArchived(BigDecimal archived) {
		this.archived = archived;
	}

	public BigDecimal getContextsequenceid() {
		return this.contextsequenceid;
	}

	public void setContextsequenceid(BigDecimal contextsequenceid) {
		this.contextsequenceid = contextsequenceid;
	}

	public BigDecimal getDocumenttype() {
		return this.documenttype;
	}

	public void setDocumenttype(BigDecimal documenttype) {
		this.documenttype = documenttype;
	}

	public BigDecimal getFkQiofficialreceivedate() {
		return this.fkQiofficialreceivedate;
	}

	public void setFkQiofficialreceivedate(BigDecimal fkQiofficialreceivedate) {
		this.fkQiofficialreceivedate = fkQiofficialreceivedate;
	}

	public BigDecimal getIsmessagereceivedatechanged() {
		return this.ismessagereceivedatechanged;
	}

	public void setIsmessagereceivedatechanged(BigDecimal ismessagereceivedatechanged) {
		this.ismessagereceivedatechanged = ismessagereceivedatechanged;
	}

	public Date getMdnackreceivedate() {
		return this.mdnackreceivedate;
	}

	public void setMdnackreceivedate(Date mdnackreceivedate) {
		this.mdnackreceivedate = mdnackreceivedate;
	}

	public Date getMessagedate() {
		return this.messagedate;
	}

	public void setMessagedate(Date messagedate) {
		this.messagedate = messagedate;
	}

	public String getMessageformatversion() {
		return this.messageformatversion;
	}

	public void setMessageformatversion(String messageformatversion) {
		this.messageformatversion = messageformatversion;
	}

	public String getMessageid() {
		return this.messageid;
	}

	public void setMessageid(String messageid) {
		this.messageid = messageid;
	}

	public String getMessagelang() {
		return this.messagelang;
	}

	public void setMessagelang(String messagelang) {
		this.messagelang = messagelang;
	}

	public String getMessagenumber() {
		return this.messagenumber;
	}

	public void setMessagenumber(String messagenumber) {
		this.messagenumber = messagenumber;
	}

	public Date getMessagereceivedate() {
		return this.messagereceivedate;
	}

	public void setMessagereceivedate(Date messagereceivedate) {
		this.messagereceivedate = messagereceivedate;
	}

	public String getMessagereleaseversion() {
		return this.messagereleaseversion;
	}

	public void setMessagereleaseversion(String messagereleaseversion) {
		this.messagereleaseversion = messagereleaseversion;
	}

	public BigDecimal getMessagetype() {
		return this.messagetype;
	}

	public void setMessagetype(BigDecimal messagetype) {
		this.messagetype = messagetype;
	}

	public Date getOfficialreceivedate() {
		return this.officialreceivedate;
	}

	public void setOfficialreceivedate(Date officialreceivedate) {
		this.officialreceivedate = officialreceivedate;
	}

	public BigDecimal getOfficialreceivedatemrec() {
		return this.officialreceivedatemrec;
	}

	public void setOfficialreceivedatemrec(BigDecimal officialreceivedatemrec) {
		this.officialreceivedatemrec = officialreceivedatemrec;
	}

	public BigDecimal getOriginalackref() {
		return this.originalackref;
	}

	public void setOriginalackref(BigDecimal originalackref) {
		this.originalackref = originalackref;
	}

	public BigDecimal getOriginalmessageref() {
		return this.originalmessageref;
	}

	public void setOriginalmessageref(BigDecimal originalmessageref) {
		this.originalmessageref = originalmessageref;
	}

	public String getSenderid() {
		return this.senderid;
	}

	public void setSenderid(String senderid) {
		this.senderid = senderid;
	}

	public MessageAck getIMessageack() {
		return this.IMessageack;
	}

	public void setIMessageack(MessageAck IMessageack) {
		this.IMessageack = IMessageack;
	}

	public List<SafetyReports> getSafetyReports() {
		return this.safetyReports;
	}

	public void setSafetyReports(List<SafetyReports> ISafetyreports) {
		this.safetyReports = ISafetyreports;
	}
	

	/**
     * @return the receiverid
     */
    public String getReceiverid() {
        return receiverid;
    }
    

    /**
     * @return the messageDateFormat
     */
    public String getMessageDateFormat() {
        return messageDateFormat;
    }

    /**
     * @param messageDateFormat the messageDateFormat to set
     */
    public void setMessageDateFormat(String messageDateFormat) {
        this.messageDateFormat = messageDateFormat;
    }

    /**
     * @param receiverid the receiverid to set
     */
    public void setReceiverid(String receiverid) {
        this.receiverid = receiverid;
    }

    public SafetyReports addISafetyreport(SafetyReports ISafetyreport) {
		getSafetyReports().add(ISafetyreport);
		ISafetyreport.setIchicsrMessage(this);

		return ISafetyreport;
	}

	public SafetyReports removeISafetyreport(SafetyReports ISafetyreport) {
		getSafetyReports().remove(ISafetyreport);
		ISafetyreport.setIchicsrMessage(null);

		return ISafetyreport;
	}

}
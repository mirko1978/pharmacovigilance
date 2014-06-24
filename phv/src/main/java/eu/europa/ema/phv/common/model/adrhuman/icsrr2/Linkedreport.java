package eu.europa.ema.phv.common.model.adrhuman.icsrr2;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the I_LINKEDREPORT database table.
 * 
 */
@Entity
@Table(name="I_LINKEDREPORT")
@NamedQuery(name="LinkedReport.findAll", query="SELECT l FROM LinkedReport l")
public class LinkedReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PK_LINKEDREPORT", unique=true, nullable=false, precision=10)
	private long pkLinkedreport;

	@Column(length=100)
	private String linkreportnumb;

	//bi-directional many-to-one association to SafetyReport
	@ManyToOne
	@JoinColumn(name="FK_SAFETYREPORT", nullable=false)
	private SafetyReport ISafetyreport;

	public LinkedReport() {
	}

	public long getPkLinkedreport() {
		return this.pkLinkedreport;
	}

	public void setPkLinkedreport(long pkLinkedreport) {
		this.pkLinkedreport = pkLinkedreport;
	}

	public String getLinkreportnumb() {
		return this.linkreportnumb;
	}

	public void setLinkreportnumb(String linkreportnumb) {
		this.linkreportnumb = linkreportnumb;
	}

	public SafetyReport getISafetyreport() {
		return this.ISafetyreport;
	}

	public void setISafetyreport(SafetyReport ISafetyreport) {
		this.ISafetyreport = ISafetyreport;
	}

}
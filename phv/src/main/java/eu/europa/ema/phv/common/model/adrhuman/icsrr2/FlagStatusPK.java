package eu.europa.ema.phv.common.model.adrhuman.icsrr2;

import java.io.Serializable;

/**
 * The primary key class for the I_FLAGSTATUS database table.
 * Look at the stored procedure ICHICSR.EV_ICHICSR_STATUS
 */
public class FlagStatusPK implements Serializable {
    // default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

    private long fkSafetyreport;

    private long flagcode;

    public FlagStatusPK() {
    }

    public long getFkSafetyreport() {
        return this.fkSafetyreport;
    }

    public void setFkSafetyreport(long fkSafetyreport) {
        this.fkSafetyreport = fkSafetyreport;
    }

    public long getFlagcode() {
        return this.flagcode;
    }

    public void setFlagcode(long flagcode) {
        this.flagcode = flagcode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlagStatusPK)) {
            return false;
        }
        FlagStatusPK castOther = (FlagStatusPK) other;
        return this.fkSafetyreport == castOther.fkSafetyreport && this.flagcode == castOther.flagcode;
    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + ((int) (this.fkSafetyreport ^ (this.fkSafetyreport >>> 32)));
        hash = hash * prime + ((int) (this.flagcode ^ (this.flagcode >>> 32)));

        return hash;
    }
}
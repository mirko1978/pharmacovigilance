package eu.europa.ema.phv.common.persistence;

import eu.europa.ema.phv.common.model.adrhuman.icsrr2.CaseTypeEnum;
import eu.europa.ema.phv.common.model.adrhuman.MessageMetadata;
import eu.europa.ema.phv.common.model.adrhuman.icsrr2.IchicsrMessage;
import eu.europa.ema.phv.common.model.adrhuman.icsrr2.SafetyReport;
import eu.europa.ema.phv.common.model.adrhuman.icsrr2.SafetyReports;
import org.eclipse.persistence.annotations.ReturnInsert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Persiste the ICSR R2 using JPA. <br/>
 *
 * @author Mirko Bernardoni bernardonim (created by)
 * @version $Revision: 1.1 $ (cvs revision)
 * @revisionDate $Date: 30/06/2014 $
 * @since 30/06/2014 (creation date)
 */
public class JpaIcsrR2Dao implements IcsrR2DAO {
    private static final Logger LOG = LoggerFactory.getLogger(JpaIcsrR2Dao.class);

    @PersistenceContext(unitName = "icsrJta")
    private EntityManager manager;

    @Override
    @ReturnInsert
    @Transactional
    public void persist(IchicsrMessage icsr) {
        manager.persist(icsr);
        if (LOG.isDebugEnabled()) {
            LOG.debug("DAO: ICSR core message saved for {}", icsr);
        }
    }

    @Override
    @SuppressWarnings("deprecation")
    public IchicsrMessage emptyIcsr(IchicsrMessage source) {
        IchicsrMessage destination = new IchicsrMessage();
        destination.setPkIchicsrmessage(source.getPkIchicsrmessage());
        destination.setAckgendate(source.getAckgendate());
        destination.setAcksenddate(source.getAcksenddate());
        destination.setArchived(source.getArchived());
        destination.setContextsequenceid(source.getContextsequenceid());
        destination.setDocumenttype(source.getDocumenttype());
        destination.setFkQiofficialreceivedate(source.getFkQiofficialreceivedate());
        destination.setIsmessagereceivedatechanged(source.getIsmessagereceivedatechanged());
        destination.setMdnackreceivedate(source.getMdnackreceivedate());
        destination.setMessagedate(source.getMessagedate());
        destination.setMessageformatversion(source.getMessageformatversion());
        destination.setMessageid(source.getMessageid());
        destination.setMessagelang(source.getMessagelang());
        destination.setMessagenumber(source.getMessagenumber());
        destination.setMessagereceivedate(source.getMessagereceivedate());
        destination.setMessagereleaseversion(source.getMessagereleaseversion());
        destination.setMessagetype(source.getMessagetype());
        destination.setOfficialreceivedate(source.getOfficialreceivedate());
        destination.setOfficialreceivedatemrec(source.getOfficialreceivedatemrec());
        destination.setOriginalackref(source.getOriginalackref());
        destination.setOriginalmessageref(source.getOriginalmessageref());
        destination.setSenderid(source.getSenderid());
        destination.setReceiverid(source.getReceiverid());
        destination.setMessageDateFormat(source.getMessageDateFormat());
        destination.setIMessageack(source.getIMessageack());
        return destination;
    }

    @Override
    public void prepare(IchicsrMessage message, MessageMetadata metadata) {
        // Adding the receiving date to the icsr
        message.setMessagereceivedate(metadata.getReceived());
        // Merge company and authority for each report following the database algorithm
        for (SafetyReports reports : message.getSafetyReports()) {
            SafetyReport report = reports.getSafetyReport();
            if (report.getCompanynumb() != null) {
                report.setCasenumber(report.getCompanynumb());
                report.setCasetype(CaseTypeEnum.COMPANY);
            }
            else {
                report.setCasenumber(report.getAuthoritynumb());
                report.setCasetype(CaseTypeEnum.AUTHORITY);
            }
        }

    }

}

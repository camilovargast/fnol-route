package com.tiury.translator;

import com.tiury.canonical.DeathReported;
import com.tiury.model.MediatorCsv;
import org.apache.camel.Exchange;

public class DeathReportedTranslator {

    public DeathReported translate(MediatorCsv mediatorFormat) {

        DeathReported deathReported = new DeathReported();
        deathReported.setPolicyId(mediatorFormat.getPolicyId());
        deathReported.setPolicyHolderId(mediatorFormat.getPolicyHolderId());
        deathReported.setDeceasedName(mediatorFormat.getDeceasedName());
        deathReported.setDeceasedSurname(mediatorFormat.getDeceasedSurname());
        deathReported.setDeceasedDate(mediatorFormat.getDeceasedDate());
        deathReported.setDeceasedTime(mediatorFormat.getDeceasedTime());
        deathReported.setDeceasedType(mediatorFormat.getDeceasedType());
        deathReported.setDeceasedId(mediatorFormat.getDeceasedId());
        deathReported.setDeceasedBodyLocation(mediatorFormat.getDeceasedBodyLocation());
        deathReported.setClaimantName(mediatorFormat.getClaimantName());
        deathReported.setClaimantSurname(mediatorFormat.getClaimantSurname());
        deathReported.setClaimantId(mediatorFormat.getClaimantId());
        deathReported.setDispositionType(mediatorFormat.getDispositionType());

        return deathReported;
    }
}

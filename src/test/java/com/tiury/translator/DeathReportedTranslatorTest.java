package com.tiury.translator;

import com.tiury.canonical.DeathReported;
import com.tiury.model.MediatorCsv;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class DeathReportedTranslatorTest {
    private DeathReportedTranslator translator;

    @BeforeEach
    void setUp() {
        translator = new  DeathReportedTranslator();
    }

    @Test
    void translateMediatorToCanonical() {
        // Arrange
        MediatorCsv mediatorCsv = new MediatorCsv();
        mediatorCsv.setTxId("TX-0001");
        mediatorCsv.setAppId("APP-789456");
        mediatorCsv.setPolicyId("POL-100234");
        mediatorCsv.setPolicyHolderId("PH-456789");
        mediatorCsv.setDeceasedName("John");
        mediatorCsv.setDeceasedSurname("Smith");
        mediatorCsv.setDeceasedDate(LocalDate.of(2026, 9, 15));
        mediatorCsv.setDeceasedTime(LocalTime.of(14,35));
        mediatorCsv.setDeceasedType("NATURAL");
        mediatorCsv.setDeceasedId("D-123456");
        mediatorCsv.setDeceasedBodyLocation("Madrid");
        mediatorCsv.setClaimantName("Michael");
        mediatorCsv.setClaimantSurname("Corts");
        mediatorCsv.setClaimantId("C-789456");
        mediatorCsv.setDispositionType("Burial");

        // Act
        DeathReported deathReported = translator.translate(mediatorCsv);

        // Assert
        assertAll(
                () -> assertEquals(mediatorCsv.getPolicyId(), deathReported.getPolicyId()),
                () -> assertEquals(mediatorCsv.getPolicyHolderId(), deathReported.getPolicyHolderId()),
                () -> assertEquals(mediatorCsv.getDeceasedName(), deathReported.getDeceasedName()),
                () -> assertEquals(mediatorCsv.getDeceasedSurname(), deathReported.getDeceasedSurname()),
                () -> assertEquals(LocalDate.of(2026, 9, 15), deathReported.getDeceasedDate()),
                () -> assertEquals(LocalTime.of(14, 35), deathReported.getDeceasedTime()),
                () -> assertEquals(mediatorCsv.getDeceasedType(), deathReported.getDeceasedType()),
                () -> assertEquals(mediatorCsv.getDeceasedId(), deathReported.getDeceasedId()),
                () -> assertEquals(mediatorCsv.getDeceasedBodyLocation(), deathReported.getDeceasedBodyLocation()),
                () -> assertEquals(mediatorCsv.getClaimantName(), deathReported.getClaimantName()),
                () -> assertEquals(mediatorCsv.getClaimantSurname(), deathReported.getClaimantSurname()),
                () -> assertEquals(mediatorCsv.getClaimantId(), deathReported.getClaimantId()),
                () -> assertEquals(mediatorCsv.getDispositionType(), deathReported.getDispositionType())
        );
    }
}

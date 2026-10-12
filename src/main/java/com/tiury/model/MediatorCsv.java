package com.tiury.model;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

import java.time.LocalDate;
import java.time.LocalTime;

@CsvRecord(separator = ",")
public class MediatorCsv {

    @DataField(pos = 1)
    private String txId;

    @DataField(pos = 2, required = true)
    private String appId;

    @DataField(pos = 3)
    private String policyId;

    @DataField(pos = 4)
    private String policyHolderId;

    @DataField(pos = 5, required = true)
    private String deceasedName;

    @DataField(pos = 6, required = true)
    private String deceasedSurname;

    @DataField(pos = 7, pattern = "dd/MM/yyyy", required = true)
    private LocalDate deceasedDate;

    @DataField(pos = 8, pattern = "HH:mm", required = true)
    private LocalTime deceasedTime;

    @DataField(pos = 9, required = true)
    private String deceasedType;

    @DataField(pos = 10, required = true)
    private String deceasedId;

    @DataField(pos = 11, required = true)
    private String deceasedBodyLocation;

    @DataField(pos = 12, required = true)
    private String claimantName;

    @DataField(pos = 13, required = true)
    private String claimantSurname;

    @DataField(pos = 14, required = true)
    private String claimantId;

    @DataField(pos = 15)
    private String dispositionType;

    // Getters and setters

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getPolicyHolderId() {
        return policyHolderId;
    }

    public void setPolicyHolderId(String policyHolderId) {
        this.policyHolderId = policyHolderId;
    }

    public String getDeceasedName() {
        return deceasedName;
    }

    public void setDeceasedName(String deceasedName) {
        this.deceasedName = deceasedName;
    }

    public String getDeceasedSurname() {
        return deceasedSurname;
    }

    public void setDeceasedSurname(String deceasedSurname) {
        this.deceasedSurname = deceasedSurname;
    }

    public LocalDate getDeceasedDate() {
        return deceasedDate;
    }

    public void setDeceasedDate(LocalDate deceasedDate) {
        this.deceasedDate = deceasedDate;
    }

    public LocalTime getDeceasedTime() {
        return deceasedTime;
    }

    public void setDeceasedTime(LocalTime deceasedTime) {
        this.deceasedTime = deceasedTime;
    }

    public String getDeceasedType() {
        return deceasedType;
    }

    public void setDeceasedType(String deceasedType) {
        this.deceasedType = deceasedType;
    }

    public String getDeceasedId() {
        return deceasedId;
    }

    public void setDeceasedId(String deceasedId) {
        this.deceasedId = deceasedId;
    }

    public String getDeceasedBodyLocation() {
        return deceasedBodyLocation;
    }

    public void setDeceasedBodyLocation(String deceasedBodyLocation) {
        this.deceasedBodyLocation = deceasedBodyLocation;
    }

    public String getClaimantName() {
        return claimantName;
    }

    public void setClaimantName(String claimantName) {
        this.claimantName = claimantName;
    }

    public String getClaimantSurname() {
        return claimantSurname;
    }

    public void setClaimantSurname(String claimantSurname) {
        this.claimantSurname = claimantSurname;
    }

    public String getClaimantId() {
        return claimantId;
    }

    public void setClaimantId(String claimantId) {
        this.claimantId = claimantId;
    }

    public String getDispositionType() {
        return dispositionType;
    }

    public void setDispositionType(String dispositionType) {
        this.dispositionType = dispositionType;
    }
}


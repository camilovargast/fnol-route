package com.tiury.canonical;

import java.time.LocalDate;
import java.time.LocalTime;

public class DeathReported {

    private String policyId;
    private String policyHolderId;
    private String deceasedName;
    private String deceasedSurname;

    /**The date of death (deceasedDate) corresponds to the date recorded on the death certificate issued in the place
     * where the person died, represented as a LocalDate
     */
    private LocalDate deceasedDate;

    /**The time of death (deceasedTime) corresponds to the time recorded on the death certificate issued in the place
     * where the person died, represented as a LocalDate
     */
    private LocalTime deceasedTime;

    private String deceasedType;
    private String deceasedId;
    private String deceasedBodyLocation;
    private String claimantName;
    private String claimantSurname;
    private String claimantId;
    private String dispositionType;

    // Constructor vacío (para instanciar y asignar valores después)
    public DeathReported() {
    }

    // Constructor con todos los campos
    public DeathReported(String policyId, String policyHolderId,
                         String deceasedName, String deceasedSurname, LocalDate deceasedDate,
                         LocalTime deceasedTime, String deceasedType, String deceasedId,
                         String deceasedBodyLocation, String claimantName, String claimantSurname,
                         String claimantId, String dispositionType) {

        this.policyId = policyId;
        this.policyHolderId = policyHolderId;
        this.deceasedName = deceasedName;
        this.deceasedSurname = deceasedSurname;
        this.deceasedDate = deceasedDate;
        this.deceasedTime = deceasedTime;
        this.deceasedType = deceasedType;
        this.deceasedId = deceasedId;
        this.deceasedBodyLocation = deceasedBodyLocation;
        this.claimantName = claimantName;
        this.claimantSurname = claimantSurname;
        this.claimantId = claimantId;
        this.dispositionType = dispositionType;
    }

    // Getters y Setters

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
    @Override
    public String toString() {
        return "DeathReported{" +
                "policyId='" + policyId + '\'' +
                '}';
    }
}
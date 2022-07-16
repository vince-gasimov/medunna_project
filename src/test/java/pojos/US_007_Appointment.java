package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_007_Appointment {

    /*
    "createdBy": "anonymousUser",
        "createdDate": "2021-12-21T22:33:06.907662Z",
        "id": 3403,
        "startDate": "2021-12-22T17:00:00Z",
        "endDate": "2021-12-25T18:00:00Z",
        "status": "COMPLETED",
        "anamnesis": null,
        "treatment": null,
        "diagnosis": null,
        "prescription": "",
        "description": "cfgvhbjn",
        "physician": {
     */

    private String createdBy;
    private String createdDate;
    private String startDate;
    private String endDate;
    private String status;
    private String anamnesis;
    private String treatment;
    private String diagnosis;
    private String prescription;
    private int id;
    private US_007_Patient patient;

    public US_007_Appointment(String createdBy, String createdDate, String startDate, String endDate, String status, String anamnesis, String treatment, String diagnosis, String prescription, US_007_Patient patient) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.anamnesis = anamnesis;
        this.treatment = treatment;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.patient = patient;
    }

    public US_007_Appointment() {
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public US_007_Patient getPatient() {
        return patient;
    }

    public void setPatient(US_007_Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "US_007_Appointment{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", status='" + status + '\'' +
                ", anamnesis='" + anamnesis + '\'' +
                ", treatment='" + treatment + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", prescription='" + prescription + '\'' +
                ", id=" + id +
                ", patient=" + patient +
                '}';
    }
}

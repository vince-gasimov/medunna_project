package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_10_AppointmentPojo {
    /*
    {
    "createdBy": "alpaslan",
    "createdDate": "2022-03-09T21:05:09.896988Z",
    "id": 20739,
    "startDate": "2022-07-23T00:00:00Z",
    "endDate": "2022-07-23T01:00:00Z",
    "status": "UNAPPROVED",
    "anamnesis": null,
    "treatment": null,
    "diagnosis": null,
    "prescription": null,
    "description": null,
    "physician": {
        "createdBy": "team83_fonat",
        "createdDate": "2022-06-28T18:35:35.104666Z",
        "id": 94228,
        "firstName": "filizdoctor2",

     */

    private String createdBy;
    private String id;
    private US_10_PhysicianPojo physician;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public US_10_PhysicianPojo getPhysician() {
        return physician;
    }

    public void setPhysician(US_10_PhysicianPojo physician) {
        this.physician = physician;
    }

    @Override
    public String toString() {
        return "US_10_AppointmentPojo{" +
                "createdBy='" + createdBy + '\'' +
                ", id='" + id + '\'' +
                ", physician=" + physician +
                '}';
    }
}

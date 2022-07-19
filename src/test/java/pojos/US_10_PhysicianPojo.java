package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_10_PhysicianPojo {
    /*
     "physician": {
        "createdBy": "team83_fonat",
        "createdDate": "2022-06-28T18:35:35.104666Z",
        "id": 94228,
        "firstName": "filizdoctor2",
        "lastName": "onat",
        "birthDate": "1997-01-02T05:00:00Z",
        "phone": "3335556789",
        "gender": "FEMALE",
        "bloodGroup": "Bpositive",
        "adress": "Canada",
        "description": "",
     */

    private String id;
    private String firstName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "US_10_PhysicianPojo{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}

package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_015_Patient_Pojo {

    /*
    {
        "createdBy": "irfan_team83",
        "createdDate": "2022-07-08T19:41:46.304894Z",
        "id": 113526,
        "firstName": "Team83_Burt",
        "lastName": "Hegmann",
        "birthDate": "3461-01-11T09:07:00Z",
        "phone": "0155181677",
        "gender": "FEMALE",
        "bloodGroup": "Anegative",
        "adress": "730 Jenice Views",
        "email": "Team83_penny.boyle@hotmail.com",
        "description": "facilis",
        "user": {
            "firstName": "Doctor",
            "lastName": "Doctor",
            "email": "doctore@email.com",
            "ssn": "411-73-3731",

        },
        "appointments": null,
        "inPatients": null,
        "country": {
            "id": 73991,
            "name": "Morocco"
        },
        "cstate": null
    }
     */
    private String firstName;
    private String lastName;
    private String phone;
    private String gender;
    private String bloodGroup;
    private String email;
    private US_015_UserPojo userPojo;

    public US_015_Patient_Pojo() {
    }

    public US_015_Patient_Pojo(String firstName, String lastName, String phone, String gender, String bloodGroup, String email, US_015_UserPojo userPojo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.email = email;
        this.userPojo = userPojo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public US_015_UserPojo getUserPojo() {
        return userPojo;
    }

    public void setUserPojo(US_015_UserPojo userPojo) {
        this.userPojo = userPojo;
    }

    @Override
    public String toString() {
        return "US_015_Patient_Pojo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", email='" + email + '\'' +
                ", userPojo=" + userPojo +
                '}';
    }
}

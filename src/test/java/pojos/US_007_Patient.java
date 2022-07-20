package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_007_Patient {

    /*
            "createdBy": "oscarlebsack",
            "createdDate": "2022-03-01T13:26:00.734890Z",
            "id": 10501,
            "firstName": "Harlan",
            "lastName": "Krajcik",
            "birthDate": "2001-12-02T23:00:00Z",
            "phone": "1234567890",
            "gender": "FEMALE",
            "bloodGroup": "ABpositive",
            "adress": "Apt. 341 12226 Dell Coves, Marcelview, VT 46426-5626",
            "description": "Patient Info",
     */

    private String createdBy;
    private String createdDate;
    private int id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phone;
    private String gender;
    private String adress;
    private String email;
    private US_007_User user;

    public US_007_Patient(){

    }

    public US_007_Patient(String createdBy, String createdDate, String firstName, String lastName, String birthDate, String phone, String gender, String adress, String email, US_007_User user) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        //this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
        this.adress = adress;
        this.email = email;
        this.user = user;
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
//    public int getId() {
//        return id;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }
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
    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
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
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public US_007_User getUser() {
        return user;
    }
    public void setUser(US_007_User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "US_007_Patient{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                ", user=" + user +
                '}';
    }
}

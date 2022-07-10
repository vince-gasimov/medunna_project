package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_007_AppointmentsPojo {

    /*
    {
  "appoSpeciality": "string",
  "birthDate": "2022-07-02T01:23:30.730Z",
  "email": "string",
  "firstName": "string",
  "gender": "string",
  "lastName": "string",
  "phone": "string",
  "snumber": "string",
  "ssn": "string",
  "startDate": "2022-07-02"
}
     */

    private String firstName;
    private String lastName;
    private String ssn;
    private String email;
    private String phone;
    private int startDate;

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
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getStartDate() {
        return startDate;
    }
    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "US_007_Appointments{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}

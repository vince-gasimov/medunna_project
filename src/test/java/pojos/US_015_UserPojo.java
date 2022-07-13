package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_015_UserPojo {
    /*
     "user": {
            "createdBy": "anonymousUser",
            "createdDate": "2021-12-14T10:38:26.705059Z",
            "id": 2001,
            "login": "doctor",
            "firstName": "Doctor",
            "lastName": "Doctor",
            "email": "doctore@email.com",
            "activated": true,
            "langKey": "en",
            "imageUrl": null,
            "resetDate": null,
            "ssn": "234-55-3432"
        }
     */

    private String login;
    private String firstName;
    private String lastName;
    private String email;
    private String ssn;

    public US_015_UserPojo() {
    }

    public US_015_UserPojo(String login, String firstName, String lastName, String email, String ssn) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.ssn = ssn;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "US_015_UserPojo{" +
                "login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}

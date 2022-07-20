package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class US_007_User {

    /*
                "createdBy": "anonymousUser",
                "createdDate": "2022-03-29T10:10:27.911556Z",
                "id": 43194,
                "login": "user_112233445_56677889991648548627822",
                "firstName": "a",
                "lastName": "b",
                "email": "cazs@asblas.com",
                "activated": false,
                "langKey": null,
                "imageUrl": null,
                "resetDate": null,
                "ssn": "444-44-0005"
     */

    private String createdBy;
    private String createdDate;
    private String login;
    private String firstName;
    private String lastName;
    private String creaemailtedBy;
    private boolean activated;
    private String langKey;
    private int id;
    private String ssn;

    public US_007_User(String createdBy, String createdDate, String login, String firstName, String lastName, String creaemailtedBy, boolean activated, String langKey, String ssn) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.creaemailtedBy = creaemailtedBy;
        this.activated = activated;
        this.langKey = langKey;
        this.ssn = ssn;
    }

    public US_007_User() {
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

    public String getCreaemailtedBy() {
        return creaemailtedBy;
    }

    public void setCreaemailtedBy(String creaemailtedBy) {
        this.creaemailtedBy = creaemailtedBy;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public String getLangKey() {
        return langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "US_007_User{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", creaemailtedBy='" + creaemailtedBy + '\'' +
                ", activated=" + activated +
                ", langKey='" + langKey + '\'' +
                ", id=" + id +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}

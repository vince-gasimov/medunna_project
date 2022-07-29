package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class US_018_PostPhysicianPojo {
    /*
    {
  "adress": "string",
  "appointments": [
    {
      "anamnesis": "string",
      "createdBy": "string",
      "createdDate": "2022-07-22T02:39:28.552Z",
      "ctests": [
        {
          "appointment": "string",
          "createdBy": "string",
          "createdDate": "2022-07-22T02:39:28.552Z",
          "ctestResults": [
            {
              "createdBy": "string",
              "createdDate": "2022-07-22T02:39:28.552Z",
              "ctest": "string",
              "ctestItem": {
                "createdBy": "string",
                "createdDate": "2022-07-22T02:39:28.552Z",
                "defaultValMax": "string",
                "defaultValMin": "string",
                "description": "string",
                "id": 0,
                "name": "string",
                "price": 0
              },
              "date": "2022-07-22T02:39:28.552Z",
              "description": "string",
              "id": 0,
              "result": "string"
            }
          ],
          "date": "2022-07-22T02:39:28.552Z",
          "description": "string",
          "id": 0,
          "name": "string"
        }
      ],
      "description": "string",
      "diagnosis": "string",
      "endDate": "2022-07-22T02:39:28.552Z",
      "id": 0,
      "patient": {
        "adress": "string",
        "appointments": [
          "string"
        ],
        "birthDate": "2022-07-22T02:39:28.552Z",
        "bloodGroup": "Apositive",
        "country": {
          "id": 0,
          "name": "string"
        },
        "createdBy": "string",
        "createdDate": "2022-07-22T02:39:28.552Z",
        "cstate": {
          "country": {
            "id": 0,
            "name": "string"
          },
          "id": 0,
          "name": "string"
        },
        "description": "string",
        "email": "string",
        "firstName": "string",
        "gender": "MALE",
        "id": 0,
        "inPatients": [


          {
            "appointment": "string",
            "createdBy": "string",
            "createdDate": "2022-07-22T02:39:28.552Z",
            "description": "string",
            "endDate": "2022-07-22T02:39:28.552Z",
            "id": 0,
            "patient": "string",
            "room": {
              "createdBy": "string",
              "createdDate": "2022-07-22T02:39:28.552Z",
              "description": "string",
              "id": 0,
              "price": 0,
              "roomNumber": 0,
              "roomType": "TWIN",
              "status": true
            },
            "startDate": "2022-07-22T02:39:28.552Z",
            "status": "UNAPPROVED"
          }
        ],
        "lastName": "string",
        "phone": "string",
        "ssn": "808-16-7964",
        "user": {
          "activated": true,
          "createdBy": "string",
          "createdDate": "2022-07-22T02:39:28.552Z",
          "email": "string",
          "firstName": "string",
          "id": 0,
          "imageUrl": "string",
          "langKey": "string",
          "lastName": "string",
          "login": "string",
          "resetDate": "2022-07-22T02:39:28.552Z",
          "ssn": "744-89-0456"
        }
      },
      "physician": "string",
      "prescription": "string",
      "startDate": "2022-07-22T02:39:28.552Z",
      "status": "UNAPPROVED",
      "treatment": "string"
    }
  ],
  "birthDate": "2022-07-22T02:39:28.552Z",
  "bloodGroup": "Apositive",
  "country": {
    "id": 0,
    "name": "string"
  },
  "createdBy": "string",
  "createdDate": "2022-07-22T02:39:28.552Z",
  "cstate": {
    "country": {
      "id": 0,
      "name": "string"
    },
    "id": 0,
    "name": "string"
  },
  "description": "string",
  "examFee": 0,
  "firstName": "string",
  "gender": "MALE",
  "id": 0,
  "image": "string",
  "imageContentType": "string",
  "lastName": "string",
  "phone": "string",
  "speciality": "ALLERGY_IMMUNOLOGY",
  "ssn": "333-55-9176",
  "user": {
    "activated": true,
    "createdBy": "string",
    "createdDate": "2022-07-22T02:39:28.552Z",
    "email": "string",
    "firstName": "string",
    "id": 0,
    "imageUrl": "string",
    "langKey": "string",
    "lastName": "string",
    "login": "string",
    "resetDate": "2022-07-22T02:39:28.552Z",
    "ssn": "325-41-0015"
  }
}
     */

//    private String email;
    private String firstName;
    private String gender;
    private String lastName;
    private String phone;
    private String ssn;

    public US_018_PostPhysicianPojo() {
    }

    public US_018_PostPhysicianPojo( String firstName, String gender, String lastName, String phone, String ssn) {
//        this.email = email;
        this.firstName = firstName;
        this.gender = gender;
        this.lastName = lastName;
        this.phone = phone;
        this.ssn = ssn;
    }

//    public String getEmail() {
//        return email;
//    }

//    public void setEmail(String email) {
//        this.email = email;
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "US_018_PostPhysicianPojo{" +
//                "email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}

package stepdefinitions.apiStepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US_015_Patient_Pojo;
import pojos.US_015_UserPojo;
import utilities.ConfigurationReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;
import static utilities.US_001_TXTWriter.saveApiAllPatientsData;

public class US_015_API_Get_Patients_Data {

    Response response;
    US_015_Patient_Pojo[] patients;
    US_015_UserPojo user;

    Faker faker = new Faker();

    @Given("user sends a get-request to get all patients' data")
    public void user_sends_a_get_request_to_get_all_patients_data() {

        response = given().headers(
                "Authorization",
                "Bearer " + generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).when().get(ConfigurationReader.getProperty("api_patients_endpoint"));

//        response.prettyPrint();

    }

    @Given("user deserializes the patients api response")
    public void user_deserializes_the_patients_api_response() throws IOException {

        //user deserializes the response into a nested POJO object*/

        ObjectMapper obj = new ObjectMapper();
        patients = obj.readValue(response.asString(), US_015_Patient_Pojo[].class);

        //user adds user data to patients array of POJO objects


        System.out.println(patients.length);

//        boolean flag = false;
//        for (int i = 0; i < patients.length; i++) {
//            for (int j = 0; j < 7; j++) {
//
//                if (patients[i][j].getFirstName().contains("Team83")) {
//                    System.out.println(patients[i][j].getFirstName());
//                    System.out.println(patients[i][j].getLastName());
//                    flag = true;
//
//                }
//            }
//            assertTrue(flag);
//
//
//        }
    }

        @Then("user saves the patients data to the file and validates")
        public void user_saves_the_patients_data_to_the_file_and_validates () throws IOException {
            saveApiAllPatientsData(patients);

        }

//    @Given("user sends a post-request to create a new registrant")
//    public void userSendsAPostRequestToCreateANewRegistrant() {
//
//        //1.setting the url
//        spec.pathParams("first", "api", "second", "register");
//
//        //2.set the request body
//        US_01_Registrant requestBody = new US_01_Registrant(
//                ("Team83_" + faker.name().firstName()),
//                ("PostRequest_" + faker.name().lastName()),
//                (faker.idNumber().ssnValid()),
//                ("Team83_" + faker.name().username()),
//                "en",
//                "123456789",
//                ("team83_" + faker.internet().emailAddress()),
//                true);
//
//        //3.setting the post request and get the response
//        response = given().spec(spec).contentType(ContentType.JSON).body(requestBody).when().post("/{first}/{second}");
//
//        //4.Do assertions
//        US_01_Registrant actual = response.as(US_01_Registrant.class);
//
//        assertEquals(requestBody.getSsn(), actual.getSsn());//asserting the ssn
//
//        assertEquals(requestBody.getFirstName(), actual.getFirstName());
//
//        assertTrue(actual.getFirstName().contains("Team83_"));
//
//        assertTrue(actual.getLogin().contains("Team83"));
//
//        System.out.println(actual.getFirstName());
//
//        System.out.println(actual.getSsn()); //print the ssn to the console to see if it is correct
//
//        saveApiNewRegistrantData(new US_01_Registrant[]{actual}); //save the new registrant to the file


    }


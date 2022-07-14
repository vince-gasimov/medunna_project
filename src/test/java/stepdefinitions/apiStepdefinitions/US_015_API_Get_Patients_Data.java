package stepdefinitions.apiStepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US_015_Patient_Pojo;
import pojos.US_015_UserPojo;
import pojos.US_01_Registrant;
import utilities.ConfigurationReader;

import java.io.IOException;
import java.util.List;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import static utilities.Authentication.generateToken;
import static utilities.US_001_TXTWriter.*;

public class US_015_API_Get_Patients_Data {

    Response response;
    US_015_Patient_Pojo[] patients;
    US_015_UserPojo user;
    List patientsList;

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
        patientsList = obj.readValue(response.asString(), List.class);

        //user adds json to patients array of POJO objects


        System.out.println(patients.length);


    }

    @Then("user saves the patients data to the file and validates")
    public void user_saves_the_patients_data_to_the_file_and_validates() throws IOException {
        saveApiAllPatientsData(patientsList);

    }

 }
package stepdefinitions.apiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.US_015_UserPojo;
import utilities.ConfigurationReader;

import java.io.IOException;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;
import static utilities.US_001_TXTWriter.saveApiListPatientsData;

public class US_015_API_Get_Patients_Data {

    Response response;
    US_015_UserPojo user;
    List<Object> patientList;
    JsonPath jsonPath;
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

        jsonPath = response.jsonPath();
        patientList = jsonPath.get("");
        System.out.println(patientList.size());

    }


    @Then("user saves the patients data to the file and validates")
    public void user_saves_the_patients_data_to_the_file_and_validates() throws IOException {
        saveApiListPatientsData(patientList);

        List<String> ssn = jsonPath.getList("user.ssn");
        for(String s : ssn){
            if(s.equals("654-54-5424")){
                System.out.println("Found the patient");
            }
        }
    }

}
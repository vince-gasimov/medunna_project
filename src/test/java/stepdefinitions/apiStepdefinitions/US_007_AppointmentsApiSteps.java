package stepdefinitions.apiStepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US_007_AppointmentsPojo;
import utilities.ConfigurationReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;
import static utilities.US_007_TXTWriter.saveUiRegistrantData;

public class US_007_AppointmentsApiSteps {

    Response response;
    US_007_AppointmentsPojo[] appointments;
    @Given("user sends a get request for user's data")
    public void user_sends_a_get_request_for_user_s_data() {
        response = given().
                headers("Authorization",
                        "Bearer " + ConfigurationReader.getProperty("us_007_api_token"),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON).
                when().get(ConfigurationReader.getProperty("us_007_get_appointments_api"));
        response.prettyPrint();
    }
    @Given("user deserializes the user's data to java")
    public void user_deserializes_the_user_s_data_to_java() throws Exception {
        ObjectMapper obj = new ObjectMapper();
        appointments = obj.readValue(response.asString(), US_007_AppointmentsPojo[].class);
        System.out.println("Size of actual elements: " + appointments.length);

        boolean flag = false;
        for(int i=0; i < appointments.length; i++){
            if("Tolstoy".contains(appointments[i].getLastName())){
                flag = true;
            }
        }
        assertTrue(flag);
    }
    @Then("user saves the users' data to correspondent files and validates")
    public void user_saves_the_users_data_to_correspondent_files_and_validates() {
        saveUiRegistrantData(appointments);
    }

}


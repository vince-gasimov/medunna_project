package stepdefinitions.apiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US_007_Appointments;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;

public class US_007_AppointmentsApiSteps {
    Response response;
    US_007_Appointments appointments;
    @Given("user sends a get request for user's data")
    public void user_sends_a_get_request_for_user_s_data() {
        response = given().
                headers("Authorization", "Bearer " + ConfigurationReader.getProperty("us_007_api_token"), "Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
                when().get(ConfigurationReader.getProperty("us_007_get_appointments_api"));
        response.prettyPrint();
    }
    @Given("user deserializes the user's data to java")
    public void user_deserializes_the_user_s_data_to_java() {
//        ObjectMa
    }
    @Then("user saves the users' data to correspondent files and validates")
    public void user_saves_the_users_data_to_correspondent_files_and_validates() {

    }
}

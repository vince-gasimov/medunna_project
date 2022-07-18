package stepdefinitions.apiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigurationReader;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US_10_API_StepDefs {

    Response response;

    @Given("user sends GET request for appointments")
    public void user_sends_get_request_for_appointments() {

        response = given().headers(
                "Authorization", "Bearer " + generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).when().get("https://medunna.com/api/appointments?=size=10000");


    }

    @When("user receives response with status code {string}")
    public void user_receives_response_with_status_code(String string) {
        response.then().statusCode(200);
    }

    @Then("user verifies that response contains {string}")
    public void user_verifies_that_response_contains(String string) {


    }

}

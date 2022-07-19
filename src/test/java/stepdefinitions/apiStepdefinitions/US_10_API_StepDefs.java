package stepdefinitions.apiStepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US_10_AppointmentPojo;
import pojos.US_10_PhysicianPojo;
import utilities.ConfigurationReader;


import java.util.List;

import static org.junit.Assert.*;
import static utilities.ApiRequestUtils007.getRequest;
import static utilities.Authentication.generateToken;

public class US_10_API_StepDefs {

    Response response;
    US_10_AppointmentPojo  appointmentPojo;
    US_10_PhysicianPojo physicianPojo;
    String token;
    String endPoint = ConfigurationReader.getProperty("US_010_appointmentsListApi");

    @Given("user sends GET request for appointments")
    public void user_sends_get_request_for_appointments() {
        token = generateToken();
        response = getRequest(token, endPoint);


    }

    @When("user receives response with status code {int}")
    public void user_receives_response_with_status_code(Integer statusCode) {
        response.then().assertThat().statusCode(statusCode);

    }

    @Then("user verifies that response contains physicianID")
    public void user_verifies_that_response_contains_physician_id() {

        JsonPath jsonPath = response.jsonPath();

        List<Integer> physicianId = jsonPath.getList("physician.id");
        List<Integer> appointmentId = jsonPath.getList("id");

        System.out.println("Number of appointments : " +appointmentId.size());
        System.out.println("Number of physicians : " +physicianId.size());

        assertTrue(physicianId.contains(94228));
        assertTrue(appointmentId.contains(20739));


    }

}














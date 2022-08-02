package stepdefinitions.apiStepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.US_007_Appointment;
import utilities.ConfigurationReader;

import java.io.IOException;

import static utilities.ApiRequestUtils007.getRequest;
import static utilities.Authentication.generateToken;

public class US_007_AppointmentApiStepDefs {

    String token = "";
//    String endPoint = ConfigurationReader.getProperty("us_007_appointments_url");
    Response response;
    US_007_Appointment[] appointments;

    @Given("generate the token US007")
    public void generate_the_token_us() {
//        token = generateToken();
    }
    @Given("user makes an appointment request with API US007")
    public void user_makes_an_appointment_request_with_api_us() {
//        response = getRequest(token, endPoint);
//        response.prettyPrint();

        response= getRequest(ConfigurationReader.getProperty("us_007_appointments_url"));
    }
    @When("user deserializes the appointments data US007")
    public void user_deserializes_the_appointments_data_us() throws Exception {
        ObjectMapper obj = new ObjectMapper();
        appointments = obj.readValue(response.asString(), US_007_Appointment[].class);
        System.out.println("Size: " + appointments.length);
        System.out.println(appointments[0].getCreatedDate());
        System.out.println(appointments[2].getPatient().getFirstName());
        System.out.println(appointments[2].getPatient().getUser().getLastName());
    }
    @Then("user saves the data US007")
    public void user_saves_the_data_us() {

    }

}

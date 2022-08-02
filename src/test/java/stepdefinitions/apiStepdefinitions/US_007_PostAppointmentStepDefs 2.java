package stepdefinitions.apiStepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US_007_PostAppointmentPojo;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US_007_PostAppointmentStepDefs {

    US_007_PostAppointmentPojo appointmentPojo;
    Response response;
    @Given("user sends a post request for physicians data us007")
    public void user_sends_a_post_request_for_physicians_data_us007() {
//        spec.pathParams("first", "api", "second", "appointments");
        appointmentPojo = new US_007_PostAppointmentPojo("vusal.vince@gmail.com", "Abdulhay", "male", "Abdulhayoglu", "457-456-4554", "544-44-4445", "544-444-4445");
        response= given().headers(
                "Authorization","Bearer "+ generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON
        ).body(appointmentPojo).when().post(ConfigurationReader.getProperty("us_007_post_appointment_api"));
        response.prettyPrint();
    }
    @Given("firstName, lastName, ssn should be validated by api us007")
    public void first_name_last_name_ssn_should_be_validated_by_api_us007() {
        US_007_PostAppointmentPojo actualPojo = response.as(US_007_PostAppointmentPojo.class);

        assertEquals(appointmentPojo.getSsn(), actualPojo.getSsn());
    }
}

package stepdefinitions.apiStepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.US_005_Appointment;
import utilities.ConfigurationReader;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;
import static utilities.Authentication.generateToken;
import static utilities.US_005_TXTWriter.saveUIAppointmentData;


public class US_005_ApiAppointmentStepDefs {
    Response response;

    US_005_Appointment[] us_005_appointments;
    @Given("user sends a get request for users' data")
    public void user_sends_a_get_request_for_users_data() {
        response = given().headers(
                "Authorization",
                "Bearer " + generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).when().get(ConfigurationReader.getProperty("api_users"));

        response.prettyPrint();
    }

    @Given("user deserializes the users' data to java")
    public void user_deserializes_the_users_data_to_java() throws Exception{
        ObjectMapper obj = new ObjectMapper();
        us_005_appointments = obj.readValue(response.asString(), US_005_Appointment[].class);
        System.out.println("Size of the actual elements: " + us_005_appointments.length);

        boolean flag = false;
        for (int i = 0; i < us_005_appointments.length; i++) {

            if (us_005_appointments[i].getSsn().contains("369-38-8064")) {
                System.out.println(us_005_appointments[i].getSsn());
                flag = true;
                break;
            }

        }
        assertTrue(flag);
    }


    @Then("user saves the users' data to correspondent files and validates")
    public void user_saves_the_users_data_to_correspondent_files_and_validates() {
        saveUIAppointmentData(us_005_appointments);
    }

}

package stepdefinitions.apiStepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigurationReader;

import java.util.List;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;
import static utilities.US_018_TXTWriter.saveApiUS_18_PhysiciansData;

public class US_18_Physicians {

        Response response;
        List<Object> us_18_physicians;
        @Given("admin sends a get request for users' data")
        public void admin_sends_a_get_request_for_users_data() {
            response = given().headers(
                    "Authorization",
                    "Bearer " + generateToken(),
                    "Content-Type", ContentType.JSON,
                    "Accept", ContentType.JSON
            ).when().get(ConfigurationReader.getProperty("api_newUsers"));
            response.prettyPrint();
        }

        @Given("admin deserializes the users' data to java")
        public void admin_deserializes_the_users_data_to_java() throws Exception {
            ObjectMapper obj = new ObjectMapper();
            us_18_physicians = obj.readValue(response.asString(), List.class);
            System.out.println("Size of the actual elements: " + us_18_physicians.size());



        }


        @Then("admin saves the users' data to correspondent files and validates")
        public void admin_saves_the_users_data_to_correspondent_files_and_validates() {
            saveApiUS_18_PhysiciansData(us_18_physicians);
        }







}

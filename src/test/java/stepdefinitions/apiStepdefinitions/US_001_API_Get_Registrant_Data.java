package stepdefinitions.apiStepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US_01_Registrant;
import utilities.ConfigurationReader;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Authentication.generateToken;

import static utilities.US_001_TXTWriter.*;



public class US_001_API_Get_Registrant_Data {

    Response response;
    US_01_Registrant[] registrants;

    Faker faker = new Faker();

    @Given("user sends a get-request to get all registrants' data")
    public void user_sends_a_get_request_() {

        response = given().headers(
                "Authorization",
                "Bearer " + generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).when().get(ConfigurationReader.getProperty("registrant_endpoint"));

             response.prettyPrint();

    }

    @Given("user deserializes the response")
    public void user_deserializes_the_response() throws Exception {

        ObjectMapper obj = new ObjectMapper();
        registrants = obj.readValue(response.asString(), US_01_Registrant[].class);


    }

    @Then("user saves the data to the files and validates")
    public void user_saves_the_data_to_the_files_and_validates() {
        saveUiRegistrantsData(registrants);


    }

    @Given("user sends a post-request to create a new registrant")
    public void userSendsAPostRequestToCreateANewRegistrant() {

        //1.setting the url
        spec.pathParams("first", "api", "second", "register");

        //2.set the request body
        US_01_Registrant requestBody = new US_01_Registrant(
                ("Team83_" + faker.name().firstName()),
                ("PostRequest_" + faker.name().lastName()),
                (faker.idNumber().ssnValid()),
                ("Team83_" + faker.name().username()),
                "en",
                "123456789",
                ("team83_" + faker.internet().emailAddress()),
                true);

        //3.setting the post request and get the response
        response = given().spec(spec).contentType(ContentType.JSON).body(requestBody).when().post("/{first}/{second}");

        //4.Do assertions
        US_01_Registrant actual = response.as(US_01_Registrant.class);

        assertEquals(requestBody.getSsn(), actual.getSsn());//asserting the ssn

        assertEquals(requestBody.getFirstName(), actual.getFirstName());


        System.out.println(actual.getFirstName());

        System.out.println(actual.getSsn()); //print the ssn to the console to see if it is correct

        saveApiNewRegistrantData(new US_01_Registrant[]{actual}); //save the new registrant to the file


    }
}

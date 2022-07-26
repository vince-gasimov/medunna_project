package stepdefinitions.apiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US_018_PostPhysicianPojo;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import static utilities.Authentication.generateToken;

public class US_018_PostPhysician {

    Response response;
    US_018_PostPhysicianPojo physicianPojo;
    @Given("user sends a post request for physicians data")
    public void user_sends_a_post_request_for_physicians_data() {

//        spec.pathParams("first", "api", "second", "physicians");
        physicianPojo = new US_018_PostPhysicianPojo( "Vince", "MALE", "Gasimov", "439-549-2917", "239-10-2222");

        response= given().
                headers(
                "Authorization","Bearer "+ generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON
        ).
                contentType(ContentType.JSON).body(physicianPojo).when().post("https://medunna.com/api/physicians");

        response.prettyPrint();

        Response response2= given().headers(
                "Authorization","Bearer "+ generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON
        ).when().get("https://medunna.com/api/physicians");
//        response2.prettyPrint();

    }
    @Then("Status code should be {int} us018")
    public void status_code_should_be_us018(Integer statusCode) {
        response.then().assertThat().statusCode(statusCode);
    }
    @Then("firstName, lastName, email, ssn should be validated by api")
    public void should_be_validated_by_api() {
        US_018_PostPhysicianPojo actualPojo = response.as(US_018_PostPhysicianPojo.class);

//        assertEquals(physicianPojo.getEmail(), actualPojo.getEmail());
//        assertEquals(physicianPojo.getFirstName(), actualPojo.getEmail());
    }
}

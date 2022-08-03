package stepdefinitions.apiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US_009_API_stepdefs {

    Response response;

    @Given("user sends a get request for patients data with id {string}")
    public void user_sends_a_get_request_for_patients_data(String id) {
        String path = "US_009_get_patient_request";
        //path = path + "/" + id;
        response = given().headers(
                "Authorization",
                "Bearer " + generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).when().get(ConfigurationReader.getProperty(path));

//        response.prettyPrint();

    }


/*
    @Given("user sends a get request for patients  data")
    public void user_sends_a_get_request_for_patients_data() {

        response = given().baseUri(ConfigurationReader.getProperty("US_009_get_patient_request")).
               when().headers("Authorization",
                        "Bearer "+ ConfigurationReader.getProperty("us_009_api_token"),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON).get("/api/patients/4859");
        response.prettyPrint();

    }

 */

    @Given("user verifies status code is {int}")
    public void user_verifies_status_code_is(Object expectedStatusCode) {

        //verify status code

        Assert.assertEquals(response.statusCode(), expectedStatusCode);
        System.out.println(response.asString());

    }
    @Then("user validates patient id, firstname, ssn, email with expected data")
    public void user_validates_patient_id_firstname_ssn_email_with_expected_data() {
        JsonPath jsonpath=response.jsonPath();
        String actualName=jsonpath.getString("firstName");
        Assert.assertEquals(actualName,"Seval");
        String countryName=jsonpath.getString("country.name");
        Assert.assertEquals(countryName,"Bulgaria");
    }



}

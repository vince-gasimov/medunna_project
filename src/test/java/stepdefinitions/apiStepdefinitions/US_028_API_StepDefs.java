package stepdefinitions.apiStepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigurationReader;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static utilities.Authentication.generateToken;
import static utilities.US_002_TXTWriter.readFile;
import static utilities.US_002_TXTWriter.saveMapToFile;

public class US_028_API_StepDefs {
    Response response;
    Map<String, Object> expectedData= new HashMap<>();
    Map<String, Object> actualData = new HashMap<>();
    String countryUi;
    int countryIdUi;


    @Given("user gets country data from ui")
    public void userGetsCountryDataFromUi() {
        String expectedUiData= readFile(ConfigurationReader.getProperty("US_028_country_ui_data"));
        String uiData= expectedUiData.replaceAll("[,{}]","=");
        String [] uiDataArray= uiData.split("=");
        countryUi= uiDataArray[2];
        countryIdUi= Integer.valueOf(uiDataArray[4]);
    }
    @Given("user provides expected country data from ui")
    public void userProvidesExpectedCountryDataFromUi() {
        expectedData.put("id",countryIdUi);
        expectedData.put("name",countryUi);
    }
    @Given("user sends a get request for countries")
    public void userSendsAGetRequestForCountries() {
        spec.pathParams("first","api","second","countries");
        response= given().spec(spec).headers(
                "Authorization","Bearer "+ generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON
        ).when().get("/{first}/{second}");
//        response.prettyPrint();
    }
    @Then("status code should be {int}")
    public void status_code_should_be(int statusCode) {
        response.then().assertThat().statusCode(statusCode);
    }
    @Then("country should be validated by api")
    public void country_should_be_validated_by_api() {
        response.then().assertThat().body("id",hasItem(expectedData.get("id"))).body("name",hasItem(expectedData.get("name")));

    }
    @Given("user sends get request using country id")
    public void userSendsGetRequestUsingCountryId() {
        response= given().
        headers(
        "Authorization","Bearer "+ generateToken(),
        "Content-Type", ContentType.JSON,
        "Accept",ContentType.JSON
        ).when().get("https://medunna.com/api/countries/"+expectedData.get("id"));
//        response.prettyPrint();
    }

    @Given("user sends a get request for getting new created state by country id")
    public void user_sends_a_get_request_for_getting_new_created_state_by_country_id() {
        response= given().headers(
        "Authorization","Bearer "+generateToken(),
        "Content-Type",ContentType.JSON,
        "Accept",ContentType.JSON
        ).when().get("https://medunna.com/api/c-states/country/1201");
//        response.prettyPrint();
    }
    @Then("state should be validated by api")
    public void state_should_be_validated_by_api() {
        response.then().assertThat().body("name",hasItem("Istanbul"));

    }
    @Given("user provides post body for country creation")
    public void user_provides_post_body_for_country_creation() {
        expectedData.put("name", Faker.instance().country().name());
    }
    @Given("user sends a post request for creating new country")
    public void user_sends_a_post_request_for_creating_new_country() {
        spec.pathParams("first","api","second","countries");
        response = given().spec(spec).
                headers(
                        "Authorization", "Bearer "+generateToken(),
                        "Content-Type",ContentType.JSON,
                        "Accept",ContentType.JSON
                ).
                contentType(ContentType.JSON).body(expectedData).when().post("/{first}/{second}");
        response.prettyPrint();
    }

    @When("user deserializes country data")
    public void userDeserializesCountryData() throws IOException {
        ObjectMapper obj= new ObjectMapper();
        actualData= obj.readValue(response.asString(),HashMap.class);
    }
    @Then("country should be validated")
    public void countryShouldBeValidated() {
        actualData= response.as(HashMap.class);
        Assert.assertEquals(expectedData.get("name"),actualData.get("name"));
        Assert.assertEquals(expectedData.get("id"),actualData.get("id"));
    }
    @Then("user verifies from api created country")
    public void userVerifiesFromApiCreatedCountry() {
        Assert.assertEquals(expectedData.get("name"), actualData.get("name"));
    }

    @Given("user provides put body")
    public void user_provides_put_body() {
        expectedData.put("name",Faker.instance().country().name());
        expectedData.put("id",countryIdUi);
    }
    @When("user sends a put request for updating new country")
    public void user_sends_a_put_request_for_updating_new_country() {
        spec.pathParams("first","api","second","countries");
        response= given().spec(spec).headers(
                "Authorization","Bearer "+generateToken(),
                "Content-Type",ContentType.JSON,
                "Accept",ContentType.JSON
        ).contentType(ContentType.JSON).body(expectedData).put("/{first}/{second}");
//        response.prettyPrint();
    }
    @And("updated country should be validated by api")
    public void updatedCountryShouldBeValidatedByApi() {
        response.then().assertThat().body("name",equalTo(expectedData.get("name")));
    }
    @And("user updates the ui file and saves updated country in another file")
    public void userUpdatesTheUiFileAndSavesUpdatedCountryInAnotherFile() {
        saveMapToFile(expectedData,ConfigurationReader.getProperty("US_028_country_ui_data"));
        saveMapToFile(expectedData, ConfigurationReader.getProperty("US_028_updated_country_api_data"));
    }
    @And("user saves new created country data")
    public void userSavesNewCreatedCountryData() {
        saveMapToFile(actualData,ConfigurationReader.getProperty("US_028_country_api_data"));
    }
}

package stepdefinitions.apiStepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US_002_RegistrantPojo;
import utilities.ConfigurationReader;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static utilities.Authentication.generateToken;
import static utilities.US_002_TXTWriter.readFile;

public class US_002_API_StepDefs {

        Response response;
        US_002_RegistrantPojo requestBody;
        Faker faker= new Faker();

        @Given("user sends a get request for users data US_002")
        public void userSendsAGetRequestForUsersDataUS_002() {

        response= given().headers(
                "Authorization","Bearer "+ generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON
        ).when().get(ConfigurationReader.getProperty("US_002_user_api_url"));
    }

        @Then("Status code should be {int} US_002")
        public void status_code_should_be_US_002(Integer statusCode) {
        response.then().assertThat().statusCode(statusCode);
    }

        @Then("username {string} should be validated by api US_002")
        public void username_should_be_validated_by_api_US_002(String string) {
        string= readFile(ConfigurationReader.getProperty("US_002_applicant_data"));
        String[] registrantData= string.split("'");
//        System.out.println(Arrays.toString(registrantData));
        String username= registrantData[7];
//        System.out.println(username);
//        response.then().assertThat().body("login",hasItem(username));
        response.then().assertThat().body("login",hasItem(username.toLowerCase()));

    }

        @Then("usernames should be unique US_002")
        public void usernames_should_be_unique_US_002() throws IOException {
        JsonPath json=response.jsonPath();

        List<String> actualUsernameData= json.getList("findAll{it.id>0}.login");
//        System.out.println(actualUsernameData);
        Set<String> uniqueUsername= new HashSet<>();
        for (String w:     actualUsernameData) {
            uniqueUsername.add(w);
        }

        boolean flag= false;
        if(actualUsernameData.size()== uniqueUsername.size()){
            flag= true;
        }
        Assert.assertTrue(flag);
    }

        @And("email {string} should be validated by api US_002")
        public void emailShouldBeValidatedByApiUS_002(String string) {
        response.then().assertThat().body("email",hasItem(string));
    }

        @Given("user provides post body US_002")
        public void user_provides_post_body_US_002() {
        String firstName= faker.name().firstName();
        String lastName= faker.name().lastName();
        String ssn= faker.idNumber().ssnValid();
        String username= firstName+lastName;
        String password=faker.internet().password(8,10,true,true);
        String email= username+"@gmail.com";
        requestBody = new US_002_RegistrantPojo(firstName,lastName,ssn,username,password,email);
    }
        @Given("user sends post request for creating new registrant US_002")
        public void user_sends_post_request_for_creating_new_registrant_US_002() {
        spec.pathParams("first","api","second","users");
        response= given().spec(spec).headers(
                "Authorization", "Bearer "+ generateToken(),
                "Content-Type",ContentType.JSON,
                "Accept", ContentType.JSON
        ).body(requestBody).when().post("/{first}/{second}");
//        response.prettyPrint();
    }
        @Then("user verifies username and email with given data in body US_002")
        public void user_verifies_username_and_email_with_given_data_in_body_US_002() throws IOException {
        ObjectMapper obj= new ObjectMapper();
        US_002_RegistrantPojo actualData= obj.readValue(response.asString(),US_002_RegistrantPojo.class);

        Assert.assertEquals(requestBody.getLogin().toLowerCase(),actualData.getLogin());
        Assert.assertEquals(requestBody.getEmail().toLowerCase(),actualData.getEmail());

    }

}

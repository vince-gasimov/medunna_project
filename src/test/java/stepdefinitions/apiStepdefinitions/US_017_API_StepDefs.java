package stepdefinitions.apiStepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US_017_TestItems_pojo;

import java.io.IOException;
import java.util.Arrays;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.hasItem;
import static utilities.Authentication.generateToken;

public class US_017_API_StepDefs {

    US_017_TestItems_pojo expectedPojo;
    Response response;
    US_017_TestItems_pojo[] actualPojo;

    @Given("admin provides expected test items")
    public void admin_provides_expected_test_items() {
        expectedPojo= new US_017_TestItems_pojo("49","17",null,"Urea",12);
    }
    @Given("admin sends get request for test items")
    public void admin_sends_get_request_for_test_items() {
        response= given().headers(
                "Authorization", "Bearer "+ generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON
        ).when().get("https://medunna.com/api/c-test-items");
        response.prettyPrint();
    }
    @Then("Status code should be {int}")
    public void status_code_should_be(Integer int1) {
        response.then().assertThat().statusCode(int1);
    }

    @When("admin deserializes test items data")
    public void adminDeserializesTestItemsData() throws IOException {
        ObjectMapper obj= new ObjectMapper();
        actualPojo= obj.readValue(response.asString(),US_017_TestItems_pojo[].class);

//        System.out.println(Arrays.toString(actualPojo));
    }
    @Then("admin verifies new created test item by api")
    public void admin_verifies_new_created_test_item_by_api() {

       boolean flag=false;

    for (int i=0; i<actualPojo.length;i++){

        if(expectedPojo.getName().equals( actualPojo[i].getName())){
            flag= true;
            break;
        }

        }
       Assert.assertTrue(flag);


        response.then().assertThat().body("name",hasItem(expectedPojo.getName()));
    }

}

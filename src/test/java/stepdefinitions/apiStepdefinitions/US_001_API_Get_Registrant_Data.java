package stepdefinitions.apiStepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US_01_Registrant;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;
import static utilities.Authentication.generateToken;
import static utilities.US_001_TXTWriter.saveUiRegistrantData;

public class US_001_API_Get_Registrant_Data {

    Response response;
    US_01_Registrant[] US01Registrants;

    @Given("user sends a get-request to get all registrants' data")
    public void user_sends_a_get_request_() {

        response = given().headers(
                "Authorization",
                "Bearer " + generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).when().get(ConfigurationReader.getProperty("registrant_endpoint"));
//        response.prettyPrint();

    }

    @Given("user deserializes the response")
    public void user_deserializes_the_response() throws Exception {

        ObjectMapper obj = new ObjectMapper();
        US01Registrants = obj.readValue(response.asString(), US_01_Registrant[].class);
        System.out.println(US01Registrants.length);



        //        for (Registrant registrant : registrants) {
//            List<String> list = Arrays.asList(registrant.getAuthorities());
//            System.out.println(list);
//        }

        boolean flag = false;
        for (int i = 0; i < US01Registrants.length; i++) {

            if (US01Registrants[i].getFirstName().contains("Team")) {
                System.out.println(US01Registrants[i].getFirstName());
                flag = true;
                break;
            }

        }
        assertTrue(flag);
    }

    @Then("user saves the data to the files and validates")
    public void user_saves_the_data_to_the_files_and_validates() {
        saveUiRegistrantData(US01Registrants);


    }
}

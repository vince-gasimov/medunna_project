package stepdefinitions.apiStepdefinitions;

//import com.fasterxml.jackson.databind.ObjectMapper;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import io.restassured.http.ContentType;
//
//import io.restassured.response.Response;
//import org.junit.Assert;
//import pages.DoctorAppointment;
//import utilities.ConfigurationReader;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.Map;
//import static hooks.Hooks.spec;
//import static io.restassured.RestAssured.given;
//import static utilities.Authentication.generateToken;
//import static utilities.US_010_TXTWriter.*;
//public class Us_010_AppointmentsListApiStepDefs {
//
//        DoctorAppointment doctorAppointment=new DoctorAppointment();
//        DoctorAppointment[] doctorAppointments;
//        Response response;
//
////      static DoctorAppointment expectedData;
//        @Given("Doctor sets Medunna base url")
//        public void Doctor_sets_Medunna_base_url() {
////          URL: https://medunna.com/api/appointments
//            spec.pathParams("first","api","second","appointments");
//        }
//
//        @When("Doctor sends the GET request and GET the response")
//        public void doctor_send_the_get_request_and_get_the_response() {
//            response = given().headers(
//                    "Authorization",
//                    "Bearer " + generateToken(),
//                    "Content-Type",
//                    ContentType.JSON,
//                    "Accept",
//                    ContentType.JSON).when().get(ConfigurationReader.getProperty("api_appointments"));
//            response.prettyPrint();
//        }
//
//        @And("Doctor provides patient id as a query parameter")
//        public void doctor_provides_patient_id_as_a_query_parameter(){
//
//        }
//
//        @And("Doctor deserialize data json to java")
//        public void doctorDeserializeDataJsonToJava() throws IOException {
//            response.then().statusCode(200);
//            ObjectMapper objectMapper=new ObjectMapper();
//            doctorAppointments =objectMapper.readValue(response.asString(),DoctorAppointment[].class);
//
//        }
//        @And("Doctor saves the patient data to correspondent files")
//        public void doctorSavesThePatientDataToCorrespondentFiles() {
//            saveUiRegistrantData(doctorAppointment);
//        }
//
//        @And("Doctor validates expected data with API")
//        public void doctorValidatesExpectedDataWithAPI() {
//            List<String> expectedData = getDoctorAppointment_1();
//            //System.out.println("expected:"+ expectedData);
//            List<String> actualTestItems = getDoctorAppointment_2();
//            //System.out.println("actual: "+actualTestItems);
//            Assert.assertTrue(actualTestItems.containsAll(expectedData));
//
//
//        }
//    }




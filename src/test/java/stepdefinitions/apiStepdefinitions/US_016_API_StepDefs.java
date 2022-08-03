package stepdefinitions.apiStepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US_016_Rooms;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;
import static utilities.Authentication.generateToken;
import static utilities.US_016_TXTWriter.saveAPIRegistrantData;

public class US_016_API_StepDefs {
    Response response;
    US_016_Rooms[] allRooms;
    US_016_Rooms room;
    String ID;


    @Given("software sends a get request for rooms' data")
    public void softwareSendsAGetRequestForRoomsData() {
        response = given().headers(
                "Authorization",
                "Bearer " + generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).when().get(ConfigurationReader.getProperty("roomResources_api_url"));

//       response.prettyPrint();

    }

    @Given("user should receive {int} status code")
    public void userShouldReceiveStatusCode(Integer statusCode) {

        response.then().assertThat().statusCode(200);

    }

    @And("software deserializes the rooms' data to java")
    public void softwareDeserializesTheRoomsDataToJava() throws Exception {

        ObjectMapper obj = new ObjectMapper();

        allRooms = obj.readValue(response.asString(), US_016_Rooms[].class);

        System.out.println(" Size of the actual element : " + allRooms.length);

       boolean flag = false;

        for (int i = 0; i < allRooms.length; i++) {
            System.out.println("Room Number : " + allRooms[i].getRoomNumber() + " \t\t Room Type :" + allRooms[i].getRoomType());
            if ("101601".equals(String.valueOf(allRooms[i].getRoomNumber()).trim())) {
                flag = true;
                System.out.println("\n****Room Number is matched with the expected room number ... ****\n");
            }
        }

        assertTrue(flag);



    }

    @Then("software saves the rooms' data to corresponding file and validates the data")
    public void softwareSavesTheRoomsDataToCorrespondingFileAndValidatesTheData() {


//        for (int i = 0; i < allRooms.length; i++) {
//
//            if (String.valueOf(room.getRoomNumber()).equals(String.valueOf(allRooms[i].getRoomNumber()).trim())) {
//                flag = true;
//                System.out.println("\n****Room Number is matched with the expected room number ... ****\n");
//            }
//
//        }
//            response.then().assertThat().body(String.valueOf(room.getRoomNumber()), hasItem(allRooms[0].getRoomNumber()));
        saveAPIRegistrantData(allRooms);

    }

    @Then("software checks the roomNumber, roomType, status, price and description data from endpoint and id")
    public void softwareChecksTheRoomNumberRoomTypeStatusPriceAndDescriptionDataFromEndpointAndId(DataTable dataTable) {
//        String endpoint = ConfigurationReader.getProperty("roomResources_api_url");
//        List<Map<Object, Object>> expectedMapList = dataTable.asMaps(Object.class, Object.class);
//        //expectedMapList.stream().forEach(System.out::println);
//        for (int i = 0; i < expectedMapList.size(); i++) {
//            ID = String.valueOf(expectedMapList.get(i).get("id"));
//            System.out.println("ID = " + ID);
//
//            response = given().
//                    headers(
//                            "Authorization",
//                            "Bearer " + Authentication.generateToken(),
//                            "Content-Type",
//                            ContentType.JSON,
//                            "Accept",
//                            ContentType.JSON).
//                    when().
//                    get(endpoint + "/" + ID).
//                    then().
//                    extract().
//                    response();
//
//            HashMap<Object, Object> actualMap = response.as(HashMap.class);
//
//            for (int j = 0; j < expectedMapList.get(i).size(); j++) {
//                Assert.assertEquals(expectedMapList.get(i).get(j), actualMap.get(j + 2));
//            }
//            break;
//        }
//    }
    }}
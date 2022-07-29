package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class ApiRequestUtils007 {

    public static Response getRequest(String token, String endPoinnt){

        Response response = given().headers("Authorization",
                "Bearer " + token,
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON)
                .when().get(endPoinnt);
        return response;
    }
    public static Response getRequest(String endPoinnt){

        Response response = given().headers("Authorization",
                        "Bearer " + generateToken(),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when().get(endPoinnt);
        return response;
    }
}

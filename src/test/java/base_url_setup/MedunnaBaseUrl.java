package base_url_setup;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class MedunnaBaseUrl {

    protected static RequestSpecification spec;

    public static void medunnaSetup(){

        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com/").build();
    }
}

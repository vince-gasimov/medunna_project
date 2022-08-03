package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import pages.LoginPage;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utilities.ConfigurationReader;
import utilities.Driver;


import static base_url_setup.MedunnaBaseUrl.medunnaSetup;

public class Hooks {
//    What is hooks class in cucumber?
//    hooks has Before and After annotations.
//    hooks will run Before and After each Scenario
//    What is in your After in the hooks?
//    -In cucumber hooks I use reports and I take screenshot
//    -I designed my hooks. It takes screenshot when a test scenario fails.



    public  static RequestSpecification spec;
    @Before(value= "@Api")
    public void baseUrlSetup(){
        spec= new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("base_url")).build();
    }



    @Before(order=1, value="@Login")
    public void beforeScenario() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
        LoginPage login = new LoginPage();
        Driver.waitAndClick(login.signInAndRegistrationPortal);
        Driver.waitAndClick(login.signIn);
    }

    @Before(order=3, value="@UIregistration")
    public void beforeRegistration() {
        Driver.getDriver().get("https://medunna.com/account/register");
    }

    @Before(order=4, value ="@Api")
    public void beforeApi(){
        medunnaSetup();
    }



//    @After(order=3, value="@UIregistration")
//    public void tearDown(Scenario scenario) throws IOException {
//        System.out.println();
//////        System.out.println("This is hooks after method");
//////        Getting the screenshot: getScreenshotAs method takes the screenshot
//        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
////       Attaching the screenshot to the scenarios in the default-cucumber-reports.html
//
//        if (scenario.isFailed()) {
//            scenario.attach(screenshot, "image/png", "Screenshot");
//        }





    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshots");
        }
    }

}
package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_007_HomePageStepDefs {

    HomePage homePage = new HomePage();
    @Given("user is navigated to medunna.com")
    public void user_is_navigated_to_medunna_com() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }
    @When("user clicks Make an Appointment button")
    public void user_clicks_make_an_appointment_button() throws InterruptedException {
        homePage.makeAnAppointment.click();
        Thread.sleep(2);
    }
}

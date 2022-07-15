package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.US_006_Pages;
import pages.US_021_App_Page;
import pages.US_021_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_021_StepDefs {

    US_021_Page us_021_page = new US_021_Page();
    US_021_App_Page us_021_app_page =new US_021_App_Page();

    @Given("Staff goes to Medunna URL")
    public void staff_goes_to_medunna_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_home_page"));
    }


    @Then("Staff clicks on the icon on the top right corner")
    public void staff_clicks_on_the_icon_on_the_top_right_corner() {
        us_021_page.userIcon.click();
    }


    @Then("Staff clicks signs in button")
    public void staff_clicks_signs_in_button() {
        us_021_page.signInButton.click();
    }


    @Then("Staff enters username")
    public void staff_enters_username() {
        Driver.getDriver().get(ConfigurationReader.getProperty("us_021_username"));
    }


    @Then("Staff enters password")
    public void staff_enters_password() {
        Driver.getDriver().get(ConfigurationReader.getProperty("us_021_password"));
    }


    @Then("Staff clicks on the sign in button on the right bottom")
    public void staff_clicks_on_the_sign_in_button_on_the_right_bottom() {
        us_021_page.signInButton2.click();
    }


    @Then("Staff clicks on the MY PAGES button")
    public void staff_clicks_on_the_my_pages_button() {
        us_021_page.myPagesButton.click();
    }


    @Then("Staff clicks Search Patient button")
    public void staff_clicks_search_patient_button() {
        us_021_page.searchPatientButton.click();
    }


    @Then("Staff enters SSN in the Patient SSN: box")
    public void staff_enters_ssn_in_the_patient_ssn_box() {
        us_021_page.patientSsnButton.sendKeys(ConfigurationReader.getProperty("us_021_SSN"));
    }


    @Then("Staff clicks Show Appointments button")
    public void staff_clicks_show_appointments_button() {
        us_021_page.showAppButton.click();
    }


    @Then("Staff clicks Edit button")
    public void staff_clicks_edit_button() {
        us_021_page.editButton.click();
    }


    @Then("Staff updates appointment")
    public void staff_updates_appointment() {
    }


    @Then("Staff clicks Save button")
    public void staff_clicks_save_button() {
        us_021_app_page.save.click();
    }


    @Then("Staff shows The appointment is updated with identifier popup")
    public void staff_shows_the_appointment_is_updated_with_identifier_popup() {
        us_021_app_page.popup.isDisplayed();
    }


    @Then("Staff close the browser")
    public void staff_close_the_browser() {
        Driver.closeDriver();
    }
}
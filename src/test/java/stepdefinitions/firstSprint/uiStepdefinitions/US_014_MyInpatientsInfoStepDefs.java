package stepdefinitions.firstSprint.uiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.DoctorHomePage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_014_MyInpatientsInfoStepDefs {

    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();
    DoctorHomePage doctorHomePage=new DoctorHomePage();

    @Given("doctor goes to Medunna Url")
    public void doctor_goes_to_medunna_url() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
        Thread.sleep(3000);
    }
    @When("doctor clicks on the human icon in the upper right corner")
    public void doctor_clicks_on_the_human_icon_in_the_upper_right_corner() throws InterruptedException {


        homePage.userIcon.click();
        Thread.sleep(3000);

    }
    @Then("doctor clicks on Sign In")
    public void doctor_clicks_on_sign_in() throws InterruptedException {

        homePage.signInButton.click();
        Thread.sleep(3000);

    }

    @Then("doctor enters a valid username")
    public void doctor_enters_a_valid_username() throws InterruptedException {

        loginPage.usernameBox.sendKeys("team83_filizdoctor1"+ Keys.ENTER);
        Thread.sleep(3000);

    }

    @Then("doctor enters a valid password")
    public void doctor_enters_a_valid_password() throws InterruptedException {

        loginPage.passwordBox.sendKeys("filizdoctor1"+ Keys.ENTER);
        Thread.sleep(3000);

    }
    @Then("doctor clicks the Sign In button")
    public void doctor_clicks_the_sign_in_button() throws InterruptedException {

        loginPage.signInButton.click();
        Thread.sleep(3000);


    }
    @Then("doctor clicks on MY PAGES")
    public void doctor_clicks_on_my_pages() throws InterruptedException {



        doctorHomePage.myPages.click();
        Thread.sleep(3000);


    }
    @Then("doctor clicks on My Inpatients")
    public void doctor_clicks_on_my_inpatients() {


        doctorHomePage.myInpatients.click();

    }
    @When("doctor verifies the ID of the inpatient is visible")
    public void doctor_verifies_the_id_of_the_inpatient_is_visible() {

    }

    @When("doctor verifies the Start Date of the hospitalization of the inpatient is visible")
    public void doctor_verifies_the_start_date_of_the_hospitalization_of_the_inpatient_is_visible() {

    }

    @When("doctor verifies the End Date of the hospitalization of the inpatient is visible")
    public void doctor_verifies_the_end_date_of_the_hospitalization_of_the_inpatient_is_visible() {

    }

    @When("doctor verifies the Status of the inpatient is visible")
    public void doctor_verifies_the_status_of_the_inpatient_is_visible() {

    }

    @When("doctor verifies the Description written about the inpatient is visible")
    public void doctor_verifies_the_description_written_about_the_inpatient_is_visible() {

    }

    @When("doctor verifies the Created Date of the inpatient is visible")
    public void doctor_verifies_the_created_date_of_the_inpatient_is_visible() {

    }

    @When("doctor verifies the Room of the inpatient is visible")
    public void doctor_verifies_the_room_of_the_inpatient_is_visible() {

    }

    @When("doctor verifies the Appointment ID of the inpatient is visible")
    public void doctor_verifies_the_appointment_id_of_the_inpatient_is_visible() {

    }

    @When("doctor verifies the Patient is visible")
    public void doctor_verifies_the_patient_is_visible() {

    }





}

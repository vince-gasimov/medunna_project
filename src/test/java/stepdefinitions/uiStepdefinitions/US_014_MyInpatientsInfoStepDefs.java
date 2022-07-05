package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DoctorPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_014_MyInpatientsInfoStepDefs {

    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();
    DoctorPage doctorPage =new DoctorPage();

    @Given("doctor goes to Medunna Url")
    public void doctor_goes_to_medunna_url() {

        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));

    }
    @When("doctor clicks on the human icon in the upper right corner")
    public void doctor_clicks_on_the_human_icon_in_the_upper_right_corner(){


        homePage.userIcon.click();




    }
    @Then("doctor clicks on Sign In")
    public void doctor_clicks_on_sign_in()  {

        homePage.signInButton.click();



    }

    @Then("doctor enters a valid username")
    public void doctor_enters_a_valid_username()  {


        loginPage.usernameBox.sendKeys("team83_filizdoctor1");



    }

    @Then("doctor enters a valid password")
    public void doctor_enters_a_valid_password() throws InterruptedException {

        loginPage.passwordBox.sendKeys("filizdoctor1");
        Thread.sleep(3000);


    }
    @Then("doctor clicks the Sign In button")
    public void doctor_clicks_the_sign_in_button() throws InterruptedException {

        loginPage.signInButton.click();
        Thread.sleep(3000);




    }
    @Then("doctor clicks on MY PAGES")
    public void doctor_clicks_on_my_pages()  {


        Driver.waitForVisibility(doctorPage.myPages,10);
        doctorPage.myPages.click();




    }
    @Then("doctor clicks on My Inpatients")
    public void doctor_clicks_on_my_inpatients() {

        Driver.waitForVisibility(doctorPage.myInpatients,10);
        doctorPage.myInpatients.click();


    }
    @When("doctor verifies the ID of the inpatient is visible")
    public void doctor_verifies_the_id_of_the_inpatient_is_visible() {

        Driver.waitForVisibility(doctorPage.id,10);
        Assert.assertTrue(doctorPage.id.isDisplayed());

    }

    @When("doctor verifies the Start Date of the hospitalization of the inpatient is visible")
    public void doctor_verifies_the_start_date_of_the_hospitalization_of_the_inpatient_is_visible() {
        Driver.waitForVisibility(doctorPage.startDate,10);
        Assert.assertTrue(doctorPage.startDate.isDisplayed());

    }

    @When("doctor verifies the End Date of the hospitalization of the inpatient is visible")
    public void doctor_verifies_the_end_date_of_the_hospitalization_of_the_inpatient_is_visible() {
        Driver.waitForVisibility(doctorPage.endDate,10);
        Assert.assertTrue(doctorPage.endDate.isDisplayed());

    }

    @When("doctor verifies the Status of the inpatient is visible")
    public void doctor_verifies_the_status_of_the_inpatient_is_visible() {
        Driver.waitForVisibility(doctorPage.status,10);
        Assert.assertTrue(doctorPage.status.isDisplayed());

    }

    @When("doctor verifies the Description written about the inpatient is visible")
    public void doctor_verifies_the_description_written_about_the_inpatient_is_visible() {
        Driver.waitForVisibility(doctorPage.description,10);
        Assert.assertTrue(doctorPage.description.isDisplayed());

    }

    @When("doctor verifies the Created Date of the inpatient is visible")
    public void doctor_verifies_the_created_date_of_the_inpatient_is_visible() {
        Driver.waitForVisibility(doctorPage.createdDate,10);
        Assert.assertTrue(doctorPage.createdDate.isDisplayed());

    }

    @When("doctor verifies the Room of the inpatient is visible")
    public void doctor_verifies_the_room_of_the_inpatient_is_visible() {
        Driver.waitForVisibility(doctorPage.room,10);
        Assert.assertTrue(doctorPage.room.isDisplayed());

    }

    @When("doctor verifies the Appointment ID of the inpatient is visible")
    public void doctor_verifies_the_appointment_id_of_the_inpatient_is_visible() {
        Driver.waitForVisibility(doctorPage.appointment,10);
        Assert.assertTrue(doctorPage.appointment.isDisplayed());

    }

    @When("doctor verifies the Patient is visible")
    public void doctor_verifies_the_patient_is_visible() {
        Driver.waitForVisibility(doctorPage.patient,10);
        Assert.assertTrue(doctorPage.patient.isDisplayed());

    }

    @When("doctor closes the application")
    public void doctor_closes_the_application() {

        doctorPage.doctorName.click();
        Driver.waitForVisibility(doctorPage.signOut,10);
        doctorPage.signOut.click();

    }






}

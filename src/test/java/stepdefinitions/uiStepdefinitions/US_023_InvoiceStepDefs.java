package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_023_InvoiceStepDefs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    US_23_Invoice_Patient patientPage = new US_23_Invoice_Patient();
    Actions actions = new Actions(Driver.getDriver());



    @Given("Patient goes to Medunna URL")
    public void patient_goes_to_medunna_url() {
        Driver.getDriver().get("https://medunna.com");
    }

    @Given("Patient clicks on the icon on the top right corner")
    public void patient_clicks_on_the_icon_on_the_top_right_corner() {
        homePage.userIcon.click();
    }

   @Given("Patient clicks signs in button")
    public void patient_clicks_signs_in_button() {
        homePage.signInButton.click();
   }

   @Given("Patient should entered a valid username on the sign in page")
    public void user_should_entered_a_valid_username_on_the_sign_in_page() {

        patientPage.usernameBox.sendKeys("team83_patient_02");
    }

    @Given("Patient should entered a valid password on the sign in page")
    public void user_should_entered_a_valid_password_on_the_sign_in_page(){
        loginPage.passwordBox.sendKeys("patient_02");
    }

    @Given("Patient clicks on the sign in button on the right bottom")
    public void patient_clicks_on_the_sign_in_button_on_the_right_bottom() {
        loginPage.signInButton.click();
        Driver.waitAndClick(loginPage.signInButton);
    }



    @Given("Patient clicks on the MY PAGES button")
    public void patient_clicks_on_the_my_pages_button() {
        //ReusableMethods.waitForClickablility(LoginPage.myPagesButton, 3).click();
        ReusableMethods.waitForClickablility(patientPage.myPages, 3).click();
    }

    @Given("Patient clicks on Make An Appointments button")
    public void patient_clicks_on_make_an_appointment_button() {
        patientPage.makeAnAppointment.click();
    }

    @Given("Patient enters phone number")
    public void patient_enters_phone_number() {
        //Patient.phoneNumber.sendKeys("123-123-1212");
        patientPage.Phone.sendKeys("123-123-1212");
    }

    @Then("Patient sends request for an appointment")
    public void patient_sens_request_for_an_appointment() {
        patientPage.AppointmentRequest.submit();
    }


    @Given("Staff goes to Medunna")
    public void staff_goes_to_medunna() {

    }
    @Given("Staff clicks on the right top of the corner")
    public void staff_clicks_on_the_right_top_of_the_corner() {

    }
    @Given("Staff clicks on the sign in button")
    public void staff_clicks_on_the_sign_in_button() {

    }
    @Given("Staff enters valid username")
    public void staff_enters_valid_username() {

    }
    @Given("Staff enters valid password")
    public void staff_enters_valid_password() {

    }
    @Given("Staff clicks on the My Pages button")
    public void staff_clicks_on_the_my_pages_button() {

    }
    @Given("Staff clicks on the Search patient button")
    public void staff_clicks_on_the_search_patient_button() {

    }
    @Given("Staff enters SSN number in the patient SSN box")
    public void staff_enters_ssn_number_in_the_patient_ssn_box() {

    }
    @When("Staff should see patient status completed")
    public void staff_should_see_patient_status_completed() {

    }
    @When("Staff views of patient Exam fee")
    public void staff_views_of_patient_exam_fee() {

    }
    @When("Staff views of patient test item prices")
    public void staff_views_of_patient_test_item_prices() {

    }
    @Then("Staff creates invoice for patient")
    public void staff_creates_invoice_for_patient() {

    }
    @Then("Staff save invoice")
    public void staff_save_invoice() {

    }


}
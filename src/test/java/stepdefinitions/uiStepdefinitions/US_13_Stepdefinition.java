package stepdefinitions.uiStepdefinitions;
import org.junit.Assert;
import pages.US_013Pages;
import utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigurationReader;

import java.util.NoSuchElementException;

public class US_13_Stepdefinition {
    US_013Pages us_013Pages = new US_013Pages();


    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }
    @When("User clicks on account menu")
    public void user_clicks_on_account_menu() {
        Driver.waitAndClick(us_013Pages.accountMenu);
    }
    @Then("User clicks on signin")
    public void user_clicks_on_signin() {
       Driver.waitAndClick(us_013Pages.loginItem);
    }
    @Then("User enters username")
    public void user_enters_username() {
      us_013Pages.username.sendKeys(ConfigurationReader.getProperty("validDoctorUsername"));
    }
    @Then("User enters password")
    public void user_enters_password() {
    us_013Pages.password.sendKeys(ConfigurationReader.getProperty("validDoctorPassword"));
    }
    @Then("User clicks on signin button")
    public void user_clicks_on_signin_button() {
        Driver.waitAndClick(us_013Pages.signinButton);
    }
    @Then("Doctor verifies that his page is displayed")
    public void doctor_verifies_that_his_page_is_displayed() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(us_013Pages.doctorAccount.isDisplayed());
    }
    @Then("Doctor clicks on mypage")
    public void doctor_clicks_on_mypage() {
        Driver.waitAndClick(us_013Pages.myPage);
    }
    @Then("Doctor clicks on myaccountement")
    public void doctor_clicks_on_myaccountement() {
      Driver.waitAndClick(us_013Pages.myAppointement);
    }
    @Then("Doctor verifies Appointement page is displayed")
    public void doctor_verifies_appointement_page_is_displayed() {
        Assert.assertTrue(us_013Pages.myAppointmentHeading.isDisplayed());
    }
    @Then("Doctor clicks on Edit button")
    public void doctor_clicks_on_edit_button() throws InterruptedException {
        Thread.sleep(2000);
        Driver.waitAndClick(us_013Pages.editButton);
    }
    @Then("Doctor clicks on one of the Show Test Result button.")
    public void doctor_clicks_on_one_of_the_show_test_result_button() throws InterruptedException {
        Thread.sleep(5000);
        Driver.clickWithJS(us_013Pages.showTheTestResultButton);
    }
    @Then("Doctor clicks on one of the View Results button.")
    public void doctor_clicks_on_one_of_the_view_results_button() throws InterruptedException {
      Thread.sleep(5000);
      Driver.waitAndClick(us_013Pages.viewResultButton);
    }
    @Then("Doctor verifies that the Test Results page is displayed.")
    public void doctor_verifies_that_the_test_results_page_is_displayed() {
        Driver.waitForVisibility(us_013Pages.testsPageHeading,5000);
        Assert.assertTrue(us_013Pages.testsPageHeading.isDisplayed());
    }
    @Then("Doctor verifies that  testListHeader is displayed.")
    public void doctor_verifies_that_test_list_header_is_displayed() throws InterruptedException {

        Thread.sleep(2000);
        Driver.waitForVisibility(us_013Pages.testResultHeadingList,5000);
        String expectedHeading = "ID Name Result Default Min. Value Default Max. Value Test Description Date";
        String actuelHeading= us_013Pages.testResultHeadingList.getText();
        Assert.assertTrue(expectedHeading.equals(actuelHeading));
    }
    @Then("Doctor closes the browser")
    public void doctor_closes_the_browser() {
        Driver.closeDriver();
    }

    @Then("Doctor clicks on the Request Inpatient Result button.")
    public void doctor_clicks_on_the_request_inpatient_result_button() {
        Driver.clickWithJS(us_013Pages.requestInpatientButton);
    }
    @Then("Doctor get error message or success message")
    public void doctor_get_error_message_or_success_message() throws InterruptedException {
        Thread.sleep(1000);
        try {
            Boolean result = us_013Pages.InpatientRequestDoneAlertSuccessMessage.isDisplayed();
            Assert.assertTrue(result);

        }catch (NoSuchElementException e){
            Boolean result = us_013Pages.InpatientRequestDoneAlertErrorMessage.isDisplayed();
            Assert.assertTrue(result);
        }
        }
    }

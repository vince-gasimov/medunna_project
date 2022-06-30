package stepdefinitions.firstSprint.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_007_AppointmentPage;
import utilities.Driver;

public class US_007_AppointmentStepDefs {

    US_007_AppointmentPage appointment = new US_007_AppointmentPage();
    Faker faker = new Faker();
    @Then("user enters valid first name")
    public void user_enters_valid_first_name() throws InterruptedException {
        Thread.sleep(3);
        appointment.firstName.sendKeys(faker.name().firstName());
    }
    @Then("user enters valid last name")
    public void user_enters_valid_last_name() {
        appointment.lastName.sendKeys(faker.name().lastName());
    }
    @Then("user enters valid ssn")
    public void user_enters_valid_ssn() {
        appointment.ssn.sendKeys("101-01-0101");
    }
    @Then("user enters valid email")
    public void user_enters_valid_email() {
        appointment.email.sendKeys(faker.internet().emailAddress());
    }
    @Then("user enters valid phone number")
    public void user_enters_valid_phone_number() {
        appointment.phone.sendKeys("312-345-7628");
    }
    @When("user enters valid appointment date")
    public void user_enters_valid_appointment_date() {
        appointment.date.sendKeys("09/18/2023");
    }
    @When("user clicks Send and Appointment Request")
    public void user_clicks_send_and_appointment_request() {
        appointment.submitButton.submit();
    }
    @And("verify user can make an appointment successfully")
    public void verifyUserCanMakeAnAppointmentSuccessfully() {
        Driver.waitForVisibility(appointment.successMessage,10);
        Assert.assertTrue(appointment.successMessage.isDisplayed());
    }
    @When("user enters an {string}")
    public void userEntersAn(String date) {
        appointment.date.sendKeys(date);
    }
    @Then("user sees Appointment date can not be past date! warning on date field")
    public void userSeesAppointmentDateCanNotBePastDateWarningOnDateField() {
        Driver.waitForVisibility(appointment.pastDueWarnning,10);
        Assert.assertTrue(appointment.pastDueWarnning.isDisplayed());
    }
    @Then("verify user can not make an appointment successfully")
    public void verify_user_can_not_make_an_appointment_successfully() {
        Driver.waitForVisibility(appointment.errorMessage,10);
        Assert.assertTrue(appointment.errorMessage.isDisplayed());
    }
    @Then("close the application")
    public void closeTheApplication() {
        Driver.getDriver().close();
    }
//    @When("user enters {string}")
//    public void user_enters(String string) {
//        appointment.date.sendKeys(string);
//    }
    @When("user enters today's date")
    public void userEntersTodaySDate() {
        appointment.date.sendKeys("06292022");
    }
    @When("user enters valid future date")
    public void userEntersValidFutureDate() {
        appointment.date.sendKeys("03122035");
    }
    @Then("user verifies that correct date is displayed")
    public void user_verifies_that_correct_date_is_displayed() {
        Assert.assertTrue(appointment.futureDate.isDisplayed());
    }

    @Then("user should not see any error message")
    public void userShouldNotSeeAnyErrorMessage() {
        Assert.assertFalse(appointment.pastDueWarnning.isDisplayed());
    }

    @When("user enters valid {string} using forward slash")
    public void userEntersValidUsingForwardSlash(String date) {
        appointment.date.sendKeys(date);
    }
    @When("user enters letters on date box")
    public void user_enters_letters_on_date_box() {
        appointment.date.sendKeys("asdadasffsfas");
    }
    @Then("user does not see any change on date")
    public void user_does_not_see_any_change_on_date() {
        Assert.assertTrue(appointment.todaysDate.isDisplayed());
    }
}

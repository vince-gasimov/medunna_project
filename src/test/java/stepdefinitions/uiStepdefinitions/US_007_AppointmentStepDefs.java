package stepdefinitions.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.US_007_AppointmentPage;
import pojos.US_007_Appointments;
import utilities.ConfigurationReader;
import utilities.Date;
import utilities.Driver;
import utilities.ExcelUtil;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static utilities.TXTWriter.saveUiRegistrantData;

public class US_007_AppointmentStepDefs {

    HomePage homePage = new HomePage();
    US_007_AppointmentPage appointment = new US_007_AppointmentPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    US_007_Appointments appointmentPojo = new US_007_Appointments();
    LocalDate todaysData;
    String path = "./src/test/resources/testdata/mysmoketestdata.xlsx";


    @Given("user is navigated to medunna.com")
    public void user_is_navigated_to_medunna_com() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }
    @When("user clicks Make an Appointment button")
    public void user_clicks_make_an_appointment_button() throws InterruptedException {
        homePage.makeAnAppointment.click();
        Thread.sleep(2);
    }
    @When("user clicks Send and Appointment Request")
    public void user_clicks_send_and_appointment_request() {
        appointment.submitButton.submit();
    }
    @And("verify user can make an appointment successfully")
    public void verifyUserCanMakeAnAppointmentSuccessfully() {
        Driver.waitForVisibility(appointment.successMessage,10);
        Assert.assertTrue(appointment.successMessage.isDisplayed());
        saveUiRegistrantData(appointmentPojo);
    }
    @Then("user sees Appointment date can not be past date! warning on date field")
    public void userSeesAppointmentDateCanNotBePastDateWarningOnDateField() {
        Driver.waitForVisibility(appointment.pastDueWarning,10);
        Assert.assertTrue(appointment.pastDueWarning.isDisplayed());
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
    @When("user enters valid future date")
    public void userEntersValidFutureDate() {
        appointment.date.sendKeys(Date.futureDate());
    }
    @Then("user should not see any error message")
    public void userShouldNotSeeAnyErrorMessage() {
        Assert.assertFalse(appointment.pastDueWarning.isDisplayed());
    }
    @When("user enters valid {string} using forward slash")
    public void userEntersValidUsingForwardSlash(String date) {
        appointment.date.sendKeys(date);
    }
    @When("user enters letters on date box")
    public void user_enters_letters_on_date_box() {
        appointment.date.sendKeys("asdadasffsfas");
    }
    @When("user enters symbols date box")
    public void user_enters_symbols_date_box() {
        appointment.date.sendKeys("!@#$!$@$!@$!@$");
    }
    @Then("user does not see any error message under date box")
    public void user_does_not_see_any_error_message_under_date_box() {
        Assert.assertFalse(appointment.pastDueWarning.isDisplayed());
    }
    @When("user clicks on date tab and enters valid {string}, {string}, and {string} using tab key")
    public void user_clicks_on_date_tab_and_enters_valid_and_using_tab_key(String month, String day, String year) {
        actions.click(appointment.date).sendKeys(month).
                sendKeys(Keys.TAB).sendKeys(day)
                .sendKeys(Keys.TAB).sendKeys(year).build().perform();
    }
    @When("user enters valid {string}, {string}, {string}, {string}, {string}")
    public void userEntersValid(String firstName, String lastName, String ssn, String email, String phone) {
        Driver.waitForVisibility(appointment.firstName,10);
        appointmentPojo.setFirstName(firstName);
        appointment.firstName.sendKeys(firstName);
        appointmentPojo.setLastName(lastName);
        appointment.lastName.sendKeys(lastName);
        appointmentPojo.setSsn(ssn);
        appointment.ssn.sendKeys(ssn);
        appointmentPojo.setEmail(email);
        appointment.email.sendKeys(email);
        appointmentPojo.setPhone(phone);
        appointment.phone.sendKeys(phone);
    }
    @When("user enters tomorrow's date")
    public void userEntersTomorrowSDate() {
        appointment.date.sendKeys(Date.tomorrowsDate());
    }
    @Then("user enters passed date {string}")
    public void userEntersPassedDate(String date) {
        date = Date.passedDate();
        appointment.date.sendKeys(date);
    }
    @When("user types valid {string}, {string}, {string}, {string}, {string}")
    public void user_types_valid(String firstName, String lastName, String ssn, String email, String phone) {
        Driver.waitForVisibility(appointment.firstName,10);
        firstName = faker.name().firstName();
        appointment.firstName.sendKeys(firstName);
        lastName = faker.name().lastName();
        appointment.lastName.sendKeys(lastName);
        ssn = faker.idNumber().ssnValid();
        appointment.ssn.sendKeys(ssn);
        email = faker.internet().emailAddress();
        appointment.email.sendKeys(email);
        phone = faker.phoneNumber().cellPhone();
        appointment.phone.sendKeys(phone);
    }
    @When("user enters {string} date")
    public void user_enters_date(String today) {
        today = Date.todaysDate();
        appointment.date.sendKeys(today);
    }
    @When("user enters valid {string} date")
    public void user_enters_valid_date(String future) {
        future = Date.futureDate();
        appointment.date.sendKeys(future);
    }
    @When("user enters tomorrow {string} date")
    public void user_enters_tomorrow_date(String string) {
        string = Date.tomorrowsDate();
        appointment.date.sendKeys(string);
    }
    @When("user does not enter anything on date box and clicks Send and Appointment Request")
    public void user_does_not_enter_anything_on_date_box_and_clicks_send_and_appointment_request() {
        appointment.submitButton.submit();
    }
}

package stepdefinitions.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.RegisterPage;
import pojos.US_01_Registrant;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.US_001_TXTWriter.saveUiRegistrantData;


public class US_001_RegisterationStepDefs {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    Faker faker = new Faker();
    US_01_Registrant US01Registrant = new US_01_Registrant();

    @Given("user is on the registration page")
    public void user_is_on_the_registration_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_registration_url"));

    }

    @Given("user enters a valid SSN number as {string}")
    public void user_enters_a_valid_ssn_number_as(String ssn) {

        ssn = faker.idNumber().ssnValid();
        Driver.waitAndSendText(registerPage.ssnBox, ssn);
        US01Registrant.setSsn(ssn);

    }
    @Given("user does not send SSN number")
    public void userDoesNotSendSSNNumber() {
        registerPage.ssnBox.sendKeys("");
    }
    @Given("user enters a valid first name as {string}")
    public void user_enters_a_valid_first_name_as(String firstName) {
        firstName = "Team83_" + faker.name().firstName();
        Driver.waitAndSendText(registerPage.firstNameBox, firstName);
        US01Registrant.setFirstName(firstName);
    }

    @Given("user enters a valid last name as {string}")
    public void user_enters_a_valid_last_name_as(String lastName) {
        lastName =  faker.name().lastName() +"_Team83";
        Driver.waitAndSendText(registerPage.lastNameBox, lastName);
        US01Registrant.setLastName(lastName);

    }

    @Given("user enters an username as {string}")
    public void user_enters_an_username_as(String username) {
        username = "Team83_" + faker.name().username();
        Driver.waitAndSendText(registerPage.usernameBox, username);
        US01Registrant.setLogin(username);
    }

    @Given("user enters a valid email address as {string}")
    public void user_enters_a_valid_email_address_as(String email) {
        email = "Team83_" + faker.internet().emailAddress();
        Driver.waitAndSendText(registerPage.emailBox, email);
        US01Registrant.setEmail(email);

    }

    @Given("user enters a new password as {string} and confirm password as {string}")
    public void user_enters_a_new_password_as_and_confirm_password_as(String password, String confirmPassword) {
        password = faker.internet().password();
        confirmPassword = password;
        Driver.waitAndSendText(registerPage.newPasswordBox, password);
        Driver.waitAndSendText(registerPage.confirmPasswordBox, confirmPassword);
        US01Registrant.setPassword(password);
    }
    @And("user clicks on the register button")
    public void userClicksOnTheRegisterButton() {
        registerPage.registerButton.submit();
    }
    @Then("user should see the registration success message")
    public void userShouldSeeTheRegistrationSuccessMessage() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(registerPage.registrationSuccessMessage, 5).isDisplayed());

    }
    @Then("saves the records")
    public void saves_the_records() {
        saveUiRegistrantData(US01Registrant);
        System.out.println(US01Registrant);

    }

    @Then("user should see the ssn required message")
    public void user_should_see_the_ssn_required_message() {
        Assert.assertTrue(registerPage.ssnErrorMessage.isDisplayed());
    }

    @Then("user should see the FirstName required message")
    public void user_should_see_the_first_name_required_message() {
        Assert.assertTrue(registerPage.firstNameErrorMessage.isDisplayed());
    }

    @Given("user does not enter a first name as {string}")
    public void user_does_not_enter_a_first_name_as(String string) {
        Driver.waitAndSendText(registerPage.firstNameBox, "");
    }

    @Given("user does not enter a last name as {string}")
    public void user_does_not_enter_a_last_name_as(String string) {
        Driver.waitAndSendText(registerPage.lastNameBox, "");
    }

    @Then("user should see the LastName required message")
    public void user_should_see_the_last_name_required_message() {
        Assert.assertTrue(registerPage.lastNameErrorMessage.isDisplayed());
    }

    @Given("user enters an invalid SSN number as {string}")
    public void user_enters_an_invalid_ssn_number_as(String string) {
        registerPage.ssnBox.sendKeys(faker.idNumber().invalid());

    }

    @Then("user should see the SSN-invalid message")
    public void user_should_see_the_ssn_invalid_message() {
        Assert.assertTrue(registerPage.ssnInvalidErrorMessage.isDisplayed());
    }
    @Then("close the browser")
    public void closeTheBrowser() {
        Driver.closeDriver();

    }

}






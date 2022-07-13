package stepdefinitions.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.US_002_RegistrationPage;
import pojos.US_002_RegistrantPojo;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.US_002_TXTWriter.saveUIRegistrantData;

public class US_002_ValidationUsernameEmailStepDefs {

    HomePage homePage= new HomePage();
    US_002_RegistrationPage registerPage= new US_002_RegistrationPage();
    US_002_RegistrantPojo registrant= new US_002_RegistrantPojo(); //Pojo class
    Faker faker= new Faker();

    @Given("user navigates to url")
    public void user_navigates_to_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_base_url"));
    }
    @When("user  clicks  to icon on top right corner")
    public void user_clicks_to_icon_on_top_right_corner() {
        homePage.icon.click();
    }
    @When("user clicks on Register button")
    public void user_clicks_on_register_button() {
        homePage.registerButton.click();
    }
    @Then("user verifies registration page")
    public void user_verifies_registration_page() {
        Assert.assertTrue(registerPage.RegistrationTitle.isDisplayed());
    }
    @When("user enters a valid SSN number")
    public void user_enters_a_valid_ssn_number() {
        registrant.setSsn(faker.idNumber().ssnValid());
        registerPage.SSN.sendKeys(registrant.getSsn());
    }
    @When("user enters valid first name and last name")
    public void user_enters_valid_first_name_and_last_name() {
        registrant.setFirstName(faker.name().firstName());
        registerPage.firstName.sendKeys(registrant.getFirstName());

        registrant.setLastName(faker.name().lastName());
        registerPage.lastName.sendKeys(registrant.getLastName());
    }

    @Then("user closes the browser")
    public void user_closes_the_browser() {
        Driver.closeDriver();
    }
    @When("user enters valid email")
    public void user_enters_valid_email() {
        registrant.setEmail(registrant.getFirstName()+registrant.getLastName()+"@gmail.com");
        registerPage.email.sendKeys(registrant.getEmail());
    }
    @When("user enters new password and new password confirmation")
    public void user_enters_new_password_and_new_password_confirmation() {
        registrant.setPassword(faker.internet().password(8,20,true,true));
        registerPage.newPassword.sendKeys(registrant.getPassword());
        registerPage.newPasswordConfirmation.sendKeys(registrant.getPassword());
    }
    @And("user clicks Register button for registration")
    public void userClicksRegisterButtonForRegistration() {
        registerPage.registerButton.submit();
    }
    @Then("user verifies Your username is required message")
    public void user_verifies_your_username_is_required_message() {
        Assert.assertTrue(registerPage.yourUsernameIsRequiredMessage.isDisplayed());
    }
    @When("user enters valid username")
    public void user_enters_valid_username() {
        registrant.setLogin(registrant.getFirstName()+registrant.getLastName());
        registerPage.username.sendKeys(registrant.getLogin());
    }
    @Then("user verifies Registration Saved message is displayed")
    public void user_verifies_registration_saved_message_is_displayed() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerPage.registrationSavedMessage.isDisplayed());
    }
    @Then("user clicks on Home button")
    public void user_clicks_on_home_button() {
        registerPage.homeButton.click();
    }

    @Then("user verifies that landed to home page successfully")
    public void user_verifies_that_landed_to_home_page_successfully() {
        Assert.assertTrue(homePage.welcomeToMedunnaText.isDisplayed());
    }


    @Then("user verifies username is invalid")
    public void user_verifies_username_is_invalid() {
        Assert.assertTrue(registerPage.yourUsernameIsInvalidMessage.isDisplayed());
    }

    @When("user enters invalid email {string} that not contains @ or .")
    public void user_enters_invalid_email_that_not_contains_or(String string) {
        registerPage.email.sendKeys(string + Keys.ENTER);
    }


    @Then("user verifies This field is invalid message is displayed")
    public void userVerifiesThisFieldIsInvalidMessageIsDisplayed() {
        Assert.assertTrue(registerPage.thisFieldIsInvalidMessage.isDisplayed());
    }

    @Then("user should see Your email is required message")
    public void userShouldSeeYourEmailIsRequiredMessage() {
        Assert.assertTrue(registerPage.yourEmailIsRequiredMessage.isDisplayed());
    }

    @When("user enters {string} that contains space")
    public void userEntersThatContainsSpace(String string) {
        string = faker.name().username()+" can";
        registerPage.username.sendKeys(string+Keys.ENTER);
        registrant.setLogin(string);
    }

    @And("user enters valid {string}")
    public void userEntersValid(String string) {
        string = faker.name().username();
        registerPage.username.sendKeys(string);
        registrant.setLogin(string);
    }

    @And("user enters {string} that contains special character")
    public void userEntersThatContainsSpecialCharacter(String string) {
        string= "*"+faker.name().username()+"#";
        registerPage.username.sendKeys(string);
        registrant.setLogin(string);
    }

    @And("user saves the records into a file")
    public void userSavesTheRecordsIntoAFile() {
        saveUIRegistrantData(registrant);
    }


}

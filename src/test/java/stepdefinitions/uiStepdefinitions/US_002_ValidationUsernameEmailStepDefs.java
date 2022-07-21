package stepdefinitions.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.US_002_RegistrationPage;
import pages.US_028_AdminHomePage;
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
    US_028_AdminHomePage adminHomePage= new US_028_AdminHomePage();

    @Given("user navigates to url US002")
    public void user_navigates_to_url_US002() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
        try{
            adminHomePage.adminAdminLast.click();
            adminHomePage.signOut.click();
        }catch(Exception e){

        }
    }
    @When("user  clicks  to icon on top right corner US002")
    public void user_clicks_to_icon_on_top_right_corner_US002() {
            homePage.icon.click();

    }
    @When("user clicks on Register button US002")
    public void user_clicks_on_register_button_US002() {
        homePage.registerButton.click();
    }
    @Then("user verifies registration page US002")
    public void user_verifies_registration_page_US002() {
        Assert.assertTrue(registerPage.RegistrationTitle.isDisplayed());
    }
    @When("user enters a valid SSN number US002")
    public void user_enters_a_valid_ssn_number_US002() {
        registrant.setSsn(faker.idNumber().ssnValid());
        registerPage.SSN.sendKeys(registrant.getSsn());
    }
    @When("user enters valid first name and last name US002")
    public void user_enters_valid_first_name_and_last_name_US002() {
        registrant.setFirstName(faker.name().firstName());
        registerPage.firstName.sendKeys(registrant.getFirstName());

        registrant.setLastName(faker.name().lastName());
        registerPage.lastName.sendKeys(registrant.getLastName());
    }

    @Then("user closes the browser US002")
    public void user_closes_the_browser_US002() {
        Driver.closeDriver();
    }
    @When("user enters valid email US002")
    public void user_enters_valid_email_US002() {
        registrant.setEmail(registrant.getFirstName()+registrant.getLastName()+"@gmail.com");
        registerPage.email.sendKeys(registrant.getEmail());
    }
    @When("user enters new password and new password confirmation US002")
    public void user_enters_new_password_and_new_password_confirmation_US002() {
        registrant.setPassword(faker.internet().password(8,20,true,true));
        registerPage.newPassword.sendKeys(registrant.getPassword());
        registerPage.newPasswordConfirmation.sendKeys(registrant.getPassword());
    }
    @And("user clicks Register button for registration US002")
    public void userClicksRegisterButtonForRegistration_US002() {
        registerPage.registerButton.submit();
    }
    @Then("user verifies Your username is required message US002")
    public void user_verifies_your_username_is_required_message_US002() {
        Assert.assertTrue(registerPage.yourUsernameIsRequiredMessage.isDisplayed());
    }
    @When("user enters valid username US002")
    public void user_enters_valid_username_US002() {
        registrant.setLogin(registrant.getFirstName()+registrant.getLastName());
        registerPage.username.sendKeys(registrant.getLogin());
    }
    @Then("user verifies Registration Saved message is displayed US002")
    public void user_verifies_registration_saved_message_is_displayed_US002() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerPage.registrationSavedMessage.isDisplayed());
    }
    @Then("user clicks on Home button US002")
    public void user_clicks_on_home_button_US002() {
        registerPage.homeButton.click();
    }

    @Then("user verifies that landed to home page successfully US002")
    public void user_verifies_that_landed_to_home_page_successfully_US002() {
        Assert.assertTrue(homePage.welcomeToMedunnaText.isDisplayed());
    }


    @Then("user verifies username is invalid US002")
    public void user_verifies_username_is_invalid_US002() {
        Assert.assertTrue(registerPage.yourUsernameIsInvalidMessage.isDisplayed());
    }

    @When("user enters invalid email {string} that not contains @ or . US002")
    public void user_enters_invalid_email_that_not_contains_or_US002(String string) {
        registerPage.email.sendKeys(string + Keys.ENTER);
    }


    @Then("user verifies This field is invalid message is displayed US002")
    public void userVerifiesThisFieldIsInvalidMessageIsDisplayedUS002() {
        Assert.assertTrue(registerPage.thisFieldIsInvalidMessage.isDisplayed());
    }

    @Then("user should see Your email is required message US002")
    public void userShouldSeeYourEmailIsRequiredMessageUS002() {
        Assert.assertTrue(registerPage.yourEmailIsRequiredMessage.isDisplayed());
    }

    @When("user enters {string} that contains space US002")
    public void userEntersThatContainsSpaceUS002(String string) {
        string = faker.name().username()+" can";
        registerPage.username.sendKeys(string+Keys.ENTER);
        registrant.setLogin(string);
    }

    @And("user enters valid {string} US002")
    public void userEntersValidUS002(String string) {
        string = faker.name().username();
        registerPage.username.sendKeys(string);
        registrant.setLogin(string);
    }

    @And("user enters {string} that contains special character US002")
    public void userEntersThatContainsSpecialCharacterUS002(String string) {
        string= "*"+faker.name().username()+"#";
        registerPage.username.sendKeys(string);
        registrant.setLogin(string);
    }

    @And("user saves the records into a file US002")
    public void userSavesTheRecordsIntoAFileUS002() {
        saveUIRegistrantData(registrant);
    }


}

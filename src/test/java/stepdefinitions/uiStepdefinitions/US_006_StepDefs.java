package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.US_006_Pages;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_006_StepDefs {

    US_006_Pages us006Pages = new US_006_Pages();
    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
    }

    @Then("User should enter valid Username")
    public void user_should_enter_valid_username() {
        us006Pages.usernameBox.sendKeys(ConfigurationReader.getProperty("us006_username"));
    }

    @Then("User should enter valid Password")
    public void user_should_enter_valid_password() {
        us006Pages.passwordBox.sendKeys(ConfigurationReader.getProperty("us006_password"));
    }

    @Then("User should click on the Sign in button located right bottom")
    public void user_should_click_on_the_sign_in_button_located_right_bottom() {
        us006Pages.signInButton2.click();
    }

    @Then("User should click on the button that shows user's name on the top right corner")
    public void user_should_click_on_the_button_that_shows_user_s_name_on_the_top_right_corner() {
        us006Pages.registratedUserButton.click();
    }

    @Then("User should click on the Settings button")
    public void user_should_click_on_the_settings_button() {
        us006Pages.settingsButton.click();
    }

    @Then("User should see User settings for text")
    public void user_should_see_user_settings_for_text() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(us006Pages.userSettingsForText, 3).isDisplayed());
    }

    @Then("User settings for page should include First Name, Last Name, and Email options")
    public void user_settings_for_page_should_include_first_name_last_name_and_email_options() {
        Assert.assertTrue(us006Pages.firstName.isDisplayed());
        Assert.assertTrue(us006Pages.lastName.isDisplayed());
        Assert.assertTrue(us006Pages.eMail.isDisplayed());
    }

    @Then("User should be update firstname {string}")
    public void user_should_be_update_firstname(String firstName) {
        ReusableMethods.waitFor(3);
        us006Pages.firstName.clear();
        Driver.waitAndSendText(us006Pages.firstName, firstName);
    }

    @Then("User should be update lastname {string}")
    public void user_should_be_update_lastname(String lastname) {
        ReusableMethods.waitForVisibility(us006Pages.lastName, 3).clear();
        Driver.waitAndSendText(us006Pages.lastName, lastname);
    }

    @Then("User should be update email {string}")
    public void user_should_be_update_email(String email) {
        ReusableMethods.waitForVisibility(us006Pages.eMail, 3).clear();
        Driver.waitAndSendText(us006Pages.eMail, email);
    }

    @Then("User should click save button")
    public void user_should_click_save_button() {
        Driver.waitAndClick(us006Pages.saveButton);
    }

    @Then("User should see Settings saved! popup message on the top left corner")
    public void user_should_see_settings_saved_popup_message_on_the_top_left_corner() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(us006Pages.popup, 3).isDisplayed());
    }

    @Then("User should see Your first name is required text message when entering invalid firstname")
    public void user_should_see_your_first_name_is_required_text_message_when_entering_invalid_firstname() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(us006Pages.firstNameError, 6).isDisplayed());
    }

    @Then("User should see Your last name is required text message when entering invalid lastname")
    public void user_should_see_your_last_name_is_required_text_message_when_entering_invalid_lastname() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(us006Pages.lastNameError, 7).isDisplayed());
    }

    @Then("User should see Your email is required text message when entering invalid email")
    public void user_should_see_your_email_is_required_text_message_when_entering_invalid_email() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(us006Pages.eMailError, 7).isDisplayed());
    }

    @Given("User leaves firstname blank")
    public void userLeavesFirstnameBlank() {
        ReusableMethods.waitForVisibility(us006Pages.firstName, 3).clear();
        Driver.waitAndSendText(us006Pages.firstName, " ");
        actions.sendKeys(Keys.TAB).build().perform();
    }

    @Given("User leaves lastname blank")
    public void userLeavesLastnameBlank() {
        ReusableMethods.waitForVisibility(us006Pages.lastName, 3).clear();
        Driver.waitAndSendText(us006Pages.lastName, " ");
        actions.sendKeys(Keys.TAB).build().perform();
    }

    @Given("User leaves email blank")
    public void userLeavesEmailBlank() {
        ReusableMethods.waitForVisibility(us006Pages.eMail, 3).clear();
        Driver.waitAndSendText(us006Pages.eMail, " ");
        actions.sendKeys(Keys.TAB).build().perform();
    }

    @Given("user should enter a valid first name as {string}")
    public void user_should_enter_a_valid_first_name_as(String firstname) {
        ReusableMethods.waitForVisibility(us006Pages.firstName, 3).clear();
        Driver.waitAndSendText(us006Pages.firstName, firstname);
    }

    @Then("user should enter a valid last name as {string}")
    public void user_should_enter_a_valid_last_name_as(String lastname) {
        ReusableMethods.waitForVisibility(us006Pages.lastName, 3).clear();
        Driver.waitAndSendText(us006Pages.lastName, lastname);
    }

    @Then("user should enter an invalid email as {string}")
    public void user_should_enter_an_invalid_email_as(String email) {
        ReusableMethods.waitForVisibility(us006Pages.eMail, 3).clear();
        Driver.waitAndSendText(us006Pages.eMail, email);
    }
}
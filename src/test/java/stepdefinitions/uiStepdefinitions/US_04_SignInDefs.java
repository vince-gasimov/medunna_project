package stepdefinitions.uiStepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LoginPage;
import pages.ResetPasswordPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_04_SignInDefs {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ResetPasswordPage resetPasswordPage = new ResetPasswordPage();

    @Given("user is on the Medunna page")
    public void user_is_on_the_Medunna_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }
    @Given("user clicks signInLocation button")
    public void user_clicks_sign_in_location_button() {
        loginPage.signInLocation.click();
    }

    @Given("user should entered a valid username {string} on the sign in page")
    public void user_should_entered_a_valid_username_on_the_sign_in_page(String username) {
        loginPage.usernameBox.sendKeys(username);
    }

    @Given("user should entered a valid password   {string} on the sign in page")
    public void user_should_entered_a_valid_password_on_the_sign_in_page(String password) {
        loginPage.passwordBox.sendKeys(password);
    }

    @Given("user should entered a invalid username {string} on the sign in page")
    public void user_should_entered_a_invalid_username_on_the_sign_in_page(String invalid_username) {
        loginPage.passwordBox.sendKeys(invalid_username);
    }

    @Given("user should entered a invalid password   {string} on the sign in page")
    public void user_should_entered_a_invalid_password_on_the_sign_in_page(String invalid_password) {
        loginPage.passwordBox.sendKeys(invalid_password);
    }

    @When("user should click sign in box")
    public void user_should_click_sign_in_box() {
       // Driver.waitForVisibility(homePage.signInButton, 10);
        homePage.signInBox.submit();
    }

    @Then("user should verify signed in {string} successful")
    public void user_should_verify_signed_in_successful(String signedin_confirm) {
        Assert.assertTrue(loginPage.signedInUserName.isDisplayed());
    }

    @Then("user should verify fail message")
    public void userShouldVerifyFailMessage() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(loginPage.failedToSignInAlert.isDisplayed());
    }

    @Given("user should click to remember me button")
    public void user_should_click_to_remember_me_button() {
        loginPage.rememberMeBox.click();
    }

    @Then("user clicked the user's account and clicked the signed out")
    public void user_clicked_the_user_s_account_and_clicked_the_signed_out() {
        loginPage.signedInUserName.click();
        loginPage.signOutButton.click();

    }

    @When("username should automatically see existing username")
    public void username_should_automatically_see_existing_username() {
        Assert.assertTrue(loginPage.shownUserName.isDisplayed());
    }

    @When("user should click signinAgain box")
    public void userShouldClickSigninAgainBox() {
        homePage.signInAgain.click();
    }

    @And("user clicked on username box")
    public void userClickedOnUsernameBox() {
        loginPage.usernameBox.click();
    }

    @Then("user verify failed message")
    public void user_verify_failed_message() {
        Driver.waitForVisibility(loginPage.failedToSignInAlert, 5);
        Assert.assertTrue(loginPage.failedToSignInAlert.isDisplayed());
    }

    @When("user should click to Did you forget your password")
    public void userShouldClickToDidYouForgetYourPassword() {
        loginPage.didYouForgetPasswd.click();
    }

    @And("user should double click to Did you forget your password")
    public void userShouldDoubleClickToDidYouForgetYourPassword() {
       loginPage.didYouForgetPasswd.click();
        loginPage.didYouForgetPasswd.click();
    }

    @And("user entered valid email {string}")
    public void userEnteredValidEmail(String email) {
        resetPasswordPage.emailField.sendKeys(email);
    }

    @When("user clicked reset password")
    public void user_clicked_reset_password() {
        resetPasswordPage.resetPassword.submit();
    }

    @Then("user verify the  message {string} message")
    public void userVerifyTheMessageMessage(String string) {
        Driver.waitForVisibility(resetPasswordPage.checkYourEmailMessage, 5);
        Assert.assertTrue(resetPasswordPage.checkYourEmailMessage.isDisplayed());

    }

    @And("user entered invalid format email address{string}")
    public void userEnteredInvalidFormatEmailAddress(String invalidformatemail) {
        resetPasswordPage.emailField.sendKeys(invalidformatemail);
    }

    @Then("user verify the invalid character message {string}")
    public void userVerifyTheInvalidCharacterMessage(String string) {
        Assert.assertTrue(resetPasswordPage.invalidCharacterMessage.isDisplayed());
    }

    @And("user entered a non-registered {string}  email adress")
    public void userEnteredANonRegisteredEmailAdress(String nonregistered_email) {
        resetPasswordPage.emailField.sendKeys(nonregistered_email);
    }

    @When("user should click to {string}")
    public void userShouldClickTo(String string) {
        loginPage.registerNewAccount.click();
        loginPage.registerNewAccount.click();
    }

    @And("user verify to navigate registration page")
    public void userVerifyToNavigateRegistrationPage() {
        Assert.assertTrue(resetPasswordPage.registrationText.isDisplayed());
    }

    @When("user should click to cancel button")
    public void userShouldClickToCancelButton() {
        loginPage.cancelButton.click();
    }

    @Then("user verify that  successfully to switch to home page")
    public void userVerifyThatSuccessfullyToSwitchToHomePage() {
        Assert.assertTrue(homePage.homePage.isDisplayed());
    }

    @When("user left blank username and password field")
    public void userLeftBlankUsernameAndPasswordField() {
        loginPage.usernameBox.sendKeys(" ");
        loginPage.passwordBox.sendKeys(" ");
    }

    @And("user should double click to cancel button")
    public void userShouldDoubleClickToCancelButton() {
        loginPage.cancelButton.click();
        loginPage.cancelButton.click();

    }

}




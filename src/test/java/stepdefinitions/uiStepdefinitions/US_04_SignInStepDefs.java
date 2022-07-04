package stepdefinitions.uiStepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_04_SignInStepDefs {
    LoginPage loginPage = new LoginPage();
    HomePage homePage=new HomePage();

    @Given("user is on the Medunna page")
    public void user_is_on_the_Medunna_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
    }

    @Given("user clicks human icon")
    public void user_clicks_human_icon() {
        homePage.userIcon.click();
    }

    @Given("user clicks signInLocation button")
    public void user_clicks_sign_in_location_button() {

        loginPage.signInLocation.click();
    }

    @Given("user should entered a valid username {string} on the sign in page")
    public void user_should_entered_a_valid_username_on_the_sign_in_page(String string) {
        loginPage.usernameBox.sendKeys(string);
    }
    @Given("user should entered a valid password   {string} on the sign in page")
    public void user_should_entered_a_valid_password_on_the_sign_in_page(String string) {
        loginPage.passwordBox.sendKeys(string);
    }

    @Given("user should entered a invalid username {string} on the sign in page")
    public void user_should_entered_a_invalid_username_on_the_sign_in_page(String string) {
        loginPage.passwordBox.sendKeys(string);
    }

    @Given("user should entered a invalid password   {string} on the sign in page")
    public void user_should_entered_a_invalid_password_on_the_sign_in_page(String string) {
        loginPage.passwordBox.sendKeys(string);
    }


    @When("user should click sign in box")
    public void user_should_click_sign_in_box() {
        loginPage.signInButton.click();

    }
    @Then("user should verify signed in {string} successful")
    public void user_should_verify_signed_in_successful(String string) {
        Assert.assertTrue(loginPage.signedInUserName.isDisplayed());

    }
}





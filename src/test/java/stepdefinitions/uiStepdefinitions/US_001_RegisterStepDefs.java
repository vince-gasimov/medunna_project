package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.RegisterPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_001_RegisterStepDefs {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    Actions actions = new Actions(Driver.getDriver());


    @Given("user is on the home page")
    public void userIsOnTheHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }

    @When("user clicks on the user icon")
    public void userClicksOnTheUserIcon() {
        homePage.userIcon.click();
    }

    @And("user clicks on the register link")
    public void userClicksOnTheRegisterLink() {
        homePage.registerButton.click();
    }

    @Then("user should be on the register page and should see the register title")
    public void userShouldBeOnTheRegisterPageAndShouldSeeTheRegisterTitle() {
        Assert.assertEquals("Registration", registerPage.registrationText.getText());
    }

    @And("user sends SSN number as {string}")
    public void userSendsSSNNumberAs(String arg0) {
        registerPage.ssnBox.sendKeys("654-54-5440");
    }

    @And("user sends first name as {string}")
    public void userSendsFirstNameAs(String arg0) {
        registerPage.firstNameBox.sendKeys("team83_user_04");
    }

    @And("user sends last name as {string}")
    public void userSendsLastNameAs(String arg0) {
        registerPage.lastNameBox.sendKeys("user_04");
    }

    @Then("close the browser")
    public void closeTheBrowser() {
        Driver.closeDriver();

    }

    @Given("user does not send SSN number")
    public void userDoesNotSendSSNNumber() {
        registerPage.ssnBox.sendKeys("");
    }

    @Then("user should see the SNN-error message")
    public void userShouldSeeTheSNNErrorMessage() {
        Assert.assertTrue(registerPage.ssnErrorMessage.isDisplayed());
    }

    @And("user does not send first name")
    public void userDoesNotSendFirstName() {
        registerPage.firstNameBox.sendKeys("");
    }


    @Then("user should see the FirstName error message")
    public void userShouldSeeTheFirstNameErrorMessage() {
        Assert.assertTrue(registerPage.firstNameErrorMessage.isDisplayed());
    }

    @And("user does not send last name")
    public void userDoesNotSendLastName() {
        registerPage.lastNameBox.sendKeys("");
        actions.sendKeys(Keys.TAB).build().perform();
    }

    @Then("user should see the LastName error message")
    public void userShouldSeeTheLastNameErrorMessage() {
        Assert.assertTrue(registerPage.lastNameErrorMessage.isDisplayed());
    }


    @Then("user should see the SNN-invalid message")
    public void userShouldSeeTheSNNInvalidMessage() {
        Assert.assertTrue(registerPage.ssnInvalidErrorMessage.isDisplayed());
    }

    @When("user sends in valid SSN number as {string}")
    public void userSendsInValidSSNNumberAs(String ssn) {
        registerPage.ssnBox.sendKeys(ssn);
    }
}


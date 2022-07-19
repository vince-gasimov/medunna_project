package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.ContactPage;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_026_ContactStepDefs {

    HomePage homePage=new HomePage();
    ContactPage contactPage=new ContactPage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("user goes to Medunna Url")
    public void userGoesToMedunnaUrl() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
        Thread.sleep(3000);
    }

    @Then("user clicks Contact")
    public void userClicksContact() throws InterruptedException {
        homePage.contact.click();
        Thread.sleep(3000);
    }

    @And("verify any user can reach contact portal")
    public void verifyAnyUserCanReachContactPortal() throws IOException {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://medunna.com/contact"));
        ReusableMethods.getScreenshot("US026_TC001_");
    }

    @When("user enters valid name, email and subject")
    public void userEntersValidNameEmailAndSubject() throws InterruptedException {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        contactPage.name.sendKeys("filiz");
        contactPage.email.sendKeys("filizonatce@gmail.com");
        contactPage.subject.sendKeys("I can not see my appointment");

    }



    @Then("user clicks Send button")
    public void user_clicks_send_button() throws InterruptedException {
        Driver.waitForVisibility(contactPage.sendButton,10);
        contactPage.sendButton.click();
        Thread.sleep(3000);
    }

    @Then("verify any user can send a request with valid credentials")
    public void verify_any_user_can_send_a_request_with_valid_credentilas() throws IOException {
        Assert.assertTrue(contactPage.receivedMessage.isDisplayed());
        ReusableMethods.getScreenshot("US026_TC002_");
    }

    @Then("user closes the browser")
    public void userClosesTheBrowser() {
        Driver.closeDriver();
    }

    @When("user enters valid name and valid subject but leaves the email box empty")
    public void user_enters_valid_name_and_valid_subject_but_leaves_the_email_box_empty() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        contactPage.name.sendKeys("filiz");
        contactPage.subject.sendKeys("I can not see my appointment");
    }

    @Then("verify user can not send a request without filling the email box")
    public void verify_user_can_not_send_a_request_without_filling_the_email_box() throws IOException {
        Assert.assertTrue(contactPage.yourEmailIsRequiredMessage.isDisplayed());
        ReusableMethods.getScreenshot("US026_TC003_");
    }

    @When("user enters valid name and valid subject")
    public void userEntersValidNameAndValidSubject() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        contactPage.name.sendKeys("filiz");
        contactPage.subject.sendKeys("I can not see my appointment");
    }

    @Then("user writes an invalid email in email box")
    public void user_writes_an_invalid_email_in_email_box() {
        contactPage.email.sendKeys("filizonatce@gmail");
    }

    @Then("verify user can not send a request without writing a valid email")
    public void verify_user_can_not_send_a_request_without_writing_a_valid_email() throws IOException {
        Assert.assertTrue(contactPage.thisFieldIsInvalidMessage.isDisplayed());
        ReusableMethods.getScreenshot("US026_TC004_");
    }

    @When("user enters valid email and valid subject")
    public void user_enters_valid_email_and_valid_subject() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        contactPage.email.sendKeys("filizonatce@gmail.com");
        contactPage.subject.sendKeys("I can not see my appointment");
    }
    @Then("user leaves the name box empty")
    public void user_leaves_the_name_box_empty() {

    }
    @Then("verify user can not send a request without filling the name box")
    public void verify_user_can_not_send_a_request_without_filling_the_name_box() throws IOException {
        Assert.assertTrue(contactPage.nameIsRequiredMessage.isDisplayed());
        ReusableMethods.getScreenshot("US026_TC005_");
    }

    @When("user enters valid name and valid email")
    public void user_enters_valid_name_and_valid_email() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        contactPage.name.sendKeys("filiz");
        contactPage.email.sendKeys("filizonatce@gmail.com");
    }
    @Then("user leaves the subject box empty")
    public void user_leaves_the_subject_box_empty() {
    }

    @Then("verify user can not send a request without filling the subject box")
    public void verify_user_can_not_send_a_request_without_filling_the_subject_box() throws IOException {
        Assert.assertTrue(contactPage.subjectThisFieldIsRequiredMessage.isDisplayed());
        ReusableMethods.getScreenshot("US026_TC006_");
    }

    @Then("user leaves the message box empty")
    public void userLeavesTheMessageBoxEmpty() {
    }

    @Then("verify user can send a request without filling the message box")
    public void verifyUserCanSendARequestWithoutFillingTheMessageBox() throws IOException {
        Assert.assertTrue(contactPage.receivedMessage.isDisplayed());
        ReusableMethods.getScreenshot("US026_TC007_");
    }
}




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
//        Thread.sleep(3000);
//        contactPage.email.sendKeys("filizonatce@gmail.com");
//        Thread.sleep(3000);
//        contactPage.subject.sendKeys("I can not see my appointment");
//        Thread.sleep(3000);
    }



    @Then("user clicks Send button")
    public void user_clicks_send_button() throws InterruptedException {
        Driver.waitForVisibility(contactPage.sendButton,10);
        contactPage.sendButton.click();
        Thread.sleep(2000);
    }

    @Then("verify any user can use contact portal with valid credentials")
    public void verify_any_user_can_use_contact_portal_with_valid_credentilas() {
        Assert.assertTrue(contactPage.receivedMessage.isDisplayed());
    }

    @Then("user closes the browser")
    public void userClosesTheBrowser() {
        Driver.getDriver().close();
    }



}

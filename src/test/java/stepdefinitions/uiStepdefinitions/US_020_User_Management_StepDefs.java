package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;
import pages.US_020_User_Page;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_020_User_Management_StepDefs {

    LoginPage loginPage = new LoginPage();
    US_020_User_Page userPage = new US_020_User_Page();

    @Given("Admin20 navigates to medunna login page")
    public void admin20_navigates_to_medunna_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
    }

    @Then("Admin20 signs in")
    public void admin20_signs_in() {
        loginPage.usernameBox.sendKeys("Irfan_team83");
        loginPage.passwordBox.sendKeys("Irfan_83");
        loginPage.signInButton.click();

    }

    @Then("Admin20 clicks on Administrations then clicks on User Management")
    public void admin20_clicks_on_administrations_then_clicks_on_user_management() {
        ReusableMethods.waitForVisibility(userPage.administration, 5).click();
        ReusableMethods.waitForVisibility(userPage.userManagement, 5).click();

    }

    @Then("Admin20 clicks on View button")
    public void admin20_clicks_on_view_button() {
        ReusableMethods.waitForVisibility(userPage.viewButton, 5).click();

    }

    @Then("Admin20 verifies user's information on the page")
    public void admin20_verifies_user_s_information_on_the_page() {
        ReusableMethods.waitForVisibility(userPage.firstNameText, 5);
        Assert.assertTrue(userPage.firstNameText.isDisplayed());
        ReusableMethods.waitForVisibility(userPage.lastNameText, 5);
        Assert.assertTrue(userPage.lastNameText.isDisplayed());
        ReusableMethods.waitForVisibility(userPage.emailText, 5);
        Assert.assertTrue(userPage.emailText.isDisplayed());

    }

    @Then("Admin20 closes the application")
    public void admin20_closes_the_application() {
        Driver.closeDriver();

    }

    @Then("Admin20 clicks on Edit button")
    public void admin20_clicks_on_edit_button() {
        ReusableMethods.waitForVisibility(userPage.editButton, 5).click();

    }

    @Then("Admin20 assigns role to the user")
    public void admin20_assigns_role_to_the_user() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);
        Select select = new Select(userPage.profileDropdown);
        select.selectByVisibleText("ROLE_USER");


    }

    @Then("Admin20 clicks on Save button")
    public void admin20_clicks_on_save_button() {
        Driver.clickWithJS(ReusableMethods.waitForVisibility(userPage.saveButton, 5));
        Assert.assertTrue(ReusableMethods.waitForVisibility(userPage.successMessage, 5).isDisplayed());

    }

    @Then("Admin20 activates user's status")
    public void admin20_activates_user_s_status() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        ReusableMethods.waitForVisibility(userPage.activatedCheckbox, 5).click();

        Driver.clickWithJS(ReusableMethods.waitForVisibility(userPage.saveButton, 5));
        Assert.assertTrue(ReusableMethods.waitForVisibility(userPage.successMessage, 5).isDisplayed());

    }

    @Then("Admin20 deletes the user")
    public void admin20_deletes_the_user() throws InterruptedException {
        Thread.sleep(3000);
        Driver.clickWithJS(ReusableMethods.waitForVisibility(userPage.idButton, 5));
        Thread.sleep(3000);
        Driver.clickWithJS(ReusableMethods.waitForVisibility(userPage.deleteButton, 5));
        Driver.clickWithJS(ReusableMethods.waitForVisibility(userPage.deleteConfirmButton, 5));

        Assert.assertTrue(ReusableMethods.waitForVisibility(userPage.userDeletedMessage, 5).isDisplayed());

    }
}

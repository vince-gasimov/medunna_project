package stepdefinitions.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SignInPage;
import pages.US17_CreateUpdateDeleteTestItemPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_017_CreateUpdateDeleteTestItemStepDefs {


    US_017_CreateUpdateDeleteTestItemPage testItemPage= new US_017_CreateUpdateDeleteTestItemPage();
    Faker faker = new Faker();
    SignInPage signInPage=new SignInPage();


    @When("Admin navigates to the home page")
    public void admin_navigates_to_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("base_url"));
    }

//    @When("Admin clicks sign in button at the home page and navigates to sign in page")
//    public void admin_clicks_sign_in_button_at_the_home_page_and_navigates_to_sign_in_page() {
//        Driver.waitAndClick(testItemPage.accountMenu);
//        Driver.waitAndClick(testItemPage.signDropdown);

    // }

    @Then("Admin verifies that sign in page header is visible")
    public void admin_verifies_that_sign_in_page_header_is_visible() {
        Driver.waitForVisibility(testItemPage.singinPageHeader, 5);
        Assert.assertTrue(testItemPage.singinPageHeader.isDisplayed());
    }

    @Then("Admin enters username {string} and password {string}")
    public void admin_enters_username_and_password(String username, String password) {
        signInPage.loginDropdown.click();
        signInPage.signDropdown.click();

        signInPage.username.sendKeys(username);
        signInPage.password.sendKeys(password);
    }

    @Then("Admin clicks sign in button")
    public void admin_clicks_sign_in_button() {

        testItemPage.singInButton.click();
        Driver.wait(3);
    }

    @Then("Admin verifies that sign in is successful")
    public void admin_verifies_that_sign_in_is_successful() throws IOException {
        Driver.wait(3);
        Assert.assertTrue(testItemPage.homeText.isDisplayed());
        ReusableMethods.getScreenshot("successful Message");
    }

    @When("Admin clicks on the ItemTitles dropdown")
    public void admin_clicks_on_the_item_titles_dropdown() {
        Driver.wait(2);
        testItemPage.itemsTitles.click();
    }

    @When("Admin clicks on the testItem dropdown")
    public void admin_clicks_on_the_test_item_dropdown() {
        Driver.wait(3);
        testItemPage.testItem.click();
    }

    @When("Admin clicks on the createNewTestItem dropdown")
    public void admin_clicks_on_the_create_new_test_item_dropdown() {
        Driver.wait(2);
        Driver.clickElementByJS(testItemPage.CreateTestItem);
    }

    @Then("Admin provides a test name {string}")
    public void admin_provides_a_test_name(String testName) {
//        testItemPage.testName.sendKeys("dihanlin");
        testName =faker.name().firstName();
        Driver.waitAndSendText(testItemPage.testNameBox,testName);
    }

    @Then("Admin enters a description {string}")
    public void admin_enters_a_description(String descriptionNote) {
        testItemPage.description.sendKeys("mg/ml");
    }

    @Then("Admin enters a price {string}")
    public void admin_enters_a_price(String currentPrice) {
        testItemPage.price.sendKeys("130");
    }

    @Then("Admin enter a min value {string}")
    public void admin_enter_a_min_value(String minValue) {
        testItemPage.minValue.sendKeys("80");
    }

    @Then("Admin enters a max value {string}")
    public void admin_enters_a_max_value(String maxValue) {
        testItemPage.maxValue.sendKeys("130");
    }


    @Then("Admin clicks on save button")
    public void admin_clicks_on_save_button() {
        Driver.waitAndClick(testItemPage.saveButton);
    }

    @Then("Admin verifies that saving is successful")
    public void admin_verifies_that_saving_is_successful() {
        Driver.wait(3);
        Assert.assertTrue(testItemPage.savingSuccessMessage.isDisplayed());
    }

    @Then("Admin clicks last arrow button")
    public void admin_clicks_last_arrow_button() {
        Driver.waitAndClick(testItemPage.arrowLastItem);
    }

    @Then("Admin clicks last itemNumber")
    public void admin_clicks_last_item_number() {
        testItemPage.lastFigureItem.click();
    }

    @Then("Admin clicks delete button")
    public void admin_clicks_delete_button() {
        testItemPage.deleteTestItem.click();
    }


    @Then("Admin clicks confirmDelete button")
    public void admin_clicks_confirm_delete_button() {
        Driver.wait(3);
        testItemPage.confirmDeleteButton.click();
    }

    @Then("Admin verifies itemDeleteMessage")
    public void admin_verifies_item_delete_message() {
        Assert.assertTrue(testItemPage.deleteSuccessMessage.isDisplayed());
    }

    @And("Admin clicks on login dropdown icon")
    public void admin_clicks_on_login_dropdown_icon() {
        Driver.wait(2);
        testItemPage.loginButton.click();
    }

    @Then("Admin clicks on sign out")
    public void admin_clicks_sign_out() {

        testItemPage.singOutButton.click();
        Driver.wait(3);
    }

}

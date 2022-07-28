package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.US_18_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_18_Physicians {

      US_18_Page us_18_page = new US_18_Page();

    WebDriver driver;


    @Given("user should navigate to medunna.com")
    public void user_should_navigate_to_medunna_com() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }

    @When("user should click to human icon to top right")
    public void user_should_click_to_human_icon_to_top_right() {
        us_18_page.signInButton.click();
    }

    @When("user enters click to sign in button")
    public void user_should_click_to_sign_in_button() {
        us_18_page.lastsignInButton.click();
    }

    @When("user enters valid username on the sign in page")
    public void user_enters_valid_username_on_the_sign_in_page() {
        us_18_page.username.sendKeys("vusalgasimov");
    }

    @When("user enters valid password on the sign in page")
    public void user_enters_valid_password_on_the_sign_in_page() {
        us_18_page.password.sendKeys("vusalgasimov");
    }

    @When("user enters click sign in box")
    public void user_should_click_sign_in_box() {
        us_18_page.submit.submit();
    }

    @When("user should click Items&Titles box")
    public void user_should_click_items_titles_box() {
        Driver.wait(2);
        WebElement element = Driver.getDriver().findElement(By.id("entity-menu"));
        element.click();
    }

    @When("user should click Physician box")
    public void user_should_click_physician_box() {
        Driver.wait(2);
        us_18_page.physicianbutton.click();
    }

    @When("user enters Create a new Physician box")
    public void user_enters_create_a_new_physician_box() {
        us_18_page.createNewPhysicianBox.click();
    }

    @When("user enters valid data on ssn, firstname, lastname, date, phone field")
    public void user_enters_valid_data_on_ssn_firstname_lastname_date_phone_field() {
        Actions actions = new Actions(Driver.getDriver());
       us_18_page.ssnBox.sendKeys("196-23-1234");
        us_18_page.nameBox.sendKeys("adacan");
        us_18_page.lastNameBox.sendKeys("yenihst");
        us_18_page.dateBox.sendKeys("20-01");
       us_18_page.phoneBox.sendKeys("607-876-0919");

    }

    @When("User should click Speciality box")
    public void admin_should_click_speciality_box() {
        Driver.wait(1);
        Driver.selectByIndex(us_18_page.specialityBox, 5);
    }

    @When("User should click Choose File box")
    public void admin_should_click_choose_file_box() {
        String pathOfImage = ConfigurationReader.getProperty("pathOfImage");
        Driver.waitAndClick(us_18_page.chooseFileBox);
        Driver.waitAndSendText(us_18_page.chooseFileBox, pathOfImage);
    }

    @When("User enters valid Exam fee")
    public void user_enters_valid_exam_fee() {
        us_18_page.examFeeBox.sendKeys("120");
    }

    @When("User enters Save button")
    public void user_enters_save_button() {
        us_18_page.saveBox.submit();
    }

    @When("user see succesfull message")
    public void user_see_succesfull_message() {

    }

    @When("User enters a valid ssn")
    public void user_enters_a_valid_ssn() {
        us_18_page.ssnBox.sendKeys("234-55-3432");
    }

    @When("User should click Use Search")
    public void user_should_click_use_search() {
        us_18_page.searchBox.click();
    }

    @When("User should click Search User")
    public void user_should_click_search_user() {
        us_18_page.searchButton.click();
    }

    @When("User see firstname,lastname,birh date")
    public void user_see_firstname_lastname_birh_date() {
        Driver.wait(1);
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("firstName"));
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("lastName"));
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("birthDate"));
    }

    @When("User see successfull message")
    public void user_see_successfull_message() {
        Driver.wait(1);
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("User found with search SSN"));
    }

    @When("User should click and choose Speciality box")
    public void user_should_click_and_choose_speciality_box() {
        Driver.wait(1);
        Driver.selectByIndex(us_18_page.specialityBox, 5);
    }

    @When("User should click and Choose File box")
    public void user_should_click_and_choose_file_box() {
        String pathOfImage = ConfigurationReader.getProperty("pathOfImage");
        Driver.waitAndClick(us_18_page.chooseFileBox);
        Driver.waitAndSendText(us_18_page.chooseFileBox, pathOfImage);
    }

    @When("User enters valid date")
    public void user_enters_valid_date() {
        us_18_page.dateBox.sendKeys("20-01");
    }

    @When("User enters Phone")
    public void user_enters_phone() {
        us_18_page.phoneBox.sendKeys("507-876-0919");
    }


    @When("user go to last page")
    public void user_go_to_last_page() {
        Driver.waitAndClick(us_18_page.firstPageButton);
    }


    @When("user should click Edit box")
    public void user_should_click_edit_box() {
        Driver.wait(2);
        Driver.clickWithJS(us_18_page.editBox);
    }



    @When("user should click phone box")
    public void user_should_click_phone_box() {
        Driver.wait(2);
        us_18_page.editPhoneBox.clear();
    }
    @When("user should edit phone")
    public void user_should_edit_phone() {
        Driver.wait(2);
        us_18_page.editPhoneBox.sendKeys("110-907-8510");

    }

    @And("user see edit successful message")
    public void userSeeEditSuccessfulMessage() {
        Driver.wait(1);
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("A Physician is updated with identifier"));

    }

    @And("user go to page")
    public void userGoToPage() {
        Driver.wait(2);
        Driver.waitAndClick(us_18_page.PageButton);
    }

    @And("user should click delete box")
    public void userShouldClickDeleteBox() {
        Driver.wait(2);
        Driver.clickWithJS(us_18_page.deleteBox);
    }

    @And("user should click confirm delete box")
    public void userShouldClickConfirmDeleteBox() {
        Driver.wait(2);
        Driver.clickWithJS(us_18_page.confirmDeleteBox);

    }

    @And("user see delete successful message")
    public void userSeeDeleteSuccessfulMessage() {
        Driver.wait(1);
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("A Physician is deleted with identifier"));
    }

    @And("user see Internal server error message")
    public void userSeeInternalServerErrorMessage() {
        Driver.wait(1);
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Internal server error."));
    }
}






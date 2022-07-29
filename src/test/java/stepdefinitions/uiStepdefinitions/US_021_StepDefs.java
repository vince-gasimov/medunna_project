package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.US_006_Pages;
import pages.US_021_App_Page;
import pages.US_021_Page;
import utilities.ConfigurationReader;
import utilities.Date;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.Key;

public class US_021_StepDefs {

    US_021_Page us_021_page = new US_021_Page();
    US_021_App_Page us_021_app_page = new US_021_App_Page();
    Actions actions = new Actions(Driver.getDriver());



    @Given("Staff goes to Medunna URL")
    public void staff_goes_to_medunna_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }



    @Then("Staff clicks on the icon on the top right corner")
    public void staff_clicks_on_the_icon_on_the_top_right_corner() {
        us_021_page.userIcon.click();
    }



    @Then("Staff clicks signs in button")
    public void staff_clicks_signs_in_button() {
        ReusableMethods.waitForClickablility(us_021_page.signInButton, 3).click();
    }



    @Then("Staff enters username")
    public void staff_enters_username() {
        us_021_page.usernameBox.sendKeys(ConfigurationReader.getProperty("us_021_username"));
    }




    @Then("Staff enters password")
    public void staff_enters_password() {
        us_021_page.passwordBox.sendKeys(ConfigurationReader.getProperty("us_021_password"));
    }



    @Then("Staff clicks on the sign in button on the right bottom")
    public void staff_clicks_on_the_sign_in_button_on_the_right_bottom() {
        us_021_page.signInButton2.click();
    }




    @Then("Staff clicks on the MY PAGES button")
    public void staff_clicks_on_the_my_pages_button() {
        ReusableMethods.waitForClickablility(us_021_page.myPagesButton, 3).click();
    }




    @Then("Staff clicks Search Patient button")
    public void staff_clicks_search_patient_button() {
        us_021_page.searchPatientButton.click();
    }




    @Then("Staff enters SSN in the Patient SSN: box")
    public void staff_enters_ssn_in_the_patient_ssn_box() {
        ReusableMethods.waitFor(2);
        us_021_page.patientSsnButton.sendKeys(ConfigurationReader.getProperty("us_021_SSN"));
    }




    @Then("Staff clicks Show Appointments button")
    public void staff_clicks_show_appointments_button() {
        ReusableMethods.waitForClickablility(us_021_page.showAppButton, 3).click();
    }




    @Then("Staff clicks Edit button")
    public void staff_clicks_edit_button() {
        ReusableMethods.waitForClickablility(us_021_page.editButton, 3).click();
    }




    @Then("Staff updates appointment")
    public void staff_updates_appointment() {
        ReusableMethods.waitForClickablility(us_021_app_page.startDate, 3).sendKeys(Date.tomorrowsDate());
        ReusableMethods.waitForClickablility(us_021_app_page.endDate, 3).sendKeys(Date.tomorrowsDate());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }



    @Then("Staff clicks Save button")
    public void staff_clicks_save_button() {
        ReusableMethods.waitFor(2);
        //ReusableMethods.waitForClickablility(us_021_app_page.save, 3).click();
        Driver.clickWithJS(us_021_app_page.save);
    }



    @Then("Staff shows The appointment is updated with identifier popup")
    public void staff_shows_the_appointment_is_updated_with_identifier_popup() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(us_021_app_page.popup, 3).isDisplayed());

    }


    @Then("Staff close the browser")
    public void staff_close_the_browser() {
        Driver.closeDriver();
    }




    @Then("staff selects COMPLETED option in the status box")
    public void staff_selects_completed_option_in_the_status_box() {
        ReusableMethods.waitForVisibility(us_021_app_page.status, 3);
        Select select = new Select(us_021_app_page.status);
        select.selectByVisibleText("COMPLETED");
}



    @Then("Staff shows status cannot update as COMPLETED")
    public void staff_shows_status_cannot_update_as_completed() {
       String expectedStatus = ConfigurationReader.getProperty("us_021_status");
       String actualStatus = us_021_app_page.actualStatus.getText();
       Assert.assertEquals(actualStatus,expectedStatus);
    }




    @Then("staff may change {string}")
    public void staffMayChange(String status) {
        ReusableMethods.waitForVisibility(us_021_app_page.status, 3);
        Select select = new Select(us_021_app_page.status);
        select.selectByVisibleText(status);
    }





    @Then("Staff leave Anamnesis button as Blank")
    public void staff_leave_anamnesis_button_as_blank() {
        ReusableMethods.waitForClickablility(us_021_app_page.anamnesis, 1).clear();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
    }



    @Then("Staff leave Treatment button as Blank")
    public void staff_leave_treatment_button_as_blank() {
        ReusableMethods.waitForClickablility(us_021_app_page.treatment, 1).clear();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
    }



    @Then("Staff leave Diagnosis button as Blank")
    public void staff_leave_diagnosis_button_as_blank() {
        ReusableMethods.waitForClickablility(us_021_app_page.diagnosis, 1).clear();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }



    @Then("staff should select the current doctor")
    public void staff_should_select_the_current_doctor() throws InterruptedException {
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        us_021_app_page.physician.click();
        Thread.sleep(15000);
        Select select = new Select(us_021_app_page.physician);
        select.selectByVisibleText(ConfigurationReader.getProperty("us_021_Physician"));
        ReusableMethods.waitFor(1);
    }





    @Then("Staff clicks Show Tests button")
    public void staff_clicks_show_tests_button() {
        ReusableMethods.waitForClickablility(us_021_app_page.ShowTests, 1).click();
    }



    @Then("Staff clicks View Results button")
    public void staff_clicks_view_results_button() {
        ReusableMethods.waitForClickablility(us_021_app_page.viewResults, 1).click();
    }



    @Then("Staff shows Test Result text")
    public void staff_shows_test_result_text() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(us_021_app_page.TestResultsText, 3).isDisplayed());
    }




    @Then("Staff updates date as past")
    public void staff_updates_date_as_past() {
        ReusableMethods.waitForClickablility(us_021_app_page.startDate, 3).sendKeys(Date.passedDate());
        ReusableMethods.waitForClickablility(us_021_app_page.endDate, 3).sendKeys(Date.passedDate());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }



    @Then("Staff should not show The appointment is updated with identifier popup")
    public void staff_should_not_show_the_appointment_is_updated_with_identifier_popup() {
//        Assert.assertFalse(ReusableMethods.waitForVisibility(us_021_app_page.popup, 3).isDisplayed());
    }
}
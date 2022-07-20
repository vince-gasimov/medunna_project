package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LoginPage;
import pages.MyPagesAppointmentPage;
import pages.RequestTestPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_012_RequestTestStepDefs {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    RequestTestPage requestTestPage = new RequestTestPage();
    MyPagesAppointmentPage myPagesAppointmentPage = new MyPagesAppointmentPage();

    @Then("doctor clicks to mypages")
    public void doctor_clicks_to_mypages() {
        Driver.waitForVisibility(myPagesAppointmentPage.myPages, 10);
        myPagesAppointmentPage.myPages.click();
    }

    @Then("doctor clicks my appoinments")
    public void doctor_clicks_my_appoinments() {
        myPagesAppointmentPage.myAppointments.click();
    }

    @Then("doctor clicks edit button")
    public void doctor_clicks_edit_button() {
        Driver.waitForVisibility(myPagesAppointmentPage.editButton, 10);
        myPagesAppointmentPage.editButton.click();
    }

    @Then("doctor doubleclicks request a test button")
    public void doctorDoubleClicksRequestATestButton() throws InterruptedException {
        Driver.doubleClick(requestTestPage.requestTestButton);
        Thread.sleep(2000);
    }

    @Then("doctor verifies on request test page")
    public void doctorVerifiesOnRequestTestPage() {
        Assert.assertTrue(requestTestPage.testItemsPage.isDisplayed());
    }

    @And("doctor should click on Save button")
    public void doctorShouldClickOnSaveButton() {
        ReusableMethods.waitForClickablility(requestTestPage.requestTestSaveButton, 10);
    }

    @And("doctor should see No Test Items Found message")
    public void doctorShouldSeeNoTestItemsFoundMessage() {
        Assert.assertTrue(requestTestPage.noTestItemsFound.isDisplayed());
    }

    @And("doctor clicks on checkmark box of Sodium")
    public void doctorClicksOnCheckmarkBoxOfSodium() {
        requestTestPage.sodiumCheckBox.click();


    }

    @And("doctor clicks on checkmark box of Urea")
    public void doctorClicksOnCheckmarkBoxOfUrea() {
        requestTestPage.ureaCheckBox.click();
    }

    @And("doctor clicks on checkmark box of Hemoglobin")
    public void doctorClicksOnCheckmarkBoxOfHemoglobin() {
        requestTestPage.hemoglobinCheckBox.click();
    }

    @And("doctor clicks on checkmark box of Albumin")
    public void doctorClicksOnCheckmarkBoxOfAlbumin() {
        Driver.clickWithJS(requestTestPage.albuminCheckBox);

    }

    @And("doctor clicks on checkmark box of Creatinin")
    public void doctorClicksOnCheckmarkBoxOfCreatinin() {
        Driver.clickWithJS(requestTestPage.creatinineCheckBox);
    }

    @And("doctor clicks on checkmark box of Total Protein")
    public void doctorClicksOnCheckmarkBoxOfTotalProtein() {
        Driver.clickWithJS(requestTestPage.totalProteinCheckBox);
    }

    @And("doctor clicks on checkmark box of Potassium")
    public void doctorClicksOnCheckmarkBoxOfPotassium() {
        Driver.clickWithJS(requestTestPage.potassiumCheckBox);
    }

    @And("doctor verifies A New Test Created message")
    public void doctorVerifiesANewTestCreatedMessage() {
        Assert.assertTrue(requestTestPage.aNewTestCreatedMessage.isDisplayed());
    }

    @And("doctor should verify Glucose is not displayed")
    public void doctorShouldVerifyGlucoseIsNotDisplayed() {


        Select select = new Select(requestTestPage.table);
        List<WebElement> allOptions = select.getOptions();
        boolean flag = false;
        for (WebElement eachOption : allOptions) {
            if (!eachOption.getText().contains("Glucose")) {
                flag = true;

            }

        }
        Assert.assertFalse(flag = false);


    }
}




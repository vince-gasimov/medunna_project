package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.ResetPasswordPage;
import pages.US_022_StaffEditPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_022_EditStaffStepDefs {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ResetPasswordPage resetPasswordPage = new ResetPasswordPage();
    US_022_StaffEditPage staffEditPage = new US_022_StaffEditPage();


    @When("Staff clicks on My Page")
    public void staff_clicks_on_my_page() {
        Driver.waitForVisibility(staffEditPage.myPages, 10);
        staffEditPage.myPages.click();
    }

    @When("Staff clicks on Search Patient")
    public void staff_clicks_on_search_patient() {
        staffEditPage.SearchPatient.click();
    }

    @When("Staff enters a valid SSN Id {string}  on Patient SSN box")
    public void staff_enters_a_valid_ssn_id_on_patient_ssn_box(String SSN) {
        staffEditPage.PatientSSNSearchBox.sendKeys(SSN);

    }

    @Then("Staff should verifies to access the  record of patient who registered with this SSN id")
    public void staff_should_verifies_to_access_the_record_of_patient_who_registered_with_this_ssn_id() {
        Assert.assertTrue(staffEditPage.PatientDetailPage.isDisplayed());
    }

    @And("Staff clicks on Show Appoinments")
    public void staffClicksOnShowAppoinments() {
        Driver.waitForVisibility(staffEditPage.ShowAppoinments, 5);
        staffEditPage.ShowAppoinments.click();
    }


    @And("Staff clicks on Show Test")
    public void staffClicksOnShowTest() {
        Driver.waitForVisibility(staffEditPage.ShowTest, 10);
        staffEditPage.ShowTest.click();
    }


    @And("Staff clicks on View Results")
    public void staffClicksOnViewResults() {
        Driver.waitForVisibility(staffEditPage.ViewResult, 10);
        staffEditPage.ViewResult.click();
    }


    @And("Staff entered a valid SSN Id {string} in Patient SSN box")
    public void staffEnteredAValidSSNIdInPatientSSNBox(String SSN) {

        staffEditPage.PatientSSNSearchBox.sendKeys(SSN);
    }


    @Then("Staff verifies  to see test results on View Results")
    public void staffVerifiesToSeeTestResultsOnViewResults() {
        Driver.waitForVisibility(staffEditPage.ViewResultWithNumber, 10);
        Assert.assertTrue(staffEditPage.ViewResultWithNumber.isDisplayed());
    }

    @And("Staff clicks on Edit")
    public void staffClicksOnEdit() {
        staffEditPage.EditOnView.click();
    }

    @Then("Staff verifies Test Result updated message")
    public void staffVerifiesTestResultUpdatedMessage() throws Throwable {
        Driver.waitForVisibility(staffEditPage.ResultUpdatedmessage, 10);
        Assert.assertTrue(staffEditPage.ResultUpdatedmessage.isDisplayed());
    }

    @And("Staff clicks on Result in Edit")
    public void staffClicksOnResultInEdit() {
        Driver.waitForVisibility(staffEditPage.ResultOnEdit, 10);
        staffEditPage.ResultOnEdit.click();
    }

    @And("Staff entered {string} on Result")
    public void staffEnteredOnResult(String string) {
        staffEditPage.ResultOnEdit.sendKeys(string);
    }

    @And("Staff clicks on Save")
    public void staffClicksOnSave() {

       Driver.clickWithJS(staffEditPage.SaveOnEdit);

    }

    @Then("capture the screenshot")
    public void captureTheScreenshot() throws IOException {
        ReusableMethods.getScreenshot("capturing screenshot");
    }

    @And("Staff clicks on ID")
    public void staffClicksOnID() {
        staffEditPage.ID.click();
    }

    @And("Staff clicks on Description")
    public void staffClicksOnDescription() {
        Driver.waitForVisibility(staffEditPage.Description, 10);
        staffEditPage.Description.click();
    }

    @And("Staff entered {string} on Description")
    public void staffEnteredOnDescription(String string) {
        staffEditPage.Description.sendKeys(string);
    }

    @Then("Staff verifies to access Test Result Create or Edit Test Result")
    public void staffVerifiesToAccessTestResultCreateOrEditTestResult() {
        Assert.assertTrue(staffEditPage.CreateOrEditTestResult.isDisplayed());
    }
}

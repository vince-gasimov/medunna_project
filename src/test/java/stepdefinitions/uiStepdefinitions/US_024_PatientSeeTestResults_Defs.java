package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.*;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_024_PatientSeeTestResults_Defs {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    US_024_PatientSeeTestResultsPage us024PatientSeeTestResultsPage = new US_024_PatientSeeTestResultsPage();

    @Then("patient should click on mypages")
    public void patient_should_click_on_mypages() {
        Driver.waitForVisibility(us024PatientSeeTestResultsPage.myPagesPatientButton, 10);
        us024PatientSeeTestResultsPage.myPagesPatientButton.click();
    }
    @Then("patient should click on My Appointments")
    public void patient_should_click_on_my_appointments() {
        us024PatientSeeTestResultsPage.myAppointmentsButton.click();
    }
    @Then("patient should click on Show Test button")
    public void patient_should_click_on_show_test_button() throws InterruptedException {
        Driver.doubleClick(us024PatientSeeTestResultsPage.showTestsButton);
        Thread.sleep(2000);
        //s024PatientSeeTestResultsPage.showTestsButton.click();

    }
    @Then("patient should click on View Results button")
    public void patient_should_click_on_view_results_button() {
        Driver.doubleClick(us024PatientSeeTestResultsPage.viewResultsButton);
        //us024PatientSeeTestResultsPage.viewResultsButton.click();
    }
    @And("Patient should verify id")
    public void patientShouldVerifyId() {
        Driver.waitAndClick(us024PatientSeeTestResultsPage.idButton,3);
        Assert.assertTrue(us024PatientSeeTestResultsPage.idButton.isDisplayed());
    }
    @Then("Patient should verify name")
    public void patient_should_verify_name() {
        Driver.waitAndClick(us024PatientSeeTestResultsPage.nameButton,3);
        Assert.assertTrue(us024PatientSeeTestResultsPage.nameButton.isDisplayed());
    }
    @Then("Patient should verify default max value")
    public void patient_should_verify_default_max_value() {
        Driver.waitAndClick(us024PatientSeeTestResultsPage.defaultMaxValueButton,3);
        Assert.assertTrue(us024PatientSeeTestResultsPage.defaultMaxValueButton.isDisplayed());
    }
    @Then("Patient should verify default min value")
    public void patient_should_verify_default_min_value() {
        Driver.waitAndClick(us024PatientSeeTestResultsPage.defaultMinValueButton,3);
        Assert.assertTrue(us024PatientSeeTestResultsPage.defaultMinValueButton.isDisplayed());
    }
    @Then("Patient should verify description")
    public void patient_should_verify_description() {
        Driver.waitAndClick(us024PatientSeeTestResultsPage.descriptionButton,3);
        Assert.assertTrue(us024PatientSeeTestResultsPage.descriptionButton.isDisplayed());
    }
    @Then("Patient should verify date")
    public void patient_should_verify_date() {
        Driver.waitAndClick(us024PatientSeeTestResultsPage.dateButton,3);
        Assert.assertTrue(us024PatientSeeTestResultsPage.dateButton.isDisplayed());
    }
    @And("patient should verify No Appointments found message")
    public void patientShouldVerifyNoAppointmentsFoundMessage() {
        Driver.waitAndClick(us024PatientSeeTestResultsPage.noAppointmentsFoundMessage,3);
       Assert.assertTrue(us024PatientSeeTestResultsPage.noAppointmentsFoundMessage.isDisplayed());
    }
    @And("patient should verify No Test Found message")
    public void patientShouldVerifyNoTestFoundMessage() {
        Driver.waitAndClick(us024PatientSeeTestResultsPage.noTestFoundMessage,3);
        Assert.assertTrue(us024PatientSeeTestResultsPage.noTestFoundMessage.isDisplayed());
    }
    @And("patient should click on Show Invoice button")
    public void patientShouldClickOnShowInvoiceButton() {
        ReusableMethods.waitForClickablility(us024PatientSeeTestResultsPage.showInvoiceButton, 5).click();

    }
    @And("patient should verify INVOICE page")
    public void patientShouldVerifyINVOICEPage() {
        Assert.assertTrue(us024PatientSeeTestResultsPage.invoice.isDisplayed());
    }
}

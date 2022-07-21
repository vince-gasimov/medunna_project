package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.*;
import utilities.Driver;

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
    public void patient_should_click_on_show_test_button() {
        us024PatientSeeTestResultsPage.showTestsButton.click();

    }
    @Then("patient should click on View Results button")
    public void patient_should_click_on_view_results_button() {
        us024PatientSeeTestResultsPage.viewResultsButton.click();
    }
    @Then("Patient should verify id, name for test, default max and min value, test date and description")
    public void patient_should_verify_id_name_for_test_default_max_and_min_value_test_date_and_description() {
        Assert.assertTrue(us024PatientSeeTestResultsPage.idButton.isDisplayed());
        Assert.assertTrue(us024PatientSeeTestResultsPage.nameButton.isDisplayed());
        Assert.assertTrue(us024PatientSeeTestResultsPage.defaultMaxValueButton.isDisplayed());
        Assert.assertTrue(us024PatientSeeTestResultsPage.defaultMinValueButton.isDisplayed());
        Assert.assertTrue(us024PatientSeeTestResultsPage.dateButton.isDisplayed());
        Assert.assertTrue(us024PatientSeeTestResultsPage.descriptionButton.isDisplayed());
    }

    @And("patient should verify No Appointments found message")
    public void patientShouldVerifyNoAppointmentsFoundMessage() {
       Assert.assertTrue(us024PatientSeeTestResultsPage.noAppointmentsFoundMessage.isDisplayed());
    }

    @And("patient should verify No Test Found message")
    public void patientShouldVerifyNoTestFoundMessage() {
        Assert.assertTrue(us024PatientSeeTestResultsPage.noTestFoundMessage.isDisplayed());
    }

    @And("patient should click on Show Invoice button")
    public void patientShouldClickOnShowInvoiceButton() {
        us024PatientSeeTestResultsPage.showInvoiceButton.click();
    }

    @And("patient should verify INVOICE page")
    public void patientShouldVerifyINVOICEPage() {
        Assert.assertTrue(us024PatientSeeTestResultsPage.invoice.isDisplayed());
    }
}

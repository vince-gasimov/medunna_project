package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LoginPage;
import pages.MyPagesAppointmentPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_011_AppointmentbyDoctor_StepDefs {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    MyPagesAppointmentPage myPagesAppointmentPage = new MyPagesAppointmentPage();
    Actions actions = new Actions(Driver.getDriver());
     public String patientID;

    @Then("user navigates the sign in page with" +
            " validUsername and validPassword")
    public void user_navigates_the_sign_in_page_with_and() {
        ReusableMethods.waitFor(2);
        ReusableMethods.waitForPageToLoad(7);
        myPagesAppointmentPage.firstSignIn.click();
        myPagesAppointmentPage.signIn.click();
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("validDoctorUsername"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("validDoctorPassword"));
    }
    @Then("user signs in")
    public void user_signs_in() {
        ReusableMethods.waitFor(2);
        loginPage.signInButton.click();

    }
    @Then("user navigates to My Pages segment")
    public void user_navigates_to_my_pages_segment() throws InterruptedException {
        ReusableMethods.waitFor(2);
        myPagesAppointmentPage.myPages.click();
    }
    @Then("user clicks on My appointments")
    public void user_clicks_on_my_appointments() {
        ReusableMethods.waitFor(2);
        myPagesAppointmentPage.myAppointments.click();
        ReusableMethods.waitFor(2);

        myPagesAppointmentPage.fromDateAppointment.click();
        actions.sendKeys("2022").perform();
        actions.sendKeys(Keys.TAB);
        actions.sendKeys("07").perform();
        actions.sendKeys("01").perform();
        actions.sendKeys(Keys.TAB).perform();

        ReusableMethods.waitFor(3);
        actions.sendKeys("2022").perform();
        actions.sendKeys(Keys.TAB);
        actions.sendKeys("07").perform();
        actions.sendKeys("15").perform();

    }
    @Then("user clicks on Edit button")
    public void user_clicks_on_edit_button() {
        ReusableMethods.waitFor(5);
        myPagesAppointmentPage.editButton.click();

    }
    @Then("user verifies the website shows the Create or Edit an Appointment text")
    public void user_verifies_the_website_shows_the_text() {
        ReusableMethods.waitFor(2);
        String expected = "Create or Edit an Appointment";
        String actual = myPagesAppointmentPage.createEditAppointmentText.getText();
        Assert.assertEquals(expected,actual);
    }
    @Then("user verifies patient's info id is visible")
    public void user_verifies_patient_s_info_id_is_visible() {
        Assert.assertTrue(myPagesAppointmentPage.id.isDisplayed());
//        this.patientID = ID;
//        patientID = myPagesAppointmentPage.id.getDomAttribute("value");
//        System.out.println(patientID);
    }

    @Then("closes the page")
    public void closes_the_page() {
        ReusableMethods.waitFor(1);
        Driver.closeDriver();

    }
    @Then("user verifies patient's start date is visible")
    public void user_verifies_patient_s_start_date_is_visible() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(myPagesAppointmentPage.startDate.isDisplayed());
    }
    @Then("user verifies patient's end date is visible")
    public void user_verifies_patient_s_end_date_is_visible() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(myPagesAppointmentPage.endDate.isDisplayed());
    }
    @Then("user verifies patient's status is visible")
    public void user_verifies_patient_s_status_is_visible() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(myPagesAppointmentPage.status.isDisplayed());
    }
    @Then("user verifies patient's physician is visible")
    public void user_verifies_patient_s_physician_is_visible() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(myPagesAppointmentPage.physician.isDisplayed());
    }
    @Then("verify the patient's physician name which should be the same with login user's name")
    public void verify_the_patient_s_physician_name_which_should_be_the_same_with_login_user_s_name() {
        ReusableMethods.waitFor(2);
        String actualPhysician = myPagesAppointmentPage.physician.getText();
        if (actualPhysician.isEmpty()) {
            ReusableMethods.waitFor(2);
            ReusableMethods.waitForPageToLoad(5);

        } else {
            String expectedPhysician = "102969:"+ConfigurationReader.getProperty("validDoctorName")+":FAMILY_MEDICINE";
            ReusableMethods.waitFor(1);
            Assert.assertEquals(expectedPhysician,actualPhysician);
        }
    }






    @Then("user fills in required fields, anemnesis, treatment, diagnosis")
    public void user_fills_in_required_fields_anemnesis_treatment_diagnosis() {
        ReusableMethods.waitFor(2);
        myPagesAppointmentPage.anamnesis.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        ReusableMethods.waitFor(1);
        myPagesAppointmentPage.anamnesis.sendKeys("Anamnesis");

        myPagesAppointmentPage.treatment.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        ReusableMethods.waitFor(1);
        myPagesAppointmentPage.treatment.sendKeys("Treatment");

        myPagesAppointmentPage.diagnosis.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        ReusableMethods.waitFor(1);
        myPagesAppointmentPage.diagnosis.sendKeys("Diagnosis");
    }
    @Then("user clicks on Save button")
    public void user_clicks_on_save_button() {
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN);
        actions.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.waitFor(1);
        myPagesAppointmentPage.saveButton.submit();
    }
    @Then("verify appointment is saved successfully")
    public void verify_appointment_is_saved_successfully() {
        ReusableMethods.waitFor(2);
        String ID = myPagesAppointmentPage.appointmentID.getText();
        String expected = "The Appointment is updated with identifier " + ID;
        ReusableMethods.waitFor(2);
        String actual = myPagesAppointmentPage.savedSuccessfullyText.getText();
        System.out.println("Expected = " + expected);
        System.out.println("Actual = " + actual);
        ReusableMethods.waitFor(1);
        Assert.assertEquals(expected,actual);

    }

    @Then("user does not fill in required fields, anemnesis, treatment, diagnosis")
    public void userDoesNotFillInRequiredFieldsAnemnesisTreatmentDiagnosis() {
        myPagesAppointmentPage.anamnesis.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        ReusableMethods.waitFor(1);

        myPagesAppointmentPage.treatment.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        ReusableMethods.waitFor(1);

        myPagesAppointmentPage.diagnosis.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        ReusableMethods.waitFor(1);

        myPagesAppointmentPage.prescription.sendKeys(" ");
        ReusableMethods.waitFor(2);


    }

    @And("checks if the error messages are displayed")
    public void checksIfTheErrorMessagesAreDisplayed() {
       ReusableMethods.waitFor(1);
       Assert.assertTrue(myPagesAppointmentPage.anamnesisError.isDisplayed());
        ReusableMethods.waitFor(1);
       Assert.assertTrue(myPagesAppointmentPage.treatmentError.isDisplayed());
        ReusableMethods.waitFor(1);
       Assert.assertTrue(myPagesAppointmentPage.diagnosisError.isDisplayed());
    }


    @And("verify appointment is not saved")
    public void verifyAppointmentIsNotSaved() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(myPagesAppointmentPage.saveButton.isDisplayed());
    }

    @And("user selects status as {string}")
    public void userSelectsStatusAs(String status) {
        ReusableMethods.waitFor(1);
        Select select = new Select(myPagesAppointmentPage.status);
        select.selectByVisibleText(status);

        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB);


    }

    @And("verify {string} status is not saved")
    public void verifyStatusIsNotSaved(String status) {
        ReusableMethods.waitFor(3);
        //userSelectsStatusAs(status);
       Assert.assertNotEquals(status,myPagesAppointmentPage.statusCheck.getText());




    }

    @And("verify selected status as {string}")
    public void verifySelectedStatusAs(String status) {
        ReusableMethods.waitFor(2);
        Select select = new Select(myPagesAppointmentPage.status);
        Assert.assertEquals(status,select.getFirstSelectedOption().getText());
    }

    @And("verify selected status is not {string}")
    public void verifySelectedStatusIsNot(String status) {
        ReusableMethods.waitFor(2);
        Select select = new Select(myPagesAppointmentPage.status);
        Assert.assertNotEquals(status,select.getFirstSelectedOption().getText());
    }
}

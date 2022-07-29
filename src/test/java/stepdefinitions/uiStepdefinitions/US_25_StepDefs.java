package stepdefinitions.uiStepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.US_25_PatientAppointmentPage;
import utilities.ConfigurationReader;
import utilities.Date;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_25_StepDefs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    US_25_PatientAppointmentPage patientPage = new US_25_PatientAppointmentPage();
    Faker faker = new Faker();
    @Given("Patient goes to Medunna url")
    public void patient_goes_to_medunna_url() {

    }
    @Then("Patient navigates the sign in page and enter username {string} password {string} and clicks Sign In")
    public void patient_navigates_the_sign_in_page_and_enter_username_password_and_clicks_sign_in(String string, String string2) {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
        homePage.userIcon.click();
        homePage.signInButton.click();
        loginPage.usernameBox.sendKeys(string);
        loginPage.passwordBox.sendKeys(string2);
        loginPage.signInButton.click();
    }
    @Then("Patient navigates My Pages And select Make an Appointment")
    public void patient_navigates_my_pages_and_select_make_an_appointment() {
        ReusableMethods.waitForVisibility(patientPage.myPages,3);
        patientPage.myPages.click();
        ReusableMethods.waitForVisibility(patientPage.myPages,3);
        patientPage.makeAppointment.click();

    }
    @Then("Patient verifies Your FirstName is required warning shown")
    public void patient_verifies_your_first_name_is_required_warning_shown() {
        ReusableMethods.waitForVisibility(patientPage.myPages,10);
        Assert.assertTrue(patientPage.firstNameErrorMessage.isDisplayed());

    }

    @Then("Patient enters all information and leaves First name empty")
    public void patient_enters_all_information_and_leaves_first_name_empty() throws InterruptedException {
        patientPage.firstNameBox.clear();
        patientPage.phoneBox.sendKeys(faker.phoneNumber().cellPhone());
        Thread.sleep(3000);
        patientPage.sendRequest.submit();

    }

    @Then("Patient enters all information and leaves Last name empty")
    public void patient_enters_all_information_and_leaves_last_name_empty() throws InterruptedException {
        patientPage.lastNameBox.clear();
        patientPage.phoneBox.sendKeys(faker.phoneNumber().cellPhone());
        Thread.sleep(3000);
        patientPage.sendRequest.submit();

    }
    @Then("Patient verifies Your LastName is required warning shown")
    public void patient_verifies_your_last_name_is_required_warning_shown() {
        ReusableMethods.waitForVisibility(patientPage.myPages,10);
        Assert.assertTrue(patientPage.lastNameErrorMessage.isDisplayed());
    }
    @Then("Patient verifies Your SSN is required warning shown")
    public void patient_verifies_your_ssn_is_required_warning_shown() {
        ReusableMethods.waitForVisibility(patientPage.myPages,10);
        Assert.assertTrue(patientPage.SSNErrorMessage.isDisplayed());

    }
    @Then("Patient verifies Your email is required warning shown")
    public void patient_verifies_your_email_is_required_warning_shown() {
        ReusableMethods.waitForVisibility(patientPage.myPages,10);
        Assert.assertTrue(patientPage.emailErrorMessage.isDisplayed());
    }

    @Then("Patient enters all information and leaves SSN empty")
    public void patient_enters_all_information_and_leaves_ssn_empty() throws InterruptedException {
        patientPage.ssnBox.clear();
        patientPage.phoneBox.sendKeys(faker.phoneNumber().cellPhone());
        Thread.sleep(3000);
        patientPage.sendRequest.submit();

    }
    @Then("Patient enters all information and leaves Email empty")
    public void patient_enters_all_information_and_leaves_email_empty() throws InterruptedException {
        patientPage.emailBox.clear();
        patientPage.phoneBox.sendKeys(faker.phoneNumber().cellPhone());
        Thread.sleep(3000);
        patientPage.sendRequest.submit();

    }
    @Then("Patient verifies Phone number is required warning shown")
    public void patient_verifies_phone_number_is_required_warning_shown() {
        ReusableMethods.waitForVisibility(patientPage.myPages,10);
        Assert.assertTrue(patientPage.phoneNumberErrorMessage.isDisplayed());
    }

    @Then("Patient enters all information and leaves Phone empty")
    public void patient_enters_all_information_and_leaves_phone_empty() throws InterruptedException {
        patientPage.phoneBox.clear();
        Thread.sleep(3000);
        patientPage.sendRequest.submit();

    }
    @Then("Patient enters all information and select past appointment date")
    public void patient_enters_all_information_and_select_past_appointment_date() {
       patientPage.phoneBox.sendKeys(faker.numerify("###-###-####"));
        patientPage.appointmentDate.sendKeys(Date.passedDate2());
        patientPage.sendRequest.submit();

    }
    @Then("Patient enters all information and select future appointment date")
    public void patient_enters_all_information_and_select_future_appointment_date() {
        patientPage.phoneBox.sendKeys(faker.numerify("###-###-####"));
        patientPage.appointmentDate.sendKeys(Date.futureDate2());
        patientPage.sendRequest.submit();

    }

    @Then("Patient verifies Appointment date can not be past date! warning shown")
    public void patient_verifies_appointment_date_can_not_be_past_date_warning_shown() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(patientPage.pastAppDateErrorMessage.isDisplayed());

    }
    @Then("Patient verifies Appointment registration saved! pop up shown")
    public void patient_verifies_appointment_registration_saved_pop_up_shown() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(patientPage.appSavedMessage.isDisplayed());

    }








}

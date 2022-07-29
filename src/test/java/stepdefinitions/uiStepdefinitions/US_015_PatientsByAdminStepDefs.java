package stepdefinitions.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_015_PatientsByAdminStepDefs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    PatientPage patientPage = new PatientPage();
    US_015_Patients us015_Patients = new US_015_Patients();
    Faker faker = new Faker();
    EditPatientInformation editPatient = new EditPatientInformation();
    Select select;

    @Given("user is on the home page US_015")
    public void userIsOnTheHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }
    @When("user clicks on the user icon US_015")
    public void userClicksOnTheUserIcon() {
        homePage.userIcon.click();
    }
    @And("user clicks on the sign in link US_015")
    public void userClicksOnTheSignInLink() {
        homePage.signInButton.click();
    }
    @And("user enters valid username and password US_015")
    public void userEntersValidUsernameAndPassword() {
                                                  //wrire down your own credentials(admin or staff or physician)
        loginPage.usernameBox.sendKeys("irfan_team83");
        loginPage.passwordBox.sendKeys("Irfan_83");
    }
    @Then("user clicks on sign in button US_015")
    public void userClicksOnSignInButton() {
        loginPage.signInButton.click();
    }
    @Given("user clicks on Items&Titles button US_015")
    public void userClicksOnItemsTitlesButton() {
        Driver.waitForVisibility(homePage.itemsAndTitlesButton, 5);
        homePage.itemsAndTitlesButton.click();
    }
    @Then("user clicks on Patients button US_015")
    public void userClicksOnPatientsButton() {
//        Driver.waitForVisibility(us015_Patients.patientButton, 3).click();
        us015_Patients.patientButton.click();
    }
    @Given("user clicks on create new patient button US_015")
    public void userClicksOnCreateNewPatientButton() {
        ReusableMethods.waitForClickablility(patientPage.createNewPatientButton, 15);
        patientPage.createNewPatientButton.click();
    }
    @And("user enters valid patient credential and clicks save button US_015")
    public void userEntersValidPatientCredentialAndClicksSaveButton() throws InterruptedException {
        patientPage.firstNameBox.sendKeys("Team83_"+ faker.name().firstName());
        patientPage.lastNameBox.sendKeys(faker.name().lastName());
        patientPage.birthDateBox.sendKeys("00"+faker.date().birthday().getTime());
        patientPage.emailBox.sendKeys("Team83_"+faker.internet().emailAddress());
        patientPage.phoneBox.sendKeys(faker.number().digits(10));
        Select select = new Select(patientPage.genderBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        select = new Select(patientPage.bloodGroupBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        patientPage.addressBox.sendKeys(faker.address().streetAddress());
        patientPage.descriptionBox.sendKeys(faker.lorem().word());
        select = new Select(patientPage.userBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        select = new Select(patientPage.countryBox);
        select.selectByVisibleText("USA");
        select = new Select(patientPage.stateBox);
        ReusableMethods.waitForVisibility(patientPage.stateBox, 5);
        select.selectByVisibleText("California");
        patientPage.saveButton.submit();

    }

    @Then("user should see patient created message US_015")
    public void userShouldSeePatientCreatedMessage() {

        Assert.assertTrue(ReusableMethods.waitForVisibility(patientPage.successMessage, 5).isDisplayed());
    }
    @Then("user sees all patient information after sorting US_015")
    public void user_sees_all_patient_information_after_sorting() throws InterruptedException {
        us015_Patients.firstNameButton.click();
        us015_Patients.lastNameButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(us015_Patients.patientSsn.isDisplayed());
        Assert.assertTrue(us015_Patients.patientFirstName.isDisplayed());
        Assert.assertTrue(us015_Patients.patientLastName.isDisplayed());
        Assert.assertTrue(us015_Patients.patientBirthDate.isDisplayed());
        Assert.assertTrue(us015_Patients.patientPhone.isDisplayed());
        Assert.assertTrue(us015_Patients.patientEmail.isDisplayed());
        Assert.assertTrue(us015_Patients.patientGender.isDisplayed());
        Assert.assertTrue(us015_Patients.patientBloodGroup.isDisplayed());
        Assert.assertTrue(us015_Patients.patientAddress.isDisplayed());
        Assert.assertTrue(us015_Patients.patientDescription.isDisplayed());
        Assert.assertTrue(us015_Patients.patientCreatedDate.isDisplayed());
        Assert.assertTrue(us015_Patients.patientUser.isDisplayed());
        Assert.assertTrue(us015_Patients.patientCountry.isDisplayed());
        Assert.assertTrue(us015_Patients.patientStateCity.isDisplayed());
    }
    @Then("user clicks on edit button US_015")
    public void user_clicks_on_edit_button() {
        Driver.waitAndClick(us015_Patients.firstNameButton, 5);
        Driver.waitAndClick(us015_Patients.lastNameButton, 5);
        Driver.waitAndClick(us015_Patients.editPatient, 1);
    }
    @Then("user sees all patient information US_015")
    public void user_sees_all_patient_information() {
//        Assert.assertTrue(editPatient.id.isDisplayed());
        Assert.assertTrue(editPatient.firstName.isDisplayed());
        Assert.assertTrue(editPatient.lastName.isDisplayed());
        Assert.assertTrue(editPatient.birthDate.isDisplayed());
        Assert.assertTrue(editPatient.phone.isDisplayed());
        Assert.assertTrue(editPatient.email.isDisplayed());
        Assert.assertTrue(editPatient.gender.isDisplayed());
        Assert.assertTrue(editPatient.bloodGroup.isDisplayed());
        Assert.assertTrue(editPatient.address.isDisplayed());
        Assert.assertTrue(editPatient.description.isDisplayed());
        Assert.assertTrue(editPatient.user.isDisplayed());
        Assert.assertTrue(editPatient.country.isDisplayed());
//        Assert.assertTrue(editPatient.state.isDisplayed());
    }
    @Then("user clicks on user and assigns patient to the doctor US_015")
    public void user_clicks_on_user_and_assigns_patient_to_the_doctor() {
        select = new Select(editPatient.user);
        select.selectByValue("3309");
    }
    @Then("user clicks on save button US_015")
    public void user_clicks_on_save_button() {
        editPatient.saveButton.submit();
    }
    @Then("user sees A Patient is updated with identifier message US_015")
    public void user_sees_a_patient_is_updated_with_identifier_message() {
        Driver.waitForVisibility(us015_Patients.patientUpdatedMessage,10);
        Assert.assertTrue(us015_Patients.patientUpdatedMessage.isDisplayed());
    }
    @Then("user sees updated patient information US_015")
    public void user_sees_updated_patient_information() {
        Assert.assertTrue(us015_Patients.ahmetDoctor.isDisplayed());
    }
    @Then("user enters valid information and select country as USA US_015")
    public void user_enters_valid_information_and_select_country_as_usa() {
        patientPage.firstNameBox.sendKeys("Team83_"+ faker.name().firstName());
        patientPage.lastNameBox.sendKeys(faker.name().lastName());
        patientPage.birthDateBox.sendKeys("00"+faker.date().birthday().getTime());
        patientPage.emailBox.sendKeys("Team83_"+faker.internet().emailAddress());
        patientPage.phoneBox.sendKeys(faker.number().digits(10));
        Select select = new Select(patientPage.genderBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        select = new Select(patientPage.bloodGroupBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        patientPage.addressBox.sendKeys(faker.address().streetAddress());
        patientPage.descriptionBox.sendKeys(faker.lorem().word());
        select = new Select(patientPage.userBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        select = new Select(patientPage.countryBox);
        select.selectByVisibleText("USA");
    }
    @Then("user select California and clicks save US_015")
    public void user_select_california_and_clicks_save() {
        select = new Select(patientPage.stateBox);
        ReusableMethods.waitForVisibility(patientPage.stateBox, 5);
        select.selectByVisibleText("California");
        patientPage.saveButton.submit();
    }
    @Then("user clicks Created Date button to see last added patient US_015")
    public void user_clicks_created_date_button_to_see_last_added_patient() {
        patientPage.createdDate.click();
    }
    @Then("user verifies state is California US_015")
    public void user_verifies_state_is_california() {
        Assert.assertTrue(patientPage.californiaState.isDisplayed());
    }
    @Then("user does not select any state option and clicks save button US_015")
    public void user_does_not_select_any_state_option_and_clicks_save_button() {
        patientPage.saveButton.submit();
    }
    @Then("user enters valid information and select country as Morocco US_015")
    public void user_enters_valid_information_and_select_country_as_morocco() {
        patientPage.firstNameBox.sendKeys("Team83_"+ faker.name().firstName());
        patientPage.lastNameBox.sendKeys(faker.name().lastName());
        patientPage.birthDateBox.sendKeys("00"+faker.date().birthday().getTime());
        patientPage.emailBox.sendKeys("Team83_"+faker.internet().emailAddress());
        patientPage.phoneBox.sendKeys(faker.number().digits(10));
        Select select = new Select(patientPage.genderBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        select = new Select(patientPage.bloodGroupBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        patientPage.addressBox.sendKeys(faker.address().streetAddress());
        patientPage.descriptionBox.sendKeys(faker.lorem().word());
        select = new Select(patientPage.userBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        select = new Select(patientPage.countryBox);
        select.selectByVisibleText("Morocco");
    }
    @When("user sorts the patients and clicks on delete button on first patient US_015")
    public void user_sorts_the_patients_and_clicks_on_delete_button_on_first_patient() {
        patientPage.createdDateButton.click();
        us015_Patients.deletePatient.click();
    }
    @Then("user confirms delete US_015")
    public void user_confirms_delete() {
        us015_Patients.confirmDelete.click();
    }
    @Then("user confirms that patients information is deleted US_015")
    public void user_confirms_that_patients_information_is_deleted() {
        Driver.waitAndClick(patientPage.createdDateButton, 5);
//        Assert.assertFalse(us015_Patients.deletedUser.isDisplayed());
    }
}



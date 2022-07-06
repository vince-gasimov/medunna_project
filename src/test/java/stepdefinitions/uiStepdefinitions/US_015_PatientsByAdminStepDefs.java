package stepdefinitions.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LoginPage;
import pages.PatientPage;
import pages.US_015_Patients;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_015_PatientsByAdminStepDefs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    PatientPage patientPage = new PatientPage();
    US_015_Patients us015_Patients = new US_015_Patients();
    Faker faker = new Faker();

    @Given("user is on the home page")
    public void userIsOnTheHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }
    @When("user clicks on the user icon")
    public void userClicksOnTheUserIcon() {
        homePage.userIcon.click();
    }
    @And("user clicks on the sign in link")
    public void userClicksOnTheSignInLink() {
        homePage.signInButton.click();
    }
    @And("user enters valid username and password")
    public void userEntersValidUsernameAndPassword() {
                                                  //wrire down your own credentials(admin or staff or physician)
        loginPage.usernameBox.sendKeys("irfan_team83");
        loginPage.passwordBox.sendKeys("Irfan_83");
    }
    @Then("user clicks on sign in button")
    public void userClicksOnSignInButton() {
        loginPage.signInButton.click();
    }
    @Given("user clicks on Items&Titles button")
    public void userClicksOnItemsTitlesButton() {
//        Driver.waitAndClick(homePage.itemsAndTitlesButton, 1);
        homePage.itemsAndTitlesButton.click();
    }
    @Then("user clicks on Patients button")
    public void userClicksOnPatientsButton() {
//        Driver.waitForVisibility(us015_Patients.patientButton, 3).click();
        us015_Patients.patientButton.click();
    }
    @Given("user clicks on create new patient button")
    public void userClicksOnCreateNewPatientButton() {
        ReusableMethods.waitForClickablility(patientPage.createNewPatientButton, 15);
        patientPage.createNewPatientButton.click();
    }
    @And("user enters valid patient credential and clicks save button")
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

    @Then("user should see patient created message")
    public void userShouldSeePatientCreatedMessage() {

        Assert.assertTrue(ReusableMethods.waitForVisibility(patientPage.successMessage, 5).isDisplayed());
    }
    @Then("user sees all patient information")
    public void user_sees_all_patient_information() throws InterruptedException {
        us015_Patients.firstNameButton.click();
        us015_Patients.lastNameButton.click();
        Thread.sleep(1000);
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
    @Then("user clicks on edit button")
    public void user_clicks_on_edit_button() {
        Driver.waitAndClick(us015_Patients.editPatient, 1);
    }
}



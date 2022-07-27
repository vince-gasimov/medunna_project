package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import pages.PatientView;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_009_PatientViewStepDefs {

    PatientView patientView = new PatientView();

    @Given("User \\(Admin & Staff) goes to Medunna URL")
    public void user_admin_staff_goes_to_medunna_url() {
        Driver.getDriver().get("https://medunna.com/login");

    }

    @Given("User Admin should enter  valid credentials")
    public void user_admin_should_enter_valid_credentials() {

        patientView.usernameInput.sendKeys("vusalgasimov");
        patientView.passwordInput.sendKeys("vusalgasimov");

    }

    @When("User \\(Admin & Staff) clicks on sign in button")
    public void user_admin_staff_clicks_on_sign_in_button() throws InterruptedException {
        patientView.SignInButton.click();
        Thread.sleep(3000);

    }

    @Then("User \\(Admin & Staff) succesfully login and sees the message {string}")
    public void user_admin_staff_succesfully_login_and_sees_the_message(String expectedMessageWelcome) {
        String actualMessage= patientView.WelcomeMessage.getText();
        System.out.println(actualMessage);
        Assert.assertEquals(actualMessage,expectedMessageWelcome);

    }

    @Then("User clicks on Items&Titles button")
    public void user_clicks_on_items_titles_button() throws InterruptedException {
        Thread.sleep(1000);
        patientView.ItemsTitles.click();
        Thread.sleep(1000);

    }


    @When("User \\(Admin & Staff) clicks on Patients button")
    public void user_admin_staff_clicks_on_patients_button() throws InterruptedException {
         patientView.Patient.isDisplayed();
         patientView.Patient.click();


    }

    @Then("User should be able to see patients")
    public void user_should_be_able_to_see_patients() throws InterruptedException {
        Thread.sleep(1000);
       String actualName = patientView.PatientName.getText();
       Assert.assertEquals(actualName, "Elizbeth");
    }
    @When("Admin clicks on patient ID")
    public void admin_clicks_on_patient_id() throws InterruptedException {
        Thread.sleep(1000);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("javascript:window.scrollBy(0,800)");

        //Java script ile click yapildi
        JavascriptExecutor jsExecutor = (JavascriptExecutor)Driver.getDriver();
         jsExecutor.executeScript("arguments[0].click();", patientView.PatientID);
         //Normal click calismadi
       // patientView.PatientID.click();


    }

    @When("Admin scrolls down and clicks edit button")
    public void admin_scrolls_down_and_clicks_edit_button() throws InterruptedException {
        ReusableMethods.waitForClickablility(patientView.EditButton,3);
        JavascriptExecutor jsExecutor = (JavascriptExecutor)Driver.getDriver();
        jsExecutor.executeScript("arguments[0].click();", patientView.EditButton);
       // patientView.EditButton.click();
        Thread.sleep(3000);
    }
    @When("Admin edit patient name and surname")
    public void admin_edit_patient_name_and_surname() throws InterruptedException {
        patientView.PatienFirsttNameInputBox.clear();
        patientView.PatienFirsttNameInputBox.sendKeys("Seval" );
        patientView.PatienLasttNameInputBox.clear();
        patientView.PatienLasttNameInputBox.sendKeys("team_83");

    }
    @When("Admin clicks save button")
    public void admin_clicks_save_button() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor)Driver.getDriver();
        jsExecutor.executeScript("arguments[0].click();", patientView.saveButton);
    }
    @Then("Admin should be able to see the success message")
    public void admin_should_be_able_to_see_the_success_message() {


    }
    @When("Admin sends patient email")
    public void admin_sends_patient_email() throws InterruptedException {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView();",  patientView.patientEmail);
        Thread.sleep(2000);
      patientView.patientEmail.clear();
      patientView.patientEmail.sendKeys("servur@hotmail.com");
    }

    @When("Admin edit patient address")
    public void admin_edit_patient_address() {
       patientView.patientAddress.clear();
       patientView.patientAddress.sendKeys("amerika");
    }
    @When("Admin edit patient country")
    public void admin_edit_patient_country() throws InterruptedException {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView();", patientView.patientCountry);
       // ((JavascriptExecutor) Driver.getDriver()).executeScript("javascript:window.scrollBy(0,1000)");
        Select drpCountry = new Select(patientView.patientCountry);
        drpCountry.selectByVisibleText("Bulgaria");
        Thread.sleep(2000);
      //  List<WebElement> listOfCountries= drpCountry.getOptions();
      //  for (WebElement o : listOfCountries) {
       //     System.out.println(o.getText());
       // }


    }

    @When("Admin edit patient gender")
    public void admin_edit_patient_gender() throws InterruptedException {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView();", patientView.patientGender);
        Thread.sleep(2000);
        Select drpGender = new Select(patientView.patientGender);
        drpGender.selectByVisibleText("OTHER");
        Thread.sleep(2000);
    }

    @When("Admin edit patient blood group")
    public void admin_edit_patient_blood_group() throws InterruptedException {
        Select drpBloodGroup= new Select(patientView.patientBloodGroup);
        drpBloodGroup.selectByVisibleText("B-");
        Thread.sleep(1000);

    }
    @When("user edit patient info name-surname-email-gender-bloodgroup-country")
    public void user_edit_patient_info_name_surname_email_gender_bloodgroup_country() throws InterruptedException {
        patientView.PatienFirsttNameInputBox.clear();
        patientView.PatienFirsttNameInputBox.sendKeys("SevalBanu" );
        patientView.PatienLasttNameInputBox.clear();
        patientView.PatienLasttNameInputBox.sendKeys("team_831");
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView();",  patientView.patientEmail);
        Thread.sleep(2000);
        patientView.patientEmail.clear();
        patientView.patientEmail.sendKeys("servur@hotmail.com");
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView();", patientView.patientGender);
        Thread.sleep(2000);
        Select drpGender = new Select(patientView.patientGender);
        drpGender.selectByVisibleText("OTHER");
        Thread.sleep(2000);
        Select drpBloodGroup= new Select(patientView.patientBloodGroup);
        drpBloodGroup.selectByVisibleText("B-");
        Thread.sleep(1000);
        patientView.patientAddress.clear();
        patientView.patientAddress.sendKeys("amerika");
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView();", patientView.patientCountry);
        // ((JavascriptExecutor) Driver.getDriver()).executeScript("javascript:window.scrollBy(0,1000)");
        Select drpCountry = new Select(patientView.patientCountry);
        drpCountry.selectByVisibleText("Bulgaria");
        Thread.sleep(2000);

    }
    @Then("Admin should be able to see the changes")
    public void admin_should_be_able_to_see_the_changes() throws InterruptedException {
        Thread.sleep(3000);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView();",  patientView.PatientID);
        String name=  Driver.getDriver().findElement(By.xpath("(//tr/td/a[contains(text(),'4859')]/parent:: td//parent:: tr/td)[3]")).getText();
        System.out.println(name);
        String surName=  Driver.getDriver().findElement(By.xpath("(//tr/td/a[contains(text(),'4859')]/parent:: td//parent:: tr/td)[4]")).getText();
        System.out.println(surName);
        Assert.assertEquals("SevalBanu",name);
        Assert.assertEquals("team_831",surName);
    }

    @When("Admin edit patient phone")
    public void admin_edit_patient_phone() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("javascript:window.scrollBy(0,1000)");
        patientView.patientPhone.clear();
        patientView.patientPhone.sendKeys("2287221871");
    }

    @When("Admin edit patient  patientStateCity")
    public void admin_edit_patient_patient_state_city() {
       patientView.patientStateCity.clear();
       patientView.patientStateCity.sendKeys("FL/Orlando");
    }

    @When("Admin edit patient  patientDescription")
    public void admin_edit_patient_patient_description() throws InterruptedException {
        patientView.patientDescription.clear();
        patientView.patientDescription.sendKeys("good to go");
        Thread.sleep(2000);

    }
    @When("Admin edit patient  patientBirthDate")
    public void admin_edit_patient_patient_birth_date() {
      patientView.patientBirthDate.clear();
      patientView.patientBirthDate.sendKeys("22/03/1850");

    }




}



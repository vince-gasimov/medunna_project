
package stepdefinitions.uiStepdefinitions;

        import io.cucumber.java.en.Given;
        import io.cucumber.java.en.Then;
        import io.cucumber.java.en.When;
        import org.junit.Assert;
        import org.openqa.selenium.WebElement;
        import pages.DoctorPage;
        import pages.HomePage;
        import pages.LoginPage;
        import utilities.ConfigurationReader;
        import utilities.Driver;
        import utilities.ReusableMethods;

        import java.io.IOException;

public class US_014_MyInpatientsInfoStepDefs {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    DoctorPage doctorPage = new DoctorPage();

    @Given("doctor goes to Medunna Url")
    public void doctor_goes_to_medunna_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
        try{
            doctorPage.doctorName.click();
            Driver.waitForVisibility(doctorPage.signOut, 10);
            doctorPage.signOut.click();
            Thread.sleep(2000);
        }catch(Exception e){

        }

    }

    @When("doctor clicks on the human icon in the upper right corner")
    public void doctor_clicks_on_the_human_icon_in_the_upper_right_corner() {
        Driver.waitForVisibility(homePage.userIcon,10);
        homePage.userIcon.click();
    }

    @Then("doctor clicks on Sign In")
    public void doctor_clicks_on_sign_in() {
        Driver.waitForVisibility(homePage.signInButton,10);
        homePage.signInButton.click();
    }

    @Then("doctor enters a valid username")
    public void doctor_enters_a_valid_username() {
        loginPage.usernameBox.sendKeys("team83_filizdoctor1");
    }

    @Then("doctor enters a valid password")
    public void doctor_enters_a_valid_password() throws InterruptedException {
        loginPage.passwordBox.sendKeys("filizdoctor1");
        Thread.sleep(3000);
    }

    @Then("doctor clicks the Sign In button")
    public void doctor_clicks_the_sign_in_button() throws InterruptedException {
        loginPage.signInButton.click();
        Thread.sleep(3000);
    }

    @Then("doctor clicks on MY PAGES")
    public void doctor_clicks_on_my_pages() {
        Driver.waitForVisibility(doctorPage.myPages, 10);
        doctorPage.myPages.click();
    }

    @Then("doctor clicks on My Inpatients")
    public void doctor_clicks_on_my_inpatients() throws InterruptedException {
        Driver.waitForVisibility(doctorPage.myInpatients, 10);
        doctorPage.myInpatients.click();
        Thread.sleep(2000);
    }

    @When("doctor verifies the ID of the inpatient is visible")
    public void doctor_verifies_the_id_of_the_inpatient_is_visible() throws IOException {
        Driver.waitForVisibility(doctorPage.id, 10);
        Assert.assertTrue(doctorPage.id.isDisplayed());
        ReusableMethods.getScreenshot("US014_TC001_");
    }

    @When("doctor verifies the Start Date of the hospitalization of the inpatient is visible")
    public void doctor_verifies_the_start_date_of_the_hospitalization_of_the_inpatient_is_visible() throws IOException {
        Driver.waitForVisibility(doctorPage.startDate, 10);
        Assert.assertTrue(doctorPage.startDate.isDisplayed());
        ReusableMethods.getScreenshot("US014_TC002_");
    }

    @When("doctor verifies the End Date of the hospitalization of the inpatient is visible")
    public void doctor_verifies_the_end_date_of_the_hospitalization_of_the_inpatient_is_visible() throws IOException {
        Driver.waitForVisibility(doctorPage.endDate, 10);
        Assert.assertTrue(doctorPage.endDate.isDisplayed());
        ReusableMethods.getScreenshot("US014_TC003_");
    }

    @When("doctor verifies the Status of the inpatient is visible")
    public void doctor_verifies_the_status_of_the_inpatient_is_visible() throws IOException {
        Driver.waitForVisibility(doctorPage.status, 10);
        Assert.assertTrue(doctorPage.status.isDisplayed());
        ReusableMethods.getScreenshot("US014_TC004_");
    }

    @When("doctor verifies the Description written about the inpatient is visible")
    public void doctor_verifies_the_description_written_about_the_inpatient_is_visible() throws IOException {
        Driver.waitForVisibility(doctorPage.description, 10);
        Assert.assertTrue(doctorPage.description.isDisplayed());
        ReusableMethods.getScreenshot("US014_TC005_");
    }

    @When("doctor verifies the Created Date of the inpatient is visible")
    public void doctor_verifies_the_created_date_of_the_inpatient_is_visible() throws IOException {
        Driver.waitForVisibility(doctorPage.createdDate, 10);
        Assert.assertTrue(doctorPage.createdDate.isDisplayed());
        ReusableMethods.getScreenshot("US014_TC006_");
    }

    @When("doctor verifies the Room of the inpatient is visible")
    public void doctor_verifies_the_room_of_the_inpatient_is_visible() throws IOException {
        Driver.waitForVisibility(doctorPage.room, 10);
        Assert.assertTrue(doctorPage.room.isDisplayed());
        ReusableMethods.getScreenshot("US014_TC007_");
    }

    @When("doctor verifies the Appointment ID of the inpatient is visible")
    public void doctor_verifies_the_appointment_id_of_the_inpatient_is_visible() throws IOException {
        Driver.waitForVisibility(doctorPage.appointment, 10);
        Assert.assertTrue(doctorPage.appointment.isDisplayed());
        ReusableMethods.getScreenshot("US014_TC008_");
    }

    @When("doctor verifies the Patient is visible")
    public void doctor_verifies_the_patient_is_visible() throws IOException {
        Driver.waitForVisibility(doctorPage.patient, 10);
        Assert.assertTrue(doctorPage.patient.isDisplayed());
        ReusableMethods.getScreenshot("US014_TC009_");
    }

    @When("doctor verifies she can see all the info of patients")
    public void doctorVerifiesSheCanSeeAllTheInfoOfPatients() throws IOException {
        WebElement table = Driver.waitForVisibility(doctorPage.entireTable, 10);
        System.out.println(table.getText());
        Assert.assertTrue(doctorPage.entireTable.isDisplayed());
        ReusableMethods.getScreenshot("US014_TC010_");
    }

    @When("doctor closes the application")
    public void doctor_closes_the_application() throws InterruptedException {
        doctorPage.doctorName.click();
        Driver.waitForVisibility(doctorPage.signOut, 10);
        doctorPage.signOut.click();
        Thread.sleep(2000);
    }
}


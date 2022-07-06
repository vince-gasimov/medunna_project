package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.MyPagesAppointmentPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_010_AppointmentsListStepDefs {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AppointmentsListPage appointmentsListPage = new AppointmentListPage();
    Actions actions = new Actions(Driver.getDriver());
    public String patientID;

    @Given("user navigates to medunna.com")
    public void user_navigates_to_medunna_com() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }
    @Then("user navigates the sign in page with" + " validUsername and validPassword")
    public void user_clicks_on_the_sign_in_button() {
        ReusableMethods.waitFor(2);
        ReusableMethods.waitForPageToLoad(7);
        myPagesAppointmentPage.firstSignIn.click();
        myPagesAppointmentPage.signIn.click();
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("validDoctorUsername"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("validDoctorPassword"));
        }

    }
    @Given("user clicks on Sign in button")
    public void user_clicks_on_sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user clicks on Appointments button")
    public void user_clicks_on_appointments_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should see Appointments list and time slots")
    public void user_should_see_appointments_list_and_time_slots() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}

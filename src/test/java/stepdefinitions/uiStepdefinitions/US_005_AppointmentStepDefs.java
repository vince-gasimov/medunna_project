package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.US_007_AppointmentPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_005_AppointmentStepDefs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    US_007_AppointmentPage us_007_appointmentPage = new US_007_AppointmentPage();


    @Given("user should navigate to medunna")
    public void user_should_navigate_to_medunna() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }

    @When("user clicks on Make an Appointment button")
    public void user_clicks_on_make_an_appointment_button() {
        homePage.makeAnAppointment.click();
    }

    @When("user enters valid first name")
    public void user_enters_valid_first_name() {
        us_007_appointmentPage.firstName.sendKeys("a");
    }

    @When("user enters valid last name")
    public void user_enters_valid_last_name() {
        us_007_appointmentPage.lastName.sendKeys("C");
    }

    @When("user enters valid ssn")
    public void user_enters_valid_ssn() {
        us_007_appointmentPage.ssn.sendKeys("176-23-1234");
    }

    @When("user enters valid email")
    public void user_enters_valid_email() {
        us_007_appointmentPage.email.sendKeys("gazkop12@hotmail.com");
    }

    @When("user enters valid phone number")
    public void user_enters_valid_phone_number() {
        us_007_appointmentPage.phone.sendKeys("176-123-1234");
    }

    @When("user enters valid appointment date")
    public void user_enters_valid_appointment_date() {
        us_007_appointmentPage.date.sendKeys("2022-09-09");
    }


    @Then("user does not fill out firstname box")
    public void userDoesNotFillOutFirstnameBox() {
        us_007_appointmentPage.firstName.sendKeys("");
    }

    @And("user does not fill out SSN box")
    public void userDoesNotFillOutSSNBox() {
        us_007_appointmentPage.ssn.sendKeys("");
    }

    @And("user does not fill out lastname box")
    public void userDoesNotFillOutLastnameBox() {
        us_007_appointmentPage.lastName.sendKeys("");
    }

    @And("user does not fill out phone number box")
    public void userDoesNotFillOutPhoneNumberBox() {
        us_007_appointmentPage.phone.sendKeys("");
    }



        @When("User does not use '-' after 3rd and 6th digits in phone number")
        public void user_does_not_use_after_3rd_and_6th_digits_in_phone_number () {
            us_007_appointmentPage.phone.sendKeys("1312420202");


        }

        @And("user enters icon to top right corner")
        public void userEntersIconToTopRightCorner () {
            homePage.userIcon.click();
        }

        // @And("user enters password again")
        // public void userEntersPasswordAgain() {
        //  homePage.registerButton.click();
        // }

        @And("user enters valid data on ssn, firstname, lastname, username, email, password field")
        public void userEntersValidDataOnSsnFirstnameLastnameUsernameEmailPasswordField () {
            Actions actions = new Actions(Driver.getDriver());
            actions.click(homePage.registerButton).perform();
            registerPage.ssnBox.sendKeys("176-23-1234");
            registerPage.firstNameBox.sendKeys("a");
            registerPage.lastNameBox.sendKeys("C");
            registerPage.usernameBox.sendKeys("gzsdakp");
            registerPage.emailBox.sendKeys("gazkop12@hotmail.com");
            registerPage.newPasswordBox.sendKeys("hst123.");

        }

        @And("user enters password again")
        public void userEntersPasswordAgain () {
            registerPage.confirmPasswordBox.sendKeys("hst123.");
        }

        @And("user enters Register button")
        public void userEntersRegisterButton () {
            registerPage.registerButton.submit();
        }


        @And("user enters sign in button")
        public void userEntersSignInButton () {
            homePage.signInButton.click();

        }

        @And("user enters valid username")
        public void userEntersValidUsername () {
            loginPage.usernameBox.sendKeys("gzsdakp");
        }

        @And("user enters valid password")
        public void userEntersValidPassword () {
            loginPage.passwordBox.sendKeys("hst123.");
        }

        @And("user enters last sign in button")
        public void userEntersLastSignInButton () {
            loginPage.signInButton.submit();
        }

        @And("users see their profile")
        public void usersSeeTheirProfile () {
            Assert.assertTrue(homePage.profil.isDisplayed());
        }


        @And("user should see the error message")
        public void userShouldSeeTheErrorMessage () {
            Assert.assertTrue(homePage.invalidmessage.isDisplayed());
        }


        @Given("user connects to the database 005")
        public void userConnectsToTheDatabase () {

        }


    }

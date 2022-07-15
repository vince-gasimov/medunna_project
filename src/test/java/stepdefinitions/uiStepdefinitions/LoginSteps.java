package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import utilities.Driver;

public class LoginSteps {


    LoginPage login = new LoginPage();

    @Given("user sends the username as {string}")
    public void user_sends_the_username_as(String username) {
        Driver.waitAndSendText(login.usernameBox, username);
    }
    @Given("user provides the password as {string}")
    public void user_provides_the_password_as(String password) {
        Driver.waitAndSendText(login.passwordBox, password);
    }
    @Then("user signs in  and valiates")
    public void user_signs_in_and_valiates() {

        Driver.waitAndClick(login.signInButton);
    }


}

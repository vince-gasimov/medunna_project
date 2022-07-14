package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.RegisterPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_003_RegistrationPagePasswordStrength {

    HomePage homePage=new HomePage();
    RegisterPage registerPage=new RegisterPage();


    @When("user enters a password that is not strong enough")
    public void userEntersAPasswordThatIsNotStrongEnough() {
        registerPage.newPasswordBox.sendKeys("123");

    }

    @Then("user should see a message that password should be at least {int} characters long")
    public void user_should_see_a_message_that_password_should_be_at_least_characters_long(Integer chars) {
        registerPage.confirmPasswordBox.click();
        Assert.assertTrue(registerPage.invalidMessage.isDisplayed());
        Driver.wait(2);
    }
    @Then("User enters a four characters random {string}")
    public void user_enters_a_four_characters_random(String password) {
        registerPage.newPasswordBox.sendKeys(password);
        Driver.wait(1);
    }
    @Then("User verifies password  chart color is filled {string}  level bar")
    public void user_verifies_password_chart_color_is_filled_level_bar(String level) {
        colorStrength(level);
    }

    @Then("User enters seven characters {string} with a combination by using two of a digit, special char, upper and  lowers letter")
    public void userEntersSevenCharactersWithACombinationByUsingTwoOfADigitSpecialCharUpperAndLowersLetter(String password) {
        registerPage.newPasswordBox.sendKeys(password);
        Driver.wait(1);
    }

    @Then("User enters seven characters {string} with a combination by using three of a digit, special char, upper and  lowers letter")
    public void userEntersSevenCharactersWithACombinationByUsingThreeOfADigitSpecialCharUpperAndLowersLetter(String password) {
        registerPage.newPasswordBox.sendKeys(password);
        Driver.wait(1);
    }

    @Then("User enters seven characters {string} with a combination by using all the different type of chars")
    public void userEntersSevenCharactersWithACombinationByUsingAllTheDifferentTypeOfChars(String password) {
        registerPage.newPasswordBox.sendKeys(password);
        Driver.wait(1);
    }

    @Then("User provides a random {string}")
    public void userProvidesARandom(String password) {
        registerPage.newPasswordBox.sendKeys(password);
        Driver.wait(1);

    }



    public void colorStrength(String level){
        if (1 == Integer.parseInt(level)) {
            Assert.assertTrue(RegisterPage.passwordStrength1.isDisplayed());
            Driver.wait(2);
        } else if (2 == Integer.parseInt(level)) {
            Assert.assertTrue(RegisterPage.passwordStrength2.isDisplayed());
            Driver.wait(2);
        } else if (3 == Integer.parseInt(level)) {
            Assert.assertTrue(RegisterPage.passwordStrength3.isDisplayed());
            Driver.wait(2);
        } else if (4 == Integer.parseInt(level)) {
            Assert.assertTrue(RegisterPage.passwordStrength4.isDisplayed());
            Driver.wait(2);
        }
    }


    @Given("userE goes to medunna")
    public void userGoesToMedunna(){
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));

    }

    @Then("userE clicks on register button")
    public void userClicksOnRegisterButton (){
        homePage.userIcon.click();

    }
}

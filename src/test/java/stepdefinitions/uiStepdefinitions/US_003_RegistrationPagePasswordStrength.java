package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegisterPage;
import utilities.Driver;

public class US_003_RegistrationPagePasswordStrength {


    RegisterPage registerPage=new RegisterPage();
    @Then("User enters a four characters random {string}")
    public void user_enters_a_four_characters_random(String password) {
        registerPage.newPasswordBox.sendKeys(password);
        Driver.wait(1);
    }
    @Then("User verifies password  chart color is filled first level bar with red color")
    public void user_verifies_password_chart_color_is_filled_first_level_bar() {
        Assert.assertTrue(RegisterPage.passwordStrength1.isDisplayed());
        Driver.wait(2);
    }


    @Then("User enters seven characters {string} with a combination by using two of a digit, special char, upper and  lowers letter")
    public void userEntersSevenCharactersWithACombinationByUsingTwoOfADigitSpecialCharUpperAndLowersLetter(String password) {
        registerPage.newPasswordBox.sendKeys(password);
        Driver.wait(1);

    }

    @Then("User verifies password  chart color is filled first two level bars")
    public void userVerifiesPasswordChartColorIsFilledFirstTwoLevelBars() {
        Assert.assertTrue(RegisterPage.passwordStrength2.isDisplayed());
        Driver.wait(2);
    }

    @Then("User enters seven characters {string} with a combination by using three of a digit, special char, upper and  lowers letter")
    public void userEntersSevenCharactersWithACombinationByUsingThreeOfADigitSpecialCharUpperAndLowersLetter(String password) {
        registerPage.newPasswordBox.sendKeys(password);
        Driver.wait(1);
    }
    @Then("User verifies password  chart color is filled first three level bars")
    public void userVerifiesPasswordChartColorIsFilledFirstThreeLevelBars() {
        Assert.assertTrue(RegisterPage.passwordStrength3.isDisplayed());
        Driver.wait(2);
    }


    @Then("User enters seven characters {string} with a combination by using all of a digit, special char, upper and lowers letter")
    public void userEntersSevenCharactersWithACombinationByUsingAllOfADigitSpecialCharUpperAndLowersLetter(String password) {
        registerPage.newPasswordBox.sendKeys(password);
        Driver.wait(1);
    }

    @Then("User verifies password  chart color is filled first four level bars")
    public void userVerifiesPasswordChartColorIsFilledFirstFourLevelBars() {
        Assert.assertTrue(RegisterPage.passwordStrength4.isDisplayed());
        Driver.wait(2);
    }


    @Then("User verifies password chart's fifth bar is still gray")
    public void userVerifiesPasswordChartSFifthBarIsStillGray() {
        Assert.assertTrue(RegisterPage.fifthPasswordBarGray.isDisplayed());
        Driver.wait(2);
    }

    @Then("User enters more than seven characters {string} with a combination by using all of a digit, special char, upper and lowers letter")
    public void userEntersMoreThanSevenCharactersWithACombinationByUsingAllOfADigitSpecialCharUpperAndLowersLetter(String password) {
        registerPage.newPasswordBox.sendKeys(password);
        Driver.wait(1);
    }

    @Then("User verifies password  chart color is filled all the level bars")
    public void userVerifiesPasswordChartColorIsFilledAllTheLevelBars() {
        Assert.assertTrue(RegisterPage.passwordStrength5.isDisplayed());
        Driver.wait(2);
    }

    @When("user enters a {string} that is less than four chars long")
    public void userEntersAThatIsNotStrongEnough(String password) {
        Driver.wait(2);
        registerPage.newPasswordBox.sendKeys(password);
        Driver.wait(2);
    }

    @Then("user should see a message that password should be at least four characters long")
    public void userShouldSeeAMessageThatPasswordShouldBeAtLeastFourCharactersLong() {
        registerPage.confirmPasswordBox.click();
        Driver.wait(4);
        Assert.assertTrue(RegisterPage.passwordErrorMessage.isDisplayed());
        Driver.wait(2);
    }

    @When("user enters a assorted {string} that is fifty characters long")
    public void userEntersAAssortedThatIsFiftyCharactersLong(String password) {
        registerPage.newPasswordBox.sendKeys(password);
        Driver.wait(2);
    }

    @Then("User asserts that password should be max {int} characters long")
    public void userAssertsThatPasswordShouldBeMaxCharactersLong(int maxCharacters) {
        Assert.assertTrue(RegisterPage.newPasswordBoxStatic.getAttribute("maxlength").equals(String.valueOf(maxCharacters)));
        Driver.wait(2);
    }
}

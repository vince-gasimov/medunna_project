package stepdefinitions.firstSprint.uiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.UserSettingsPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_006_User_Settings_P1_StepDefs {

 UserSettingsPage userSettingsPage = new UserSettingsPage();

    @Given("User should navigate to medunna.com")
    public void user_should_navigate_to_medunna_com() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
        Driver.getDriver().get("https://medunna.com");
    }


    @Then("User should click to the icon on the top right corner")
    public void user_should_click_to_the_icon_on_the_top_right_corner() {
        userSettingsPage.userIconButton.click();
    }


    @Then("User should click on the Sign in button")
    public void user_should_click_on_the_sign_in_button() {
      userSettingsPage.signInButton.click();

    }


    @Then("User should enter valid Username")
    public void user_should_enter_valid_username() {
      userSettingsPage.usernameBox.
              sendKeys("ahmetlemehmet"+Keys.ENTER);       // hard code
    }


    @Then("User should enter valid Password")
    public void user_should_enter_valid_password() {
       userSettingsPage.passwordBox.
               sendKeys("12345"+ Keys.ENTER);              // hard code
    }


    @Then("User should click on the Sign in button located right bottom")
    public void user_should_click_on_the_sign_in_button_located_right_bottom() {
      userSettingsPage.signInButton2.click();
    }


    @Then("User should click on the button that shows user's name on the top right corner")
    public void user_should_click_on_the_button_that_shows_user_s_name_on_the_top_right_corner() {
      userSettingsPage.registratedUserButton.click();
    }



    @Then("User should click on the Settings button")
    public void user_should_click_on_the_settings_button() {
      userSettingsPage.settingsButton.click();
   }


    @Then("User should see User settings for text")
    public void user_should_see_user_settings_for_text() {
    String expectedText = "User settings for";
    String actualText = userSettingsPage.userSettingsFor.getText();
    Assert.assertEquals(expectedText,actualText);
    }



    @Then("User should be update firstname")
    public void user_should_be_update_firstname() {

    }


    @Then("User should be update lastname")
    public void user_should_be_update_lastname() {

    }



    @Then("User should be update email")
    public void user_should_be_update_email() {

    }




    @Then("User should click save button")
    public void user_should_click_save_button() {

    }



    @Then("User should see Settings saved! popup message on the top left corner")
    public void user_should_see_settings_saved_popup_message_on_the_top_left_corner() {

    }




    @Then("User settings for page should include First Name, Last Name, and Email options")
    public void user_settings_for_page_should_include_first_name_last_name_and_email_options() {

    }



    @Then("User should see Your first name is required text message when entering invalid firstname")
    public void user_should_see_your_first_name_is_required_text_message_when_entering_invalid_firstname() {

    }



    @Then("User should see Your last name is required text message when entering invalid lastname")
    public void user_should_see_your_last_name_is_required_text_message_when_entering_invalid_lastname() {

    }



    @Then("User should see Your email is required text message when entering invalid email")
    public void user_should_see_your_email_is_required_text_message_when_entering_invalid_email() {

    }





}



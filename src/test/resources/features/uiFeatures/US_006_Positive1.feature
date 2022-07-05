@US_006
Feature: testing_of_settings_functionality

  Background: sign_in_and_click_settings_button
    Given User should navigate to medunna.com
    Then User should click to the icon on the top right corner
    Then User should click on the Sign in button
    Then User should enter valid Username
    Then User should enter valid Password
    Then User should click on the Sign in button located right bottom
    Then User should click on the button that shows user's name on the top right corner


  @Scenario1
  Scenario: testing_of_visibility_of_settings_for_page
    Then User should click on the Settings button
    Then User should see User settings for text
    Then User settings for page should include First Name, Last Name, and Email options


  @Scenario2
  Scenario: testing_of_firstname
    Then User should be update firstname
    Then User should click save button
    Then User should see Settings saved! popup message on the top left corner


  @Scenario3
  Scenario: testing_of_lastname
    Then User should be update lastname
    Then User should click save button
    Then User should see Settings saved! popup message on the top left corner


  @Scenario4
  Scenario: testing_of_email
    Then User should be update email
    Then User should click save button
    Then User should see Settings saved! popup message on the top left corner


  @Scenario5
  Scenario: negative_testing_of_firstname
    Then User should see Your first name is required text message when entering invalid firstname


  @Scenario6
  Scenario: negative_testing_of_lastname
    Then User should see Your last name is required text message when entering invalid lastname


  @Scenario7
  Scenario: negative_testing_of_email
    Then User should see Your email is required text message when entering invalid email
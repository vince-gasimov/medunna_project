@US_006
Feature: testing_of_settings_functionality

  Background: user_navigates_to_user_settings_page
    Given user is on the login page
    Then User should enter valid Username
    Then User should enter valid Password
    Then User should click on the Sign in button located right bottom
    Then User should click on the button that shows user's name on the top right corner
    Then User should click on the Settings button


  @US_006_Scenario_1
  Scenario: testing_of_visibility_of_settings_for_page

    Then User should see User settings for text
    Then User settings for page should include First Name, Last Name, and Email options
    Then close the browser

  @smoke
  @US_006_Scenario_2
  Scenario Outline: positive scenario

    Then User should be update firstname "<firstname>"
    Then User should be update lastname "<lastname>"
    Then User should be update email "<email>"
    Then User should click save button
    Then User should see Settings saved! popup message on the top left corner
    Then close the browser

    Examples: positive test data
      | firstname | lastname | email                       |
      | Ahmet1    | Mehmet   | ahmetlemehtmet@gmail.com    |
      | Ahmet1    | Mehmet1  | ahmetlemehtmet@gmail.com    |
      | Ahmet1    | Mehmet1  | ahmetlemehtmet@gmail.com.tr |
      | Ahmet     | Mehmet   | ahmetlemehtmet@gmail.com    |


  @US_006_Scenario_3
  Scenario: negative_scenario
    Given User leaves firstname blank
    Then User should see Your first name is required text message when entering invalid firstname
    Given User leaves lastname blank
    Then User should see Your last name is required text message when entering invalid lastname
    Given User leaves email blank
    Then User should see Your email is required text message when entering invalid email
    Then close the browser

  @US_006_Scenario_4
  Scenario Outline: negative_scenario
    Given user should enter a valid first name as "Ahmet"
    Then user should enter a valid last name as "Mehmet"
    Then user should enter an invalid email as "<email>"
    Then close the browser

    Examples:
      | email       |
      | ahmet       |
      | ahmet@gmail |
      | ahmet.com   |
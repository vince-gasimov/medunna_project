@appointmentsList
Feature: appointments_List

  Background: user is on the home page
    Given user navigates to medunna.com

@US_010_TC001
  Scenario: TC_001_user_in_Appointments_List
    Given user clicks on the user icon
    And user clicks on the Sign in button
    And user enters valid username and password
    And user clicks on Sign in button
    And user clicks on Items&Titles button
    Then user clicks on Appointments button
    And user should see Appointments list and time slots


  Scenario: TC_002_user_sign_in_invalid_username
    Given user clicks on the user icon
    And user clicks on the Sign in button
    And user enters invalid username
    And user enters valid password
    And user clicks to Sign in button
    Then user should see invalid username message


  Scenario: TC_003_user_sign_in_invalid_password
    Given user clicks on the user icon
    And user clicks on the Sign in button
    And user enters valid username
    And user enters invalid password
    And user clicks to Sign in button
    Then user should see invalid password message


  Scenario: TC_004_user_sign_in_with_credentials
    Given user signs in with credentials
    And user clicks on my pages button
    And user clicks on my appointments button
    Then user sees patient id, start date, end date, status























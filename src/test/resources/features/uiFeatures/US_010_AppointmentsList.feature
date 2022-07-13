@appointmentsList
Feature: appointments_List

  Scenario: doctor can see their appointments list and time slots on My Appointments

  Background: doctor is on the home page
    Given doctor navigates to medunna.com
    And doctor clicks on the user icon button
    And doctor clicks on the Sign in button


@US_010_TC001
  Scenario: TC_001_user_in_Appointments_List

    And doctor writes a valid username
    And doctor writes a valid password
    And doctor clicks on Sign in button
    And doctor clicks on My Pages button
    And doctor clicks on Appointments button
    And doctor selects Appointment date from datefrom and dateto
    And doctor should see Appointments list and time slots


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























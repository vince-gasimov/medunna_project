@new_registration

Feature: user_registration

  Background: user is on the home page & registration page
    Given user is on the registration page

  Scenario: TC_01_user_registration_testing

    Given user enters a valid SSN number as "ssn"
    And user enters a valid first name as "firstname"
    And user enters a valid last name as "lastname"
    And user enters an username as "username"
    And user enters a valid email address as "email"
    And user enters a new password as "password" and confirm password as "password"
    And user clicks on the register button
    Then user should see the registration success message
    And saves the records
#    Then close the browser

  Scenario: TC_02 user_registration_ssn_blank

    Given user does not send SSN number
    And user enters a valid first name as "firstname"
    And user enters a valid last name as "lastname"
    And user enters an username as "username"
    And user enters a valid email address as "email"
    And user enters a new password as "password" and confirm password as "password"
    And user clicks on the register button
    Then user should see the ssn required message
    Then close the browser

  Scenario: TC_03 user_registration_firstname_blank

    Given user enters a valid SSN number as "ssn"
    And user does not enter a first name as "firstname"
    And user enters a valid last name as "lastname"
    And user enters an username as "username"
    And user enters a valid email address as "email"
    And user enters a new password as "password" and confirm password as "password"
    And user clicks on the register button
    Then user should see the FirstName required message
    Then close the browser

  Scenario: TC_04 user_registration_lastname_blank
    Given user enters a valid SSN number as "ssn"
    And user enters a valid first name as "firstname"
    And user does not enter a last name as "lastname"
    And user enters an username as "username"
    And user enters a valid email address as "email"
    And user enters a new password as "password" and confirm password as "password"
    And user clicks on the register button
    Then user should see the LastName required message
    Then close the browser

  Scenario: TC_05 user_registration_invalid_ssn
    Given user enters an invalid SSN number as "ssn"
    And user enters a valid first name as "firstname"
    And user enters a valid last name as "lastname"
    And user enters an username as "username"
    And user enters a valid email address as "email"
    And user enters a new password as "password" and confirm password as "password"
    And user clicks on the register button
    Then user should see the SSN-invalid message
    Then close the browser




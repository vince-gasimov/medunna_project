@patientsbyadmin
Feature: patient_by_admin

  Background: user is on the home page
    Given user is on the home page
    When user clicks on the user icon
    And user clicks on the sign in link
    And user enters valid username and password
    Then user clicks on sign in button

  Scenario: TC_001_creating_new_patient
    Given user clicks on Items&Titles button
    Then user clicks on Patients button
    And user clicks on create new patient button
    And user enters valid patient credential and clicks save button
    Then user should see patient created message



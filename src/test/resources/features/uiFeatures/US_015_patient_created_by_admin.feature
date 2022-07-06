@patientsbyadmin
Feature: patient_by_admin

  Background: user is on the home page
    Given user is on the home page
    When user clicks on the user icon
    And user clicks on the sign in link
    And user enters valid username and password
    Then user clicks on sign in button
    Given user clicks on Items&Titles button
    Then user clicks on Patients button

@US_015_Create_New_Patient
  Scenario: TC_001_creating_new_patient
    And user clicks on create new patient button
    And user enters valid patient credential and clicks save button
    Then user should see patient created message
    Then close the application

  @US_015_Patients_Information
  Scenario: TC_001_verify_users_data
    And user sees all patient information
    Then close the application

  @US_015_Edit_Patient
  Scenario: TC_001_edits_users_data
    And user clicks on edit button
    And user sees all patient information
    Then close the application




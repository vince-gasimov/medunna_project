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
  Scenario: TC 001_creating_new_patient
    And user clicks on create new patient button
    And user enters valid patient credential and clicks save button
    Then user should see patient created message
    Then close the application

  @US_015_Patients_Information
  Scenario: TC_002_verify_users_data
    And user sees all patient information after sorting
    Then close the application

  @US_015_Edit_Patient
  Scenario: TC_003_edits_users_data
    And user clicks on edit button
    And user sees all patient information
    Then close the application

  @US_015_Assign_Doctor_To_Patient
  Scenario: TC_004_assign_doctor_to_patient
    And user clicks on edit button
    And user clicks on user and assigns patient to the doctor
    And user clicks on save button
    And user sees A Patient is updated with identifier message
    And user sees updated patient information
    Then close the application

  @US_015_Select_State
  Scenario: TC_004_assign_doctor_to_patient
    And user clicks on create new patient button
    And user enters valid information and select country as USA
    And user select California and clicks save
    Then user should see patient created message
    And user clicks Created Date button to see last added patient
    And user verifies state is California

  @TC_016_Not_Selecting_State
    Scenario: User does not select any stats
    When user clicks on create new patient button
    Then user enters valid information and select country as USA
    And user does not select any state option and clicks save button

  @TC_008_Select_Country_Morocco
  Scenario: User select country as Morocco
    When user clicks on create new patient button
    Then user enters valid information and select country as Morocco
    And user does not select any state option and clicks save button

  @TC_009_DeletePatient
  Scenario: Delete user
    When user sorts the patients and clicks on delete button on first patient
    Then user confirms delete
    And user confirms that patients information is deleted



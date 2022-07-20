@patientsbyadmin
Feature: patient_by_admin

  Background: user is on the home page US_015
    Given user is on the home page US_015
    When user clicks on the user icon US_015
    And user clicks on the sign in link US_015
    And user enters valid username and password US_015
    Then user clicks on sign in button US_015
    Given user clicks on Items&Titles button US_015
    Then user clicks on Patients button US_015

@US_015_Create_New_Patient @smoke
  Scenario: TC 001_creating_new_patient US_015
    And user clicks on create new patient button US_015
    And user enters valid patient credential and clicks save button US_015
    Then user should see patient created message US_015
    Then close the application US_015

  @US_015_Patients_Information
  Scenario: TC_002_verify_users_data US_015
    And user sees all patient information after sorting US_015
    Then close the application US_015

  @US_015_Edit_Patient
  Scenario: TC_003_edits_users_data US_015
    And user clicks on edit button US_015
    And user sees all patient information US_015
    Then close the application US_015

  @US_015_Assign_Doctor_To_Patient
  Scenario: TC_004_assign_doctor_to_patient US_015
    And user clicks on edit button US_015
    And user clicks on user and assigns patient to the doctor US_015
    And user clicks on save button US_015
    And user sees A Patient is updated with identifier message US_015
    And user sees updated patient information US_015
    Then close the application US_015

  @US_015_Select_State
  Scenario: TC_004_assign_doctor_to_patient US_015
    And user clicks on create new patient button US_015
    And user enters valid information and select country as USA US_015
    And user select California and clicks save US_015
    Then user should see patient created message US_015
    And user clicks Created Date button to see last added patient US_015
    And user verifies state is California US_015
    Then close the application US_015

  @TC_016_Not_Selecting_State
    Scenario: User does not select any stats US_015
    When user clicks on create new patient button US_015
    Then user enters valid information and select country as USA US_015
    And user does not select any state option and clicks save button US_015
    Then close the application US_015

  @TC_008_Select_Country_Morocco
  Scenario: User select country as Morocco US_015
    When user clicks on create new patient button US_015
    Then user enters valid information and select country as Morocco US_015
    And user does not select any state option and clicks save button US_015
    Then close the application US_015

  @TC_009_DeletePatient
  Scenario: Delete user US_015
    When user sorts the patients and clicks on delete button on first patient US_015
    Then user confirms delete US_015
    And user confirms that patients information is deleted US_015
    Then close the application US_015



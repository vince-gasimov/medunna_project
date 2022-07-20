@myInpatientsInfo
Feature:Doctor_Views_inPatients_info
  Background:
    Given  doctor goes to Medunna Url
    When   doctor clicks on the human icon in the upper right corner
    Then   doctor clicks on Sign In
    And    doctor enters a valid username
    And    doctor enters a valid password
    And    doctor clicks the Sign In button
    And    doctor clicks on MY PAGES
    Then   doctor clicks on My Inpatients

  Scenario: TC_001_verify_id_is_visible
    When doctor verifies the ID of the inpatient is visible
    And doctor closes the application
    And doctor closes the browser

  Scenario: TC_002_verify_start_date_is_visible
    When doctor verifies the Start Date of the hospitalization of the inpatient is visible
    And doctor closes the application
    And doctor closes the browser

  Scenario: TC_003_verify_end_date_is_visible
    When doctor verifies the End Date of the hospitalization of the inpatient is visible
    And doctor closes the application
    And doctor closes the browser

  Scenario: TC_004_verify_status_is_visible
    When doctor verifies the Status of the inpatient is visible
    And doctor closes the application
    And doctor closes the browser

  Scenario: TC_005_verify_description_is_visible
    When doctor verifies the Description written about the inpatient is visible
    And doctor closes the application
    And doctor closes the browser

  Scenario: TC_006_verify_created_date_is_visible
    When doctor verifies the Created Date of the inpatient is visible
    And doctor closes the application
    And doctor closes the browser

  Scenario: TC_007_verify_room_is_visible
    When doctor verifies the Room of the inpatient is visible
    And doctor closes the application
    And doctor closes the browser

  Scenario: TC_008_verify_appointment_Id_is_visible
    When doctor verifies the Appointment ID of the inpatient is visible
    And doctor closes the application
    And doctor closes the browser

  Scenario: TC_009_verify_patient_is_visible
    When doctor verifies the Patient is visible
    And doctor closes the application
    And doctor closes the browser

  Scenario: TC_010_verify_entire_table_is_visible
    When doctor verifies she can see all the info of patients
    And doctor closes the application
    And doctor closes the browser

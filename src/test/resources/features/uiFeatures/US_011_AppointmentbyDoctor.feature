@US011_edit_portal
Feature: US_011 My Appointments Edit portal by Physician(Doctor)

  Background:Sign in as a physician
    Given user is navigated to medunna.com
    Then user navigates the sign in page with validUsername and validPassword
    And user signs in
    And user navigates to My Pages segment
    And user clicks on My appointments
    And user clicks on Edit button
    And user verifies the website shows the Create or Edit an Appointment text

  @US011_TC001 @smoke
  Scenario: TC_001 Check Patient's id
    And user verifies patient's info id is visible
    And closes the page
  @US011_TC002 @smoke
  Scenario:TC_002 Check Patient's start date
    And user verifies patient's start date is visible
    And closes the page
  @US011_TC003
  Scenario:TC_003 Check Patient's end date
    And user verifies patient's end date is visible
    And closes the page
  @US011_TC004
  Scenario:TC_004 Check Patient's status
    And user verifies patient's status is visible
    And closes the page
  @US011_TC005
  Scenario:TC_005 Check Patient's physician
    And user verifies patient's physician is visible
    And verify the patient's physician name which should be the same with login user's name
    Then closes the page




  @US011_TC006
  Scenario:TC_007 Check Doctor fills in required fields and save
    And user fills in required fields, anemnesis, treatment, diagnosis
    And user clicks on Save button
    And verify appointment is saved successfully
    Then closes the page
  @US011_TC007
  Scenario:TC_008 Negative Scenario for Anamnesis, Treatment, and Diagnosis as required fields
    Then user does not fill in required fields, anemnesis, treatment, diagnosis
    And checks if the error messages are displayed
    And user clicks on Save button
    And verify appointment is not saved
    Then closes the page
  @US011_TC008
  Scenario: TC_009 Status can be only selected as "PENDING" by Doctor
    Then user fills in required fields, anemnesis, treatment, diagnosis
    And user selects status as "PENDING"
    And verify selected status as "PENDING"
    And user clicks on Save button
    Then closes the page
  @US011_TC009
  Scenario: TC_010 Status can be only selected as "COMPLETED" by Doctor
    Then user fills in required fields, anemnesis, treatment, diagnosis
    And user selects status as "COMPLETED"
    And verify selected status as "COMPLETED"
    And user clicks on Save button
    And verify appointment is saved successfully
    Then closes the page
  @US011_TC010
  Scenario: TC_011 Status can be only selected as "CANCELLED" by Doctor
    Then user fills in required fields, anemnesis, treatment, diagnosis
    And user selects status as "CANCELLED"
    And verify selected status as "CANCELLED"
    And user clicks on Save button
    Then closes the page
  @US011_TC011
  Scenario: TC_012 Status can be only selected as "UNAPPROVED" by Doctor
    Then user fills in required fields, anemnesis, treatment, diagnosis
    And user selects status as "UNAPPROVED"
    And verify selected status is not "UNAPPROVED"
    And user clicks on Save button
    Then closes the page

@US25
@sprint2
Feature: patient_make_appointment
  Background: login as a patient
    Given Patient goes to Medunna url
    Then Patient navigates the sign in page and enter username "team83_patient_01" password "patient_01" and clicks Sign In
    And Patient navigates My Pages And select Make an Appointment

  @US25_TC001
  Scenario: TC01_leave_firstName_empty
    Then Patient enters all information and leaves First name empty
    Then Patient verifies Your FirstName is required warning shown

  @US25_TC002
  Scenario: TC02_leave_lastName_empty
    Then Patient enters all information and leaves Last name empty
    Then Patient verifies Your LastName is required warning shown

  @US25_TC003
  Scenario: TC03_leave_SSN_empty
    Then Patient enters all information and leaves SSN empty
    Then Patient verifies Your SSN is required warning shown

  @US25_TC004
  Scenario: TC04_leave_Email_empty
    Then Patient enters all information and leaves Email empty
    Then Patient verifies Your email is required warning shown

  @US25_TC005
  Scenario: TC05_leave_phone_empty
    Then Patient enters all information and leaves Phone empty
    Then Patient verifies Phone number is required warning shown

  @US25_TC006
  Scenario: TC06_invalid_date
    Then Patient enters all information and select past appointment date
    Then Patient verifies Appointment date can not be past date! warning shown

  @US25_TC007  @smoke
  Scenario: TC07_leave_firstName_empty
    Then Patient enters all information and select future appointment date
    Then Patient verifies Appointment registration saved! pop up shown
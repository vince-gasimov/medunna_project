@US_021
Feature: testing_of_some_capability_of_a_staff

  Background:
    Given Staff goes to Medunna URL
    Then Staff clicks on the icon on the top right corner
    Then Staff clicks signs in button
    Then Staff enters username
    Then Staff enters password
    Then Staff clicks on the sign in button on the right bottom
    Then Staff clicks on the MY PAGES button
    Then Staff clicks Search Patient button

  @US_021_Scenario_1
  Scenario: testing_of_updating_appointment_page
    Then Staff enters SSN in the Patient SSN: box
    Then Staff clicks Show Appointments button
    Then Staff clicks Edit button
    Then Staff updates appointment
    Then Staff clicks Save button
    Then Staff shows The appointment is updated with identifier popup
    Then Staff close the browser



  @US_021_Scenario_2
    Scenario: testing_of_status_box_as_completed
    Then Staff enters SSN in the Patient SSN: box
    Then Staff clicks Show Appointments button
    Then Staff clicks Edit button
    Then staff selects COMPLETED option in the status box
    Then Staff clicks Save button
    Then Staff enters SSN in the Patient SSN: box
    Then Staff clicks Show Appointments button
    Then Staff shows status cannot update as COMPLETED
    Then Staff close the browser



  @US_021_Scenario_3
  Scenario Outline: Updating Status Box
    Then Staff enters SSN in the Patient SSN: box
    Then Staff clicks Show Appointments button
    Then Staff clicks Edit button
    Then staff may change "<status>"
    Then Staff clicks Save button
    Then Staff close the browser
    Examples:
      | status     |
      | PENDING    |
      | UNAPPROVED |
    # | CANCELLED  |



  @US_021_Scenario_4

  Scenario: testing_of_anamnesis_treatment_and_diagnosis_fields
    Then Staff enters SSN in the Patient SSN: box
    Then Staff clicks Show Appointments button
    Then Staff clicks Edit button
    Then Staff leave Anamnesis button as Blank
    Then Staff leave Treatment button as Blank
    Then Staff leave Diagnosis button as Blank
    Then Staff clicks Save button
    Then Staff shows The appointment is updated with identifier popup
    Then Staff close the browser



  @US_021_Scenario_5
  Scenario: testing_of_selecting_physician
    Then Staff enters SSN in the Patient SSN: box
    Then Staff clicks Show Appointments button
    Then Staff clicks Edit button
    Then staff should select the current doctor
    Then Staff clicks Save button
    Then Staff shows The appointment is updated with identifier popup
    Then Staff close the browser



  @US_021_Scenario_6
  Scenario: testing_of_visibility_of_patients's_test_results
    Then Staff enters SSN in the Patient SSN: box
    Then Staff clicks Show Appointments button
    Then Staff clicks Show Tests button
    Then Staff clicks View Results button
    Then Staff shows Test Result text
    Then Staff close the browser



  @US_021_Scenario_7
  Scenario: negative_testing_of_updating_appointment_page
    Then Staff enters SSN in the Patient SSN: box
    Then Staff clicks Show Appointments button
    Then Staff clicks Edit button
    Then Staff updates date as past
    Then Staff clicks Save button
    Then Staff should not show The appointment is updated with identifier popup
    Then Staff close the browser




@US_023
Feature: Staff_sends_invoice_to_patient

  Scenario: patient_gets_appoinment
    Given Patient goes to Medunna URL
    And Patient clicks on the icon on the top right corner
    And Patient clicks signs in button
    And Patient enters username
    And Patient enters password
    And Patient clicks on the sign in button on the right bottom
    And Patient clicks on the MY PAGES button
    And Patient clicks on My Appointments button
    And Patient enters phone number
    Then Patient sens request for an appointment

@US_023
    Scenario: Staff_views_and_creates_an_invoice_to_patient

    Given Staff goes to Medunna
    And Staff clicks on the right top of the corner
    And Staff clicks on the sign in button
    And Staff enters valid username
    And Staff enters valid password
    And Staff clicks on the sign in button
    And Staff clicks on the My Pages button
    And Staff clicks on the Search patient button
    And Staff enters SSN number in the patient SSN box
    When Staff should see patient status completed
    And Staff views of patient Exam fee
    And Staff views of patient test item prices
    Then Staff creates invoice for patient
  Then Staff save invoice
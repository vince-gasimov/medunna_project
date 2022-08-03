@US_009
Feature: view and edit patient portal
  Scenario: view patient portal

  Given User (Admin & Staff) goes to Medunna URL
    And User Admin should enter  valid credentials
    And User (Admin & Staff) clicks on sign in button
    Then User (Admin & Staff) succesfully login and sees the message "WELCOME TO MEDUNNA"
    Then User clicks on Items&Titles button
    And User (Admin & Staff) clicks on Patients button
    Then User should be able to see patients
    Then user closes the browser

  @smoke
  Scenario: As an admin I should able to edit Pateients info name surname
    Given User (Admin & Staff) goes to Medunna URL
    And User Admin should enter  valid credentials
    And User (Admin & Staff) clicks on sign in button
    Then User (Admin & Staff) succesfully login and sees the message "WELCOME TO MEDUNNA"
    Then User clicks on Items&Titles button
    And User (Admin & Staff) clicks on Patients button
    When Admin clicks on patient ID
    When Admin scrolls down and clicks edit button
    When Admin edit patient name and surname
    When Admin clicks save button
    Then Admin should be able to see the success message
    Then user closes the browser


  Scenario: As an admin I should able to edit Pateients info email
    Given User (Admin & Staff) goes to Medunna URL
    And User Admin should enter  valid credentials
    And User (Admin & Staff) clicks on sign in button
    Then User (Admin & Staff) succesfully login and sees the message "WELCOME TO MEDUNNA"
    Then User clicks on Items&Titles button
    And User (Admin & Staff) clicks on Patients button
    When Admin clicks on patient ID
    When Admin scrolls down and clicks edit button
    When Admin sends patient email
    When Admin clicks save button
    Then Admin should be able to see the success message
    Then user closes the browser

  Scenario: As an admin I should able to edit Pateients info address
    Given User (Admin & Staff) goes to Medunna URL
    And User Admin should enter  valid credentials
    And User (Admin & Staff) clicks on sign in button
    Then User (Admin & Staff) succesfully login and sees the message "WELCOME TO MEDUNNA"
    Then User clicks on Items&Titles button
    And User (Admin & Staff) clicks on Patients button
    When Admin clicks on patient ID
    When Admin scrolls down and clicks edit button
    When Admin edit patient address
    When Admin clicks save button
    Then Admin should be able to see the success message
    Then user closes the browser

  Scenario: As an admin I should able to edit Patients country
    Given User (Admin & Staff) goes to Medunna URL
    And User Admin should enter  valid credentials
    And User (Admin & Staff) clicks on sign in button
    Then User (Admin & Staff) succesfully login and sees the message "WELCOME TO MEDUNNA"
    Then User clicks on Items&Titles button
    And User (Admin & Staff) clicks on Patients button
    When Admin clicks on patient ID
    When Admin scrolls down and clicks edit button
    When Admin edit patient country
    When Admin clicks save button
    Then Admin should be able to see the success message
    Then user closes the browser

  Scenario: As an admin I should able to edit Patients info gender, blood group
    Given User (Admin & Staff) goes to Medunna URL
    And User Admin should enter  valid credentials
    And User (Admin & Staff) clicks on sign in button
    Then User (Admin & Staff) succesfully login and sees the message "WELCOME TO MEDUNNA"
    Then User clicks on Items&Titles button
    And User (Admin & Staff) clicks on Patients button
    When Admin clicks on patient ID
    When Admin scrolls down and clicks edit button
    When Admin edit patient gender
    When Admin edit patient blood group
    When Admin clicks save button
    Then Admin should be able to see the success message
    Then user closes the browser

  Scenario: As an admin I should able to edit Patients info phone
    Given User (Admin & Staff) goes to Medunna URL
    And User Admin should enter  valid credentials
    And User (Admin & Staff) clicks on sign in button
    Then User (Admin & Staff) succesfully login and sees the message "WELCOME TO MEDUNNA"
    Then User clicks on Items&Titles button
    And User (Admin & Staff) clicks on Patients button
    When Admin clicks on patient ID
    When Admin scrolls down and clicks edit button

    When Admin edit patient phone
    When Admin clicks save button
    Then Admin should be able to see the success message
    Then user closes the browser


  Scenario: As an admin I should able to edit Patients info phone2
    Given User (Admin & Staff) goes to Medunna URL
    And User Admin should enter  valid credentials
    And User (Admin & Staff) clicks on sign in button
    Then User (Admin & Staff) succesfully login and sees the message "WELCOME TO MEDUNNA"
    Then User clicks on Items&Titles button
    And User (Admin & Staff) clicks on Patients button
    When Admin clicks on patient ID
    When Admin scrolls down and clicks edit button
    When Admin edit patient  patientStateCity
    When Admin clicks save button
    Then Admin should be able to see the success message
    Then user closes the browser

  Scenario: As an admin I should able to edit Patients info phone3
    Given User (Admin & Staff) goes to Medunna URL
    And User Admin should enter  valid credentials
    And User (Admin & Staff) clicks on sign in button
    Then User (Admin & Staff) succesfully login and sees the message "WELCOME TO MEDUNNA"
    Then User clicks on Items&Titles button
    And User (Admin & Staff) clicks on Patients button
    When Admin clicks on patient ID
    When Admin scrolls down and clicks edit button
    When Admin edit patient gender
    When Admin edit patient  patientDescription
    When Admin clicks save button
    Then Admin should be able to see the success message
    Then user closes the browser


  Scenario: As an admin I should able to edit Patients info phone4
    Given User (Admin & Staff) goes to Medunna URL
    And User Admin should enter  valid credentials
    And User (Admin & Staff) clicks on sign in button
    Then User (Admin & Staff) succesfully login and sees the message "WELCOME TO MEDUNNA"
    Then User clicks on Items&Titles button
    And User (Admin & Staff) clicks on Patients button
    When Admin clicks on patient ID
    When Admin scrolls down and clicks edit button
    When Admin edit patient gender
    When Admin edit patient  patientBirthDate
    When Admin clicks save button
    Then Admin should be able to see the success message
    Then user closes the browser

  #All edit together
  @win
  Scenario: As an admin I should able to edit Pateients all info
    Given User (Admin & Staff) goes to Medunna URL
    And User Admin should enter  valid credentials
    And User (Admin & Staff) clicks on sign in button
    Then User (Admin & Staff) succesfully login and sees the message "WELCOME TO MEDUNNA"
    Then User clicks on Items&Titles button
    And User (Admin & Staff) clicks on Patients button
    When Admin clicks on patient ID
    When Admin scrolls down and clicks edit button
    When user edit patient info name-surname-email-gender-bloodgroup-country
    When Admin edit patient gender
    When Admin edit patient phone
    When Admin edit patient  patientDescription
    When Admin clicks save button
    Then Admin should be able to see the changes
    Then user closes the browser


  Scenario: view patient portal2
    Given User (Admin & Staff) goes to Medunna URL
    And User Admin should enter  valid credentials
    And User (Admin & Staff) clicks on sign in button
    Then User (Admin & Staff) succesfully login and sees the message "WELCOME TO MEDUNNA"
    Then User clicks on Items&Titles button
    And User (Admin & Staff) clicks on Patients button
    Then User should be able to see patients
    Then user closes the browser

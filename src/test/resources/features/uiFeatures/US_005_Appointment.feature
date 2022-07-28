@US_05
Feature: user_appointment


@appointment
@smoke
  Scenario: login_user_make_appointment
    Given user should navigate to medunna
    When user clicks on Make an Appointment button
    And user enters valid first name
    And user enters valid last name
    And user enters valid ssn
    And user enters valid email
    And user enters valid phone number
    And user enters valid appointment date
    Then user clicks Send and Appointment Request

  @name

  Scenario: login_user_make_appointment_without_name

    Given user should navigate to medunna
    When user clicks on Make an Appointment button
    Then user does not fill out firstname box
    And user enters valid last name
    And user enters valid ssn
    And user enters valid email
    And user enters valid phone number
    And user enters valid appointment date
    And user clicks Send and Appointment Request
    Then user should see the error message

  @ssn

  Scenario: login_user_make_appointment_without_ssn

    Given user should navigate to medunna
    When user clicks on Make an Appointment button
    And user enters valid first name
    And user enters valid last name
    And user does not fill out SSN box
    And user enters valid email
    And user enters valid phone number
    And user enters valid appointment date
    And user clicks Send and Appointment Request
    Then user should see the error message

  @lastname

  Scenario: login_user_make_appointment_without_lastname
    Given user should navigate to medunna
    When user clicks on Make an Appointment button
    Then user enters valid first name
    And user does not fill out lastname box
    And user enters valid ssn
    And user enters valid email
    And user enters valid phone number
    And user enters valid appointment date
    And user clicks Send and Appointment Request
    Then user should see the error message

  @phone

  Scenario: login_user_make_appointment_without_phone


    Given user should navigate to medunna
    When user clicks on Make an Appointment button
    And user enters valid first name
    And user enters valid last name
    And user enters valid ssn
    And user enters valid email
    And user does not fill out phone number box
    And user enters valid appointment date
    And user clicks Send and Appointment Request
    Then user should see the error message

  @wphone

  Scenario: login_user_make_appointment_wrong_phone


    Given user should navigate to medunna
    When user clicks on Make an Appointment button
    And user enters valid first name
    And user enters valid last name
    And user enters valid ssn
    And user enters valid email
    And User does not use '-' after 3rd and 6th digits in phone number
    And user enters valid appointment date
    And user clicks Send and Appointment Request


  @signIn

  Scenario: login_user_make_appointment
    Given user should navigate to medunna
    When user clicks on Make an Appointment button
    And user enters valid first name
    And user enters valid last name
    And user enters valid ssn
    And user enters valid email
    And user enters valid phone number
    And user enters valid appointment date
    Then user clicks Send and Appointment Request
    And user enters icon to top right corner
    #And user enters register button
    And user enters valid data on ssn, firstname, lastname, username, email, password field
    And user enters password again
    And user enters Register button

  @last


  Scenario: login_user_make_appointment
    Given user should navigate to medunna
    When user clicks on Make an Appointment button
    And user enters valid first name
    And user enters valid last name
    And user enters valid ssn
    And user enters valid email
    And user enters valid phone number
    And user enters valid appointment date
    Then user clicks Send and Appointment Request
    And user enters icon to top right corner
    #And user enters register button
    And user enters valid data on ssn, firstname, lastname, username, email, password field
    And user enters password again
    And user enters Register button
    And user enters icon to top right corner
    And user enters sign in button
    And user enters valid username
    And user enters valid password
    And user enters last sign in button
    And users see their profile
    Then close the browser


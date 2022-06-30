@make_appointment
Feature: Make Appointment

  Background: fill out first, last name, ssn, email, phone
    Given user is navigated to medunna.com
    When user clicks Make an Appointment button
    Then user enters valid first name
    And user enters valid last name
    And user enters valid ssn
    And user enters valid email
    And user enters valid phone number

@US007_TC001
Scenario: TC_001_Enter_Valid_Data
    When user enters valid appointment date
    And user clicks Send and Appointment Request
    And verify user can make an appointment successfully
    Then close the application

@US007_TC003
Scenario Outline: TC_00_No_Date_Entry
    When user enters an "<older date>"
    Then user sees Appointment date can not be past date! warning on date field
    And user clicks Send and Appointment Request
    And verify user can not make an appointment successfully
    Then close the application
  Examples: older date
  |older date|
  |03122022  |

  @US007_TC004
  Scenario: TC_004_Todays_Date
    When user enters today's date
    Then user should not see any error message
    Then user clicks Send and Appointment Request
    And verify user can make an appointment successfully
    Then close the application

  @US007_TC008
  Scenario: TC_007_Correct_Date_Displayed
    When user enters valid future date
    Then user verifies that correct date is displayed
    Then close the application

  @US007_TC011
  Scenario Outline: TC_007_Enter_Date_Using_ForwardSlash
    When user enters valid "<date>" using forward slash
    Examples: use forward slash
    Then close the application
    |date|
    |03/12/2029|

  @US007_TC012
  Scenario: TC_004_Enter_Letter
    When user enters letters on date box
    Then user does not see any change on date
    Then user clicks Send and Appointment Request
    And verify user can make an appointment successfully
    Then close the application

  @US007_TC013
  Scenario: TC_004_Enter_Symbol
    When user enters symbols date box
    Then user clicks Send and Appointment Request
    And verify user can make an appointment successfully









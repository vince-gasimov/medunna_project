@US_007_make_appointment, @regression
Feature: Make Appointment

  Background: fill out first, last name, ssn, email, phone
    Given user is navigated to medunna.com
    When user clicks Make an Appointment button

  @smoke
  @US007_TC001
  Scenario: TC_001_Valid_credentials
    When user enters valid "firstName", "lastName", "ssn", "email", "phone" us007
    And save the records us007
    And user does not enter anything on date box and clicks Send and Appointment Request
    And verify user can make an appointment successfully
    Then close the application US_015

  @US007_TC003
  Scenario: TC_004_Passed_Date
    When user enters valid "firstName", "lastName", "ssn", "email", "phone" us007
    And save the records us007
    Then user enters passed date "date"
    Then user sees Appointment date can not be past date! warning on date field
    And user clicks Send and Appointment Request
    And verify user can not make an appointment successfully
    Then close the application US_015

  @US007_TC004
  Scenario: TC_004_Todays_Date
    When user enters valid "firstName", "lastName", "ssn", "email", "phone" us007
    And save the records us007
    When user enters "today" date
    Then user clicks Send and Appointment Request
    And verify user can make an appointment successfully
    Then close the application US_015

  @US007_TC008
  Scenario: TC_007_Correct_Date_Displayed
    When user enters valid "firstName", "lastName", "ssn", "email", "phone" us007
    And save the records us007
    When user enters valid "future" date
    Then user clicks Send and Appointment Request
    And verify user can make an appointment successfully
    Then close the application US_015

  @US007_TC011
  Scenario: TC_007_Enter_Date_Using_ForwardSlash
    When user enters valid "firstName", "lastName", "ssn", "email", "phone" us007
    And save the records us007
    When user enters valid "<date>" using forward slash
    Then user clicks Send and Appointment Request
    And verify user can make an appointment successfully
    Then close the application US_015

  @US007_TC012
  Scenario: TC_004_Enter_Letter
    When user enters valid "firstName", "lastName", "ssn", "email", "phone" us007
    And save the records us007
    When user enters letters on date box
    Then user clicks Send and Appointment Request
    And verify user can make an appointment successfully
    Then close the application US_015

  @US007_TC013
  Scenario: TC_004_Enter_Symbol
    When user enters valid "firstName", "lastName", "ssn", "email", "phone" us007
    And save the records us007
    When user enters symbols date box
    Then user clicks Send and Appointment Request
    And verify user can make an appointment successfully
    Then close the application US_015

  @US007_TC014
  Scenario: TC_004_Use_Tab_Key
    When user enters valid "firstName", "lastName", "ssn", "email", "phone" us007
    And save the records us007
    When user clicks on date tab and enters valid "<month>", "<day>", and "<year>" using tab key
    Then user clicks Send and Appointment Request
    And verify user can make an appointment successfully
    Then close the application US_015

  @US007_TomorrowsDate
  Scenario: TC_004_Tomorrow_Date
    When user enters valid "firstName", "lastName", "ssn", "email", "phone" us007
    And save the records us007
    When user enters tomorrow "tomorrow" date
    Then user clicks Send and Appointment Request
    And verify user can make an appointment successfully
    Then close the application US_015
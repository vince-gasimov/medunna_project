@US_007_make_appointment, @regression
Feature: Make Appointment

  Background: fill out first, last name, ssn, email, phone
    Given user is navigated to medunna.com
    When user clicks Make an Appointment button

  @US007_TC001
  Scenario Outline:
    When user enters valid "<firstName>", "<lastName>", "<ssn>", "<email>", "<phone>"
    And user does not enter anything on date box and clicks Send and Appointment Request
    And verify user can make an appointment successfully
    Then close the application
    Examples: valid credentials
      |firstName|lastName|ssn        |email                 |phone       |
      |Lev      |Tolstoy |653-24-3425|annakarenina@gmail.com|653-204-3425|

  @US007_TC003
  Scenario: TC_004_Passed_Date
    When user types valid "firstName", "lastName", "ssn", "email", "phone"
    Then user enters passed date "date"
    Then user sees Appointment date can not be past date! warning on date field
    And user clicks Send and Appointment Request
    And verify user can not make an appointment successfully
    Then close the application

  @US007_TC004
  Scenario: TC_004_Todays_Date
    When user types valid "firstName", "lastName", "ssn", "email", "phone"
    When user enters "today" date
    Then user clicks Send and Appointment Request
    And verify user can make an appointment successfully
    Then close the application

  @US007_TC008
  Scenario Outline: TC_007_Correct_Date_Displayed
    When user enters valid "<firstName>", "<lastName>", "<ssn>", "<email>", "<phone>"
    When user enters valid "future" date
    Then user clicks Send and Appointment Request
    And verify user can make an appointment successfully
    Then close the application
    Examples: valid credentials
      |firstName|lastName|ssn        |email              |phone       |
      |Steve    |Jobs    |783-32-9834|stevejobs@gmail.com|783-324-9834|

  @US007_TC011
  Scenario Outline: TC_007_Enter_Date_Using_ForwardSlash
    When user enters valid "<firstName>", "<lastName>", "<ssn>", "<email>", "<phone>"
    When user enters valid "<date>" using forward slash
    Then user clicks Send and Appointment Request
    And verify user can make an appointment successfully
    Then close the application
    Examples: valid credentials
      |firstName|lastName|ssn        |email             |phone       |date|
      |Elon     |Musk    |893-09-4381|elanmusk@gmail.com|893-091-4381|03/12/2029|

  @US007_TC012
  Scenario Outline: TC_004_Enter_Letter
    When user enters valid "<firstName>", "<lastName>", "<ssn>", "<email>", "<phone>"
    When user enters letters on date box
    Then user clicks Send and Appointment Request
    And verify user can make an appointment successfully
    Then close the application
    Examples: valid credentials
      |firstName|lastName|ssn        |email                  |phone      |
      |Mustafa  |Kemal   |234-43-6782|mustafakemal@gmail.com|234-435-6782|

  @US007_TC013
  Scenario Outline: TC_004_Enter_Symbol
    When user enters valid "<firstName>", "<lastName>", "<ssn>", "<email>", "<phone>"
    When user enters symbols date box
    Then user clicks Send and Appointment Request
    And verify user can make an appointment successfully
    Then close the application
    Examples: valid credentials
      |firstName|lastName|ssn        |email                |phone       |
      |Dan      |Brown   |324-33-2346|codedavinci@gmail.com|324-333-2346|

  @US007_TC014
  Scenario Outline: TC_004_Use_Tab_Key
    When user enters valid "<firstName>", "<lastName>", "<ssn>", "<email>", "<phone>"
    When user clicks on date tab and enters valid "<month>", "<day>", and "<year>" using tab key
    Then user clicks Send and Appointment Request
    And verify user can make an appointment successfully
    Then close the application
    Examples: enter date using slash
      |firstName   |lastName   |ssn        |email           |phone       |month|day|year|
      |Dostoyevski |Dostoyevski|564-23-0245|budala@gmail.com|564-234-0245|12   |23 |2024|

  @US007_TomorrowsDate
  Scenario Outline: TC_004_Tomorrow_Date
    When user enters valid "<firstName>", "<lastName>", "<ssn>", "<email>", "<phone>"
    When user enters tomorrow "tomorrow" date
    Then user clicks Send and Appointment Request
    And verify user can make an appointment successfully
    Then close the application
    Examples: valid credentials
      |firstName|lastName|ssn        |email             |phone       |
      |George   |Orwell  |273-23-5435|book1994@gmail.com|273-236-5435|
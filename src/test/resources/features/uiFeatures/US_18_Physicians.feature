@US_018ui
Feature: admin_login_physicians
  Scenario: admin_valid_ssn

    Given user should navigate to medunna.com
    When user should click to human icon to top right
    And user enters click to sign in button
    And user enters valid username on the sign in page
    And user enters valid password on the sign in page
    And user enters click sign in box
    And user should click Items&Titles box
    And user should click Physician box
    And user enters Create a new Physician box
    And User enters a valid ssn
    And User should click Use Search
    And User should click Search User
    And User see firstname,lastname,birh date
    And User see successfull message
    Then user closes the browser


  Scenario: admin_change

    Given user should navigate to medunna.com
    When  user should click to human icon to top right
    And user enters click to sign in button
    And user enters valid username on the sign in page
    And user enters valid password on the sign in page
    And user enters click sign in box
    And user should click Items&Titles box
    And user should click Physician box
    And user enters Create a new Physician box
    And  User enters a valid ssn
    And User should click Use Search
    And User should click Search User
    And User enters valid date
    And User enters Phone
    And User see firstname,lastname,birh date
    And User should click and choose Speciality box
    And User should click and Choose File box
    And  User enters valid Exam fee
    And  User enters Save button
    And user see succesfull message
    Then user closes the browser
@Edit

  Scenario: admin_edit

    Given user should navigate to medunna.com
    When user should click to human icon to top right
    And user enters click to sign in button
    And user enters valid username on the sign in page
    And user enters valid password on the sign in page
    And user should click sign in box
    And user should click Items&Titles box
    And user should click Physician box
    And user go to last page
    And user should click Edit box
    And user should click phone box
    And user should edit phone
    And User enters Save button
    And user see edit successful message
    Then user closes the browser


  @Delete

  Scenario: admin_delete

    Given user should navigate to medunna.com
    When user should click to human icon to top right
    And user enters click to sign in button
    And user enters valid username on the sign in page
    And user enters valid password on the sign in page
    And user should click sign in box
    And user should click Items&Titles box
    And user should click Physician box
    And user go to page
    And user should click delete box
    And user should click confirm delete box
    And user see Internal server error message
    Then user closes the browser







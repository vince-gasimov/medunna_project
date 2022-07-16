@US13
Feature:doctor_can_see_test-result
  Background: TC01_02_before
    Given User is on the login page
    When  User clicks on account menu
    Then  User clicks on signin
    And   User enters username
    And   User enters password
    And   User clicks on signin button
    And   Doctor verifies that his page is displayed
    And   Doctor clicks on mypage
    And   Doctor clicks on myaccountement
    And   Doctor verifies Appointement page is displayed
    And   Doctor clicks on Edit button

  @US13_TC01
  Scenario: TC01
    Then  Doctor clicks on one of the Show Test Result button.
    Then  Doctor clicks on one of the View Results button.
    And   Doctor verifies that the Test Results page is displayed.
    And   Doctor verifies that  testListHeader is displayed.
    And   Doctor closes the browser


  @US13_TC02
  Scenario: TC02
    Then  Doctor clicks on the Request Inpatient Result button.
    And   Doctor get error message or success message
    And   Doctor closes the browser
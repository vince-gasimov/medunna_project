@US002
Feature:US002_valid_username_email

  Background:user_navigates_to_register_page
    Given user navigates to url
    When user  clicks  to icon on top right corner
    And user clicks on Register button
    Then user verifies registration page
    When user enters a valid SSN number
    And user enters valid first name and last name

  @valid_username_email
  Scenario:TC01_valid_username
    And user enters valid username
    And user enters valid email
    And user enters new password and new password confirmation
    And user clicks Register button for registration
    Then user verifies Registration Saved message is displayed
    And user clicks on Home button
    And user verifies that landed to home page successfully
    And user closes the browser

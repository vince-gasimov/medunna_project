@Signin
Feature: User_login
  Scenario Outline: login_user

    Given User in the home page
    And clicks on signin button
    And user sends username "<username>"
    And user sends password "<password>"
    When user clicks on Sign in button
    And user clicks on his name button
    And user clicks on password button
    And user sends current password "<password>"
    And user enters new password in New password box
    And user enters at least seven char
    And user enters at least one lowercase
    And user enters at least one uppercase
    And user enters at least special cha
    And user enters at least one digit
    Then user enters the new password in New password confirmation box
    Then user clicks on save button



    Examples:

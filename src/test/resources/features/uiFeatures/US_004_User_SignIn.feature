@US004_SignIn
Feature: user_signin

  Background: user_is_on_the_Medunna_page
    Given  user is on the Medunna page
    And user  clicks  to icon on top right corner US002
    And user clicks signInLocation button


  @smoke
  @US004_TC01
  Scenario Outline: TC01_signin_user_profile_testing

    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    Then  user should verify signed in "<signedInUserName>" successful
    Then close the browser

    Examples: customer credentials
      | username       | password  | signedInUserName
      | Team83-kubraoz | Esra2014. | Kubra Ozyasar


  @US004_TC02
  Scenario Outline: TC02_signin_user_profile_negative_testing

    And  user should entered a invalid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    Then  user should verify fail message
    Then close the browser

    Examples: customer credentials
      | username     | password  |
      | Team83-ghj15 | Esra2014. |

  @US004_TC03
  Scenario Outline: TC03_signin_user_profile_negative_testing

    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a invalid password   "<password>" on the sign in page
    When  user should click sign in box
    Then  user should verify fail message
    Then close the browser
    Examples: customer credentials
      | username        | password |
      | Team83-kubra123 | asdFJ12  |

  @US004_TC04
  Scenario Outline: TC04_there_should_be_a_remember_me_option_for_existing_credentials

    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    And  user should click to remember me button
    And  user should click sign in box
    Then  user should verify signed in "<signedInUserName>" successful
    And user clicked the user's account and clicked the signed out
    When  user should click signinAgain box
    And user clicked on username box
    And username should automatically see existing username
    Then close the browser

    Examples: customer credentials
      | username       | password  | signedInUserName
      | Team83-kubraoz | Esra2014. | Kubra Ozyasar


  @US004_TC05
  Scenario: TC05_there_should_be_a_remember_me_option_for_existing_credentials_negative
    And  user should click to remember me button
    And  user should click sign in box
    Then user verify failed message
    Then close the browser


  @US004_TC06
  Scenario Outline:TC06_Need_to_update_password_if_forgotten_"Did_you_forget_your_password
    And user should double click to Did you forget your password
    And user entered valid email "<valid email address>"
    When user clicked reset password
    Then user verify the  message "Check your emails for details on how to reset your password" message
    Then close the browser

    Examples: customer credentials
      | valid email address   |
      | kubracanada@gmail.com |

  @US004_TC07
  Scenario Outline:TC07_Need_to_update_password_if_forgotten_"Did_you_forget_your_password
    When user should double click to Did you forget your password
    And user entered invalid format email address"<invalid email address>"
    And user clicked reset password
    Then user verify the invalid character message "This field is invalid"
    Then close the browser

    Examples: customer credentials
      | invalid email address |
      | kubraca842-gmail/com  |

  @US004_TC08
  Scenario Outline:  TC08_Need_to_update_password_if_forgotten_"Did_you_forget_your_password
    When user should double click to Did you forget your password
    And user entered a non-registered "<non-registered email>"  email adress
    When user clicked reset password
    Then user verify the  message "Check your emails for details on how to reset your password" message
    Then close the browser

    Examples: customer credentials
      | non-registered email |
      | kubra@gmail.com      |

  @US004_TC09
  Scenario: Need  to  to navigate to registration page if not registered yet
    When user should click to " You don't have an account yet? Register a new account"
    And user verify to navigate registration page
    Then close the browser

  @US004_TC10
  Scenario Outline:Need to to navigate to "cancel login"
    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When user should click to cancel button
    Then user verify that  successfully to switch to home page
    Then close the browser

    Examples: customer credentials
      | username        | password |
      | Team83-kubra123 | asdFJ12  |

  @smoke
  @US004_TC11
  Scenario: Need to to navigate to "cancel login"
    When user left blank username and password field
    And user should double click to cancel button
    Then user verify that  successfully to switch to home page
    Then close the browser

@US_08_user_password_segment
Feature:   US008_password_update

  @smoke
  @US08_TC_0001
  Scenario Outline: The new password should be confirmed
    Given user navigates to Url
    And user clicks on Account menu
    And user clicks on Sign in button
    And user enters "sedatarslan" as username and "1234560" as password
    And user clicks on the Signin button
#    And verify the login is successful
    And user clicks on account menu on the account page
    Then user clicks on Password button
    And user sends current password "<currentPassword>" to current password part
    And user sends new password "<newPassword>" to new password part
    And user sends new password "<confirmationPassword>" again to new password confirmation part
    And user clicks on save button
    And user verifies the success message on the toast container box
    Examples:
      | currentPassword | newPassword | confirmationPassword |
      | 1234560          | 1234560        | 1234560           |

  @US08_TC_0002
  Scenario Outline: for stronger password adding one LOWERCASE character
    And user cleans the new password part
    And user sends new password "<new password>" to new password part
    And user verifies the password strength bar is one
    And user add character " <add character>" to new password part
    And user verifies the password strength bar is two

    Examples:
      | new password | add character|
      | 123456       | a            |

  @US08_TC_0003
  Scenario Outline: for stronger password adding one UPPERCASE character
    And user cleans the new password part
    And user sends new password "<new password>" to new password part
    And user verifies the password strength bar is two
    And user add character " <add character>" to new password part
    And user verifies the password strength bar is four

    Examples:
      | new password | add character |
      | 1234560a      | C             |

  @US08_TC_0004
  Scenario Outline: for stronger password adding one DIGIT character
    And user cleans the new password part
    And user sends new password "<new password>" to new password part
    And user verifies the password strength bar is four
    And user add character " <add character>" to new password part
    And user verifies the password strength bar is five
    Examples:
      | new password | add character |
      | qazwsX!      | 5             |
  @US08_TC_0005
  Scenario Outline: for stronger password adding one SPECIAL character
    And user cleans the new password part
    And user sends new password "<new password>" to new password part
    And user verifies the password strength bar is two
    And user add character " <add character>" to new password part
    And user verifies the password strength bar is four
    Examples:
      | new password | add character |
      | 12345xy      | !             |
  @US08_TC_0006-negative_test_for_stronger_password_sending_7_character
  Scenario Outline:(Negative Scenario) sending 4 or 5 or 6 characters to verify that is not enough for a stronger password(There should be at least 7 characters)
    And user cleans the new password part
    And user sends new password "<new password>" to new password part
    And user verifies the password strength bar is one
    Examples:
      | new password |
      | qA1!5*       |
  @US08_TC_0007_positive_test_for_stronger_password_sending_7_character
  Scenario Outline:(Positive Scenario) sending 6 then add 1 chars to see the password is getting stronger(There should be at least 7 characters)
    And user cleans the new password part
    And user sends new password "<new password>" to new password part
    And user verifies the password strength bar is one
    And user add character " <add character>" to new password part
    And user verifies the password strength bar is four
    Examples:
      | new password | add character |
      | 12345x       | !             |
  @US08_TC_008
  Scenario Outline: old password should not be used
    When user cleans the current password part
    And user cleans the new password part
    And user cleans the confirmation password part
    And user sends current password "<current Password>" to current password part
    And user sends current password "<new Password>" to new password part
    And user sends current password "<confirmation Password>" to confirmation password part
    And user clicks on save button
    Then user sees the success message on the toast container box as a BUG
    Then user close the driver
    Examples:
      | current Password | new Password | confirmation Password |
      | 1234560           | 1234560      | 1234560          |
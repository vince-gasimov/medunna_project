@US004_user_signin
Feature: user_signin

  Background: user_is_on_the_Medunna_page
    Given  user is on the Medunna page
    And user clicks human icon
    And user clicks signInLocation button

  @US004_TC01
  Scenario Outline: TC01_signin_user_profile_testing

    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    Then  user should verify signed in "<signedInUserName>" successful

    Examples: customer credentials
      | username       | password  | signedInUserName
      | Team83-kubraoz | Esra2014. | Kubra Ozyasar
      | Team83-user2   | Izmir35.  | Kubra Oz


  @US004_TC02
  Scenario Outline: TC02_signin_user_profile_negative_testing

    And  user should entered a invalid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    Then  user should verify signed in "<signedInUserName>" successful

    Examples: customer credentials
      | username        | password  | signedInUserName
      | Team83-ghj15 | Esra2014. | Kubra Ozyasar

  @US004_TC03
  Scenario Outline: TC03_signin_user_profile_negative_testing

    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a invalid password   "<password>" on the sign in page
    When  user should click sign in box
    Then  user should verify signed in "<signedInUserName>" successful

    Examples: customer credentials
      | username        | password  | signedInUserName
      | Team83-kubra123 | asdFJ12 | Kubra Ozyasar

@US024_patient_see_test_results
Feature: patient_see_test_results

  Background: user_is_on_the_Medunna_page
    Given  user is on the Medunna page
    And user  clicks  to icon on top right corner US002
    And user clicks signInLocation button


    @TC01
  Scenario Outline: TC024_patient_view_test_results
    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    Then  user should verify signed in "<signedInUserName>" successful
    And patient should click on mypages
    And patient should click on My Appointments
    And patient should click on Show Test button
    And patient should click on View Results button
    And Patient should verify id, name for test, default max and min value, test date and description

      Examples: customer credentials
      | username            | password  | signedInUserName|
      | team83_yesimpatient1 | medunna | zeynep3 ozturk   |


    @TC02
  Scenario Outline: TC024_patient_can_not_find_appointments
    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    Then  user should verify signed in "<signedInUserName>" successful
    And patient should click on mypages
    And patient should click on My Appointments
    And patient should verify No Appointments found message

      Examples: customer credentials
        | username            | password  | signedInUserName|
        | team83_yesimpatient3 | medunna | zeynep6 ozturk   |

  @TC03

  Scenario Outline: TC024_patient_can_not_see_tests
    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    Then  user should verify signed in "<signedInUserName>" successful
    And patient should click on mypages
    And patient should click on My Appointments
    And patient should click on Show Test button
    And patient should verify No Test Found message



    Examples: customer credentials
      | username            | password  | signedInUserName|
      | team83_yesimpatient2 | medunna | zeynep4 ozturk   |

  @TC04

  Scenario Outline: TC024_patient_can_not_see_tests
    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    Then  user should verify signed in "<signedInUserName>" successful
    And patient should click on mypages
    And patient should click on My Appointments
    And patient should click on Show Invoice button
    And patient should verify INVOICE page



    Examples: customer credentials
      | username            | password  | signedInUserName|
      | team83_yesimpatient1 | medunna | zeynep3 ozturk   |


@US024_patient_see_test_results
Feature: patient_see_test_results

  Background: user_is_on_the_Medunna_page
    Given  user is on the Medunna page
    And user  clicks  to icon on top right corner US002
    And user clicks signInLocation button

  @US_24_TC01
  Scenario Outline: TC024_patient_view_test_results
    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    Then  user should verify signed in "<signedInUserName>" successful
    And patient should click on mypages
    And patient should click on My Appointments
    And patient should click on Show Test button
    And patient should click on View Results button
    And Patient should verify id
    And Patient should verify name
    And Patient should verify default max value
    And Patient should verify default min value
    And Patient should verify description
    And Patient should verify date
    Then user closes the browser US002
    Examples: customer credentials
      | username             | password | signedInUserName |
      | team83_yesimpatient2 | medunna  | zeynep4 ozturk   |

  @US_24_TC02
  Scenario Outline: TC024_patient_can_not_find_appointments
    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    Then  user should verify signed in "<signedInUserName>" successful
    And patient should click on mypages
    And patient should click on My Appointments
    And patient should verify No Appointments found message
    Then user closes the browser US002

    Examples: customer credentials
      | username  | password | signedInUserName |
      | ypatient5 | medunna  | patient5 ozturk  |

  @US_24_TC03

  Scenario Outline: TC024_patient_can_not_see_tests
    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    Then  user should verify signed in "<signedInUserName>" successful
    And patient should click on mypages
    And patient should click on My Appointments
    And patient should click on Show Test button
    And patient should verify No Test Found message
    Then user closes the browser US002

    Examples: customer credentials
      | username  | password | signedInUserName |
      | ypatient4 | medunna  | patient4 ozturk  |

  @US_24_TC04

  Scenario Outline: TC024_patient_can_not_see_tests
    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    Then  user should verify signed in "<signedInUserName>" successful
    And patient should click on mypages
    And patient should click on My Appointments
    And patient should click on Show Invoice button
    And patient should verify INVOICE page
    Then user closes the browser US002


    Examples: customer credentials
      | username          | password          | signedInUserName             |
      | team83_patient_11 | team83_patient_11 | team83_patient_11 patient_11 |


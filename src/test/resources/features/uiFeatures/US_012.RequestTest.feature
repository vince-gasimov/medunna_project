@US012_request_test
Feature: request_test

  Background: user_is_on_the_Medunna_page
    Given  user is on the Medunna page
    And user  clicks  to icon on top right corner US002
    And user clicks signInLocation button

  @Smoke
  @TC01
  Scenario Outline: TC012_doctor_request_test
    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    Then  user should verify signed in "<signedInUserName>" successful
    And  doctor clicks to mypages
    And doctor clicks my appoinments
    And doctor clicks edit button
    And doctor doubleclicks request a test button
    Then  doctor verifies on request test page


    Examples: customer credentials
      | username            | password  | signedInUserName
      | team83_yesimdoctor3 | medunna | zeynep7 ozturk

  @Smoke
  @TC02
  Scenario Outline: TC012_doctor_see_noTestItemsFound
    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    Then  user should verify signed in "<signedInUserName>" successful
    And  doctor clicks to mypages
    And doctor clicks my appoinments
    And doctor clicks edit button
    And doctor doubleclicks request a test button
    Then  doctor verifies on request test page
    And doctor should click on Save button
    And doctor should see No Test Items Found message


    Examples: customer credentials
      | username            | password  | signedInUserName|
      | team83_yesimdoctor3 | medunna   | zeynep7 ozturk    |

  @TC03

  Scenario Outline: TC012_doctor_request_test
    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    Then  user should verify signed in "<signedInUserName>" successful
    And  doctor clicks to mypages
    And doctor clicks my appoinments
    And doctor clicks edit button
    And doctor doubleclicks request a test button
    Then  doctor verifies on request test page
    And doctor clicks on checkmark box of Sodium
    And doctor clicks on checkmark box of Urea
    And doctor clicks on checkmark box of Hemoglobin
    And doctor clicks on checkmark box of Albumin
    And doctor clicks on checkmark box of Creatinin
    And doctor clicks on checkmark box of Total Protein
    And doctor clicks on checkmark box of Potassium
    And doctor should click on Save button
    And doctor verifies A New Test Created message


    Examples: customer credentials
      | username            | password  | signedInUserName|
      | team83_yesimdoctor3 | medunna   | zeynep7 ozturk    |

  @TC04

  Scenario Outline: TC012_doctor_request_test
    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    Then  user should verify signed in "<signedInUserName>" successful
    And  doctor clicks to mypages
    And doctor clicks my appoinments
    And doctor clicks edit button
    And doctor doubleclicks request a test button
    Then  doctor verifies on request test page
    And doctor should verify Glucose is not displayed



    Examples: customer credentials
      | username            | password  | signedInUserName|
      | team83_yesimdoctor3 | medunna   | zeynep7 ozturk    |


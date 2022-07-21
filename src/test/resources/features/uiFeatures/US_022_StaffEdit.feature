@US22_EditTest
Feature: staff_edit

  Background: user_is_on_the_Medunna_page
    Given  user is on the Medunna page
    And user  clicks  to icon on top right corner US002
    And user clicks signInLocation button

  @US22_TC01
  Scenario Outline: TC01_staff_can_search_patient_by_SSN

    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    And Staff clicks on My Page
    And Staff clicks on Search Patient
    And Staff enters a valid SSN Id "<SSN>"  on Patient SSN box
     Then Staff should verifies to access the  record of patient who registered with this SSN id
    Then close the application


    Examples: customer credentials

     | username | password    |  SSN                |
     |  Harry   |  Potter2022.| 689-96-5168         |


  @US22_TC02
  Scenario Outline: TC02_staff_can_see_test_results

    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    And Staff clicks on My Page
    And Staff clicks on Search Patient
    And Staff entered a valid SSN Id "<SSN>" in Patient SSN box
    And Staff clicks on Show Appoinments
    And Staff clicks on Show Test
    And Staff clicks on View Results
    Then Staff verifies  to see test results on View Results
    Then close the application


    Examples: customer credentials

      | username | password    |   SSN                |
      |  Harry   |  Potter2022.|   321-54-4567        |

  @US22_TC03
  Scenario Outline: TC03_staff_can_view_and_update_test_results

    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    And Staff clicks on My Page
    And Staff clicks on Search Patient
    And Staff entered a valid SSN Id "<SSN>" in Patient SSN box
    And Staff clicks on Show Appoinments
    And Staff clicks on Show Test
    And Staff clicks on View Results
    Then Staff verifies  to see test results on View Results
    And Staff clicks on Edit
    And Staff clicks on Result in Edit
    And Staff entered "<changed_info>" on Result
    And Staff clicks on Save
    Then Staff verifies Test Result updated message
    Then close the application

    Examples: customer credentials

      | username | password    |   SSN                | changed_info |
      |  Harry   |  Potter2022.|   321-54-4567        |  negative    |


  @US22_TC04
  Scenario Outline: TC04_staff_can_view_and_update_test_results

    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    And Staff clicks on My Page
    And Staff clicks on Search Patient
    And Staff entered a valid SSN Id "<SSN>" in Patient SSN box
    And Staff clicks on Show Appoinments
    And Staff clicks on Show Test
    And Staff clicks on View Results
    Then Staff verifies  to see test results on View Results
    And Staff clicks on Edit
    And Staff clicks on Description
    And Staff entered "<changed_info>" on Description
    And Staff clicks on Save
    Then Staff verifies Test Result updated message
    Then close the application

    Examples: customer credentials

      | username | password    |   SSN                | changed_info |
      |  Harry   |  Potter2022.|   321-54-4567        |  abnormal blood level   |



  @US22_TC05
  Scenario Outline: TC04_staff_can_view_and_update_test_results

    And  user should entered a valid username "<username>" on the sign in page
    And  user should entered a valid password   "<password>" on the sign in page
    When  user should click sign in box
    And Staff clicks on My Page
    And Staff clicks on Search Patient
    And Staff entered a valid SSN Id "<SSN>" in Patient SSN box
    And Staff clicks on Show Appoinments
    And Staff clicks on Show Test
    And Staff clicks on View Results
    Then Staff verifies  to see test results on View Results
    And Staff clicks on Edit
    Then Staff verifies to access Test Result Create or Edit Test Result
    Then close the application

    Examples: customer credentials

      | username | password    |   SSN                |
      |  Harry   |  Potter2022.|   321-54-4567        |





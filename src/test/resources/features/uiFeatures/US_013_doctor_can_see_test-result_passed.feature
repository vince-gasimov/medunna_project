@US130doctor_can_see_test-result_passed
  Feature:doctor_can_see_test-result








    @Login
    Scenario Outline: test login users
      Given user sends the username as "<username>"
      And user provides the password as "<password>"
      Then user signs in  and valiates
      Examples: test data
        |username|password|
        |Team83-11-Doctor|Team83-11-Doctor|





   Scenario: test doctor

      And Doctor clicks on myaccountment
      And Doctor verifies Appointment page is displayed
      And Doctor clicks on edit button

      @TC01_1
      Scenario: TC01_2
        Then Doctor clicks on one of the Show Test Result button.
        Then Doctor clicks on one of the View Results page is displayed
        And Doctor verifies that the Test Results page in displayed.
        And Doctor closes the browser

        @TC01_2
        Scenario: TC01_2
          Then Doctor clicks on the Request Inpatient Result button.
          And Doctor ger error message: Inpatient request already done for this appointment.
          And Doctor closes the browser



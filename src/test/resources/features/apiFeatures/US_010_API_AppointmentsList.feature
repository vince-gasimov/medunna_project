@us_010_api
Feature: US_010_appointmentsList

  Scenario Outline: TC_10_get_appointmentList
    Given user sends GET request for appointments
    When user receives response with status code "<statusCode>"
    Then user verifies that response contains "<physicianID>"
    Examples:
      | statusCode | physicianID |
      | 200        | 94228       |




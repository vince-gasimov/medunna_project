@US_010_API_Testing
Feature: test api appointments list

  @US_010_Get_Api_AppointmentsList
  Scenario: get request to "https://www.medunna.com/api/user"
    Given user sends a get request for user's data
    And user provides patient id as a query parameter
    And user verifies status code is 200
    Then user validates patient id, start date, end date, status with expected data



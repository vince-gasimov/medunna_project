Feature: test the appointment with api

  @Api

  @US_007_GetRequest
  Scenario: get the appointment with get request
    Given generate the token US007
    And user makes an appointment request with API US007
    When user deserializes the appointments data US007
    Then user saves the data US007
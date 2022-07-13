Feature: test the appointment with api

  @US_007_GetRequest

  Scenario: get the appointment with get request
    Given generate the token US_007
    And user makes an appointment request with API US_007
    When user deserializes the appointments data US_007
    Then user saves the data US_007
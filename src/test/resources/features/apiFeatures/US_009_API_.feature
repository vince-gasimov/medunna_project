Feature: Verifying patient information
  @api
    @US009_API
  Scenario: Verifying patient name
    Given user sends a get request for patients  data
    And user verifies status code is 200
    Then user validates patient id, firstname, ssn, email with expected data


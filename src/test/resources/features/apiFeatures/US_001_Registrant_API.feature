Feature: registrant_data_api_test

  @Api
  @GetApiRegistrants
  Scenario: TC_01_Get_Registrant_Data
    Given user sends a get-request to get all registrants' data
    And user deserializes the response
    Then user saves the data to the files and validates

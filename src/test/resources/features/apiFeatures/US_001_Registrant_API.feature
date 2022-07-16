@US_01_API
Feature: registrant_data_api_test

  @Api
  @GetApiRegistrants
  Scenario: US_01_TC_006_Get_Registrant_Data
    Given user sends a get-request to get all registrants' data
    And user deserializes the response
    Then user saves the data to the files and validates

  @Api
  @PostApiRegistrants
  Scenario: US_01_TC_007_Post_Request
    Given user sends a post-request to create a new registrant
    Then user saves the data to the files and validates

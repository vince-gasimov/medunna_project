Feature: registrant_data_api_test

  @Api
  @GetApiPatients
  Scenario: TC_09_Get_Patients_Data
    Given user sends a get-request to get all patients' data
    And user deserializes the patients api response
    Then user saves the patients data to the file and validates




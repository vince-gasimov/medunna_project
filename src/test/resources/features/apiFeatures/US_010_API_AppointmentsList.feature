@US_010_Validate_API_Testing
Feature: test api appointments list

  @US_010_Get_Api_AppointmentsList
  Scenario: doctor should be able to see appointments list in api
    Given Doctor sets Medunna base url
#   "https://medunna.com/api/appointments"
    When Doctor sends the GET request and GET the response
    And Doctor provides patient id as a query parameter
    And Doctor deserialize data json to java
    And Doctor saves the patient data to correspondent files
    And Doctor validates expected data with API
#    Then Doctor validates patient id, start date, end date, status with expected data








@us_010_api
Feature: US_010_appointmentsList

    @Api
    @US_10_AppointmentsList
  Scenario: TC_10_get_appointmentList
    Given user sends GET request for appointments
    When user receives response with status code 200
    Then user verifies that response contains physicianID





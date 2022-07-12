@US_007_API_Testing
Feature: test api appointment data

  @US_007_Post_Api_Appointments
  Scenario: get request for appointment
    Given user sends a post request for user's data
    And user deserializes appointments api response
#    Then status code should be "200"
#    And user deserializes the user's data to java
#    Then user saves the users' data to correspondent files and validates
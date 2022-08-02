@Api
Feature: US002_username_email_api

  @US_007_PostAppointmentApi
  Scenario: TC07_username_validation_unique_api_Object_Mapper
    Given user sends a post request for physicians data us007
#    Then Status code should be 200 us018
    And firstName, lastName, ssn should be validated by api us007

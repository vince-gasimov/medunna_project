@Api
Feature: US002_username_email_api

  @US_018_PostPhysicianApi
  Scenario: TC07_username_validation_unique_api_Object_Mapper
    Given user sends a post request for physicians data
    Then Status code should be 201 us018
    And firstName, lastName, email, ssn should be validated by api

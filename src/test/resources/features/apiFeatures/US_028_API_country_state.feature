@US028
@US028_Api
@Api
Feature: US028_country_state_validation_api

  @CountryApi
  Scenario: TC04_country_get_request
    Given user gets country data from ui
    Given user provides expected country data from ui
    Given user sends a get request for countries
    Then status code should be 200
    And country should be validated by api

  @CountryApiId
  Scenario:TC05_country_get_request_id
    Given user gets country data from ui
    Given user provides expected country data from ui
    And user sends get request using country id
    Then status code should be 200
    When user deserializes country data
    Then country should be validated

  @StateApi
  Scenario: TC06_state_get_request
    Given user sends a get request for getting new created state by country id
    Then status code should be 200
    And state should be validated by api

  @CountryPostApi
  Scenario: TC07_country_post_request
    Given user provides post body for country creation
    And user sends a post request for creating new country
    Then status code should be 201
    When user deserializes country data
    Then user verifies from api created country
    And user saves new created country data

  @CountryUpdateApi
  Scenario: TC08_country_put_request
    Given user gets country data from ui
    Given user provides put body
    When user sends a put request for updating new country
    Then status code should be 200
    And updated country should be validated by api
    And user updates the ui file and saves updated country in another file
@US002
@Api
@US002_Api
Feature: US002_username_email_api

  @UsernameApi
  Scenario Outline: TC07_username_validation_unique_api
    Given user sends a get request for users data US_002
    Then Status code should be 200 US_002
    And username "<username>" should be validated by api US_002
    And usernames should be unique US_002

    Examples: username_validation
      |username|
      |samantha|


  @EmailApi
  Scenario Outline: TC08_email_validation_api
    Given user sends a get request for users data US_002
    Then Status code should be 200 US_002
    And email "<email>" should be validated by api US_002

    Examples:
      |email|
      |maryland@gmail.com|


  @PostApi
  Scenario: TC09_email_post_request
    Given user provides post body US_002
    Given user sends post request for creating new registrant US_002
    Then Status code should be 201 US_002
    And user verifies username and email with given data in body US_002

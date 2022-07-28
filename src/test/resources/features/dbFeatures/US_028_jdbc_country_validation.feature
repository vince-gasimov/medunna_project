@US028
@US028_DB
Feature: US028_country_validation_db

  Scenario: TC09_country_validation
    Given user connects to the database US_002
    And user gets country data from api US_028
    Then country that is created by api should be validated by database US_028
    When user close the database connection US_002

  Scenario: TC10_updated_country_validation
    Given user connects to the database US_002
    And user gets updated country data from api US_028
    Then country that is updated by api should be validated by database US_028
    When user close the database connection US_002

@US_001_DB_testing
Feature: database_read_feature

  Background: Prerequisite_Connect_to_The_Server
    Given user connects to database 007

  @db_registrant_ssn
  Scenario: TC08_read_registrant_ssn_information
    When user gets the "ssn" data from "jhi_user" table
    And close the database connection 007

  Scenario Outline: TC08_verify_registrant_ssn_information
    Then verify "jhi_user" table "ssn" column contains "<ssn>" data
    And close the database connection 007
    Examples:
      | ssn         |
      | 654-54-5430 |
      | 888-33-4444 |



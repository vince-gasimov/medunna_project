Feature: database_read_feature

  Background: Prerequisite_Connect_to_The_Server
    Given user connects to the database

  @db_registrant_ssn
  Scenario: TC01_read_customer_ssn_information
    And user gets the "*" from "tp_customer" table
    And user reads all of the "ssn" column data
    Then close the database connection

  @db_user_ssn_verify
  Scenario: TC07_verify_jhi_user_email
    And user gets the "*" from "jhi_user" table
    Then verify "*" table "*" column contains "*" data
    Then close the database connection

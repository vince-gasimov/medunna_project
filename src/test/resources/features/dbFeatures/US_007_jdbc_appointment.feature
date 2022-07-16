@US_007_database_connectivity
Feature: database_appointments

  Background: Prerequisite_Connect_to_the_server
    Given user connects to database 007

  @US_007_Read_All_Data
  Scenario: read_all_patient_table
    When user gets the "*" data from "appointment" table
    And close the database connection 007

  @US_007_015
  Scenario Outline: read_all_patient_table
    Then verify "patient" table "first_name" column contains "<name>" data
    And close the database connection 007
    Examples: name
    |name|
    |ksjjkbsefkjebfkbse|

  @US_007_db_firstname_table
  Scenario: TC01_read_customer_ssn_information
    And user gets the "*" data from "patient" table
    And user reads all of the "first_name" column data
    Then close the database connection 007

  @US_007_db_lastname_table
  Scenario: TC01_read_customer_ssn_information
    And user gets the "*" data from "patient" table
    And user reads all of the "last_name" column data
    Then close the database connection 007

  @US_007_db_phone_table
  Scenario: TC03_read_customer_address_information
    And user gets the "*" data from "patient" table
    And user reads all of the "phone" column data
    Then close the database connection 007

  @US_007_db_firstname_verify
  Scenario: TC03_read_customer_address_information
    Then verify "patient" table "first_name" column contains "Vince" data
    Then close the database connection 007

  @US_007_db_phone_verify
  Scenario Outline: TC03_read_customer_address_information
    Then verify "patient" table "phone" column contains "<phone>" data
    Then close the database connection 007
    Examples: phone
    |phone|
    |123-123-1234|

  @US_007_db_firstname_verify
  Scenario: TC03_read_customer_address_information
    Then verify "patient" table "first_name" column does not contain "Vusal" data
    Then close the database connection 007
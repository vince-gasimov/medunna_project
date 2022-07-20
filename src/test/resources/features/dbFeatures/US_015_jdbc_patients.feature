@US_015_database_connectivity
Feature: database_patients

  Background: Prerequisite_Connect_to_the_server
    Given user connects to database 007

  @US_015_Read_All_Patient_Data
  Scenario: TC_001_read_all_patient_table
    When user gets the "*" data from "patient" table
    And close the database connection 007

  @US_015_Read_Patient_Firstname
  Scenario Outline: TC_002_verify_patient_firstname
    Then verify "patient" table "first_name" column contains "<name>" data
    And close the database connection 007
    Examples: name
      |name|
      |Team83_Manie|

  @US_015_Read_All_Firstname
  Scenario: TC_003_read_all_firstname_column
    And user gets the "*" data from "patient" table
    And user reads all of the "first_name" column data
    Then close the database connection 007

  @US_015_Verify_Patient_PhoneNumber
  Scenario: TC_004__verify_patient_phone_exists
    And user gets the "phone" column from "patient" table
    And user verifies that "phone" column contains "5712311234" data
    Then close the database connection 007

  @US_015_db_phone_table
  Scenario: TC_005_read_all_phonenumber_column
    And user gets the "*" data from "patient" table
    And user reads all of the "phone" column data
    Then close the database connection 007

  @US_015_db_firstname_verify
  Scenario: TC_006__verify_customers_firstname
    Then verify "patient" table "first_name" column contains "Gerardo" and "Team83_Antoinette" data
    Then close the database connection 007

  @US_015_db_phone_verify
  Scenario Outline: TC_007_read_customer_phonenumber
    Then verify "patient" table "phone" column contains "<phone>" data
    Then close the database connection 007
    Examples: phone
      |phone|
      |123-123-1234|

  @US_015_db_firstname_verify
  Scenario: TC_008_verify_patient_firstname
    Then verify "patient" table "first_name" column does not contain "Vusal" data
    Then close the database connection 007
@US_005_db
Feature: database_read_patient

  Background: Prerequisite_Connect_to_The_Server
    Given user connects to database 007


  @US_005_Read_All_Data
  Scenario: TC01_read_patient_information
    When user gets the "*" data from "patient" table
    And close the database connection 007


  @US_005_db_firstname_table
  Scenario: TC02_read_patient_name
    And verify "patient" table "first_name" column contains "a" data
    Then close the database connection 007


  @US_005_db_lastname_table
  Scenario: TC03_read_patient_lastname
    And verify "patient" table "last_name" column contains "C" data
    Then close the database connection 007


  @US_005_db_phone_table
  Scenario: TC04_read_patient_phone
    And verify "patient" table "phone" column contains "222-333-2322" data
    Then close the database connection 007





@US_18_Read_All_Data
Feature: database_read_All_Physicians

  Background: Prerequisite_Connect_to_The_Server
    Given user connects to database 007


  @US_18_Read_Physician
  Scenario: TC01_read_Physicians_information
    When user gets the "*" data from "physician" table
    And close the database connection

  @US_18_Read_All_lastName
  Scenario: TC01_read_physician_lastName_information
    And verify "physician" table "last_name" column contains "doctor" data
    Then close the database connection
@US_010_database_connectivity
Feature: database_appointmentsList

  Background: Prerequisite_Connect_to_the_server
    Given user connects to database 007


  @US_010_Patient_AppointmentsList
  Scenario: patient_appointmentsList
    When user gets the "*" data from "patient" table
    And close the database connection 007


  @US_010_db_ID_table
  Scenario: TC01_read_patient_id
    And user gets the "*" data from "patient" table
    And user reads all of the "id" column data
    Then close the database connection 007


  @US_010_db_start_date_table
  Scenario: TC02_read_patient_start_date
    And user gets the "*" data from "patient" table
    And user reads all of the "start_date" column data
    Then close the database connection 007


  @US_010_db_end_date_table
  Scenario: TC03_read_patient_end_date
    And user gets the "*" data from "patient" table
    And user reads all of the "end_date" column data
    Then close the database connection 007



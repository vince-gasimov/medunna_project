@US_010_database_connectivity
Feature: db_appointmentsList

  Background: Connect_to_the_server
    Given doctor connects to database


  @US_010_Patient_AppointmentsList
  Scenario: patient_appointmentsList
    When doctor gets the "*" data from "patient" table
    And close the database connection


  @US_010_db_ID_table
  Scenario: TC01_read_patient_id
    And doctor gets the "*" data from "patient" table
    And doctor reads the "id" column data
    Then close the database connection


  @US_010_db_start_date_table
  Scenario: TC02_read_patient_start_date
    And doctor gets the "*" data from "patient" table
    And doctor reads the "start_date" column data
    Then close the database connection


  @US_010_db_end_date_table
  Scenario: TC03_read_patient_end_date
    And doctor gets the "*" data from "patient" table
    And doctor reads the "end_date" column data
    Then close the database connection


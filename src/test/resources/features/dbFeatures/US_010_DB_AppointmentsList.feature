@US_010_database_connectivity
Feature: db_appointmentsList

  Background: Connect_to_the_server
    Given Doctor connects to database

  Scenario: Doctor tests Appointment DB
    Given Doctor connects to database
    Then Doctor gets appointment "status"
    And Doctor verifies the "PENDING" by DB
    Then close the database connection 010


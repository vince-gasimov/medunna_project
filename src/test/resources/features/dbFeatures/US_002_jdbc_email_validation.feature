@US002
@US002_DB
Feature: US002_email_validation_db
  Scenario:TC09_email_db
    Given user connects to the database US_002
    Then user verifies that "jhi_user" table "email" column contains "maryland@gmail.com" US_002
    And user close the database connection US_002

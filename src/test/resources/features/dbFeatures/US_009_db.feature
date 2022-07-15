Feature:database_read_feature
  @database_medunna_patient_info
  Scenario: US_009_read_patient_info
    Given user connects to database 007
    When user gets the "*" from "patient" table with the "ID" of "4859"
#    And user reads all of the "id" column data
    Then the "FIRST_NAME" of the person should be "SevalBanu"
    And close the database connection 007

  @database_medunna_patient_info
  Scenario: US_009_delete_patient_info
    Given user connects to database 007
    When User deletes the patient with the "ID" of "115283" from the "appointment" table
    Then user should not be able to get the "*" from "appointment" table with the "ID" of "115283"
    And close the database connection 007


  @unused_db_delete_test
  Scenario: US_009_delete_patient_info2
    Given  User Staff connects to the database
    And User deletes the patient with the "ID" of "4859" from the "patient" table
    When user gets the "*" from "patient" table with the "ID" of "4859"
#    And user reads all of the "id" column data
    Then User should not see empty result
    And close the database connection 007

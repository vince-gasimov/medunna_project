Feature: test api physicians data
  @Api
  @GetApiPhysicians
  Scenario:
    Given admin sends a get request for users' data
    And admin deserializes the users' data to java
    Then admin saves the users' data to correspondent files and validates


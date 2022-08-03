@Api
@US_016_API
@sprint2
Feature: US_016 Room Validation from API

  @Api
  @GetAPIRooms
  @smoke
  Scenario: Get Room Validation from API
    Given software sends a get request for rooms' data
    Given user should receive 200 status code
    And software deserializes the rooms' data to java
    Then software saves the rooms' data to corresponding file and validates the data
  #  Then software checks the roomNumber, roomType, status, price and description data from endpoint and id
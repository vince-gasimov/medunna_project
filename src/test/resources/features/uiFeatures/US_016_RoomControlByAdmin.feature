@US_016

Feature: US_016 Room Create by Admin

  Background: Sign in as an admin and click to Create a new Room button
    Given user is navigated to medunna.com
    Then user navigates the sign in page with adminUsername and adminPassword
    And user signs in
    Then user clicks on Items&Titles button US_015
    When admin clicks on Room button
    Then admin clicks on Create a new Room button



  Scenario Outline: TC_001 Create a new Twin Room which is full and it has description - Happy Path

    And admin enters the room number as "<roomNumber>"
    And admin selects the room type as "<roomType>"
    And admin selects the room status as "<roomStatus>"
    And admin enters the price as "<price>"
    And admin enters the description with "<roomDescription>"
    And admin enters the created date from current system date and time
    And software saving the records
    And admin saves the room
    Then admin should see the message as "<roomMessage>"
    Then close the browser


    Examples:
      |roomNumber  |  roomType  |  roomStatus  | price  | roomMessage                             |roomDescription|
      |101601      |  TWIN      |   Full       | 50     | A new Room is created with identifier   |+              |
      #|101602      |  TWIN      |  Available   | 50     | A new Room is created with identifier   |+              |
      #|101603      |  TWIN      |  Full        | 50     | A new Room is created with identifier   |-              |
      #|101604      |  TWIN      |  Available   | 50     | A new Room is created with identifier   |-              |


  Scenario Outline: TC_003 Create a new Twin Room which is full and it has NO description - Negative Path

    And admin enters the room number as "<roomNumber>"
    And admin selects the room type as "<roomType>"
    And admin selects the room status as "<roomStatus>"
    And admin enters the price as "<price>"
    And admin enters the description with "<roomDescription>"
    And admin enters the created date from current system date and time
    And software saving the records
    And admin saves the room
    Then admin should see the message as "<roomMessage>"
    Then close the browser

    Examples:
      |roomNumber  |  roomType  |  roomStatus  | price  | roomMessage                           |roomDescription|
      |            |  TWIN      |  Available   |        | Room could not created                |+              |
      |            |  TWIN      |  Available   |  50    | Room could not created                |+              |
      |101607      |  TWIN      |  Available   |        | Room could not created                |-              |
      |101608      |  TWIN      |  Full        |        | Room could not created                |-              |
      |101605      |  TWIN      |  Full        |        | Room could not created                |+              |
      |101606      |  TWIN      |  Available   |        | Room could not created                |+              |

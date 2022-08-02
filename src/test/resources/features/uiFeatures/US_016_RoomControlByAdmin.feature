@US_016

Feature: US_016 Room Create by Admin

  Background: Sign in as an admin and click to Create a new Room button
    Then close the browser
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
      |101601      |  TWIN      |  Full        | 50     | A new Room is created with identifier   |+              |
      |101602      |  TWIN      |  Available   | 50     | A new Room is created with identifier   |+              |
      |101603      |  TWIN      |  Full        | 50     | A new Room is created with identifier   |-              |
      |101604      |  TWIN      |  Available   | 50     | A new Room is created with identifier   |-              |

      |102601      |  DELUXE    |  Full        | 100    | A new Room is created with identifier   |+              |
      |102602      |  DELUXE    |  Available   | 100    | A new Room is created with identifier   |+              |
      |102603      |  DELUXE    |  Full        | 100    | A new Room is created with identifier   |-              |
      |102604      |  DELUXE    |  Available   | 100    | A new Room is created with identifier   |-              |

      |103601      |  PREMIUM_DELUXE    |  Full        | 150    | A new Room is created with identifier   |+      |
      |103602      |  PREMIUM_DELUXE    |  Available   | 150    | A new Room is created with identifier   |+      |
      |103603      |  PREMIUM_DELUXE    |  Full        | 150    | A new Room is created with identifier   |-      |
      |103604      |  PREMIUM_DELUXE    |  Available   | 150    | A new Room is created with identifier   |-      |

      |104601      |  SUITE    |  Full        | 200    | A new Room is created with identifier   |+              |
      |104602      |  SUITE    |  Available   | 200    | A new Room is created with identifier   |+              |
      |104603      |  SUITE    |  Full        | 200    | A new Room is created with identifier   |-              |
      |104604      |  SUITE    |  Available   | 200    | A new Room is created with identifier   |-              |

      |105601      |  DAYCARE  |  Full        | 250    | A new Room is created with identifier   |+              |
      |105602      |  DAYCARE  |  Available   | 250    | A new Room is created with identifier   |+              |
      |105603      |  DAYCARE  |  Full        | 250    | A new Room is created with identifier   |-              |
      |105604      |  DAYCARE  |  Available   | 250    | A new Room is created with identifier   |-              |


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

      |            |  DELUXE    |  Available   |        | Room could not created                |+              |
      |            |  DELUXE    |  Available   |  50    | Room could not created                |+              |
      |102607      |  DELUXE    |  Available   |        | Room could not created                |-              |
      |102608      |  DELUXE    |  Full        |        | Room could not created                |-              |
      |102605      |  DELUXE    |  Full        |        | Room could not created                |+              |
      |102606      |  DELUXE    |  Available   |        | Room could not created                |+              |

      |            |  PREMIUM_DELUXE      |  Available   |        | Room could not created      |+              |
      |            |  PREMIUM_DELUXE      |  Available   |  50    | Room could not created      |+              |
      |103607      |  PREMIUM_DELUXE      |  Available   |        | Room could not created      |-              |
      |103608      |  PREMIUM_DELUXE      |  Full        |        | Room could not created      |-              |
      |103605      |  PREMIUM_DELUXE      |  Full        |        | Room could not created      |+              |
      |103606      |  PREMIUM_DELUXE      |  Available   |        | Room could not created      |+              |

      |            |  SUITE    |  Available   |        | Room could not created                 |+              |
      |            |  SUITE    |  Available   |  50    | Room could not created                 |+              |
      |104607      |  SUITE    |  Available   |        | Room could not created                 |-              |
      |104608      |  SUITE    |  Full        |        | Room could not created                 |-              |
      |104605      |  SUITE    |  Full        |        | Room could not created                 |+              |
      |104606      |  SUITE    |  Available   |        | Room could not created                 |+              |

      |            |  DAYCARE  |  Available   |        | Room could not created                 |+              |
      |            |  DAYCARE  |  Available   |  50    | Room could not created                 |+              |
      |105607      |  DAYCARE  |  Available   |        | Room could not created                 |-              |
      |105608      |  DAYCARE  |  Full        |        | Room could not created                 |-              |
      |105605      |  DAYCARE  |  Full        |        | Room could not created                 |+              |
      |105606      |  DAYCARE  |  Available   |        | Room could not created                 |+              |
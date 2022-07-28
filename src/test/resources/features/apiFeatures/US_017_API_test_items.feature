@Api
@US017_Api
Feature:
  Scenario:
    Given admin provides expected test items
    And admin sends get request for test items
    Then Status code should be 200
    When admin deserializes test items data
    And admin verifies new created test item by api

#  Scenario:
#    Given admin provides post body
#    And admin send post request
#    Then Status code should be 201
#    When admin deserializes new created data
#    And admin verifies new created test item data
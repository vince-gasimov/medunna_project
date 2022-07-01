@myInpatientsUpdate
Feature:Doctor_Updates_inPatients_info

  Background:
    Given doctor goes to Medunna Url
    When  doctor clicks on the human icon in the upper right corner
    Then  doctor clicks on Sign In
    And    doctor enters a valid username
    And    doctor enters a valid password
    And   doctor clicks the Sign In button
    And   doctor clicks on MY PAGES
    And   doctor clicks on My Inpatients
    Then  doctor clicks the Edit button

  Scenario: TC_010_description_update
    When doctor writes a new description
    And  doctor clicks Save button
    Then doctor verifies the Description is updated successfully

  Scenario: TC_011_created_date_update_with_old date
    When doctor selects an old date from Created Date box
    And  doctor clicks Save button
    Then doctor verifies the Created Date is updated successfully

  Scenario: TC_012_created_date_update_with_today
    When doctor selects today from Created Date box
    And  doctor clicks Save button
    Then doctor verifies the Created Date is updated successfully

  Scenario: TC_013_created_date_update_with_later_date
    When doctor selects a later date from Created Date box
    And  doctor clicks Save button
    Then doctor verifies the Created Date is updated successfully

  Scenario: TC_014_status_update_as_unapproved
    When doctor selects UNAPPROVED as Status from dropdown
    And  doctor clicks Save button
    Then doctor verifies the Status is updated successfully

  Scenario: TC_015_status_update_as_staying
    When doctor selects STAYING as Status from dropdown
    And  doctor clicks Save button
    Then doctor verifies the Status is updated successfully

  Scenario: TC_016_status_update_as_discharged
    When doctor selects DISCHARGED as Status from dropdown
    And  doctor clicks Save button
    Then doctor verifies the Status is updated successfully

  Scenario: TC_017_status_update_as_cancelled
    When doctor selects CANCELLED as Status from dropdown
    And  doctor clicks Save button
    Then doctor verifies the Status is updated successfully

  Scenario: TC_018_room_update
    When doctor selects a different room from dropdown
    And  doctor clicks Save button
    Then doctor verifies the Room is updated successfully

  Scenario: TC_019_room_update_not
    When doctor selects an unavailable room from dropdown
    And  doctor clicks Save button
    Then doctor verifies the Room is not updated successfully


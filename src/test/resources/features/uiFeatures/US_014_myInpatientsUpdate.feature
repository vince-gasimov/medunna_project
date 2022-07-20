@myInpatientsUpdate
Feature:Doctor_Updates_inPatients_info

  Background:
    Given doctor goes to Medunna Url
    When  doctor clicks on the human icon in the upper right corner
    Then  doctor clicks on Sign In
    And   doctor enters a valid username
    And   doctor enters a valid password
    And   doctor clicks the Sign In button
    And   doctor clicks on MY PAGES
    And   doctor clicks on My Inpatients

  Scenario:TC_011_verify_Unapproved_inpatients'_description_can_be_changed
    Given doctor finds the first UNAPPROVED inpatient and clicks edit button
    When doctor deletes description box and writes a new description for the inpatient
    Then doctor clicks save button
    Then doctor verifies Unapproved inpatients' description can be changed
    And doctor closes the browser

  Scenario: TC_012_verify_Unapproved_Inpatients'_created _date_can_not_be_changed_to_an_earlier_date
    Given doctor finds the first UNAPPROVED inpatient and clicks edit button
    Then doctor changes the created date box to an earlier date
    Then doctor clicks save button
    Then doctor verifies Unapproved inpatients' created date can not be changed to an earlier date
    And doctor closes the browser

  Scenario: TC_013_verify_Unapproved_Inpatients'_created _date_can_not_be_changed_to_a_future_date
    Given doctor finds the first UNAPPROVED inpatient and clicks edit button
    Then doctor changes the created date box to a future date
    Then doctor clicks save button
    Then doctor verifies Unapproved inpatients' created date can not be changed to a future date
    And doctor closes the browser

  Scenario: TC_014_verify_Unapproved_Inpatients'_room_can_not_be_updated_even_if_it_is_available
    Given doctor finds the first UNAPPROVED inpatient and clicks edit button
    When doctor chooses an available room for the inpatient
    Then doctor clicks save button
    Then doctor verifies Unapproved inpatients' room can not be updated even if it is available
    And doctor closes the browser

  Scenario: TC_015_verify_Unapproved_Inpatients'_room_can_not_be_updated_with_an_unavailable_room
    Given doctor finds the first UNAPPROVED inpatient and clicks edit button
    When doctor chooses an unavailable room for the inpatient
    Then doctor clicks save button
    Then doctor verifies Unapproved inpatients' room can not be updated with an unavailable room
    And doctor closes the browser

  Scenario: TC_016_verify-Unapproved_Inpatients'_status_can_not_be_changed_to_Discharged
    Given doctor finds the first UNAPPROVED inpatient and clicks edit button
    When doctor changes the status of the inpatient as Discharged
    Then doctor clicks save button
    Then doctor verifies Unapproved inpatients' status can not be changed to Discharged
    And doctor closes the browser

  Scenario: TC_017_verify-Unapproved_Inpatients'_status_can_be_changed_to_Cancelled
    Given doctor finds the first UNAPPROVED inpatient and clicks edit button
    When doctor changes the status of the inpatient as Cancelled
    Then doctor clicks save button
    Then doctor verifies Unapproved inpatients' status can be changed to Cancelled
    And doctor closes the browser

  Scenario: TC_018_verify-Unapproved_Inpatients'_status_can_not_be_changed_to_Staying_without_choosing_any_room
     Given doctor finds the first UNAPPROVED inpatient and clicks edit button
     When doctor changes the status of the Unapproved inpatient as Staying without choosing any room
     Then doctor clicks save button
     Then doctor verifies Unapproved inpatients' status can not be changed to Staying without choosing any room
     And doctor closes the browser

#  I DO NOT RUN IT BECAUSE WHEN IT IS RUNNED ONCE THEN PATIENT CAN NOT BE USED AGAIN
#  Scenario: TC_019_verify-Unapproved_Inpatients'_status_can_be_changed_to_Staying_with_choosing_an_available_room
#     Given doctor finds the first UNAPPROVED inpatient and clicks edit button
#     When doctor changes the status of the inpatient as Staying
#     Then doctor chooses an available room for the inpatient
#     Then doctor clicks save button
#     Then doctor verifies Unapproved inpatients' status can be changed to Staying with choosing an available room
#     And doctor closes the application
#     And doctor closes the browser

  Scenario: TC_020_verify-Unapproved_Inpatients'_status_can_not_be_changed_to_Staying_with_choosing_an_unavailable_room
    Given doctor finds the first UNAPPROVED inpatient and clicks edit button
    When doctor changes the status of the inpatient as Staying
    Then doctor chooses an unavailable room for the inpatient
    Then doctor clicks save button
    Then doctor verifies Unapproved inpatients' status can not be changed to Staying with choosing an unavailable room
    And doctor closes the browser

  Scenario: TC_021_verify_Staying_inpatients'_description_can_be_changed
    Given doctor finds the first STAYING inpatient and clicks edit button
    When doctor deletes description box and writes a new description for the inpatient
    Then doctor clicks save button
    Then doctor verifies Staying inpatients' description can be changed
    And doctor closes the browser

  Scenario: TC_022_verify_Staying_Inpatients'_created _date_can_not_be_changed_to_an_earlier_date
   Given doctor finds the first STAYING inpatient and clicks edit button
   Then doctor changes the created date box to an earlier date
   Then doctor clicks save button
   Then doctor verifies Staying inpatients' created date can not be changed to an earlier date
   And doctor closes the browser

  Scenario: TC_023_verify_Staying_Inpatients'_created _date_can_not_be_changed_to_a_future_date
    Given doctor finds the first STAYING inpatient and clicks edit button
    Then doctor changes the created date box to a future date
    Then doctor clicks save button
    Then doctor verifies Staying inpatients' created date can not be changed to a future date
    And doctor closes the browser

#  I COULD NOT FIND HOW TO ASSERT IT
#  Scenario: TC_024_verify_Staying_Inpatients'_room_can_be_updated_when_it_is_available
#      Given doctor finds the first STAYING inpatient and clicks edit button
#      When doctor chooses an available room for the inpatient
#      Then doctor clicks save button
#      Then doctor verifies Staying inpatients' room can be updated when it is available
#      And doctor closes the application
#      And doctor closes the browser

  Scenario: TC_025_verify_Staying_Inpatients'_room_can_not_be_updated_with_an_unavailable_room
    Given doctor finds the first STAYING inpatient and clicks edit button
    When doctor chooses an unavailable room for the inpatient
    Then doctor clicks save button
    Then doctor verifies Staying inpatients' room can not be updated with an unavailable room
    And doctor closes the browser

  Scenario: TC_026_verify-Staying_Inpatients'_status_can_not_be_changed_to_Unapproved
    Given doctor finds the first STAYING inpatient and clicks edit button
    When doctor changes the status of the inpatient as Unapproved
    Then doctor clicks save button
    Then doctor verifies Staying inpatients' status can not be changed to Unapproved
    And doctor closes the browser

  Scenario: TC_027_verify-Staying_Inpatients'_status_can_not_be_changed_to_Cancelled
    Given doctor finds the first STAYING inpatient and clicks edit button
    When doctor changes the status of the inpatient as Cancelled
    Then doctor clicks save button
    Then doctor verifies Staying inpatients' status can not be changed to Cancelled
    And doctor closes the browser

##  I DO NOT RUN IT BECAUSE WHEN IT IS RUNNED ONCE THE PATIENT DIES
#  Scenario: TC_028_verify-Staying_Inpatients'_status_can_be_changed_to_Discharged
#    Given doctor finds the first STAYING inpatient and clicks edit button
#    When doctor changes the status of the inpatient as Discharged
#    Then doctor clicks save button
#    Then doctor verifies Staying inpatients' status can be changed to Discharged
#    And doctor closes the application
#    And doctor closes the browser

  Scenario: TC_029_verify_Discharged_inpatients'_description_can_not_be_changed
    Given doctor finds the first DISCHARGED inpatient and clicks edit button
    When doctor deletes description box and writes a new description for the inpatient
    Then doctor clicks save button
    Then doctor verifies Discharged inpatients' description can not be changed
    And doctor closes the browser

  Scenario: TC_030_verify_Discharged_Inpatients'_created _date_can_not_be_changed_to_an_earlier_date
    Given doctor finds the first DISCHARGED inpatient and clicks edit button
    Then doctor changes the created date box to an earlier date
    Then doctor clicks save button
    Then doctor verifies Discharged inpatients' created date can not be changed to an earlier date
    And doctor closes the browser

  Scenario: TC_031_verify_Discharged_Inpatients'_created _date_can_not_be_changed_to_a_future_date
     Given doctor finds the first DISCHARGED inpatient and clicks edit button
     Then doctor changes the created date box to a future date
     Then doctor clicks save button
     Then doctor verifies Discharged inpatients' created date can not be changed to a future date
     And doctor closes the browser

  Scenario: TC_032_verify_Discharged_Inpatients'_room_can_not_be_updated_even_if_it_is_available
    Given doctor finds the first DISCHARGED inpatient and clicks edit button
    When doctor chooses an available room for the inpatient
    Then doctor clicks save button
    Then doctor verifies Discharged inpatients' room can not be updated even if it is available
    And doctor closes the browser

  Scenario: TC_033_verify_Discharged_Inpatients'_room_can_not_be_updated_with_an_unavailable_room
    Given doctor finds the first DISCHARGED inpatient and clicks edit button
    When doctor chooses an unavailable room for the inpatient
    Then doctor clicks save button
    Then doctor verifies Discharged inpatients' room can not be updated with an unavailable room
    And doctor closes the browser

  Scenario: TC_034_verify-Discharged_Inpatients'_status_can_not_be_changed_to_Unapproved
    Given doctor finds the first DISCHARGED inpatient and clicks edit button
    When doctor changes the status of the inpatient as Unapproved
    Then doctor clicks save button
    Then doctor verifies Discharged inpatients' status can not be changed to Unapproved
    And doctor closes the browser

  Scenario: TC_035_verify-Discharged_Inpatients'_status_can_not_be_changed_to_Cancelled
    Given doctor finds the first DISCHARGED inpatient and clicks edit button
    When doctor changes the status of the inpatient as Cancelled
    Then doctor clicks save button
    Then doctor verifies Discharged inpatients' status can not be changed to Cancelled
    And doctor closes the browser

  Scenario: TC_036_verify-Discharged_Inpatients'_status_can_not_be_changed_to_Staying
    Given doctor finds the first DISCHARGED inpatient and clicks edit button
    When doctor changes the status of the inpatient as Staying
    Then doctor clicks save button
    Then doctor verifies Discharged inpatients' status can not be changed to Staying
    And doctor closes the browser

  Scenario: TC_037_verify_Cancelled_inpatients'_description_can_not_be_changed
    Given doctor finds the first CANCELLED inpatient and clicks edit button
    When doctor deletes description box and writes a new description for the inpatient
    Then doctor clicks save button
    Then doctor verifies Cancelled inpatients' description can not be changed
    And doctor closes the browser

  Scenario: TC_038_verify_Cancelled_Inpatients'_created _date_can_not_be_changed_to_an_earlier_date
    Given doctor finds the first CANCELLED inpatient and clicks edit button
    Then doctor changes the created date box to an earlier date
    Then doctor clicks save button
    Then doctor verifies Cancelled inpatients' created date can not be changed to an earlier date
    And doctor closes the browser

  Scenario: TC_039_verify_Cancelled_Inpatients'_created _date_can_not_be_changed_to_a_future_date
    Given doctor finds the first CANCELLED inpatient and clicks edit button
    Then doctor changes the created date box to a future date
    Then doctor clicks save button
    Then doctor verifies Cancelled inpatients' created date can not be changed to a future date
    And doctor closes the browser

  Scenario: TC_040_verify_Cancelled_Inpatients'_room_can_not_be_updated_even_if_it_is_available
     Given doctor finds the first CANCELLED inpatient and clicks edit button
     When doctor chooses an available room for the inpatient
     Then doctor clicks save button
     Then doctor verifies Cancelled inpatients' room can not be updated even if it is available
     And doctor closes the browser

  Scenario: TC_041_verify_Cancelled_Inpatients'_room_can_not_be_updated_with_an_unavailable_room
    Given doctor finds the first CANCELLED inpatient and clicks edit button
    When doctor chooses an unavailable room for the inpatient
    Then doctor clicks save button
    Then doctor verifies Cancelled inpatients' room can not be updated with an unavailable room
    And doctor closes the browser

  Scenario: TC_041_verify-Cancelled_Inpatients'_status_can_not_be_changed_to_Unapproved
    Given doctor finds the first CANCELLED inpatient and clicks edit button
    When doctor changes the status of the inpatient as Unapproved
    Then doctor clicks save button
    Then doctor verifies Cancelled inpatients' status can not be changed to Unapproved
    And doctor closes the browser

  Scenario: TC_043_verify-Cancelled_Inpatients'_status_can_not_be_changed_to_Staying
    Given doctor finds the first CANCELLED inpatient and clicks edit button
    When doctor changes the status of the inpatient as Staying
    Then doctor clicks save button
    Then doctor verifies Cancelled inpatients' status can not be changed to Staying
    And doctor closes the browser

  Scenario: TC_044_verify_Cancelled_Inpatients'_status_can_not_be_changed_to_Discharge
    Given doctor finds the first CANCELLED inpatient and clicks edit button
    When doctor changes the status of the inpatient as Discharged
    Then doctor clicks save button
    Then doctor verifies Cancelled inpatients' status can not be changed to Discharged
    And doctor closes the browser






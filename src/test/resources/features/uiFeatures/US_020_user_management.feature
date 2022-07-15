@US_020

Feature: user_registration

  Scenario: TC_01_seeing_a_new_user_info
    Given Admin20 navigates to medunna login page
    Then Admin20 signs in
    And Admin20 clicks on Administrations then clicks on User Management
    And Admin20 clicks on View button
    And Admin20 verifies user's information on the page
    Then Admin20 closes the application

  Scenario: TC_02_giving_role_to_a_new_user
    Given Admin20 navigates to medunna login page
    Then Admin20 signs in
    And Admin20 clicks on Administrations then clicks on User Management
    And Admin20 clicks on Edit button
    And Admin20 assigns role to the user
    And Admin20 clicks on Save button
    And Admin20 closes the application

  Scenario: TC_03_activating_a_user
    Given Admin20 navigates to medunna login page
    Then Admin20 signs in
    And Admin20 clicks on Administrations then clicks on User Management
    And Admin20 clicks on Edit button
    And Admin20 activates user's status
    Then Admin20 closes the application

    @delete_user
  Scenario: TC_04_deleting_a_user
    Given user is on the registration page
    Given user enters a valid SSN number as "ssn"
    And user enters a valid first name as "firstname"
    And user enters a valid last name as "lastname"
    And user enters an username as "username"
    And user enters a valid email address as "email"
    And user enters a new password as "password" and confirm password as "password"
    And user clicks on the register button
    Then user should see the registration success message
    Then close the browser
    Given Admin20 navigates to medunna login page
    Then Admin20 signs in
    And Admin20 clicks on Administrations then clicks on User Management
    And Admin20 deletes the user
    Then Admin20 closes the application






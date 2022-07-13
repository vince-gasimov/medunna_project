Feature: Any_user_can_use_contact_portal
  Background:
    Given user goes to Medunna Url
    When user clicks Contact


    Scenario: TC_001_verify_any_user_can_reach_contact_portal
       Then verify any user can reach contact portal
       And user closes the browser


    Scenario: TC_002_verify_any_user_can_send_a_request_with_valid_credentials
      When user enters valid name, email and subject
      Then user clicks Send button
      And verify any user can use contact portal with valid credentials
      Then user closes the browser

      Scenario:TC_003_verify_user_can_not_send_a_request_without_name_is_written
        When user enters va




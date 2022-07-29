@US028
@US028_UI
Feature: US028_country_creation_update_read_delete

  Background: admin_navigates_to_items&titles
    Given user navigates to url US002
    When user  clicks  to icon on top right corner US002
    And user clicks to Sign in button US028
    Then user verifies sign in pop up US028
    When admin enters admin credentials and signs in US028
    And admin clicks on Items&Titles button US028

  @country_creation
  Scenario: TC01_create_country_UI
    And admin clicks on Country US028
    Then admin verifies landed on Countries page US028
    When admin clicks on Create a new Country button US028
    And admin enters Country name US028
    And admin clicks on Save button on country page US028
    Then admin verifies A new Country is created with new id number message US028
    And admin verifies new created country is showing up in the country list US028
    And admin saves new created country and id US028
    And user closes the browser US002

  @state_creation
  Scenario: TC02_create_state_UI
    And admin clicks on StateCity US028
    And admin clicks on Create a new StateCity button US028
    Then admin verifies landed on Create or edit a StateCity page US028
    When admin selects new created country from dropdown US028
    When admin enters related state based on country US028
    And admin clicks on Save button on state page US028
    Then admin verifies A new StateCity is created message US028
    And user closes the browser US002

  @country_deletion
  Scenario: TC03_delete_country
    And admin clicks on Country US028
    Then admin verifies landed on Countries page US028
    When admin clicks on Create a new Country button US028
    And admin enters Country name US028
    And admin clicks on Save button on country page US028
    Then admin verifies A new Country is created with new id number message US028
    When admin finds the new created country and clicks on Delete button US028
    Then admin verifies the warning message US028
    When admin clicks on pop up on Delete button US028
    Then admin verifies Country is deleted successfully message US028
    And admin verifies deleted country is not showing up on the country list US028
    And user closes the browser US002

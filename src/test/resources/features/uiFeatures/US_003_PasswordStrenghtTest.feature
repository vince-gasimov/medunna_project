password_strength
Feature: Registration_page_should_restrict_password
  Background:
    Given User navigates to "https://www.medunna.com/"
    When User clicks on SignIn button  on the right top
    Then User clicks on Register in dropdown list

    Scenario Outline: TC_001 User enters four characters passwords
      And User enters four chars password "<password>"


      Examples:
        | password |
        | wert     |
        | WERT     |
        | 4321     |
        | @#€$     |
        | Ab1$     |
@password_strength
Feature: Registration_page_should_restrict_password

  Background:
    Given user navigates to url US002
    When user  clicks  to icon on top right corner US002
    And user clicks on Register button US002

  @smoke
  @US_003_TC_001
  Scenario Outline:TC_001 User enters four charts passwords
    Then User enters a four characters random "<password>"
    Then User verifies password  chart color is filled first level bar with red color
    Examples:
      | password |
      | wert     |
      | WERT     |
      | 4321     |
      | @#€$     |
      | Ab1$     |
  @US_003_TC_002
  Scenario Outline: TC_002 User enters seven chars combination passwords and verifies the password strength
    Then User enters seven characters "<password>" with a combination by using two of a digit, special char, upper and  lowers letter
    Then User verifies password  chart color is filled first two level bars
    Examples:Test Data
      | password |
      | abcABCD  |
      | 1234abc  |
      | 1234$&%  |
      | abcd123  |
      | ABCD$&*  |
  @US_003_TC_003
  Scenario Outline: TC_003 User enters seven chars password in three combinations
    Then User enters seven characters "<password>" with a combination by using three of a digit, special char, upper and  lowers letter
    Then User verifies password  chart color is filled first three level bars
    Examples: Test Data
      | password |
      | ABcd123  |
      | CD123AB  |
      | 123ab@#  |

  @US_003_TC_004
  Scenario Outline: TC_004 User enters seven chars password in all combinations
    Then User enters seven characters "<password>" with a combination by using all of a digit, special char, upper and lowers letter
    Then User verifies password  chart color is filled first four level bars
    Then User verifies password chart's fifth bar is still gray
    Examples: Test Data
      | password |
      | ABcd123  |
      | #2ABabc  |
      | 2AB#abc  |

  @US_003_TC_005
  Scenario Outline: TC_005 User enters more than seven chars password in all combinations
    Then User enters more than seven characters "<password>" with a combination by using all of a digit, special char, upper and lowers letter
    Then User verifies password  chart color is filled all the level bars
    Examples: Test Data
      | password  |
      | ABcd123@. |
      | @2ABabc., |
      | 12ab*AB#@ |

  @US_003_TC_006
  Scenario Outline:TC_006 the password should be at least 4 characters long
    When user enters a "<password>" that is less than four chars long
    Then user should see a message that password should be at least four characters long
    Examples: Test Data
      | password |
      | AB       |
      | @2A      |
      | 12a      |
  @US_003_TC_007
  Scenario Outline: Password should be max 50 characters long
    When user enters a assorted "<password>" that is fifty characters long
    Then User asserts that password should be max 50 characters long
    Examples: Test Data
      | password                                           |
      | ajdjgjffk12345?ertwert4rrrrrrrrrrrrrrrrrrrrrrrrrrr |
      | ;sdf;sdlk'asldkf'sld;k121212390183/.//.@#$@#$      |



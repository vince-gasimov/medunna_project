@password_strength
Feature: Registration_page_should_restrict_password

  Background:
#    Given user goes to Medunna Url
#    Then user clicks on the register button
    Given userE goes to medunna
    Then userE clicks on register button

    @tag123
    Scenario: Password should be at least 4 characters long
        When user enters a password that is not strong enough
        Then user should see a message that password should be at least 4 characters long



  Scenario Outline:TC_001 User enters four charts passwords
    Then User enters a four characters random "<password>"
    Then User verifies password  chart color is filled "1"  level bar
    Examples:
      | password |
      | abcd     |
      | ABCD     |
      | 1234     |
      | %$#@     |
      | Ab1&     |

  Scenario Outline: TC_002 User enters seven chars combination passwords and verifies the password strength
    Then User enters seven characters "<password>" with a combination by using two of a digit, special char, upper and  lowers letter
    Then User verifies password  chart color is filled "2"  level bar
    Examples:Test Data
      | password |
      | abcABCD  |
      | 1234abc  |
      | 1234$&%  |
      | abcd123  |
      | ABCD$&*  |

  Scenario Outline: TC_003 User enters seven chars password in three combinations
    Then User enters seven characters "<password>" with a combination by using three of a digit, special char, upper and  lowers letter
    Then User verifies password  chart color is filled "3"  level bar
    Examples: Test Data
      | password |
      | ABcd123  |
      | *&123AB  |
      | 123ab@#  |

  Scenario Outline: TC_004 User enters seven chars password in four combinations
    Then User enters seven characters "<password>" with a combination by using all the different type of chars
    Then User verifies password  chart color is filled "4"  level bar
    Examples: Test Data
      | password |
      | ABcd12$  |
      | *12acAB  |
      | 12ab*AB  |


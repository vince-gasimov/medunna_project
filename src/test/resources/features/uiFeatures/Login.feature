Feature: test login page




  @Login
  Scenario Outline: test login users
    Given user sends the username as "<username>"
    And user provides the password as "<password>"
    Then user signs in  and valiates
    Examples: test data
    |username|password|
    |Team83-11-Doctor|Team83-11-Doctor|
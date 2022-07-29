@loginTest @EndToEnd
Feature: test item functionality

  @UI_login_positive1

#    And admin clicks sign in button at the home page and navigates to sign in page


#    Examples: credentials
#      |username |password |
#      |admin79  | admin   |
#
#  @UI_login_positive2
#  Scenario Outline: Verifying admin itemsTitles
  Scenario Outline: Verifying admin login with correct username and password

    Given Admin navigates to the home page
    Then Admin verifies that sign in page header is visible
    And Admin enters username "<username>" and password "<password>"
    And Admin clicks sign in button
    And Admin verifies that sign in is successful

    Then Admin clicks on the ItemTitles dropdown
    And Admin clicks on the testItem dropdown
    And Admin clicks on the createNewTestItem dropdown
    And Admin provides a test name "<testName>"
    Then Admin enters a description "<descriptionNote>"
    And Admin enters a price "<currentPrice>"
    And Admin enter a min value "<minValue>"
    And Admin enters a max value "<maxValue>"

    Then Admin clicks on save button
    And Admin verifies that saving is successful
    And Admin clicks last arrow button
    And Admin clicks last itemNumber
#    And Admin clicks delete button
#    And Admin clicks confirmDelete button
#    Then Admin verifies itemDeleteMessage
    And Admin clicks on login dropdown icon
    Then Admin clicks on sign out


    Examples: credentials
      |username |password |testName |descriptionNote |currentPrice|minValue|maxValue |
      |admin79  |admin|dihanlin  |     mg/ml      |   120     | 80  |   130   |
@appointmentsList
Feature: appointments_List

  Background: doctor is on the home page
    Given doctor navigates to medunna.com
    And doctor clicks on the user icon button
    And doctor clicks on the Sign in button

  @smoke
@US_010_TC001
  Scenario: TC_001_user_in_Appointments_List

    And doctor writes a valid username
    And doctor writes a valid password
    And doctor clicks on Sign in button
    And doctor clicks on My Pages button
    And doctor clicks on Appointments button
    And doctor selects Appointments startDate, endDate and status

























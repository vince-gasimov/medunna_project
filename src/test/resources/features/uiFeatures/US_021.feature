@US_021
  Feature: testing_of_some_capability_of_a_staff

    @US_021_Scenario_1
      Scenario: testing_of_updating_appointment_page

        Given Staff goes to Medunna URL
        Then Staff clicks on the icon on the top right corner
        Then Staff clicks signs in button
        Then Staff enters username
        Then Staff enters password
        Then Staff clicks on the sign in button on the right bottom
        Then Staff clicks on the MY PAGES button
        Then Staff clicks Search Patient button
        Then Staff enters SSN in the Patient SSN: box
        Then Staff clicks Show Appointments button
        Then Staff clicks Edit button
        Then Staff updates appointment
      # Arada sayfayi asagi cekmesi gerek
        Then Staff clicks Save button
        Then Staff shows The appointment is updated with identifier popup
        Then Staff close the browser


    @US_021_Scenario_2
      Scenario: testing_of_status_box
        Given Staff goes to Medunna URL
        Then Staff clicks on the icon on the top right corner
        Then Staff clicks signs in button
        Then Staff enters username
        Then Staff enters password
        Then Staff clicks on the sign in button on the right bottom
        Then Staff clicks on the MY PAGES button
        Then Staff clicks Search Patient button
        Then Staff enters SSN in the Patient SSN: box
        Then staff clicks Status box
        Then staff may change "<status>"
        Then staff cannot change Status as COMPLETED
        Then Staff clicks Save button
        Then Staff close the browser
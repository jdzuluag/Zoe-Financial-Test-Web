#Autor: Jose Daniel el bobo hpta Zuluaga Castaño


  Feature: As a user I want to reschedule the appointment

    Scenario: Reschedule
      Given The user open url application
      When The user selects the new date 30
      And The user selects the new time for the meeting 2200
      And The user selects the type of the meeting Video Conference
      And The user confirms the meeting
      Then The user should see the message of successfully rescheduled
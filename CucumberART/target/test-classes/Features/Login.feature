Feature: Test the Login screen of Google
@smoke
  Scenario: Navigate to a browser
    Given The browser is Open
    When The URL is launch
    And User enter the Testdata in the search field and hit enter
    Then Search result should be listed Vishnu
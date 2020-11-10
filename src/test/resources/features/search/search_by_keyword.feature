@deviget
Feature: Search by keyword on aliexpress

  Scenario: line: Searching for the second item going from the home page
    Given The user is on the aliexpress homepage
    When he search for an item 'iphone' and go to the second page of the results and clicks on the option number '2'
    Then there are items for buy
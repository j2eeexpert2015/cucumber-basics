Feature: Sum of two numbers

  Scenario: Add two numbers correctly
    Given I have two numbers 3 and 5
    When I add the numbers
    Then the result should be 8

  Scenario: Add two numbers incorrectly
    Given I have two numbers 3 and 5
    When I add the numbers
    Then the result should be 9

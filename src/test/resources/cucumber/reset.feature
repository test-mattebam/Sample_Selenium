Feature: User reset
   Scenario: User registration details
    Given User Registration application
    When user enters Name as "vasudha" and age as 28 and salary 100
    Then the result should be empty fields
    
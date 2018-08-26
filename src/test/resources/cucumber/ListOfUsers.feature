Feature: List of users
   Scenario: User registration details
    Given User Registration application
    When user enters Name as "vasudha" and age as 28 and salary 1000
    When user enters Name as "nagaraju" and age as 38 and salary 10000
     When user enters Name as "bhavagna" and age as 3 and salary 100
    Then user count should be 3
    Then delete all inserted users
    
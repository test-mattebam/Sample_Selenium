Feature: User Registration

  Scenario: User registration details
    Given User Registration application
    When user enters Name as "nagaraju" and age as 38 and salary 100
    Then the result should be "User created successfully"
    Then Delete user
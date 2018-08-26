Feature: User update

  Scenario: User registration details
    Given User Registration application
    When user enters Name as "vasudha" and age as 28 and salary 100
    Then the result should be "User created successfully"
    
   
  Scenario: update user registration
    When user clicks edit button
    Then user enters Name as "bhavagna" and age as 3 and salary 100
    Then the result should be "User updated successfully"
    Then Delete user
    
    
    
    Scenario: User registration details
    Given User Registration application
    When user enters Name as "vasudha" and age as 28 and salary 100
    Then the result should be "User created successfully"
    
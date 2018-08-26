Feature: Facebook Home
Scenario Outline: Clicking Login
    Given Facebook details
    When user enters emailId as "<emailId>" and password as "<password>"
    Then the result should be "<Result>"
  
    Examples:
    
    |emailId                   |password  |Result  |
    |vasudhamattebam@gmail.com |Whoami@123|f       |
    
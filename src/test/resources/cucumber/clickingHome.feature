Feature: facebook Home
Scenario Outline: Login to Facebook
    Given facebook registration details
    When user enters email as "<EmailId>" and password as "<Password>"
    Then result should be "<Result>"
    
    Examples:
    | EmailId                    | Password  |  Result   |
    | vasudhamattebam@gmail.com  | Whoami@123 | Home  |
    
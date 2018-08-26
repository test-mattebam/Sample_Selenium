Feature: Guru99 Home
Scenario Outline: Clicking Guru99
    Given Guru99 details
    When user clicks Link as "<Link>" 
    Then the result should be "<Result>"
  
    Examples:
    
    |Link    |Result|
    |testing |Free Selenium Tutorials|
    
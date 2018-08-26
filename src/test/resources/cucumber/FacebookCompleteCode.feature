Feature: facebook Home
Scenario Outline: Login to Facebook
    Given facebook registration details
    When user enters Firstname as "<FirstName>" and Surname as "<Surname>" and email1 as "<EmailId>" and Email2 as "<EmailId2>" and Password as "<Password>" and day as <day> and month as <month> and year as <year>
    Then the result should be "<Result>"
  
  
   Examples:
   |FirstName | Surname  | EmailId                |EmailId2              |Password  |day|month|year|Result|
   |vasudha   | mattebam |  vasudha.m@gmail.co.uk |vasudha.m@gmail.co.uk |Whoami@123|11 |7 |1990| Facebook|
   
   
   
   
   
   
   
   
   
   
  
    
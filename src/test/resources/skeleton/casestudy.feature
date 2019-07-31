
    Feature: Login

In order to login in TestMe App
As a user
I need to register first

Business rules:
 - Ony registered users can login
 - password should be masked
 
Questions:
 - Can guest user purchasee a product
 
Background:
Given user is on the TestMeApp
 @bittu
 Scenario: user can do the successful registration
 
 
 

 When  user clicks on signup button
 And   user enters the username as "sans05"
 And   user enters the firstname "sanskriti"
 And   user enters the lastname  "jha"
 And   user enters the password "sansu0510"
 And   user enters the confirmpassword "sansu0510"
 And   user enters the gender "Female"
 And   user enters the email "sanskriti05jha@yahoo.com"
 And   user enters the mobileno "8210797041"
 And   user enters the dateofbirth "05/10/1996"
 And   user enters the address "shivpuri patna"
 And   user enters the securityquestion 3
 And   user enters the answer "patna"
 Then  user click on register button
 
 
@gullu
Scenario Outline: user can do the successful login 
When user clicks on signin button
When user enteres  username as "<username>"
And user enters  password as "<password>"
Then user has done successful login
Examples:
|username|password |
|Lalitha |Password123|
 

Feature: Login

In order to login in TestMe App
As a user
I need to register first

Business rules:
 - Ony registered users can login
 - password should be masked
 
Questions:
 - Can guest user purchasee a product
 
 
@data_outline
Scenario Outline: user can do the successful login with different data
Given user is on testmeapp login  page
When user enteres correct username as "<username>"
And user enters correct password as "<password>"
Then user can do successful login
Examples:
|username|password |
|admin   |Password456|
|Lalitha |Password123|
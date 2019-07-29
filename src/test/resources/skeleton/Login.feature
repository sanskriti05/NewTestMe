
Feature: Login

In order to login in TestMe App
As a user
I need to register first

Business rules:
 - Ony registered users can login
 - password should be masked
 
Questions:
 - Can guest user purchasee a product
 
 
 Scenario: user can do the successful login
 Given Larry is on the login page
 When  Larry provides the correct credentials
 Then Larry rendered to TestMeApp home page


@san
 Scenario: The one where the user change some of the data and place the order
 When Larry increase the headphone quantity by 2
 And  continue for checkout
 And  change the shipping address to a new address as "Pune"
 Then the product should be delivered to the new address
 
@datatable
Scenario: the one where user search multiple products
When user search the below producs:
|Headphone|
|Laptop|
|Travel|
Then products should be added to cart if available



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


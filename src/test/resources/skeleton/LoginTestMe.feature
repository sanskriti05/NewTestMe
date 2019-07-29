
Feature: Login

In order to login to TestMeApp
As a user
I need to register

Business Rules:
-Only registered user can login
-password should be masked

Questions:
-Can guest user purchase a product

Scenario: The one where user can do successful login
Given Larry is on login page
When  Larry enters correct credentials
Then  Larry is on the home page 

@data-driven
Scenario: the one where the user change some of the data and place order
When Larry increases the headphone quantity by 2
And continue for checkout
And change the shipping address to a new address as "pune"
Then the product should be delivered to the new address
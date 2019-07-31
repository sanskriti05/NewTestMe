
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
 
 @tag1
 Scenario: user cannot add product to the cart without signIn
 When  user search for the product
 And   user clicks on add to cart
 Then user is directed to signin page
 
 @tag2
 Scenario: user search for item by typing one alphabet at a time
 When user signIn the app
 And  user searches product by one alphabet at a time
 Then user gets suggestions from app
 
 
 @tag3
 Scenario: user moves to cart without adding any item in it
  When user signin the app
  And user searches the product and did not add the product in the cart
  Then cart icon is not available
 
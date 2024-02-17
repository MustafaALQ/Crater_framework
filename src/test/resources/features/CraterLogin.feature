#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@smoke
Feature: Crater Login Functionality

Scenario: User enters valid username and password
Given User is in the login page
When user enters valid email and valid password
And user clicks on the Login in button
Then User is logged in successfully 


Scenario Outline: crater invalid login
Given User is in the login page
When user enters invalid "<email>" and "<password>"
And user clicks on the Login in button
Then user should not be logged in
	
	Examples: email/password
	|		  email			  |    password         |
  | omar@gmail.com  |    wrongPassWord    |
  |wrond][[@yoo.com |    aldfkasf34903000 |
  |                 |    asdf890808900===f|
  |                 |                     |


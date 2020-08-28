@temp
Feature: Login feature using datatable

Scenario: Verify Sign Up functionality with already registered email
	Given I am on home page
	When  I click on Sign Up button
	And I enter information from the provided datatable
	|	First Name	|	Last Name	|	Email Address				|	Password	|	Mobile Number	|
	|	Joe	 				|	Doe				|	customer@gmail.com	|	Joe123doe	|	5708995689		|
	|	Jane 				|	Smith			|	customer@gmail.com	|	Joe123doe	|	5708995456		|
	|	Tim					|	Grey			|	customer@gmail.com	|	Joe123doe	|	5708999977		|
	|	Kim					|	Brown			|	customer@gmail.com	|	Joe123doe	|	5708994565		|
	
	Then I should receive a message that contains: Welcome Back

	
	
	
@temp
Feature: Hotel tonight for every occasion 
	As a customer, I want to be able to see Hotel tonight for every occasion section

Scenario: Verify the Hotel tonight for every occasion text 

	Given I am on home page 
	When  I scroll down the page 
	Then verify the text Hotel tonight for every occasion 
	
Scenario: Verify the Martini glass icon and text 

	Given I am on home page 
	When I scroll down the page 
	Then Verify dispayed  glass icon text 
	
	
Scenario: Verify the Clock icon and text 
	Given I am on home page 
	When I scroll down the page 
	Then verify the text Skip the commute. With a same day deal, traffic can wait. 
	
	
Scenario: Verify the Building icon and text 
	Given I am on home page 
	When I scroll down the page 
	Then verify the text Let's have a threeday. Score weekend getaways in cities you love. 
	And close the window 
	
Scenario: Verify the Calendar icon and text 
	Given I am on home page 
	When I scroll down the page 
	Then verify the text Go big on your bucket list. Book in advance. Zero stress. 
	And close the window 
	
	
    
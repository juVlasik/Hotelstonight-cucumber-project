Feature: City buttons features


  Scenario: verify city button with parametrization 
  
    Given I am on home page
    When  I click on "Las Vegas" button
		Then I taken to a new page and where is "Las Vegas"
		

	Scenario Outline: verify city buttons
		Given I am on home page
    When  I click on <city> button
		Then I taken to a new page and where is <city>
	
		Examples: 
		|		city				|
		|		Las Vegas		|
		|		San Diego		|
		|		Los Angeles	|
		|		Boston			|
		|		Denver			|
		|		Destin			|
		|		Honolulu		|
		
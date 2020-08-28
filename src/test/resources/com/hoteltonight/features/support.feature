@temp
Feature: Support feature
  As a customer, I want to be able to find answers in support section


  Scenario: display questions and anwsers
  
    Given I am on home page
    When  I scroll down the page 
    And click on Support 
    Then I am on Support page
    And verify the Support title
    Then verify all questions and answers
    

 
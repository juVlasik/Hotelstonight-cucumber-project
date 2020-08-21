  Feature: Login feature
  As a customer, I want to be able to login using login pop-up

  Scenario: negative login test
  
    Given I am on home page
    When  I click on Sign In button
    And type in random email
    And click on Continue button
    Then verify the message
    And click on Send My Link button
    And verify the message again

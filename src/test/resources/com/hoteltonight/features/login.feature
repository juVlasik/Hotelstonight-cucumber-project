Feature: Login feature
  As a customer, I want to be able to login using login pop-up
  
  Background: 
    Given I am on home page
    When I click on Sign In button
    
#Julia's Sprint 4
  Scenario: negative login test
    And type in random email
    And click on Continue button
    Then verify the message
    And click on Send My Link button
    And verify the message again
    
#Julia's  Sprint 4
  Scenario: negative login test
    And type in random email
    And click on Continue button
    Then verify another message
    Then click on Sign In button again
    Then type password in the input box
    Then click on Sign In button one more time
    And verify the error message

   
    @temp

    

@sprint5

  Scenario Outline: negative login test using multiple credentials using CO
    And enter "<email>" to email field
    And click on Continue button
    And click on Sign In button again
    And type "<password>" in the input box
    Then click on Sign In button one more time
    And verify the "<error message>"

    Examples: 
      | email               | password   | error message              |
      | jdepp01@comcast.net | jdepp01    | Invalid email or password. |
      | bpitt01@hotmail.com | bpitt01    | Invalid email or password. |
      | gclooney@gmail.com  | gclooney01 | Invalid email or password. |

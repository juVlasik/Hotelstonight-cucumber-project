Feature: Hotel Partners
  As a user, I want to be able to sign up as a hotel partner

#Julia's Sprint 5
  Scenario: hotel partner sign up using Custom typa, POJO and Transformer
    Given I am on home page
    When I click on hotel partners link
    And I type in valid email
    Then I can pass info to input fields using custom type
    
      | hotelName | firstName | lastName | phoneNo    | city       |
      | Local B&B | Julia     | Cruz     | 5711231234 | Alexandria |

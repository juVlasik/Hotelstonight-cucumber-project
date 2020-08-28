Feature: Checking functionality of links for cities

  #Julia's Sprint 4  
     Scenario: verify Las Vegas link functionality
     When I am on home page
     Then I click on the city link
     Then I verify the title
     And I go back to the main page
     
 
  #Julia's Sprint 5
  @sprint5
     Scenario: verify city link functionality
     When I am on home page
     Then I click on the "Austin" link
     Then I verify that ciy name "Austin"
     
   #Julia's print 5
   @sprint5
     Scenario: verify city link functionality
     When I am on home page
     Then I click on the "Maui" link
     Then I verify that ciy name "Maui"
     
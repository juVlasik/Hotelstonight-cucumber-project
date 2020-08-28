Feature: Verify find great deals on HotelTonight


  #Scenario: Verify city name
  #
    #Given I am on homepage
    #When I click on Our Cities button
    #When Find great deals on HotelTonight in a city near you
    #When I click on EXPLORE ALL CITIES button
    #When I find San Diego 
    #When clin on it
    #Then The following subcategories should be there
          #| Where:    |San Diego, CA                                   |
   #				| When:     |Tonight                                         |
  #				| Customize:|1 Room, Top Deals, WiFi, Breakfast, Parking, Gym| 

 @temp
Scenario: Verify otel name

    Given I am on homepage again
    When I click on Our Cities button again
    And Find great deals on HotelTonight in a city near me
    And I click on EXPLORE ALL CITIES button for search
    And I find San Diego city 
    And clin on it for hotel
    Then search the InterContinental hotel for date
    
   
     
      
    
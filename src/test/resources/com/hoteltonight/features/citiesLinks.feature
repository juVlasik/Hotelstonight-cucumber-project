Feature: Checking functionality of links for cities

  #Scenario Outline: verify cities links functionality
   # Given I am on home page
   # When I click on "<city>"
    #Then I verify title of the page
   # And I go back to the main page

   # Examples: 
    #  | city          | title                                                      |
    #  | Chicago       | Best Hotels in Chicago, Illinois - HotelTonight            |
    #  | San Francisco | Best Hotels in San Francisco, California - HotelTonight    |
     # | New Orleans   | Best Hotels in French Quarters, New Orleans - HotelTonight |

     
     Scenario: verify Las Vegas link functionality
     When I am on home page
     Then I click on the city link
     Then I verify the title
     And I go back to the main page
     
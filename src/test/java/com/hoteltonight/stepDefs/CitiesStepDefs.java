 package com.hoteltonight.stepDefs;


import com.hoteltonight.Utilities.BrowserUtilities;
import com.hoteltonight.Utilities.ConfigReader;
import com.hoteltonight.Utilities.Driver;
import com.hoteltonight.pages.CitiesPages;
import com.hoteltonight.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class CitiesStepDefs {

    

@Given("I am on homepage")
public void iAmOnHomepage() {
	CitiesPages cp = new CitiesPages();
	Driver.getDriver().get(ConfigReader.getProperty("url"));
	 cp.ourCitiesButton.click();
   
}

@When("I click on Our Cities button")
public void iClickOnOurCitiesButton() {
	CitiesPages cp = new CitiesPages();
	   cp.allCitiesButton.click();
	   BrowserUtilities.waitFor(5);
}

@When("Find great deals on HotelTonight in a city near you")
public void findGreatDealsOnHotelTonightInACityNearYou() {
	CitiesPages cp = new CitiesPages();
	   cp.SearchButton.click();
	   BrowserUtilities.waitFor(2);
}

@When("I click on EXPLORE ALL CITIES button")
public void iClickOnEXPLOREALLCITIESButton() {
	CitiesPages cp = new CitiesPages();
	   cp.SearchACity.sendKeys("San Diego");
		BrowserUtilities.waitFor(2);
	
}

@When("I find San Diego")
public void iFindSanDiego() {
	CitiesPages cp = new CitiesPages();
	   cp.SearchSanDiego.click();
	   BrowserUtilities.waitFor(2);
}

@When("clin on it")
public void clinOnIt() {
	CitiesPages cp = new CitiesPages();
	cp.Data.click();
	   cp.Customize.click();
	   cp.PremiumButton.click();
	   cp.WiFiButton.click();
	   cp.BreakfastButton.click();
	   cp.ParkingButton.click();
	   cp.GymButton.click();
	   BrowserUtilities.waitFor(2);
	   cp.DoneButton.click();
	
	
}

@Then("The following subcategories should be there")
public void theFollowingSubcategoriesShouldBeThere(io.cucumber.datatable.DataTable dataTable) {
	


}


	@Then("Confirm the city is San Diego")
	public void confirmTheCityIsSanDiego() {
		String expected = "San Diego, CA";
		   String actual = new CitiesPages().SearchACity.getText();
//	    Assert.assertEquals(expected, actual);
		  
//		   InterCont
	}
	
	@Given("I am on homepage again")
	public void iAmOnHomepageAgain() {
		CitiesPages cp = new CitiesPages();
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		 cp.ourCitiesButton.click();
		
	   
	}

	@When("I click on Our Cities button again")
	public void iClickOnOurCitiesButtonAgain() {
		CitiesPages cp = new CitiesPages();
		   cp.allCitiesButton.click();
		   BrowserUtilities.waitFor(2);
	    
	}

	@When("Find great deals on HotelTonight in a city near me")
	public void findGreatDealsOnHotelTonightInACityNearMe() {
		CitiesPages cp = new CitiesPages();
		   cp.SearchButton.click();
		   BrowserUtilities.waitFor(2);
	}

	@When("I click on EXPLORE ALL CITIES button for search")
	public void iClickOnEXPLOREALLCITIESButtonForSearch() {
		CitiesPages cp = new CitiesPages();
		   cp.SearchACity.sendKeys("San Diego");
			BrowserUtilities.waitFor(2);
	}

	@When("I find San Diego city")
	public void iFindSanDiegoCity() {
		CitiesPages cp = new CitiesPages();
		   cp.SearchSanDiego.click();
		   BrowserUtilities.waitFor(2);
	}

	@When("clin on it for hotel")
	public void clinOnItForHotel() {
		CitiesPages cp = new CitiesPages();
		cp.Data.click();
		   cp.Customize.click();
		   cp.PremiumButton.click();
		   cp.WiFiButton.click();
		   cp.BreakfastButton.click();
		   cp.ParkingButton.click();
		   cp.GymButton.click();
		   BrowserUtilities.waitFor(2);
		   cp.DoneButton.click();
		   BrowserUtilities.waitFor(2);
		   cp.InterCont.click();
		   BrowserUtilities.waitFor(2);
	}

	@Then("search the InterContinental hotel for date")
	public void searchTheInterContinentalHotelForDate() {
		CitiesPages cp = new CitiesPages();
		cp.ChekIn.click();
		   BrowserUtilities.waitFor(2);
		   cp.MonthChekIn.click();
		   BrowserUtilities.waitFor(2);
		   cp.dataChekIn.click();
		   BrowserUtilities.waitFor(2);
		   cp.dataChekOut.click();
		   BrowserUtilities.waitFor(2);
		   cp.done.click();
		   BrowserUtilities.waitFor(2);
		   cp.doneButton.click();
		   BrowserUtilities.waitFor(2);
		   
//		   cp.done.click();
//		   cp.doneButton.click();
//		   rowserUtilities.waitFor(2);
		   String expected = "Order Summary for InterContinental San Diego - HotelTonight";
		   String actual = Driver.getDriver().getTitle();
		   
		   
		   
		   
		   
	}



	}






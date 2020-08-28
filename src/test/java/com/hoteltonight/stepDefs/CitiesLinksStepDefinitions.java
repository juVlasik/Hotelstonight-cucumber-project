package com.hoteltonight.stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import com.hoteltonight.Utilities.BrowserUtilities;
import com.hoteltonight.Utilities.Driver;
import com.hoteltonight.pages.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CitiesLinksStepDefinitions {

	String expectedCity;

@Then("I click on the city link")
public void iClickOnTheCityLink() {
	HomePage hp = new HomePage();
	
    //scroll down
	
	JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
    js.executeScript("window.scrollBy(0,2600)");
    BrowserUtilities.waitFor(5);
    

    js.executeScript("arguments[0].click();", hp.LasVegasLink);
    
    
	BrowserUtilities.waitFor(5);
	
        }



@Then("I verify the title")
public void iVerifyTheTitle() {
	String expected = "Best Hotels in Las Vegas, Nevada - HotelTonight";
	String actual = Driver.getDriver().getTitle();
	Assert.assertEquals(expected, actual);
}

@Then("I go back to the main page")
public void iGoBackToTheMainPage() {
	
	Driver.getDriver().navigate().back();
}




@Then("I click on the {string} link")
public void iClickOnTheLink(String city) {
	HomePage hp = new HomePage();
	hp.getCity(city).click();
	BrowserUtilities.waitFor(5);
	
    expectedCity = city;
}

  


		
		@Then("I verify that ciy name {string}")
		public void iVerifyThatCiyName(String city) {
			HomePage hp = new HomePage();
			String actualCity = hp.getActualCity(city).getText();
			Assert.assertEquals(expectedCity, actualCity); 
		}
		
		
		
		
	}

	
	
	
	


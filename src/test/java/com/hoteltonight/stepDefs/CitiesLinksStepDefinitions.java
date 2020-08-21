package com.hoteltonight.stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import com.hoteltonight.Utilities.BrowserUtilities;
import com.hoteltonight.Utilities.Driver;
import com.hoteltonight.pages.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class CitiesLinksStepDefinitions {


@Then("I click on the city link")
public void iClickOnTheCityLink() {
	HomePage hp = new HomePage();
	
    //scroll down
	
	JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
    js.executeScript("window.scrollBy(0,2600)");
    BrowserUtilities.waitFor(5);
    
	   // for (int i = 1; i <= 3; i++) {
		
//        hp.citiesLinks = Driver.getDriver().findElements(By.xpath(
//    			"//h3[@class='_iepax4']"));
        
       // Driver.getDriver().findElement(By.xpath("(//h3[@class='_iepax4'])[" +i+ "]")).click();
    
//    Actions a= new Actions(Driver.getDriver()); 
//    a.moveToElement(hp.LasVegasLink).click().build().perform(); 
    js.executeScript("arguments[0].click();", hp.LasVegasLink);
        //hp.LasVegasLink.click();
		BrowserUtilities.waitFor(5);
		
		
		//actualLinks.add(Driver.getDriver().getTitle());
		
		//Driver.getDriver().navigate().back();
		
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

	    
	}

	
	
	
	


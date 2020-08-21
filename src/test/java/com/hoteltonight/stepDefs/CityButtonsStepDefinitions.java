package com.hoteltonight.stepDefs;

import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.By;

import com.hoteltonight.Utilities.Driver;
import com.hoteltonight.pages.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CityButtonsStepDefinitions {

	
	
	@When("I click on {string} button")
	public void iClickOnButton(String city) {
		HomePage hp = new HomePage();
		switch (city) { 
		case "Las Vegas": 
			hp.lasVegasIcon.click(); 
			break;
		case "San Diego":
			hp.sanDiegoIcon.click();
			break;
		case "Boston":
			hp.bostonIcon.click();
			break;
		case "Denver":
			hp.denverIcon.click();
			break;
		case "Los Angeles":
			hp.losAngelesIcon.click();
			break;
		case "Honolulu":
			hp.honoluluIcon.click();
			break;	
		case "Destin":
			hp.destinIcon.click();
			break;	
		default: assertTrue(false);
		}
		
		
	}


	@Then("I taken to a new page and where is {string}")
	public void iTakenToANewPageAndWhereIs(String city) throws Exception {

		Thread.sleep(5000);
			
		String whereActual = Driver.getDriver().findElement(By.xpath("//input[@class='_m5mtc85']")).getAttribute("value");
		System.out.println("WHERE CITY: " + whereActual);
		System.out.println(city);
		assertTrue(whereActual.equals(city));
		
	}

	
	
	
}

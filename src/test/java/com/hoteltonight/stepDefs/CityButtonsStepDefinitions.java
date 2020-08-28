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

	
	
	//Scenario Outline stepDefs
	
	@When("I click on Las Vegas button")
	public void iClickOnLasVegasButton() {
		HomePage hp = new HomePage();
		hp.lasVegasIcon.click();
	}

	@Then("I taken to a new page and where is Las Vegas")
	public void iTakenToANewPageAndWhereIsLasVegas() throws Exception {
		Thread.sleep(5000);
		String whereActual = Driver.getDriver().findElement(By.xpath("//input[@class='_m5mtc85']")).getAttribute("value");
		assertTrue(whereActual.equals("Las Vegas"));
	}

	@When("I click on San Diego button")
	public void iClickOnSanDiegoButton() {
		HomePage hp = new HomePage();
		hp.sanDiegoIcon.click();
	}

	@Then("I taken to a new page and where is San Diego")
	public void iTakenToANewPageAndWhereIsSanDiego() throws Exception {
		Thread.sleep(5000);
		String whereActual = Driver.getDriver().findElement(By.xpath("//input[@class='_m5mtc85']")).getAttribute("value");
		assertTrue(whereActual.equals("San Diego"));
	}

	@When("I click on Los Angeles button")
	public void iClickOnLosAngelesButton() {
		HomePage hp = new HomePage();
		hp.losAngelesIcon.click();
	}

	@Then("I taken to a new page and where is Los Angeles")
	public void iTakenToANewPageAndWhereIsLosAngeles() throws Exception {
		Thread.sleep(5000);
		String whereActual = Driver.getDriver().findElement(By.xpath("//input[@class='_m5mtc85']")).getAttribute("value");
		assertTrue(whereActual.equals("Los Angeles"));
	}

	@When("I click on Boston button")
	public void iClickOnBostonButton() {
		HomePage hp = new HomePage();
		hp.bostonIcon.click();
	}

	@Then("I taken to a new page and where is Boston")
	public void iTakenToANewPageAndWhereIsBoston() throws Exception {
		Thread.sleep(5000);
		String whereActual = Driver.getDriver().findElement(By.xpath("//input[@class='_m5mtc85']")).getAttribute("value");
		assertTrue(whereActual.equals("Boston"));
	}

	@When("I click on Denver button")
	public void iClickOnDenverButton() {
		HomePage hp = new HomePage();
		hp.denverIcon.click();
	}

	@Then("I taken to a new page and where is Denver")
	public void iTakenToANewPageAndWhereIsDenver() throws Exception {
		Thread.sleep(5000);
		String whereActual = Driver.getDriver().findElement(By.xpath("//input[@class='_m5mtc85']")).getAttribute("value");
		assertTrue(whereActual.equals("Denver"));
	}

	@When("I click on Destin button")
	public void iClickOnDestinButton() {
		HomePage hp = new HomePage();
		hp.destinIcon.click();
	}

	@Then("I taken to a new page and where is Destin")
	public void iTakenToANewPageAndWhereIsDestin() throws Exception {
		Thread.sleep(5000);
		String whereActual = Driver.getDriver().findElement(By.xpath("//input[@class='_m5mtc85']")).getAttribute("value");
		assertTrue(whereActual.equals("Destin"));
	}

	@When("I click on Honolulu button")
	public void iClickOnHonoluluButton() {
		HomePage hp = new HomePage();
		hp.honoluluIcon.click();
	}

	@Then("I taken to a new page and where is Honolulu")
	public void iTakenToANewPageAndWhereIsHonolulu() throws Exception {
		Thread.sleep(5000);
		String whereActual = Driver.getDriver().findElement(By.xpath("//input[@class='_m5mtc85']")).getAttribute("value");
		assertTrue(whereActual.equals("Honolulu"));
	}



	
}

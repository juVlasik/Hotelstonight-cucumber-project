package com.hoteltonight.stepDefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import com.hoteltonight.Utilities.Driver;
import com.hoteltonight.pages.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SocialMediaIconsStepDefinitions {
	
	//Instagram test 
	@When("I click on Instagram button")
	public void iClickOnInstagramButton() {
		HomePage hp = new HomePage();
		hp.instagramIcon.click();	
	}

	
	
	@Then("I am taken to a new tab where title is Instagram")
	public void iAmTakenToANewTabWhereTitleIsInstagram() {
		
		  String parentWindowHandle=Driver.getDriver().getWindowHandle();
			Set<String> allHandles = Driver.getDriver().getWindowHandles();
			for (String handle : allHandles) {
				if(!handle.equals(parentWindowHandle)) {
					Driver.getDriver().switchTo().window(handle);}}
			
			String actualTitle = Driver.getDriver().getTitle();
			System.out.println(actualTitle);
			String expectedTitle = "HotelTonight (@hoteltonight) • Instagram photos and videos";
			
			assertEquals(expectedTitle, actualTitle);
			
	
	}

	
	
	//Facebook test 
	@When("I click on Facebook button")
	public void iClickOnFacebookButton() {
		HomePage hp = new HomePage();
		hp.facebookIcon.click();	

	}

	@Then("I am taken to a new tab where title is Facebook")
	public void iAmTakenToANewTabWhereTitleIsFacebook() {
		String parentWindowHandle=Driver.getDriver().getWindowHandle();
		Set<String> allHandles = Driver.getDriver().getWindowHandles();
		for (String handle : allHandles) {
			if(!handle.equals(parentWindowHandle)) {
				Driver.getDriver().switchTo().window(handle);}}
		
		String actualTitle = Driver.getDriver().getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "HotelTonight [- Home | Facebook]";
		
		//assertEquals(expectedTitle, actualTitle);
		System.out.println(actualTitle);
		assertTrue(actualTitle.contains("Home | Facebook"));		
	}

	
	//Twitter test
	@When("I click on Twitter button")
	public void iClickOnTwitterButton() {
		HomePage hp = new HomePage();
		hp.twitterIcon.click();   
	}

	
	
	@Then("I am taken to a new tab where title is Twitter")
	public void iAmTakenToANewTabWhereTitleIsTwitter() {
		  String parentWindowHandle=Driver.getDriver().getWindowHandle();
			Set<String> allHandles = Driver.getDriver().getWindowHandles();
			for (String handle : allHandles) {
				if(!handle.equals(parentWindowHandle)) {
					Driver.getDriver().switchTo().window(handle);}}
			
			String actualTitle = Driver.getDriver().getTitle();
			System.out.println(actualTitle);
			String expectedTitle = "HotelTonight (@[HotelTonight) / Twitter]";
			
			//assertEquals(expectedTitle, actualTitle);
			assertTrue(actualTitle.contains("Twitter"));
			
	}
	
	
	//LinkedIn test
	@When("I click on LinkedIn button")
	public void iClickOnLinkedInButton() {
		HomePage hp = new HomePage();
		hp.linkedinIcon.click();
	}
	
	

	@Then("I am taken to a new tab where title is LinkedIn")
	public void iAmTakenToANewTabWhereTitleIsLinkedIn() {
		  String parentWindowHandle=Driver.getDriver().getWindowHandle();
			Set<String> allHandles = Driver.getDriver().getWindowHandles();
			for (String handle : allHandles) {
				if(!handle.equals(parentWindowHandle)) {
					Driver.getDriver().switchTo().window(handle);}}
			
			String actualTitle = Driver.getDriver().getTitle();
			System.out.println(actualTitle);
			String expectedTitle = "HotelTonight [| LinkedIn]";
			
			//assertEquals(expectedTitle, actualTitle);
			assertTrue(actualTitle.contains("LinkedIn"));
			
	}

	
	
	
	

}

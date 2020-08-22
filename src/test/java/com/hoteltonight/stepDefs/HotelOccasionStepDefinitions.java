package com.hoteltonight.stepDefs;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.github.javafaker.Friends;
import com.hoteltonight.Utilities.BrowserUtilities;
import com.hoteltonight.Utilities.ConfigReader;
import com.hoteltonight.Utilities.Driver;
import com.hoteltonight.pages.HomePage;
import com.hoteltonight.pages.HotelForEveryOccasionPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelOccasionStepDefinitions {

	/*
	 * @Given("I am on home page") public void iAmOnHomePage() {
	 * 
	 * Driver.getDriver().get(ConfigReader.getProperty("url"));
	 * 
	 * Driver.getDriver().manage().window().maximize();
	 * 
	 * BrowserUtilities.waitFor(5);
	 * 
	 * System.out.println("User is in the homepage."); }
	 */

	@When("I scroll down the page")
	public void iScrollDownThePage() {

		Driver.getDriver().manage().window().maximize();
		
		HotelForEveryOccasionPage hfeop = new HotelForEveryOccasionPage();

		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		
		js.executeScript("arguments[0].scrollIntoView();", hfeop.hotelTonighText);

		BrowserUtilities.waitFor(5);

		System.out.println("Scrolled down");
	}

	@Then("verify the text Hotel tonight for every occasion")
	public void verifyTheTextHotelTonightForEveryOccasion() {
		
		HotelForEveryOccasionPage hfeop = new HotelForEveryOccasionPage();
		
		String htext = hfeop.hotelTonighText.getText();
		
		Assert.assertEquals(hfeop.expectedHotelText, htext);
		
		System.out.println(hfeop.expectedHotelText);
	}

	@Then("Verify dispayed  glass icon text")
	public void verify_dispayed_glass_icon_text() {
		
		HotelForEveryOccasionPage hfeop = new HotelForEveryOccasionPage();
		
		hfeop.listIcons.get(0).isDisplayed();
		
		String glassText = hfeop.iconsTexts.get(0).getText();
		
		Assert.assertEquals(hfeop.expectedGlassText, glassText);
		
		System.out.println(glassText);
	}

	@Then("verify the text Skip the commute. With a same day deal, traffic can wait.")
	public void verifyTheTextSkipTheCommuteWithASameDayDealTrafficCanWait() {
        
		HotelForEveryOccasionPage hfeop = new HotelForEveryOccasionPage();
		
		hfeop.listIcons.get(1).isDisplayed();
		
		String clockText = hfeop.iconsTexts.get(1).getText();
		
		Assert.assertEquals(hfeop.expectedClockText, clockText);
		
		System.out.println(clockText);
	}

	@Then("verify the text Let's have a threeday. Score weekend getaways in cities you love.")
	public void verifyTheTextLetSHaveAThreedayScoreWeekendGetawaysInCitiesYouLove() {
         
		HotelForEveryOccasionPage hfeop = new HotelForEveryOccasionPage();
		
		hfeop.listIcons.get(2).isDisplayed();
		
		String buildingText = hfeop.iconsTexts.get(2).getText();
		
		Assert.assertEquals(hfeop.expectedBuildingText, buildingText);
		
		System.out.println(buildingText);

	}

	@Then("verify the text Go big on your bucket list. Book in advance. Zero stress.")
	public void verifyTheTextGoBigOnYourBucketListBookInAdvanceZeroStress() {
 
		HotelForEveryOccasionPage hfeop = new HotelForEveryOccasionPage();
		
		hfeop.listIcons.get(3).isDisplayed();
		
		String calendarText = hfeop.iconsTexts.get(3).getText();
		
		Assert.assertEquals(hfeop.expectedCalendarText, calendarText);
		
		System.out.println(calendarText);
	}
	
   @And("close the window")
   public void close_The_Window() {
	   Driver.quit();
   }
}

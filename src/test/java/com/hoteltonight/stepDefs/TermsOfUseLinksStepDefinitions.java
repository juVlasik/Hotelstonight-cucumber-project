package com.hoteltonight.stepDefs;

import com.hoteltonight.Utilities.BrowserUtilities;
import com.hoteltonight.Utilities.ConfigReader;
import com.hoteltonight.Utilities.Driver;
import com.hoteltonight.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class TermsOfUseLinksStepDefinitions {
	
//	@Given("I am on home page")
//	public void iAmOnHomePage() {
//		Driver.getDriver().get(ConfigReader.getProperty("url"));
//		BrowserUtilities.waitFor(5);
//	}

	@When("I click on Terms Of Service link")
	public void iClickOnTermsOfServiceLink() {
	    new HomePage().termsOfServiceButton.click();
	    BrowserUtilities.waitFor(5);
	}

	@Then("I should land on Terms Of Service page")
	public void iShouldLandOnTermsOfServicePage() {
	    String expected = "Terms of Service";
	    String actual = new HomePage().termsOfServiceMessage.getText();
	    Assert.assertEquals(expected, actual);
	}

	
	@When("I click on Privacy Policy link")
	public void iClickOnPrivacyPolicyLink() {
		new HomePage().privacyPolicyButton.click();
	    BrowserUtilities.waitFor(5);
	}

	@Then("I should land on Privacy Policy page")
	public void iShouldLandOnPrivacyPolicyPage() {
		String expected = "Privacy Policy";
	    String actual = new HomePage().privacyPolicyMessage.getText();
	    Assert.assertEquals(expected, actual);
	}

	
	
}

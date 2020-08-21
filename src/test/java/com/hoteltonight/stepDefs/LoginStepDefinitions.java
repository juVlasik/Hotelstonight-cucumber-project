package com.hoteltonight.stepDefs;

import com.github.javafaker.Faker;
import com.hoteltonight.Utilities.BrowserUtilities;
import com.hoteltonight.Utilities.ConfigReader;
import com.hoteltonight.Utilities.Driver;
import com.hoteltonight.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinitions {
	
	@Given("I am on home page")
	public void iAmOnHomePage() {
		
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		BrowserUtilities.waitFor(5);
	}

	@When("I click on Sign In button")
	public void iClickOnSignInButton() {
		 HomePage hp = new HomePage();
		    hp.signInButton.click();
	}
	
	

	@When("type in random email")
	public void typeInRandomEmail() {
	    Faker f = new Faker();
	    HomePage hp = new HomePage();
	    hp.signInEmailField.sendKeys(f.name().username() + "@mail.ru");
	}

	@Then("verify the message")
	public void verifyTheMessage() {
		String actual = new HomePage().message.getText();
		String expected = "We�ll email you a link that�ll sign you in with one tap. Easy as it sounds.";
		Assert.assertEquals(expected, actual);
	}

	@Then("click on Send My Link button")
	public void clickOnSendMyLinkButton() {
		new HomePage().sendMyLinkButton.click();
		BrowserUtilities.waitFor(5);
	}

	@Then("verify the message again")
	public void verifyTheMessageAgain() {
	    String actual = new HomePage().message2.getText();
	    String expected = "We sent you a link that will log you in with one tap.";
	    Assert.assertEquals(expected, actual);
	}

	@When("click on Continue button")
	public void clickOnContinueButton() {
		new HomePage().continueButton.click();
		BrowserUtilities.waitFor(5);
	}

}

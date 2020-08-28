package com.hoteltonight.stepDefs;


import org.junit.Assert;

import com.github.javafaker.Faker;
import com.hoteltonight.Utilities.BrowserUtilities;
import com.hoteltonight.Utilities.ConfigReader;
import com.hoteltonight.Utilities.Driver;
import com.hoteltonight.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


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
		String expected = "We'll email you a link that'll sign you in with one tap. Easy as it sounds.";
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

	
	
	
	
	@Then("verify another message")
	public void verifyAnotherMessage() {
	   String expected = "One tap, you�re in";
	   String actual = new HomePage().message3.getText();
	}

	@Then("click on Sign In button again")
	public void clickOnSignInButtonAgain() {
		new HomePage().signInConfirm.click();
		BrowserUtilities.waitFor(5);
	}

	@Then("type password in the input box")
	public void typePasswordInTheInputBox() {
		Faker f = new Faker();
		BrowserUtilities.waitFor(5);
		new HomePage().signPasswordField.sendKeys(f.name().username());
	}

	@Then("click on Sign In button one more time")
	public void clickOnSignInButtonOneMoreTime() {
		new HomePage().signInConfirm2.click();
		BrowserUtilities.waitFor(5);
	}

	@Then("verify the error message")
	public void verifyTheErrorMessage() {
		   String expected = "Invalid email or password.";
		   String actual = new HomePage().message4.getText();
	}
	

	@When("enter {string} to email field")
	public void enterToEmailField(String email) {
		 new HomePage().signInEmailField.sendKeys(email);
	}

	@When("type {string} in the input box")
	public void typeInTheInputBox(String password) {
		new HomePage().signPasswordField.sendKeys(password);
	}

	@Then("verify the {string}")
	public void verifyThe(String errorMessage) {
	    String expected = errorMessage;
	    String actual = new HomePage().message4.getText();
	    Assert.assertEquals(expected, actual);
	}

}

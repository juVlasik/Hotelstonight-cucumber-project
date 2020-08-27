package com.hoteltonight.stepDefs;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;
import com.hoteltonight.Utilities.BrowserUtilities;
import com.hoteltonight.Utilities.Driver;
import com.hoteltonight.pages.HomePage;
import com.hoteltonight.pages.HotelPartnersPage;
import com.hoteltonight.pojos.User;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HotelPartnersStepDefinitions {

	@When("I click on hotel partners link")
	public void iClickOnHotelPartnersLink() {
	  new  HomePage().hotelPartnersLink.click();
	  BrowserUtilities.waitFor(5);
	}
	
	@When("I type in valid email")
	public void iTypeInValidEmail() {

		Faker f = new Faker();
     	new HotelPartnersPage().emailField.sendKeys(f.internet().emailAddress());
		
	}

	@Then("I can pass info to input fields using custom type")
	public void iCanPassInfoToInputFieldsUsingCustomType(User user) {
		HotelPartnersPage hpp = new HotelPartnersPage();
	
		hpp.hotelNameField.sendKeys(user.getHotelName());
		hpp.firstNameField.sendKeys(user.getFirstName());
		hpp.lastNameField.sendKeys(user.getLastName());
	    
		hpp.rolesDropBox.click();
		hpp.ownerOption.click();
	    
		hpp.phoneNoField.sendKeys(user.getPhoneNo());
		hpp.cityField.sendKeys(user.getCity());
		
		hpp.signUpButton.click();
		
		String expected = "Thanks for your submission!";
		String actual = hpp.submittionMessage.getText();
		Assert.assertEquals(expected, actual);
	
	}

	
	
	
}

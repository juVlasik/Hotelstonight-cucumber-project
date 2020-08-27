package com.hoteltonight.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hoteltonight.Utilities.Driver;

public class HotelPartnersPage {

	public HotelPartnersPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	

	@FindBy (xpath = "//input[@data-aid='hotelName-text']")
	public WebElement hotelNameField;
	
	@FindBy (xpath = "//input[@data-aid='firstName-text']")
	public WebElement firstNameField;
	
	@FindBy (xpath = "//input[@data-aid='lastName-text']")
	public WebElement lastNameField;
	
	@FindBy (xpath = "//input[@data-aid='email-text']")
	public WebElement emailField;

	@FindBy (xpath = "(//div[@class='_1obfur3'])[1]")
	public WebElement rolesDropBox;
	
	@FindBy (xpath = "//a[contains(text(),'Owner')]")
	public WebElement ownerOption;
	
	@FindBy (xpath = "//input[@data-aid='mobileNumber-text']")
	public WebElement phoneNoField;

	@FindBy (xpath = "//input[@data-aid='addressCity-text']")
	public WebElement cityField;

	@FindBy (xpath = "//button[@data-aid='partner-sign-up-btn']")
	public WebElement signUpButton;
	

	@FindBy (xpath = "//h2[contains(text(),'Thanks')]")
	public WebElement submittionMessage;
	
	
	
}

package com.hoteltonight.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hoteltonight.Utilities.Driver;



public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy (xpath = "//a[@data-aid='sign-in-link']")
	public WebElement signInButton;	
	
	@FindBy (xpath = "//input[@data-aid='email-text']")
	public WebElement signInEmailField;	
	
	@FindBy (xpath = "//button[@class='_mak5v0d']")
	public WebElement continueButton;	
	
	@FindBy (xpath = "//p[@class='_qzcds1']")
	public WebElement message;	
	
	@FindBy (xpath = "//button[@class='_mak5v0d']")
	public WebElement sendMyLinkButton;	
	
	@FindBy (xpath = "//p[contains(text(),'We sent you a link')]")
	public WebElement message2;	
	
	
}

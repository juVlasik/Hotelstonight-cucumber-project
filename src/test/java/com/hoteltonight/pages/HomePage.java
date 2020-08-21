package com.hoteltonight.pages;

import java.util.List;

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
	
	
	

	@FindBy (xpath = "//h1[@class='_mq3seu']")
	public WebElement termsOfServiceMessage;	
	
	@FindBy (xpath = "//a[contains(text(), 'Terms of Service')]")
	public WebElement termsOfServiceButton;	
	
	@FindBy (xpath = "//a[contains(text(), 'Privacy Policy')]")
	public WebElement privacyPolicyButton;	
	
	@FindBy (xpath = "//h1[@class='_mq3seu']")
	public WebElement privacyPolicyMessage;

	
	
	
	@FindBy (xpath = "//h1[@class='_11oy099']")
	public WebElement message3;	
	
	@FindBy (xpath = "//a[@data-aid='modal-sign-in-link']")
	public WebElement signInConfirm;
	
	@FindBy (xpath = "//div[@class='_pgajwy']")
	public WebElement message4;
	
	@FindBy (xpath = "//input[@class='_1c9vbhq8']")
	public WebElement signPasswordField;	
	
	@FindBy (xpath = "//button[@class='_mak5v0d']")
	public WebElement signInConfirm2;
	
	
	
	
	@FindBy (xpath = "//a[@class='_1yk0k7t']")
	public List<WebElement> citiesLinks;
	
	@FindBy (xpath = "//a[@href='/l/usa/nevada/las-vegas']")
	public WebElement LasVegasLink;
	
}

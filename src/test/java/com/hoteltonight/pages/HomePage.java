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
	
	
	//Anna's tests elements: Social Media Icons
	
	@FindBy (xpath ="//a[@href='https://www.instagram.com/hoteltonight']")
	public WebElement instagramIcon;	
	
	@FindBy (xpath ="//a[@href='https://www.facebook.com/hoteltonight']")
	public WebElement facebookIcon;
	
	@FindBy (xpath ="//a[@href='https://www.twitter.com/hoteltonight']")
	public WebElement twitterIcon;
	
	@FindBy (xpath ="//a[@href='https://www.linkedin.com/company/1458830/']")
	public WebElement linkedinIcon;
	
	//Anna's cities
	@FindBy (xpath ="//a[@href='/l/usa/nevada/las-vegas']")
	public WebElement lasVegasIcon;
	
	@FindBy (xpath ="//a[@href='/l/usa/california/san-diego/downtown']")
	public WebElement sanDiegoIcon;
	
	@FindBy (xpath ="//a[@href='/l/usa/california/los-angeles']")
	public WebElement losAngelesIcon;
	
	@FindBy (xpath ="//a[@href='/l/usa/massachusetts/boston']")
	public WebElement bostonIcon;
	
	@FindBy (xpath ="//a[@href='/l/usa/colorado/denver']")
	public WebElement denverIcon;
	
	@FindBy (xpath ="//a[@href='/l/usa/florida/destin']")
	public WebElement destinIcon;
	
	@FindBy (xpath ="//a[@href='/l/usa/hawaii/honolulu']")
	public WebElement honoluluIcon;

			
			
				

			
}

package com.hoteltonight.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hoteltonight.Utilities.Driver;



public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	//Julia's elements for login tests
	
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
	// end Anna's web elements
			
			
				

			
	//Julia's elements for terms of service/privacy policy links
	

	@FindBy (xpath = "//h1[@class='_mq3seu']")
	public WebElement termsOfServiceMessage;	
	
	@FindBy (xpath = "//a[contains(text(), 'Terms of Service')]")
	public WebElement termsOfServiceButton;	
	
	@FindBy (xpath = "//a[contains(text(), 'Privacy Policy')]")
	public WebElement privacyPolicyButton;	
	
	@FindBy (xpath = "//h1[@class='_mq3seu']")
	public WebElement privacyPolicyMessage;

	
	
	//Julia's elements for login tests
	
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
	
	
	
	//Julia's elements for cities links tests
	
//	@FindBy (xpath = "//a[@class='_1yk0k7t']")
//	public List<WebElement> citiesLinks;
	
	@FindBy (xpath = "//a//h3[@class='cityName_iepax4']")
	public List<WebElement> citiesLinks;
	
	@FindBy (xpath = "//a[@href='/l/usa/nevada/las-vegas']")
	public WebElement LasVegasLink;
	
	public WebElement getCity(String city) {
		String xpath = "//h3[contains(text(),'"+city+"')]";
		return Driver.getDriver().findElement(By.xpath(xpath));
		
	}
	
	public WebElement getActualCity(String city) {
		String xpath = "(//span[contains(text(),'"+city+"')])[1]";
		return Driver.getDriver().findElement(By.xpath(xpath));
		
	}
	
	//Julia's elements for Hotel Partners page
	
	@FindBy (xpath = "//div[contains(text(),'Hotel Partners')]")
	public WebElement hotelPartnersLink;
	
	
	

}

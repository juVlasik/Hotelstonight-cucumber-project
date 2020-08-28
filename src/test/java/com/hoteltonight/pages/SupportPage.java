package com.hoteltonight.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hoteltonight.Utilities.Driver;

public class SupportPage {

	public SupportPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	public static final String expectedSupportButtonText = "Support";
	public static final String expectedQuestion1="What type of room will I get? Can I choose my own room?";
	public static final String expectedQuestion2 ="When should I book - in advance or day of?";
	public static final String expectedQuestion3 = "If I can book a hotel in advance, why are you guys called HotelTonight?";
	public static final String expectedQuestion4 ="Can I book multiple rooms at a time?";
	public static final String expectedQuestion5 ="How do I edit my info?";
	public static final String expectedQuestion6 ="What is HT Perks? ";
	public static final String expectedQuestion7 = "What's this \"Daily Drop\" deal?";
	public static final String expectedQuestion8 ="Can I change the method of payment used?";
	public static final String expectedQuestion9 ="Can I extend my booking?";
	public static final String expectedQuestion10 ="I’m having trouble with my payment - can you help me?";
	public static final String expectedQuestion11 ="I’m having trouble using a coupon - can you help me?";
	public static final String expectedQuestion12 ="If something comes up or I mistakenly book a room, can I get a refund?";
	public static final String expectedQuestion13 = "I've forgotten my password - can you help?";
	
	@FindBy(xpath = "//*[text()='Support']")
	public WebElement supportButton;
	
	@FindBy(xpath ="(//div[@class='_1nd68vf'])")
	public
	List<WebElement> questionsAndAnswers;
	
	@FindBy(xpath = "(//div[@class='_rn7n8s9']/div)")
	public WebElement firstAnswer;
	
	@FindBy(xpath = "(//div[@class='_rn7n8s9'])")
	public WebElement secondAnswer;
	
	//@FindBy(xpath = "(//div[@class='_rn7n8s9'])")
	
	
	
}



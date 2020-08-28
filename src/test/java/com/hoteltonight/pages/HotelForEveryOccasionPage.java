package com.hoteltonight.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hoteltonight.Utilities.Driver;

public class HotelForEveryOccasionPage {
		
	public HotelForEveryOccasionPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	/*
	Hotel For Every Occasion variables 
	*/
	public static final String expectedHotelText = "HotelTonight for every occasion";
    
	public static final String expectedGlassText = "Happy hour is never just an hour. From basic to luxe, book where the night takes you.";
	
	public static final String expectedClockText = "Skip the commute. With a same day deal, traffic can wait.";
		
	public static final String expectedBuildingText = "Let's have a threeday. Score weekend getaways in cities you love.";
	
	public static final String expectedCalendarText = "Go big on your bucket list. Book in advance. Zero stress.";
	 
	
	
	
	@FindBy(xpath="//*[text()='HotelTonight for every occasion']")
	public WebElement hotelTonighText;

	@FindBy(css=".icon_pbww8r")
	public
	List<WebElement> listIcons;

	@FindBy(css=".message_1leeze7")
	public 
	List<WebElement> iconsTexts;
	
	
	
	
	
	
	

	@FindBy(xpath="(//div[@class='icon_pbww8r'])[2]")
	public WebElement clockIcon;

	@FindBy(xpath="(//div[@class='message_1leeze7'])[2]")
	public WebElement clockIcontext;

	@FindBy(xpath="(//div[@class='icon_pbww8r'])[3]")
	public WebElement buildingIcon;

	@FindBy(xpath="(//div[@class='message_1leeze7'])[3]")
	public WebElement buildingIconText;

	@FindBy(xpath="(//div[@class='icon_pbww8r'])[4]")
	public WebElement calendarIcon;

	@FindBy(xpath="(//div[@class='message_1leeze7'])[4]")
	public WebElement calendarIconText;


	
	
	
	
}

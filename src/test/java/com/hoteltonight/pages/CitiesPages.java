package com.hoteltonight.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hoteltonight.Utilities.Driver;



public class CitiesPages {

	public CitiesPages() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy (xpath = "//*[@id=\"viewport\"]/div/div/div[2]/div/div[2]/div/div/div/div/div[6]/div/div[2]/div/div/a[1]/div")
	public WebElement ourCitiesButton;
	
	@FindBy (xpath = "//button[@class='_og82ai7']")
	public WebElement allCitiesButton;
	
	@FindBy (xpath = "//input[@class='_18zkpeh']")
	public WebElement SearchButton;

	@FindBy (xpath = "//input[@type='text']")
	public WebElement SearchACity;

	@FindBy (xpath = "//a[@href='/s/san-diego-ca']")
	public WebElement SearchSanDiego;
	
	@FindBy (xpath = "//div[@class='container_1qc8myk']/div/div/div")
	public WebElement Data ;
	
	@FindBy (xpath = "//*[@id=\"viewport\"]/div/div/div[2]/div/div[1]/header/div/div/div[1]/div/div/div[3]/div/div/div/div")
	public WebElement Customize ;
	
	@FindBy (xpath = "//*[@id=\"viewport\"]/div/div/div[2]/div/div[1]/header/div/div/div[1]/div/div/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/a/div[1]/div")
	public WebElement PremiumButton ;
	
	@FindBy (xpath = "//*[@id=\"viewport\"]/div/div/div[2]/div/div[1]/header/div/div/div[1]/div/div/div[3]/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]")
	public WebElement WiFiButton;
	
	@FindBy (xpath = "//*[@id=\"viewport\"]/div/div/div[2]/div/div[1]/header/div/div/div[1]/div/div/div[3]/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[2]/div[1]")
	public WebElement BreakfastButton;
	
	@FindBy (xpath = "//*[@id=\"viewport\"]/div/div/div[2]/div/div[1]/header/div/div/div[1]/div/div/div[3]/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[3]/div[1]")
	public WebElement ParkingButton;
	
	@FindBy (xpath = "//*[@id=\"viewport\"]/div/div/div[2]/div/div[1]/header/div/div/div[1]/div/div/div[3]/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[4]/div[1]")
	public WebElement GymButton;
	
	@FindBy (xpath = "//button[@class='_14xftm9z']")
	public WebElement DoneButton;
	
	@FindBy (xpath = "//img[@alt='InterContinental San Diego']")
	public WebElement InterCont;
	
	@FindBy (xpath = "//div[@class='_girkfi'][1]")
	public WebElement ChekIn;
	
	@FindBy (xpath = "//button[@class='_1uss4jb8']")
	public WebElement MonthChekIn;
	
	@FindBy (xpath = "//*[@id=\"viewport\"]/div/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div[3]/div/div[2]/div/div/div[1]/div/div[4]/span[3]/span[3]\n")
	public WebElement dataChekIn;
	
	@FindBy (xpath = "//*[@id=\"viewport\"]/div/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div[3]/div/div[2]/div/div/div[1]/div/div[4]/span[7]/span[3]\n")
	public WebElement dataChekOut;
	
	@FindBy (xpath = "//button[@class='_137ph9fq']")
	public WebElement done;
	
	@FindBy (xpath = "//button[@class='_avx9qz4']")
	public WebElement doneButton;
	
	
	}



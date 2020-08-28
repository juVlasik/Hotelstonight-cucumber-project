package com.hoteltonight.stepDefs;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.hoteltonight.Utilities.BrowserUtilities;
import com.hoteltonight.Utilities.ConfigReader;
import com.hoteltonight.Utilities.Driver;
import com.hoteltonight.pages.SupportPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SupportStepDefinitions {
	@Given("I am on home page")
	public void iAmOnHomePage() {

		Driver.getDriver().get(ConfigReader.getProperty("url"));
		BrowserUtilities.waitFor(5);
	}

	@When("I scroll down the page")
	public void iScrollDownThePage() {

		Driver.getDriver().manage().window().maximize();
		SupportPage sp = new SupportPage();
		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

		js.executeScript("arguments[0].scrollIntoView();", sp.supportButton);

		BrowserUtilities.waitFor(5);

		System.out.println("Scrolled down");

	}

	@And("click on Support")
	public void click_on_Support() {
		SupportPage sp = new SupportPage();
		sp.supportButton.click();
	}

	@And("verify the Support title")
	public void verify_the_Support_title() {
		SupportPage sp = new SupportPage();
		String Supporttext = sp.supportButton.getText();
		Assert.assertEquals(sp.expectedSupportButtonText, Supporttext);
		System.out.println(Supporttext);

	}

	@And("verify all questions and answers")
	public void verify_all_questions_and_answers() {
		SupportPage sp = new SupportPage();
		sp.questionsAndAnswers.get(1).click();
		String actualQuestion1 = sp.questionsAndAnswers.get(1).getText();
		Assert.assertEquals(sp.expectedQuestion1, actualQuestion1);
		System.out.println(actualQuestion1);
		
		String firstAnswer = sp.firstAnswer.getText();
		System.out.println(firstAnswer);
		
		sp.questionsAndAnswers.get(2).click();
		String actualQuestion2 = sp.questionsAndAnswers.get(2).getText();
		Assert.assertEquals(sp.expectedQuestion2, actualQuestion2);
		System.out.println(actualQuestion2);
		
		String secondAnswer = sp.secondAnswer.getText();
		System.out.println(secondAnswer);
					
		sp.questionsAndAnswers.get(3).click();
		String actualQuestion3 = sp.questionsAndAnswers.get(3).getText();
		Assert.assertEquals(sp.expectedQuestion3, actualQuestion3);
		System.out.println(actualQuestion3);
		
		
		
		sp.questionsAndAnswers.get(4).click();
		String actualQuestion4 = sp.questionsAndAnswers.get(4).getText();
		Assert.assertEquals(sp.expectedQuestion4, actualQuestion4);
		System.out.println(actualQuestion4);
		
		sp.questionsAndAnswers.get(5).click();
		String actualQuestion5 = sp.questionsAndAnswers.get(5).getText();
		Assert.assertEquals(sp.expectedQuestion5, actualQuestion5);
		System.out.println(actualQuestion5);

		sp.questionsAndAnswers.get(6).click();
		String actualQuestion6 = sp.questionsAndAnswers.get(6).getText();
		Assert.assertEquals(sp.expectedQuestion6, actualQuestion6);
		System.out.println(actualQuestion6);

		sp.questionsAndAnswers.get(7).click();
		String actualQuestion7 = sp.questionsAndAnswers.get(7).getText();
		Assert.assertEquals(sp.expectedQuestion7, actualQuestion7);
		System.out.println(actualQuestion7);
		
		sp.questionsAndAnswers.get(8).click();
		String actualQuestion8 = sp.questionsAndAnswers.get(8).getText();
		Assert.assertEquals(sp.expectedQuestion8, actualQuestion8);
		System.out.println(actualQuestion8);
		
		sp.questionsAndAnswers.get(9).click();
		String actualQuestion9 = sp.questionsAndAnswers.get(9).getText();
		Assert.assertEquals(sp.expectedQuestion9, actualQuestion9);
		System.out.println(actualQuestion9);
		
		sp.questionsAndAnswers.get(10).click();
		String actualQuestion10 = sp.questionsAndAnswers.get(10).getText();
		Assert.assertEquals(sp.expectedQuestion10, actualQuestion10);
		System.out.println(actualQuestion10);
		
		sp.questionsAndAnswers.get(11).click();
		String actualQuestion11 = sp.questionsAndAnswers.get(11).getText();
		Assert.assertEquals(sp.expectedQuestion11, actualQuestion11);
		System.out.println(actualQuestion11);
		
		sp.questionsAndAnswers.get(12).click();
		String actualQuestion12 = sp.questionsAndAnswers.get(12).getText();
		Assert.assertEquals(sp.expectedQuestion12, actualQuestion12);
		System.out.println(actualQuestion12);
		
		sp.questionsAndAnswers.get(13).click();
		String actualQuestion13 = sp.questionsAndAnswers.get(13).getText();
		Assert.assertEquals(sp.expectedQuestion13, actualQuestion13);
		System.out.println(actualQuestion13);
		
		
	}
}
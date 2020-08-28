package com.hoteltonight.stepDefs;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import com.hoteltonight.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpStepDefinitions {

		

@When("I click on Sign Up button")
public void iClickOnSignUpButton() {
HomePage hp = new HomePage();
hp.signUpButton.click();
}


@When("I enter information from the provided datatable")
public void iEnterInformationFromTheProvidedDatatable(List<Map<String, String>> customers) throws Exception {
	HomePage hp = new HomePage();
	int size = customers.size();
	
	int i = (int) (Math.random()*size);
	System.out.println("i: "+i);
	
	Map <String, String> customer = customers.get(i);
	System.out.println(customer.get("First Name"));
	hp.signUpFirstName.sendKeys(customer.get("First Name"));
	hp.signUpLastName.sendKeys(customer.get("Last Name"));
	hp.signUpEmail.sendKeys(customer.get("Email Address"));
	hp.signUpPassword.sendKeys(customer.get("Password"));
	hp.signUpMobileNum.sendKeys(customer.get("Mobile Number"));
	hp.signUpSubmitButton.click();
	Thread.sleep(3000);
}


@Then("I should receive a message that contains: Welcome Back")
public void iShouldReceiveAMessageThatContainsWelcomeBack() {
	HomePage hp = new HomePage();
	String actualMessage = hp.signUpReturnCustomerMessage.getText();
	String expectedMessage = "Welcome Back";
	System.out.println(actualMessage);
	System.out.println(expectedMessage);
	hp.signUpReturnCustomerGotItButton.click();
	Assert.assertEquals(expectedMessage, actualMessage);   
}









}

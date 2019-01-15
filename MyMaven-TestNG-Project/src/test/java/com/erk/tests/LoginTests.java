package com.erk.tests;

import org.testng.annotations.Test;

import com.erk.pages.GoogleHomePage;
import com.erk.pages.SignInPage;
import com.erk.testBase.TestBase;
import com.erk.utilies.BrowserUtilities;
import com.erk.utilies.ConfigurationReader;

public class LoginTests extends TestBase {

	@Test
	public void pozitiveLoginScnerio() {
		
		GoogleHomePage google= new GoogleHomePage();
		google.gMail.click();
		SignInPage signIn = new SignInPage();
		signIn.signIn.click();
		signIn.userName.sendKeys(ConfigurationReader.getProperty("username"));
		BrowserUtilities.waitFor(3000);
		signIn.nextButton.click();
		BrowserUtilities.waitFor(3000);
		signIn.password.sendKeys(ConfigurationReader.getProperty("password"));
		BrowserUtilities.waitFor(3000);
		signIn.nextButton.click();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

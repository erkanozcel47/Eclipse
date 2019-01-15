package com.erk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erk.utilies.Driver;

public class SignInPage {

	public SignInPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")
	public WebElement signIn;
	
	@FindBy(xpath="//input[@jsname='YPqjbf']")
	public WebElement userName;
	
	@FindBy(xpath="//span[.='Next']")
	public WebElement nextButton;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	
 
	
	
	

}

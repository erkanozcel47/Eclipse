package com.erk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erk.utilities.Driver;

public class SigninPage {
	public SigninPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "email_create")
	public WebElement signupEmail;
	
	@FindBy(id = "email")
	public WebElement loginEmail;
	
	@FindBy(id = "password")
	public WebElement password;
	
	@FindBy(id = "submitLogin")
	public WebElement submitLogin;
	
}

 

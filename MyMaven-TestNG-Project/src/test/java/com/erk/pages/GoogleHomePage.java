package com.erk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erk.utilies.Driver;

public class GoogleHomePage {
	
	public GoogleHomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(xpath="//a[.='Gmail']")
	public WebElement gMail;
	
	
	
	
	
	

}

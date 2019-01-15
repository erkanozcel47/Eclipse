package com.erk.testBase;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.erk.utilies.Driver;
import com.erk.utilies.ConfigurationReader;

public abstract class TestBase {
	
	WebDriver driver;
	Actions actions;
	@BeforeClass
	public void setUp() {
		
		driver = Driver.getDriver();
		actions = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.get(ConfigurationReader.getProperty("url"));
 
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.closeDriver();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

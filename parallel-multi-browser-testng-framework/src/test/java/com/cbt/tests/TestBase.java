package com.cbt.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.cbt.utilities.ConfigurationReader;
import com.cbt.utilities.Driver;

public abstract class TestBase {
	
	protected WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String browser) {
		driver= Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("url"));
		
	    
	}
	
	@AfterMethod
	public void tearDown() {
        	Driver.closeDriver();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

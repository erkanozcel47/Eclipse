package testCases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import peges.LoginPage;
import peges.WebOrders;

public class Login {
	
	WebDriver driver;
	LoginPage loginPage;
	WebOrders webOrders;
	String userName="Tester";
	String passWord="test";
	String url="http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx";
	String cstrmName="Erknclk";
	String street="13 Street";
	String city="Toronto";
	String state="On";
	String visaNumber="1234567891234567";
	String visaExpDate="12/20";
	
	 
	
	
	 
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//	driver.manage().window().fullscreen();
	}
	
	 @Test
	 public void verifyOrder() {
		 driver.get(url);
		 loginPage = new LoginPage(driver);
		 loginPage.userName.sendKeys(userName);
		 loginPage.password.sendKeys(passWord);
		 loginPage.loginButton.click();
		 webOrders = new WebOrders(driver);
		 webOrders.order.click();
	 	//Select select = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
		//select.deselectByVisibleText("FamilyAlbum");
    	 webOrders.quantity.click();
		 webOrders.quantity.sendKeys("100");
		 webOrders.calculatorButton.click();
		 
		 webOrders.costumerName.sendKeys(cstrmName);
		 webOrders.streetAddress.sendKeys(street);
		 webOrders.cityName.sendKeys(city);
		 webOrders.stateName.sendKeys(state);
		 webOrders.zipAddress.sendKeys("123456");
		 
		 webOrders.visaRadioButton.click();
		 webOrders.visaCardNumber.sendKeys(visaNumber);
		 webOrders.visaCardExpDate.sendKeys(visaExpDate);
		 webOrders.processButton.click();
		 webOrders.ViewAllOrders.click();
		 
		 List<WebElement> ls =driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]"));
		System.out.println(ls.size());
		
		 List<String> ls2 = new ArrayList<>();
		 for (WebElement each : ls) {
			ls2.add(each.getText());
		}
		 System.out.println(ls2);
		 System.out.println(ls2.size());
		 
		  
		 
		 
		 
		 
		 
		 
		 
	 }
	 

	 
	
	
	
	
}

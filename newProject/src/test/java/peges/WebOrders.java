package peges;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WebOrders {

	public WebOrders(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='Process.aspx']")
	public WebElement order;
	
	@FindBy(id="ctl00_MainContent_fmwOrder_ddlProduct")
	public WebElement product;

	@FindBy(id="ctl00_MainContent_fmwOrder_txtQuantity")
	public WebElement quantity;
 
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement calculatorButton;

	@FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtName']")
	public WebElement costumerName;

    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox2")
	public WebElement streetAddress;
    
    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox3")
	public WebElement cityName;
	
    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox4")
  	public WebElement stateName;
  	
    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox5")
  	public WebElement zipAddress;
    
    @FindBy(xpath="//input[@name='ctl00$MainContent$fmwOrder$cardList']")
  	public WebElement visaRadioButton;
    
    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox6")
  	public WebElement visaCardNumber;
    
    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox1")
  	public WebElement visaCardExpDate;
    
    @FindBy(xpath="//a[contains(text(),'Process')]")
  	public WebElement processButton;
    
    @FindBy(linkText="View all orders")
	public WebElement  ViewAllOrders;
    
 
    
    
    
    
    
    
}

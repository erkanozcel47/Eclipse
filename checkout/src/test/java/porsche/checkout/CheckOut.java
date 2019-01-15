package porsche.checkout;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckOut {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		//1. Open browser     
		WebDriver driver =new ChromeDriver();
		//2. Go to url “https://www.porsche.com/usa/modelstart/”
		driver.get("https://www.porsche.com/usa/modelstart/");
		//3. Select model 718   
		driver.findElement(By.cssSelector("div[class='b-teaser-caption-wrapper']")).click();
		//5. Click on Build & Price under 718 Cayman
	    //driver.findElement(By.xpath("//div[@id='m982120']")).click();
		WebElement mainOne = driver.findElement(By.cssSelector("div[class='m-14-model-name']"));
		mainOne.click();
		//6. Verify that Base price displayed on the page is same as the price from step 4 
		//Before that i have to switch the new windows opened
		Thread.sleep(5000);
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> iter=windowIds.iterator();


		String mainWindow =iter.next();
		String childWindow=iter.next();
		
		//7. Verify that Price for Equipment is 0
		String aa = driver.findElement(By.xpath("//*[@id='s_price']/div[1]/div[2]/div[1]")).getText();
		System.out.println(aa);
		
		//div[contains(@class, 'atag') and contains(@class ,'btag')]
		
		
		
		

	}

}

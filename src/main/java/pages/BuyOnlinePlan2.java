package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyOnlinePlan2 {
	
	WebDriver driver;
	
	
	
	public BuyOnlinePlan2(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	
	
	
	public void onlinePlans() {
		
		WebElement olp = driver.findElement(By.xpath("//*[@data-action='online plans']"));
		olp.click();
		
	}
	
	
	
	
	
	
	
	
	

}

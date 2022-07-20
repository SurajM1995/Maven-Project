package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyOnlinePlan {
	
	WebDriver driver;
	@FindBy(xpath = "//*[@data-action='online plans']")
	private WebElement olp;
	@FindBy(xpath = "(//*[@class='boxInfo position-relative']//*[text()='Know more'])[2]")
	private WebElement retirementplan;
	
	
	public BuyOnlinePlan(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void onlinePlans() {
		
		olp.click();
		
		retirementplan.click();
		
	}
	
	
	public String getUrl() {
		
		String url = driver.getCurrentUrl();
		
		return url;
		
		
	}
	
	
	
	
	
	

}

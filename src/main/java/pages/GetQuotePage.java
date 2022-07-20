package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GetQuotePage extends BaseClass {
	
	WebDriver driver;
	@FindBy(xpath = "(//*[text()='+'])[1]")
	WebElement numberofadults;
	
	@FindBy(xpath = "//*[@id='txtMobile']")
	WebElement mobilenum;
	
	@FindBy(xpath = "//*[@id='txtPinCode']")
	WebElement pincode;
	
	@FindBy(xpath = "//*[@id='ctl00_Content_C001_btnCalculte']")
	WebElement getquote;
	
	
	public GetQuotePage(WebDriver driver) throws IOException {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	public void enterData() throws IOException {
		
		numberofadults.click();
		numberofadults.click();
		
//		mobilenum.sendKeys(prop.getProperty("mobilenum"));
//		
//		pincode.sendKeys(prop.getProperty("pincode"));
		
		mobilenum.sendKeys(readdata(6, 0));
	
		pincode.sendKeys(readdata(7, 2));
		
	}
	
	
	
	
	
	
	public boolean verifyTitle() {
		
		String actualtitle = driver.getTitle();
		
		boolean expectitle = actualtitle.contains("Health");
		
		return expectitle;
		
	}
	
	
	
	public void submit() {
		
		
		
		getquote.click();
		
		
	}
	
	
	
	
	
	
	
	
	

}

package testclasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BuyOnlinePlan;
import pages.BuyOnlinePlan2;
import pages.GetQuotePage;
import pages.HomePage;

public class BaseTest {
	
	public static WebDriver driver;
	public BuyOnlinePlan buyop;
	public HomePage hp;
	public GetQuotePage gqp;
	
	@BeforeSuite
	public void initDriver() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
//		WebDriverManager.firefoxdriver().setup(); //--->FF
		
		ChromeOptions options = new ChromeOptions();
		
//		FirefoxOptions options = new FirefoxOptions(); //---->FF
		
		options.addArguments("--start-maximized");
		
		options.addArguments("--disable-notifications");
		
//		options.addArguments("--incognito");
		
//		options.addArguments("--headless");
		
		driver = new ChromeDriver(options); 
		
//		driver = new FirefoxDriver(options); //------> FF
		
//		driver.manage().window().maximize();
		
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		driver.get(prop.getProperty("testsiteurl"));
		
	}
	
	
	@BeforeClass
	public void objectCreation() throws IOException {
		
		buyop = new BuyOnlinePlan(driver);
		
		
		
		hp = new HomePage(driver);
		
		gqp = new GetQuotePage(driver);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static String captureScreenShotWithreturnPath(WebDriver driver, String name) throws IOException {
		
		TakesScreenshot scr = (TakesScreenshot)driver;
		File source = scr.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"\\TakenScreenshots\\"+name+".png";
		File desti = new File(path);
		FileHandler.copy(source, desti);
		
		return path;
		
	}
	
	
	public static void capturescreenshot(WebDriver driver, String name) throws IOException {
		
		TakesScreenshot scr = (TakesScreenshot)driver;
		File source = scr.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"\\TakenScreenshots\\"+name+".png";
		File desti = new File(path);
		FileHandler.copy(source, desti);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

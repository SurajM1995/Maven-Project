package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class HomeTest extends Listeners {
	
	@Test(priority = 1)
	public void selectInsuranceType() {
		
		test.info("Selecting the Insurance");
		hp.selectInsurance("health");
		
		test.info("Selected the Insurance as Health");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

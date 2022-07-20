package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BuyOnlinePlan;
import pages.BuyOnlinePlan2;

public class OnlinePlansVerificationTest extends BaseTest {
	
	
	
	
	@Test(priority = 1)
	public void clickOnOlPlan() {
		
		buyop.onlinePlans();
		
	}
	
	
	@Test(priority = 2)
	public void verifyURL() {
		
		String actualurl = buyop.getUrl();
		
		 boolean expectedurl = actualurl.contains("retirement");
		 
		 
		 Assert.assertTrue(expectedurl);
		 
		 Assert.fail("Deliberately fail by me");
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

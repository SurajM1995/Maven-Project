package testclasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class GetQuoteTest extends Listeners {
	
	
	@Test(priority = 2)
	public void titleValidation() {
		
		test.info("Verifying the Title");
		boolean title = gqp.verifyTitle();
		
		Assert.assertEquals(title, false);
		test.info("Title has been Verified");
	}
	
	
	@Test(priority = 3)
	public void enterNSubmit() throws InterruptedException, IOException {
		
		test.info("Entering the data to the form");
		gqp.enterData();
		test.info("Data has been entered");
		
		Thread.sleep(6000);
		gqp.submit();
		test.info("Data has been submitted");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package testclasses;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Screenshot;



public class ListenersClass extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Method Start --> " + result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test run Successfully " + result.getName());

		
	} 

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("This Test is Failed and ss is taken "+ result.getName());
		
		
		try {
			Screenshot.capturescreenshot(driver, result.getName());
		} catch (IOException e) {
			System.out.println("screenshot exception handled");
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Ganpati Bappa Morya"+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-"+context.getName());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

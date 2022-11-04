package Utility;


import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
public class Listeners extends BaseClass implements ITestListener  {

	public void onTestStart(ITestResult result) {
System.out.println("Test is started"+ result.getName());
	}

public void onTestskipped(ITestResult result) {
System.out.println("Test is skipped"+ result.getName());
	}	

public void onTestSuccess(ITestResult result) {
System.out.println("Test is Passed"+ result.getName());
	}

public void onTestFailure(ITestResult result) {	
try {
	Screenshots.ScreenShots(Driver, result.getName());
} catch (IOException e) {
	
	e.printStackTrace();
}
}
	
	
	
	
	
	
	
	
	
	
	
	
}

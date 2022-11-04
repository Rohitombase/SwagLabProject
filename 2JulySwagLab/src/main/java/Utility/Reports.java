package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {

	public static ExtentReports Addreport() {
	ExtentSparkReporter	Html = new ExtentSparkReporter("ExtentReport.html");
	ExtentReports reports = new ExtentReports();
	reports.attachReporter(Html);
	reports.setSystemInfo("Created by", "Rohit");
	reports.setSystemInfo("Testing Type", "Regression");
		return reports;
		
	
	
	

	
	
}
}
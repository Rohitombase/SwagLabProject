package Test;

import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POJO.Browser;
import POM.SwagLabLoginPage;
import Utility.BaseClass;
import Utility.Parametrization;
import Utility.Reports;

@Listeners(Utility.Listeners.class)
public class SwagLabLoginTest extends BaseClass {
  ExtentReports reports;
  ExtentTest Test;
	
	@BeforeTest
	public void configurereports() {
		reports = Reports.Addreport();
	}
	@BeforeMethod
	public void launchBrowser() {
		Driver = Browser.openBrowser();
	}
@DataProvider(name = "LoginData")
public Object [][]Data() throws EncryptedDocumentException, IOException{
String Password = Parametrization.Getsheetdata("Sheet1", 2, 2);
return new Object[][]{{Parametrization.Getsheetdata("Sheet1",1,1),Password},{Parametrization.Getsheetdata("Sheet1",3,1),Password}};
}	

@Test(dataProvider = "LoginData")
public void swagLabLoginTestWithValidCrediantials(String User, String Pass) {
Test = reports.createTest("swagLabLoginTestWithValidCrediantials");
SwagLabLoginPage SwagLabLoginPage = new SwagLabLoginPage(Driver);
SwagLabLoginPage.enterUserName(User);
SwagLabLoginPage.enterpassword(Pass);
SwagLabLoginPage.clickOnLogin();
assertEquals(Driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
}

@AfterMethod
public void getTestResults(ITestResult result){
if(result.getStatus()==ITestResult.SUCCESS)
	{
Test.log(Status.PASS, result.getName());
	}
else if(result.getStatus()==ITestResult.FAILURE)
	{
Test.log(Status.FAIL, result.getName());
	}	
	
else 
{
Test.log(Status.SKIP, result.getName());
}
}
@AfterTest
public void publishreport() {
	reports.flush();
}
}	
















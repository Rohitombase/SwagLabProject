package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshots {

public static void ScreenShots(WebDriver Driver, String Name) throws IOException {

	File Source = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
    File Destination = new File("C:\\Users\\Rohit Ombase\\Desktop\\Workspace\\2JulySwagLab\\ScreenShots\\" +Name+"+ .png");
    FileHandler.copy(Source, Destination);
}
	
	
	
	
	
	
	
	
	
	
}

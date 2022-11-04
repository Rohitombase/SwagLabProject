package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {

	@FindBy (xpath = "(//input[@placeholder = 'Username'])") private WebElement UserName;
	@FindBy (xpath = "(//input[@placeholder = 'Password'])") private WebElement password;
	@FindBy (xpath = "(//input[@type = 'submit'])") private WebElement Login;
	
	public SwagLabLoginPage(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
	}
	
	public void enterUserName(String Name) {
		UserName.sendKeys(Name);
	}
	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickOnLogin() {
     Login.click();
	}
	
	
	
	
	
	
	
}

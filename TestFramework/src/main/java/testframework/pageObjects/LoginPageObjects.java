package testframework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	
	@FindBy(id="txtUsername")
	WebElement usernameField;
	
	@FindBy(id="txtPassword")
	WebElement passwordField;
	
	@FindBy(id="btnLogin")
	WebElement btnLogin;
	
	public WebDriver driver;
	
	// Constructor to initialize the page elements
	public LoginPageObjects(WebDriver driver){
		PageFactory.initElements(driver, this);
		
		this.driver=driver;
	}
	
	public void loginStep(String userNameValue, String passwordValue){
		//Enter Username
		usernameField.sendKeys(userNameValue);
		// Enter password
		passwordField.sendKeys(passwordValue);
		// Click on Login button
		btnLogin.click();
	}
	

}

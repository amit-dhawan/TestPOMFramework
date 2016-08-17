package learn.amit.TestFramework;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import testframework.pageObjects.AdminUserManagementPageObjects;
import testframework.pageObjects.LoginPageObjects;

public class SanityTask extends BaseSetup {

	public LoginPageObjects loginpage ;
	public AdminUserManagementPageObjects adminusermanagementpage;
	
	// User credentials of admin Login Page
	String userNameValue = "Admin";
	String passwordValue = "admin";
	
	@Test(priority=0)
	public void userLoginWithValidCredentials(){
		
		// instintatiate loginpage object
		loginpage = new LoginPageObjects(driver);
		
		// Test Login functionality
		loginpage.loginStep(userNameValue, passwordValue);
		
		// Assert LoginPage message
		AssertJUnit.assertEquals(driver.findElement(By.id("welcome")).getText(), "Welcome Admin");
	}
	
	@Test(priority=1)
	public void clickOnMenuItemSkills() {
		// instantiate object of AdminUserManagementPage
		adminusermanagementpage = new AdminUserManagementPageObjects(driver);
	
		// Click on view Skills menu item
		adminusermanagementpage.hoveronMenuItemAdmin();
		adminusermanagementpage.hoverOnMenuItemQualifications();
		adminusermanagementpage.clickOnSkills();
		
	}
	
	
	
}

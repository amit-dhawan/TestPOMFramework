package testframework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminUserManagementPageObjects {

	WebDriver driver;
	Actions action;

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement menuViewAdminModule;

	@FindBy(id = "menu_admin_UserManagement")
	WebElement menuAdminUserManagement;

	@FindBy(id = "menu_admin_Job")
	WebElement menuAdminJob;

	@FindBy(id = "menu_admin_Organization")
	WebElement menuAdminOrganisation;

	@FindBy(id = "menu_performance_getEmployeeCompetencyList")
	WebElement menuAdminCompentencies;

	@FindBy(id = "menu_admin_Qualifications")
	WebElement menuAdminQualification;

	@FindBy(xpath = ".//*[@id='menu_admin_viewSkills']")
	WebElement menuAdminViewSkills;

	public AdminUserManagementPageObjects(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	// MOuseHover on MenuItem Admin

	public void hoveronMenuItemAdmin() {

		action = new Actions(driver);

		action.moveToElement(menuViewAdminModule).build().perform();
	}

	// Mouse Hover on Menu Item Qualification
	public void hoverOnMenuItemQualifications() {

		action = new Actions(driver);
		action.moveToElement(menuAdminQualification).build().perform();

	}

	// Click on Qualifications Menu Item - Skills
	public void clickOnSkills() {

		if (menuAdminViewSkills.isDisplayed()) {
			action.moveToElement(menuAdminViewSkills).click().build().perform();
		} else {

			action.moveToElement(menuAdminQualification)
					.moveToElement(menuAdminViewSkills).build().perform();
		}
	}

}

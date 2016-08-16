package learn.amit.TestFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseSetup {

	public static WebDriver driver;
	public static String sURL = "http://professional.demo.orangehrmlive.com/";

	@BeforeClass
	public static void before() {
		// instantiate new browser
		driver = new FirefoxDriver();
		// maximize window
		driver.manage().window().maximize();
		// get URL
		driver.get(sURL);
		// page load wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		// implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//
	}

	@AfterClass
	public static void closeBrowser() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
	}
}

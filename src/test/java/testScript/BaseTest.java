package testScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pageObjects.*;

public class BaseTest {
	protected static WebDriver driver;
	protected static HomePage home;
	protected static LoginPage login;
	
	@BeforeMethod
	@Parameters("browser")
	public static void testSetup(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
		}
		else {
			driver = new ChromeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://agile1test.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		home = new HomePage(driver);
		
		login = new LoginPage(driver);
	}
	
	@AfterMethod
	public static void testTeardown() {
		if(driver!=null) {
			driver.quit();
		}
	}
}

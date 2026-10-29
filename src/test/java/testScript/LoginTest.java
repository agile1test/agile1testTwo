package testScript;

import org.testng.annotations.Test;

import utilities.DataProviderClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LoginTest extends BaseTest{

	 
	
  @Test(priority = 10,groups= {"positive","smoke"},    dataProviderClass = DataProviderClass.class,dataProvider = "positiveLoginData")
  public void positiveLogin(String email,String pass) {
		home.clickSignIn();
		login.insertEmail(email);
		login.insertPassword(pass);
		login.clickLogin();
		
		Assert.assertEquals(driver.getCurrentUrl(),"https://agile1test.com/qa-portal/dashboard.php");	
		
  }
  
	
	
	@Test(priority=5, dataProviderClass = DataProviderClass.class, dataProvider = "negativeLoginData")
	public void negativeLogin(String email,String pass) {
		home.clickSignIn();
		login.insertEmail(email);
		login.insertPassword(pass);
		login.clickLogin();
		
		Assert.assertFalse(login.errorDiplayed(), "Error msg is not displayed!");
		
		
	}
	

	
  

}

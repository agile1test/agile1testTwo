package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	private By signInLinkBy = By.partialLinkText("Sign In"); 
	public void clickSignIn() {
		clickElement(signInLinkBy);
	}
}

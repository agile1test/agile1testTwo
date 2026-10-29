package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	private By txtEmail = By.xpath("//input[@name='email']");
	private By txtPassword = By.xpath("//input[@name='password']");
	private By btnLogin = By.xpath("//button[@id='btn-login']");
	
	private By passErrorMsg = By.xpath("//div[@id='login-error']");
	
	public void insertEmail(String text) {
		insertText(txtEmail, text);
	}
	
	public void insertPassword(String text) {
		insertText(txtPassword, text);
	}
	
	
	public void clickLogin() {
		clickElement(btnLogin);
	}
	
	
	public boolean errorDiplayed() {
		return driver.findElement(passErrorMsg).isDisplayed();
	}
}

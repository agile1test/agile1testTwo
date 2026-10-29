package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void clickElement(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	
	
	public void insertText(By locator, String text) {
		WebElement element = driver.findElement(locator);
		
		wait.until(ExpectedConditions.visibilityOf(element)).clear();
		element.sendKeys(text);
	}



}

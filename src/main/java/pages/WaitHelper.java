package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	
	public WebDriver driver;

	public WaitHelper(WebDriver driver) {
		this.driver = driver;

	}

	@SuppressWarnings("deprecation")
	public void WaitForElement(WebElement element, long timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, 5000);
//		WebDriverWait.WebDriverWait(WebDriver driver, Duration timeout)

		wait.until(ExpectedConditions.visibilityOf(element));
	}

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;

public class WelcomePage {
	
	private WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();

	public WelcomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement ContinueBtn;
	
	public void clickContinueBtn() {
		js.javaScriptClick(driver, ContinueBtn);
	}

	//get welcome page title
			public String getWelcomePageTitle() {
				return driver.getTitle();
			}
}

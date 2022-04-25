package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;

public class ThanksForRegisteringPage {
	
	 WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper;

	public ThanksForRegisteringPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	@FindBy(xpath = "//h2[text()=\"Thanks for registerings\"]")
	private WebElement ThanksForRegisteringText;

	public boolean isThanksForRegisteringTextDisplayed() 
	{
		return ThanksForRegisteringText.isDisplayed();
	}
	
	

}

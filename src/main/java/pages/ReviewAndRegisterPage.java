package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;

public class ReviewAndRegisterPage {
	
	private WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper;

	public ReviewAndRegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	@FindBy(xpath = "//button[@class=\"form-btn form-btn form-btn--blue form-btn__submit-summary g-spacing--left-30-lg\"]")
	private WebElement SubmitRegistrationBtn;

	public void clickSubmitRegistrationBtn() {
		waitHelper.WaitForElement(SubmitRegistrationBtn, 60);
		js.javaScriptClick(driver, SubmitRegistrationBtn);
	}

}

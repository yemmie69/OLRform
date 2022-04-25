package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;

public class PatientDetailsPage {

	private WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper;

	public PatientDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper=new WaitHelper(driver);

	}

	@FindBy(xpath = "//input[@data-val-required=\"Please tell us who you are in order to start pre-registration (required) is required.\"]")
	private WebElement ThePatient;

	public void clickThePatient() {
		waitHelper.WaitForElement(ThePatient, 60);
		js.javaScriptClick(driver, ThePatient);
	}

	@FindBy(xpath = "//button[@data-sc-field-key=\"EF55CFC7EEFD4C4C81C7B8A49FA858BB\"]")
	private WebElement ThePatientPageNextBtn;

	public void clickThePatientPageNextBtn() {
		waitHelper.WaitForElement(ThePatientPageNextBtn, 60);
		js.javaScriptClick(driver, ThePatientPageNextBtn);
	}
	
	

}

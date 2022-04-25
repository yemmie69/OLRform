package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;

public class SecurityQuestionsPage {

	private WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper;


	public SecurityQuestionsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper=new WaitHelper(driver);


	}

	public void securityQuestion() throws InterruptedException {

		Thread.sleep(5000);

		// This is Text name of all the security question fields
		String dobField = "Date of birth (required)", fnameField = "First name (required)",
				doaField = "Date of admission (required)", emailField = "E-mail (required)",
				familyName = "Family name (Surname) (required)";

		// This is to get List of all the security question fields
		List<WebElement> fields = driver
				.findElements(By.xpath("//*[starts-with(@class,'form__input form__input--multi')]"));

		for (WebElement ele : fields) {
			String currentField = ele.getText();

			// This is to input Date of birth
			if (currentField.contains(dobField)) {
				driver.findElement(By.xpath("//input[@data-val-required=\"Date of birth (required) is required.\"]"))
						.sendKeys("28111970");

				// This is to input First name
			} else if (currentField.contains(fnameField)) {
				driver.findElement(By.xpath("//input[@data-val-required=\"First name (required) is required.\"]"))
						.sendKeys("Yemiol");

				// This is to input Family name
			} else if

			(currentField.contains(familyName)) {
				driver.findElement(
						By.xpath("//input[@data-val-required=\"Family name (Surname) (required) is required.\"]"))
						.sendKeys("Oluv");

				// This is to input Date of admission
			} else if (currentField.contains(doaField)) {
				driver.findElement(
						By.xpath("//input[@data-val-required=\"Date of admission (required) is required.\"]"))
						.sendKeys("01042022");

				// This is to input Email
			} else if (currentField.contains(emailField)) {
				driver.findElement(By.xpath("//input[@data-val-required=\"E-mail (required) is required.\"]"))
						.sendKeys("yemi@test.com");

			}

		}

	}

	// This is to click Accept cookies
	@FindBy(xpath = "//button[@id=\"gdpr-allow-all\"]")
	private WebElement OkBtn;

	public void clickOkBtn() {
		waitHelper.WaitForElement(OkBtn, 60);
		js.javaScriptClick(driver, OkBtn);
	}

	// This is to click Verify details to get started button
	@FindBy(xpath = "//button[text()=\"Verify details to get started\"]")
	private WebElement VerifyDetailsBtn;

	public void clickVerifyDetailsBtn() {
		waitHelper.WaitForElement(VerifyDetailsBtn, 60);
		js.javaScriptClick(driver, VerifyDetailsBtn);
	}

}

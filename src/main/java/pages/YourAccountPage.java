package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class YourAccountPage {
	
	private WebDriver driver;

	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);

	public YourAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_094fbb49-a914-4d14-a9b4-f5ccac8a9371__Value\"]")
	private WebElement TandCconfirmation;

	public void clickTandCconfirmation() {
		js.javaScriptClick(driver, TandCconfirmation);
	}
	
	@FindBy(xpath = "//input[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.Fields[f33e3d59-47c4-4231-8e7b-6781165a9b15].Value\"][@value=\"Yes\"]")
	private WebElement YesShareContactInfo;

	public void clickYesShareContactInfo() {
		js.javaScriptClick(driver, YesShareContactInfo);
	}

	@FindBy(xpath = "//input[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.Fields[f33e3d59-47c4-4231-8e7b-6781165a9b15].Value\"][@value=\"No\"]")
	private WebElement NoDontShareContactInfo;

	public void clickNoDontShareContactInfo() {
		js.javaScriptClick(driver, NoDontShareContactInfo);
	}
	
	@FindBy(xpath = "//input[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.Fields[8b96580b-ace4-4b6a-afa7-4fd48ce39c91].Value\"][@value=\"Yes\"]")
	private WebElement YesUseMyDetails;

	public void clickYesUseMyDetails() {
		js.javaScriptClick(driver, YesUseMyDetails);
	}
	
	@FindBy(xpath = "//input[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.Fields[8b96580b-ace4-4b6a-afa7-4fd48ce39c91].Value\"][@value=\"No\"]")
	private WebElement NoDontUseMyDetails;

	public void clickNoDontUseMyDetails() {
		js.javaScriptClick(driver, NoDontUseMyDetails);
	}
	
	@FindBy(xpath = "//input[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.236ce0be-39db-4f70-bc35-aad7010ded97\"]")
	private WebElement YourAccountNextButton;

	public void clickYourAccountNextButton() {
		js.javaScriptClick(driver, YourAccountNextButton);
	}
}

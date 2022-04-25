package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;

public class AboutTheAppointmentPage {
	
	private WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper;

	public AboutTheAppointmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper=new WaitHelper(driver);

	}
	
	// This is to click 'Yes' I confirm receipt of the above information (required)

	@FindBy(xpath = "//input[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.Fields[3cdb72d1-6729-4f2f-a91d-f4e54c87083b].Value\"][@value=\"Yes\"]")
	private WebElement YesConfirmReceiptOfInformation;

	public void clickYesConfirmReceiptOfInformation() {
		waitHelper.WaitForElement(YesConfirmReceiptOfInformation, 60);
		js.javaScriptClick(driver, YesConfirmReceiptOfInformation);
	}
	
	// This is to click 'No' I confirm receipt of the above information (required)

	@FindBy(xpath = "//input[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.Fields[3cdb72d1-6729-4f2f-a91d-f4e54c87083b].Value\"][@value=\"No\"]")
	private WebElement NoIHaveNotReceivedInformation;

	public void clickNoIHaveNotReceivedInformation() {
		waitHelper.WaitForElement(NoIHaveNotReceivedInformation, 60);
		js.javaScriptClick(driver, NoIHaveNotReceivedInformation);
	}
	
	// This is to click About the appointment page Next button 
	@FindBy(xpath = "//button[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.98ad006a-ae73-4cfc-a4b8-1b17573843ca\"]")
	private WebElement AboutTheAppointmentPageNextBtn;

	public void clickAboutTheAppointmentPageNextBtn() {
		waitHelper.WaitForElement(AboutTheAppointmentPageNextBtn, 60);
		js.javaScriptClick(driver, AboutTheAppointmentPageNextBtn);
	}
	

}

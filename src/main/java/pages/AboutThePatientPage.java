package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.JavaScriptExecutor;

public class AboutThePatientPage {

	private WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper;

	public AboutThePatientPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	
	@FindBy(xpath = "//select[@data-sc-field-name=\"OLR2APILV_OLR-014_Dropdown title\"]")
	private WebElement TitleDrpDwn;

	public void selectTitleDrpDwn() {
		waitHelper.WaitForElement(TitleDrpDwn, 60);
		Select titleDrop = new Select(TitleDrpDwn);
		titleDrop.selectByIndex(5);
	}
	
	@FindBy(xpath = "//input[@data-sc-field-name=\"OLR2API_OLR-017_Text other name initials\"]")
	private WebElement OtherName;

	public void inputOtherName(String othername) {
		waitHelper.WaitForElement(OtherName, 60);
		OtherName.clear();
		OtherName.sendKeys(othername);	
		}
	
	@FindBy(xpath = "//select[@data-sc-field-name=\"OLR2APILV_OLR-019_Dropdown religion\"]")
	private WebElement ReligionDrpDwn;

	public void selectReligionDrpDwn() {
		waitHelper.WaitForElement(ReligionDrpDwn, 60);
		Select religionDrpDwn = new Select(ReligionDrpDwn);
		religionDrpDwn.selectByIndex(1);
	}
	
	@FindBy(xpath = "//select[@data-sc-field-name=\"OLR2APILV_OLR-020_Dropdown ethnicity\"]")
	private WebElement EthnicityDrpDwn;

	public void selectEthnicityDrpDwn() {
		waitHelper.WaitForElement(EthnicityDrpDwn, 60);
		Select ethnicityDrpDwn = new Select(EthnicityDrpDwn);
		ethnicityDrpDwn.selectByIndex(1);
	}
	
	@FindBy(xpath = "//select[@data-sc-field-name=\"OLR2APILV_OLR-021_Dropdown sex at birth\"]")
	private WebElement 	SexAtBirthDrpDwn;

	public void selectSexAtBirthDrpDwn() {
		waitHelper.WaitForElement(SexAtBirthDrpDwn, 60);
		Select sexAtBirthDrpDwn = new Select(SexAtBirthDrpDwn);
		sexAtBirthDrpDwn.selectByIndex(1);
	}
	
	@FindBy(xpath = "//input[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.Fields[92ee7887-f723-4eb3-a3b8-38e06345f73b].Value\"]")
	private WebElement NhsNumber;

	public void inputNhsNumber(String nhsnumber) {
		waitHelper.WaitForElement(NhsNumber, 60);
		NhsNumber.clear();
		NhsNumber.sendKeys(nhsnumber);	
		}
	
	@FindBy(xpath = "//button[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.a49533b9-f912-42ba-a758-2cb75bd98481\"]")
	private WebElement AboutThePatientPageNextBtn;

	public void clickAboutThePatientPageNextBtn() {
		waitHelper.WaitForElement(AboutThePatientPageNextBtn, 60);
		js.javaScriptClick(driver, AboutThePatientPageNextBtn);
	}
	
}



package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.JavaScriptExecutor;

public class EmergencyContactDetailsPage {

	private WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper;

	public EmergencyContactDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

	@FindBy(xpath = "//select[@data-sc-field-name=\"OLR2APILV_OLR-049_Dropdown emergency title\"]")
	private WebElement EmergencyContactTitleDrpDwn;

	public void selectEmergencyTitleDrpDwn() {
		waitHelper.WaitForElement(EmergencyContactTitleDrpDwn, 60);

		Select emergencyContactTitleDrpDwn = new Select(EmergencyContactTitleDrpDwn);
		emergencyContactTitleDrpDwn.selectByIndex(2);
	}

	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_202c005e-2f06-4b8f-a14c-40b78d8bd730__Value\"]")
	private WebElement EmergencyContactFirstName;

	public void inputEmergencyContactFirstName(String emergencycontactfirstname) {
		waitHelper.WaitForElement(EmergencyContactFirstName, 60);
		EmergencyContactFirstName.clear();
		EmergencyContactFirstName.sendKeys(emergencycontactfirstname);
	}

	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_7533c2d5-6680-4401-8553-6f0868ca44bb__Value\"]")
	private WebElement EmergencyContactLastName;

	public void inputEmergencyContactLastName(String emergencycontactlastname) {
		waitHelper.WaitForElement(EmergencyContactLastName, 60);
		EmergencyContactLastName.clear();
		EmergencyContactLastName.sendKeys(emergencycontactlastname);
	}

	@FindBy(xpath = "//select[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_d7efbefa-a211-405b-add9-8a704c32fb3a__Value\"]")
	private WebElement RelationshipToPatientDrpDwn;

	public void selectRelationshipToPatientDrpDwn() {
		waitHelper.WaitForElement(RelationshipToPatientDrpDwn, 60);

		Select relationshipToPatientDrpDwn = new Select(RelationshipToPatientDrpDwn);
		relationshipToPatientDrpDwn.selectByIndex(3);
	}

	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_dbc8af26-891c-49bf-9421-62a02e1069e4__Value\"]")
	private WebElement EmergencyContactMobileNumber;

	public void inputEmergencyContactMobileNumber(String emergencycontactmobilenumber) {
		waitHelper.WaitForElement(EmergencyContactMobileNumber, 60);
		EmergencyContactMobileNumber.clear();
		EmergencyContactMobileNumber.sendKeys(emergencycontactmobilenumber);
	}

	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_66fb992d-1e9e-4f40-86ed-d8a9ad5ea7bd__Value\"]")
	private WebElement EmergencyAdditionalTelephoneNumber;

	public void inputEmergencyAdditionalTelephoneNumber(String emergencyadditionaltelephonenumber) {
		waitHelper.WaitForElement(EmergencyAdditionalTelephoneNumber, 60);
		EmergencyAdditionalTelephoneNumber.clear();
		EmergencyAdditionalTelephoneNumber.sendKeys(emergencyadditionaltelephonenumber);
	}

	@FindBy(xpath = "	//div[@class=\"form__input form__input-radio \"][1]")
	private WebElement YesAdditionalContactRadioBtn;

	public void clickYesAdditionalContactRadioBtn() {
		waitHelper.WaitForElement(YesAdditionalContactRadioBtn, 60);
		js.javaScriptClick(driver, YesAdditionalContactRadioBtn);
	}

	@FindBy(xpath = "	//div[@class=\"form__input form__input-radio \"][1]")
	private WebElement NoAdditionalContactRadioBtn;

	public void clickNoAdditionalContactRadioBtn() {
		waitHelper.WaitForElement(NoAdditionalContactRadioBtn, 60);
		js.javaScriptClick(driver, NoAdditionalContactRadioBtn);
	}

	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_96b47d52-e6bf-4477-9e6d-43f56c168e95__Value\"]")
	private WebElement EmergencyConsentCheckBox;

	public void clickEmergencyConsentCheckBox() {
		waitHelper.WaitForElement(EmergencyConsentCheckBox, 60);
		js.javaScriptClick(driver, EmergencyConsentCheckBox);
	}

	@FindBy(xpath = "//button[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.92838461-395c-4ac6-b089-6ccfe69c5fab\"]")
	private WebElement EmergencyContactNextBtn;

	public void clickEmergencyContactNextBtn() {
		waitHelper.WaitForElement(EmergencyContactNextBtn, 60);
		js.javaScriptClick(driver, EmergencyContactNextBtn);
	}

}

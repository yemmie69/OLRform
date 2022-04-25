package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.JavaScriptExecutor;

public class PatientPermanentHomeAddressAndContactDetailsPage {

	private WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper;

	public PatientPermanentHomeAddressAndContactDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

	@FindBy(xpath = "//select[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_8611be80-de32-4e25-9291-193327b6736f__Value\"]")
	private WebElement IsPatientPermanentResidencyInUkDrpDwn;

	public void selectIsPatientPermanentResidencyInUkDrpDwn() {
		waitHelper.WaitForElement(IsPatientPermanentResidencyInUkDrpDwn, 60);
		
		Select isPatientPermanentResidencyInUkDrpDwn = new Select(IsPatientPermanentResidencyInUkDrpDwn);
		isPatientPermanentResidencyInUkDrpDwn.selectByIndex(0);
	}

	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_96dc90c7-c019-4930-9144-28fd19928280__Value\"]")
	private WebElement AddressLine1;

	public void inputAddressLine1(String addressline1) {
		waitHelper.WaitForElement(AddressLine1, 60);
		AddressLine1.clear();
		AddressLine1.sendKeys(addressline1);
	}

	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_3365df61-3f63-4c10-9ca8-10bb4cb5c10e__Value\"]")
	private WebElement AddressLine2;

	public void inputAddressLine2(String addressline2) {
		waitHelper.WaitForElement(AddressLine2, 60);
		AddressLine2.clear();
		AddressLine2.sendKeys(addressline2);
	}

	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_834535bd-9fae-4cbf-ba28-46456718b9d1__Value\"]")
	private WebElement Town;

	public void inputTown(String town) {
		waitHelper.WaitForElement(Town, 60);
		Town.clear();
		Town.sendKeys(town);
	}
	
	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_8076f054-aed6-4689-bd6c-9de37b02344a__Value\"]")
	private WebElement County;

	public void inputCounty(String county) {
		waitHelper.WaitForElement(County, 60);
		County.clear();
		County.sendKeys(county);
	}
	
	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_f9d69dba-2dd8-4ec0-9603-529c3ddf8ea4__Value\"]")
	private WebElement AddressPostalCode;

	public void inputAddressPostalCode(String addressPostalCode) {
		waitHelper.WaitForElement(AddressPostalCode, 60);
		AddressPostalCode.clear();
		AddressPostalCode.sendKeys(addressPostalCode);
	}
	
	@FindBy(xpath = "//select[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_e17d9846-f3b1-46c4-9228-c1339dbb2485__Value\"]")
	private WebElement Country;

	public void selectCountry() {
		waitHelper.WaitForElement(Country, 60);
		
		Select countryDrpDwn = new Select(Country);
		countryDrpDwn.selectByIndex(2);
	}
	
	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_5eb3e527-7b03-4844-a5cb-8a43ed7b57f0__Value\"]")
	private WebElement MobileNumber;

	public void inputMobileNumber(String mobilenumber) {
		waitHelper.WaitForElement(MobileNumber, 60);
		MobileNumber.clear();
		MobileNumber.sendKeys(mobilenumber);
	}
	
	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_10ec0b8f-63f9-48be-a899-af08cf8264d0__Value\"]")
	private WebElement AdditionalTelephoneNumber;

	public void inputAdditionalTelephoneNumber(String additionaltelephonenumber) {
		waitHelper.WaitForElement(AdditionalTelephoneNumber, 60);
		AdditionalTelephoneNumber.clear();
		AdditionalTelephoneNumber.sendKeys(additionaltelephonenumber);
	}
	
	@FindBy(xpath = "//button[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.bd94e613-5cc3-48c9-a859-2346ac65b33c\"]")
	private WebElement PermAddressPageNextBtn;

	public void clickPermAddressPageNextBtn() {
		waitHelper.WaitForElement(PermAddressPageNextBtn, 60);
		js.javaScriptClick(driver, PermAddressPageNextBtn);
	}
	
	
}

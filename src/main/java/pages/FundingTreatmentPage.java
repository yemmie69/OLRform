package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.JavaScriptExecutor;

public class FundingTreatmentPage {

	private WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper;


	public FundingTreatmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);


	}

	@FindBy(xpath = "//input[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.Fields[72895472-f909-4cac-bc18-ac2f4609252c].Value\"][@value=\"Insurer\"]")
	private WebElement InsurerTab;

	public void clickInsurerTab() {
		waitHelper.WaitForElement(InsurerTab, 60);
		js.javaScriptClick(driver, InsurerTab);
	}

	@FindBy(xpath = "//input[@value=\"Third Party Sponsor\"]")
	private WebElement ThirdPartySponsor;

	public void clickThirdPartySponsor() {
		waitHelper.WaitForElement(ThirdPartySponsor, 60);
		js.javaScriptClick(driver, ThirdPartySponsor);
	}

	@FindBy(xpath = "//input[@value=\"Self-Funding\"]")
	private WebElement SelfFunding;

	public void clickSelfFunding() {
		waitHelper.WaitForElement(SelfFunding, 60);
		js.javaScriptClick(driver, SelfFunding);
	}

	@FindBy(xpath = "//input[@data-val-required=\"Is this insurance policy provided by your employer? (required) is required.\"]")
	private WebElement YesPolicyByEmployer;

	public void clickYesPolicyByEmployer() {
		waitHelper.WaitForElement(YesPolicyByEmployer, 60);
		js.javaScriptClick(driver, YesPolicyByEmployer);
	}

	@FindBy(xpath = "//input[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.Fields[b2ff5444-8b3a-4ad9-ac3b-5bb2d5f198d7].Required\"]")
	private WebElement NoPolicyNotByEmployer;

	public void clickNoPolicyNotByEmployer() {
		waitHelper.WaitForElement(NoPolicyNotByEmployer, 60);
		js.javaScriptClick(driver, NoPolicyNotByEmployer);
	}

	@FindBy(xpath = "//select[@data-val-required=\"Please select your employer name or enter as other below (required) is required.\"]")
	private WebElement EmployerName;

	public void selectEmployerName() {
		waitHelper.WaitForElement(EmployerName, 60);
		Select employerName = new Select(EmployerName);
		employerName.selectByIndex(6);

	}

	@FindBy(xpath = "//select[@data-val-required=\"Please select insurer name or enter as other below (required) is required.\"]")
	private WebElement InsurerName;

	public void selectInsurerName() {
		waitHelper.WaitForElement(InsurerName, 60);

		Select insurerName = new Select(InsurerName);
		insurerName.selectByIndex(4);

	}

	@FindBy(xpath = "//input[@data-val-required=\"Name on the policy (required) is required.\"]")
	private WebElement NameOnThePolicy;

	public void enterNameOnThePolicy(String nameOnPolicy) {
		waitHelper.WaitForElement(NameOnThePolicy, 60);
		NameOnThePolicy.clear();
		NameOnThePolicy.sendKeys(nameOnPolicy);
	}

	@FindBy(xpath = "//input[@data-val-required=\"Policy / membership number (required) is required.\"]")
	private WebElement PolicyNumber;

	public void enterPolicyNumber(String policyNumber) {
		waitHelper.WaitForElement(PolicyNumber, 60);
		PolicyNumber.clear();
		PolicyNumber.sendKeys(policyNumber);
	}

	@FindBy(xpath = "//input[@data-val-length=\"Pre-authorisation code or claim number must have at least 0 and no more than 30 characters.\"]")
	private WebElement ClaimNumber;

	public void enterClaimNumber(String claimNumber) {
		waitHelper.WaitForElement(ClaimNumber, 60);
		ClaimNumber.clear();
		ClaimNumber.sendKeys(claimNumber);
	}

	@FindBy(xpath = "//button[@data-sc-field-key=\"EF55CFC7EEFD4C4C81C7B8A49FA858BB\"]")
	private WebElement NextBtn;

	public void clickNextBtn() {
		js.javaScriptClick(driver, NextBtn);
	}

	@FindBy(xpath = "//select[@data-val-required=\"Please select your third party sponsor name or enter as other below (required) is required.\"]")
	private WebElement ThirdPartySponsorDrpDwn;

	public void selectThirdPartySponsorDrpDwn() {

		Select thirdPartySponsorDrpDown = new Select(ThirdPartySponsorDrpDwn);
		thirdPartySponsorDrpDown.selectByIndex(3);

	}

	@FindBy(xpath = "//input[@data-val-required=\"Other third party sponsor (required) is required.\"]")
	private WebElement Other3rdPartySponsor;

	public void enterOther3rdPartySponsor(String other3rdPartySponsor) {
		Other3rdPartySponsor.clear();
		Other3rdPartySponsor.sendKeys(other3rdPartySponsor);
	}

	@FindBy(xpath = "//input[@data-val-length=\"Address line 1 (required) must have at least 2 and no more than 30 characters.\"]")
	private WebElement AddressLine1;

	public void enterAddressLine1(String addressLine1) {
		AddressLine1.clear();
		AddressLine1.sendKeys(addressLine1);
	}

	@FindBy(xpath = "//input[@data-val-length=\"Address line 2 must have at least 0 and no more than 30 characters.\"]")
	private WebElement AddressLine2;

	public void enterAddressLine2(String addressLine2) {
		AddressLine2.clear();
		AddressLine2.sendKeys(addressLine2);
	}

	@FindBy(xpath = "//input[@data-val-length=\"Town or city must have at least 0 and no more than 30 characters.\"]")
	private WebElement TownOrCity;

	public void enterTownOrCity(String townOrCity) {
		TownOrCity.clear();
		TownOrCity.sendKeys(townOrCity);
	}

	@FindBy(xpath = "//input[@data-val-length=\"County must have at least 0 and no more than 30 characters.\"]")
	private WebElement County;

	public void enterCounty(String county) {
		County.clear();
		County.sendKeys(county);
	}

	@FindBy(xpath = "data-val-length=\"Address postal code (required) must have at least 2 and no more than 10 characters.\"]")
	private WebElement AddressPostalCode;

	public void enterAddressPostalCode(String addressPostalCode) {
		AddressPostalCode.clear();
		AddressPostalCode.sendKeys(addressPostalCode);
	}

	@FindBy(xpath = "//select[@data-val-required=\"Country is required.\"]")
	private WebElement CountryDrpDwn;

	public void selectCountryDrpDwn() {

		Select countryDrpDwn = new Select(CountryDrpDwn);
		countryDrpDwn.selectByIndex(0);

	}

	@FindBy(xpath = "//input[@data-val-length=\"County must have at least 0 and no more than 30 characters.\"]")
	private WebElement ThirdPartySponsorPolicy;

	public void enterThirdPartySponsorPolicy(String thirdPartySponsorPolicy) {
		ThirdPartySponsorPolicy.clear();
		ThirdPartySponsorPolicy.sendKeys(thirdPartySponsorPolicy);
	}

	@FindBy(xpath = "//*[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_b2609c70-885c-441e-a38d-a5b644482fb5\"]/div[2]/div[6]/div[2]/div/div[1]/div[1]/label/span")
	private WebElement YesBtn;

	public void clickYesBtn() {
		js.javaScriptClick(driver, YesBtn);
	}

	@FindBy(xpath = "//*[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_b2609c70-885c-441e-a38d-a5b644482fb5\"]/div[2]/div[6]/div[2]/div/div[1]/div[2]/label/span")
	private WebElement NoBtn;

	public void clickNoBtn() {
		js.javaScriptClick(driver, NoBtn);
	}

	@FindBy(xpath = "//select[@data-val-required=\"Country is required.\"]")
	private WebElement GuarantorTitle;

	public void selectGuarantorTitleDrpDwn() {

		Select guarantorTitleDrpDwn = new Select(GuarantorTitle);
		guarantorTitleDrpDwn.selectByIndex(0);

	}

	@FindBy(xpath = "//input[@data-val-length=\"First name (required) must have at least 2 and no more than 30 characters.\"]")
	private WebElement GuarantorFirstName;

	public void enterGuarantorFirstName(String guarantorFirstName) {
		GuarantorFirstName.clear();
		GuarantorFirstName.sendKeys(guarantorFirstName);
	}
	
	@FindBy(xpath = "//button[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.5c058dc0-b773-495b-9e37-6290bf82f200\"]")
	private WebElement TokenizationPageSkipBtn;

	public void clickTokenizationPageSkipBtn() {
		waitHelper.WaitForElement(TokenizationPageSkipBtn, 60);

		js.javaScriptClick(driver, TokenizationPageSkipBtn);
	}

}

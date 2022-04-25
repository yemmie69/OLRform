package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;

public class DoctorDetailsPage {

	private WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper;

	public DoctorDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

	@FindBy(xpath = "//input[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.Fields[e719971a-1529-4b8f-8cce-af9e48f9432b].Value\"][@value=\"Yes\"]")
	private WebElement YesIHaveAGPBtn;

	public void clickYesIHaveAGPBtn() {
		waitHelper.WaitForElement(YesIHaveAGPBtn, 60);
		js.javaScriptClick(driver, YesIHaveAGPBtn);
	}

	@FindBy(xpath = "//input[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.Fields[e719971a-1529-4b8f-8cce-af9e48f9432b].Value\"][@value=\"No\"]")
	private WebElement NoIDontHaveAGPBtn;

	public void clickNoIDontHaveAGPBtn() {
		waitHelper.WaitForElement(NoIDontHaveAGPBtn, 60);
		js.javaScriptClick(driver, NoIDontHaveAGPBtn);
	}

	@FindBy(xpath = "//input[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.Fields[e719971a-1529-4b8f-8cce-af9e48f9432b].Value\"][@value=\"Do not wish to provide details\"]")
	private WebElement DoNotWishToProvideDetailsBtn;

	public void clickDoNotWishToProvideDetailsBtn() {
		waitHelper.WaitForElement(DoNotWishToProvideDetailsBtn, 60);
		js.javaScriptClick(driver, DoNotWishToProvideDetailsBtn);
	}

	@FindBy(xpath = "//button[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.a413b003-beb0-4f9e-b663-a2bf11ef998c\"]")
	private WebElement DoctorDetailsNextBtn;

	public void clickDoctorDetailsNextBtn() {
		waitHelper.WaitForElement(DoctorDetailsNextBtn, 60);
		js.javaScriptClick(driver, DoctorDetailsNextBtn);
	}

	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_4564a3eb-36b3-4cab-b871-d44ba0e736ba__Value\"]")
	private WebElement GpPracticeName;

	public void inputGpPracticeName(String gppracticename) {
		waitHelper.WaitForElement(GpPracticeName, 60);
		GpPracticeName.clear();
		GpPracticeName.sendKeys(gppracticename);
	}

	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_6e6def15-1e49-4323-905f-2503160b8bbf__Value\"]")
	private WebElement GpPracticeTelephoneNumber;

	public void inputGpPracticeTelephoneNumber(String gppracticetelephonenumber) {
		waitHelper.WaitForElement(GpPracticeTelephoneNumber, 60);
		GpPracticeTelephoneNumber.clear();
		GpPracticeTelephoneNumber.sendKeys(gppracticetelephonenumber);
	}

	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_9aefde6d-1ca7-4183-8c24-c763fb1e9352__Value\"]")
	private WebElement GpPracticeAddressLine1;

	public void inputGpPracticeAddressLine1(String gppracticeaddressline1) {
		waitHelper.WaitForElement(GpPracticeAddressLine1, 60);
		GpPracticeAddressLine1.clear();
		GpPracticeAddressLine1.sendKeys(gppracticeaddressline1);
	}

	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_51d16c46-f34c-4ef1-b6cb-ccf408a29b54__Value\"]")
	private WebElement GpPracticeAddressLine2;

	public void inputGpPracticeAddressLine2(String gppracticeaddressline2) {
		waitHelper.WaitForElement(GpPracticeAddressLine2, 60);
		GpPracticeAddressLine2.clear();
		GpPracticeAddressLine2.sendKeys(gppracticeaddressline2);
	}

	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_330cb14c-6b1a-4272-8be3-a1f890d5e4f7__Value\"]")
	private WebElement GpPracticeTownOrCity;

	public void inputGpPracticeTownOrCity(String gppracticetownOrcity) {
		waitHelper.WaitForElement(GpPracticeTownOrCity, 60);
		GpPracticeTownOrCity.clear();
		GpPracticeTownOrCity.sendKeys(gppracticetownOrcity);
	}

	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_538cb87d-ca96-4e42-a549-24265fae8d7a__Value\"]")
	private WebElement GpPracticeCounty;

	public void inputGpPracticeCounty(String gppracticecounty) {
		waitHelper.WaitForElement(GpPracticeCounty, 60);
		GpPracticeCounty.clear();
		GpPracticeCounty.sendKeys(gppracticecounty);
	}

	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_8cd36265-6e39-4d3e-96d8-2d73dfcfd06c__Value\"]")
	private WebElement GpPracticePostCode;

	public void inputGpPracticePostCode(String gppracticepostcode) {
		waitHelper.WaitForElement(GpPracticePostCode, 60);
		GpPracticePostCode.clear();
		GpPracticePostCode.sendKeys(gppracticepostcode);
	}

	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_8427b8e9-f4d0-461d-a437-4b3f0c7564c2__Value\"]")
	private WebElement GpFirstName;

	public void inputGpFirstName(String gpfirstname) {
		waitHelper.WaitForElement(GpFirstName, 60);
		GpFirstName.clear();
		GpFirstName.sendKeys(gpfirstname);
	}

	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_966e22f3-50ae-4f42-97de-affb2be3e896__Value\"]")
	private WebElement GpLastName;

	public void inputGpLastName(String gplastname) {
		waitHelper.WaitForElement(GpLastName, 60);
		GpLastName.clear();
		GpLastName.sendKeys(gplastname);
	}

	@FindBy(xpath = "//input[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.Fields[22433692-5fb4-488b-9cb9-cb9276d8d898].Value\"][@value=\"Yes\"]")
	private WebElement YesGpRefererCheckBox;

	public void clickYesGpRefererCheckBox() {
		waitHelper.WaitForElement(YesGpRefererCheckBox, 60);
		js.javaScriptClick(driver, YesGpRefererCheckBox);
	}

	@FindBy(xpath = "//input[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.Fields[22433692-5fb4-488b-9cb9-cb9276d8d898].Value\"][@value=\"No\"]")
	private WebElement NoGpRefererCheckBox;

	public void clickNoGpRefererCheckBox() {
		waitHelper.WaitForElement(NoGpRefererCheckBox, 60);
		js.javaScriptClick(driver, NoGpRefererCheckBox);
	}

	@FindBy(xpath = "//input[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.Fields[f5cb38ed-a369-4f30-962d-5a76d000cfc8].Value\"][@value=\"Self-referral\"]")
	private WebElement SelfReferralBtn;

	public void clickSelfReferralBtn() {
		waitHelper.WaitForElement(SelfReferralBtn, 60);
		js.javaScriptClick(driver, SelfReferralBtn);
	}

	@FindBy(xpath = "//input[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.Fields[f5cb38ed-a369-4f30-962d-5a76d000cfc8].Value\"][@value=\"Do not wish to provide\"]")
	private WebElement DoNotWishToProvideBtn;

	public void clickDoNotWishToProvideBtn() {
		waitHelper.WaitForElement(DoNotWishToProvideBtn, 60);
		js.javaScriptClick(driver, DoNotWishToProvideBtn);
	}
	
	@FindBy(xpath = "//input[@name=\"fxb.28f6c732-bb55-4bd2-a5e8-15587ee6ab3d.Fields[f5cb38ed-a369-4f30-962d-5a76d000cfc8].Value\"][@value=\"Other\"]")
	private WebElement OtherBtn;

	public void clickOtherBtnBtn() {
		waitHelper.WaitForElement(OtherBtn, 60);
		js.javaScriptClick(driver, OtherBtn);
	}

	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_309b4443-c02c-466c-adf4-d6ec093f4333__Value\"]")
	private WebElement ReferrerName;

	public void inputReferrerName(String referrername) {
		waitHelper.WaitForElement(ReferrerName, 60);
		ReferrerName.clear();
		ReferrerName.sendKeys(referrername);
	}
	@FindBy(xpath = "//input[@id=\"fxb_28f6c732-bb55-4bd2-a5e8-15587ee6ab3d_Fields_23c9d7ed-1a71-468b-b561-bd0c3441297a__Value\"]")
	private WebElement ReferrerPracticeName;

	public void inputReferrerPracticeName(String referrerpracticename) {
		waitHelper.WaitForElement(ReferrerPracticeName, 60);
		ReferrerPracticeName.clear();
		ReferrerPracticeName.sendKeys(referrerpracticename);
	}
	
}

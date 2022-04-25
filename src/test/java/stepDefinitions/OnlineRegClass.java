package stepDefinitions;

import org.junit.Assert;
import org.junit.Assert.*;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.AboutTheAppointmentPage;
import pages.AboutThePatientPage;
import pages.DoctorDetailsPage;
import pages.EmergencyContactDetailsPage;
import pages.FundingTreatmentPage;
import pages.PatientDetailsPage;
import pages.PatientPermanentHomeAddressAndContactDetailsPage;
import pages.ReviewAndRegisterPage;
import pages.SecurityQuestionsPage;
import pages.ThanksForRegisteringPage;
import pages.WelcomePage;

public class OnlineRegClass {

	WelcomePage welcomePage = new WelcomePage(DriverFactory.getDriver());
	SecurityQuestionsPage securityQuestionsPage = new SecurityQuestionsPage(DriverFactory.getDriver());
	PatientDetailsPage patientDetailsPage = new PatientDetailsPage(DriverFactory.getDriver());
	AboutTheAppointmentPage aboutTheAppointmentPage = new AboutTheAppointmentPage(DriverFactory.getDriver());
	AboutThePatientPage aboutThePatientPage = new AboutThePatientPage(DriverFactory.getDriver());
	PatientPermanentHomeAddressAndContactDetailsPage patientPermanentHomeAddressAndContactDetailsPage = new PatientPermanentHomeAddressAndContactDetailsPage(
			DriverFactory.getDriver());
	EmergencyContactDetailsPage emergencyContactDetailsPage = new EmergencyContactDetailsPage(
			DriverFactory.getDriver());
	DoctorDetailsPage doctorDetailsPage = new DoctorDetailsPage(DriverFactory.getDriver());
	FundingTreatmentPage fundingTreatmentPage = new FundingTreatmentPage(DriverFactory.getDriver());
	ReviewAndRegisterPage reviewAndRegisterPage = new ReviewAndRegisterPage(DriverFactory.getDriver());
	ThanksForRegisteringPage thanksForRegisteringPage = new ThanksForRegisteringPage(DriverFactory.getDriver());

	@Given("user launch the browser")
	public void user_launch_the_browser() {
		DriverFactory.getDriver().get(
				"https://hcauks-dev-sitecore-single-app.azurewebsites.net/online-registration?uid=D9B28AEC-AE89-4906-932B-2EBFC2F62F6E&resetmocksession=true");

	}

	@Given("patient clicked continue button")
	public void patient_clicked_continue_button() {
		welcomePage.clickContinueBtn();
	}

	@When("patient fill in secutity questions")
	public void patient_fill_in_secutity_questions() throws InterruptedException {
		securityQuestionsPage.clickOkBtn();
		securityQuestionsPage.securityQuestion();

	}

	@When("click verify details to get started")
	public void click_verify_details_to_get_started() throws InterruptedException {
		securityQuestionsPage.clickVerifyDetailsBtn();
	}

	@When("patient select who is completing the form patient details page")
	public void patient_select_who_is_completing_the_form_patient_details_page() {
		patientDetailsPage.clickThePatient();
	}

	@When("patient click next button")
	public void patient_click_next_button() {
		patientDetailsPage.clickThePatientPageNextBtn();
	}

	@When("patient confirmed receipt of appointment information")
	public void patient_confirmed_receipt_of_appointment_information() {
		aboutTheAppointmentPage.clickYesConfirmReceiptOfInformation();
		aboutTheAppointmentPage.clickAboutTheAppointmentPageNextBtn();
	}

	@When("patient fill in about the patient page")
	public void patient_fill_in_about_the_patient_page() {
		aboutThePatientPage.selectTitleDrpDwn();
		aboutThePatientPage.inputOtherName("test");
		aboutThePatientPage.selectReligionDrpDwn();
		aboutThePatientPage.selectEthnicityDrpDwn();
		aboutThePatientPage.selectSexAtBirthDrpDwn();
		aboutThePatientPage.inputNhsNumber("1234567881");

	}

	@When("patient click about the patient page next button")
	public void patient_click_about_the_patient_page_next_button() {
		aboutThePatientPage.clickAboutThePatientPageNextBtn();
	}

	@When("patient fill in Patient permanent home address and contact details")
	public void patient_fill_in_patient_permanent_home_address_and_contact_details() {
		patientPermanentHomeAddressAndContactDetailsPage.selectIsPatientPermanentResidencyInUkDrpDwn();
		patientPermanentHomeAddressAndContactDetailsPage.inputAddressLine1("17 Rainham");
		patientPermanentHomeAddressAndContactDetailsPage.inputAddressLine2("lewisham");
		patientPermanentHomeAddressAndContactDetailsPage.inputTown("London");
		patientPermanentHomeAddressAndContactDetailsPage.inputCounty("London");
		patientPermanentHomeAddressAndContactDetailsPage.inputAddressPostalCode("SE1 2JJ");
		patientPermanentHomeAddressAndContactDetailsPage.selectCountry();
		patientPermanentHomeAddressAndContactDetailsPage.inputMobileNumber("07947378905");
		patientPermanentHomeAddressAndContactDetailsPage.inputAdditionalTelephoneNumber("01234567830");

	}

	@When("patient click Patient permanent home address and contact details page next button")
	public void patient_click_patient_permanent_home_address_and_contact_details_page_next_button() {
		patientPermanentHomeAddressAndContactDetailsPage.clickPermAddressPageNextBtn();
	}

	@When("patient fill in Emergency contact details")
	public void patient_fill_in_emergency_contact_details() {
		emergencyContactDetailsPage.selectEmergencyTitleDrpDwn();
		emergencyContactDetailsPage.inputEmergencyContactFirstName("emergency");
		emergencyContactDetailsPage.inputEmergencyContactLastName("emergencyLastName");
		emergencyContactDetailsPage.selectRelationshipToPatientDrpDwn();
		emergencyContactDetailsPage.inputEmergencyContactMobileNumber("0123456789");
		emergencyContactDetailsPage.inputEmergencyAdditionalTelephoneNumber("1234567890");
		emergencyContactDetailsPage.clickYesAdditionalContactRadioBtn();
		emergencyContactDetailsPage.clickEmergencyConsentCheckBox();
	}

	@When("patient click Emergency contact details next button")
	public void patient_click_emergency_contact_details_next_button() {
		emergencyContactDetailsPage.clickEmergencyContactNextBtn();
	}

	@When("patient fill in Doctor details")
	public void patient_fill_in_doctor_details() {
		doctorDetailsPage.clickYesIHaveAGPBtn();
		doctorDetailsPage.clickDoctorDetailsNextBtn();
		doctorDetailsPage.inputGpPracticeName("Practice name");
		doctorDetailsPage.inputGpPracticeTelephoneNumber("123456789");
		doctorDetailsPage.inputGpPracticeAddressLine1("address line 1");
		doctorDetailsPage.inputGpPracticeAddressLine2("address line 2");
		doctorDetailsPage.inputGpPracticeTownOrCity("Kent");
		doctorDetailsPage.inputGpPracticeCounty("Medway");
		doctorDetailsPage.inputGpPracticePostCode("SE1 2JD");
		doctorDetailsPage.inputGpFirstName("GP first name");
		doctorDetailsPage.inputGpLastName("GP last name");
		doctorDetailsPage.clickYesGpRefererCheckBox();
	}

	@When("patient click Doctor details next button")
	public void patient_click_doctor_details_next_button() {
		doctorDetailsPage.clickDoctorDetailsNextBtn();
	}

	@When("patient fill in funding treatment page")
	public void patient_fill_in_funding_treatment_page() {
		fundingTreatmentPage.clickInsurerTab();
		fundingTreatmentPage.clickYesPolicyByEmployer();
		fundingTreatmentPage.selectEmployerName();
		fundingTreatmentPage.selectInsurerName();
		fundingTreatmentPage.enterNameOnThePolicy("Name on policy");
		fundingTreatmentPage.enterPolicyNumber("1234455566");
		fundingTreatmentPage.enterClaimNumber("aq1234567");

	}

	@When("patient click funding treatment page next button")
	public void patient_click_funding_treatment_page_next_button() {
		fundingTreatmentPage.clickNextBtn();

	}

	@When("patient click skip button")
	public void patient_click_skip_button() {
		fundingTreatmentPage.clickTokenizationPageSkipBtn();
	}

	@Then("patient click submit registration button")
	public void patient_click_submit_registration_button() {
		reviewAndRegisterPage.clickSubmitRegistrationBtn();

	}

	@Then("Thanks for registering page is displayed")
	public void thanks_for_registering_page_is_displayed() {
//		Assert.assertEquals(thanksForRegisteringPage.isThanksForRegisteringTextDisplayed(), "Thanks for registering");
		Assert.assertTrue(thanksForRegisteringPage.isThanksForRegisteringTextDisplayed());
	}

}
package core.pages;

import java.util.Map;

import org.testng.Assert;

import agent.IAgent;
import central.Configuration;

public class AccountPage extends FullPage {

	public AccountPage(Configuration conf, IAgent agent, Map<String, String> testData) throws Exception {
		super(conf, agent, testData);
		assertPageLoad();
	}

	/* Account -> Transactions */
	public void clickHealthRecords() throws Exception {
		getControl("accountBtn").click();
		Assert.assertEquals("My Profile", getControl("myProfileBtn").getText());
		getControl("healthRecordsBtn").click();
		Assert.assertEquals("Health Records", getControl("healthRecordsTxt").getText());
	}
	
	public void clickInvoiceAndPrescription() throws Exception {
		getControl("accountBtn").click();
		Assert.assertEquals("My Profile", getControl("myProfileBtn").getText());
		getControl("healthRecordsBtn").click();
		getControl("viewInvoiceBtn").click();
		getControl("crossBtn").click();
		Assert.assertEquals("Health Records", getControl("healthRecordsTxt").getText());
		getControl("viewPrescriptionBtn").click();
		Assert.assertEquals("Oops. Technical error", getControl("technicalErrToastTxt").getText());
	}
	
	public void viewTransactions() throws Exception {
		getControl("accountBtn").click();
		getControl("transactionsBtn").click();
		Thread.sleep(3000);
		swipeDown(3);
		swipeUp(3);
	}
	
	/* Account -> About */
	public void aboutCloudnine() throws Exception {
		getControl("accountBtn").click();
		getControl("aboutBtn").click();
		Assert.assertEquals("About", getControl("aboutTxt").getText());
		getControl("aboutCloudnineBtn").click();
		Assert.assertEquals("About Us", getControl("aboutCloudnineAboutUsTxt").getText());
	}
	
	public String about_TermsAndConditions() throws Exception {
		getControl("accountBtn").click();
		getControl("aboutBtn").click();
		getControl("termsAndConditionsBtn").click();
		return getControl("tAndcTermsAndConditionsTxt").getText();
	}
	
	/* Account -> Help&Support -> A Guide To It's Our Baby */
	public void accountHelpAndSupportAGuideToIOB() throws Exception {
		getControl("accountBtn").click();
		getControl("helpAndSupportBtn").click();
		getControl("aGuidToIOBBtn").click();
	}
	
	public void bookLabtestOrScan() throws Exception {
		accountHelpAndSupportAGuideToIOB();
		getControl("bookLabTestOrScanBtn").click();
		getControl("howToBookLabOrScanBtn").click();
	}
	
	public void bookThroughIOB() throws Exception {
		accountHelpAndSupportAGuideToIOB();
		getControl("bookAnAppointmentBtn").click();
		getControl("howToBookAnApptThroughIOBBtn").click();
	}
	
	public void bump() throws Exception {
		accountHelpAndSupportAGuideToIOB();
		getControl("bumpBtn").click();
		getControl("whatIsBumpBtn").click();
	}
	
	public void gynaecCalendarHowDoesItWork() throws Exception {
		accountHelpAndSupportAGuideToIOB();
		getControl("gynaecCaledarBtn").click();
		getControl("howDoesItWorkBtn").click();
	}
	
	public void gynaecCalendarNotAbleToSeeMyCalendar() throws Exception {
		accountHelpAndSupportAGuideToIOB();
		getControl("gynaecCaledarBtn").click();
		getControl("notAbleToSeeMyynaecCalendarBtn").click();
	}
	
	public void gynaecCalendarWhatIsGynaecCalendar() throws Exception {
		accountHelpAndSupportAGuideToIOB();
		getControl("gynaecCaledarBtn").click();
		getControl("whatIsGynaecCalendarBtn").click();
	}
	
	public void healthRecordsHowToFindPresCriptions() throws Exception {
		accountHelpAndSupportAGuideToIOB();
		getControl("healthRecordsBtn").click();
		getControl("howToFindMyPrescriptionsScanOrLabReportsBtn").click();
	}
	
	public void howToLoginOrSignup() throws Exception {
		accountHelpAndSupportAGuideToIOB();
		getControl("loginOrSignupBtn").click();
		getControl("howToLoginOrSignupBtn").click();
	}
	
	public void mpin() throws Exception {
		accountHelpAndSupportAGuideToIOB();
		getControl("mpinBtn").click();
		getControl("whatIsMPINBtn").click();
	}
	
	/* Account -> Help&Support -> Book An Appointment -> Appointment Related Issues */
	public void accountHelpAndSupportBookAnAppointmentApptRelatedIssues() throws Exception {
		getControl("accountBtn").click();
		getControl("helpAndSupportBtn").click();
		getControl("bookAnAppointmentBtn").click();
		getControl("appointmentReletedIssuesBtn").click();
	}
	
	public void amIEligibleForDiscountAndOffers() throws Exception {
		accountHelpAndSupportBookAnAppointmentApptRelatedIssues();
		getControl("amIElegibleForDiscountsAndOffersBtn").click();
	}
	
	public void howDoICancelAppointment() throws Exception {
		accountHelpAndSupportBookAnAppointmentApptRelatedIssues();
		getControl("howDoICancelAnAppointmentBtn").click();
	}
	
	public void changeInfoIfWrongTabChosen() throws Exception {
		accountHelpAndSupportBookAnAppointmentApptRelatedIssues();
		getControl("howDoIChangeTheInformationIfWrongTabIsChosenBtn").click();
	}
	
	public void availableCloudnineLocation() throws Exception {
		accountHelpAndSupportBookAnAppointmentApptRelatedIssues();
		getControl("howDoIKnowTheAvailableCloudnineLocationBtn").click();
	}
	
	public void rescheduleMyAppointment() throws Exception {
		accountHelpAndSupportBookAnAppointmentApptRelatedIssues();
		getControl("howDoIRescheduleMyAppointmentBtn").click();
	}
	
	public void bookACabForAppointmentFromApp() throws Exception {
		accountHelpAndSupportBookAnAppointmentApptRelatedIssues();
		getControl("howToBookACabForTheApptUsingTheAppBtn").click();
	}
	
	public void bookApptForFollowUpVisit() throws Exception {
		accountHelpAndSupportBookAnAppointmentApptRelatedIssues();
		getControl("howToBookAnApptForFollowupVisitBtn").click();
	}
	
	public void bookAnApptWithMyDoc() throws Exception {
		accountHelpAndSupportBookAnAppointmentApptRelatedIssues();
		getControl("howToBookAnAppointmentWithMyDoctorBtn").click();
	}
	
	public void cannotSeeAvailableSlotsForMyDoc() throws Exception {
		accountHelpAndSupportBookAnAppointmentApptRelatedIssues();
		getControl("iCantSeeAvailableSlotsForMyDocBtn").click();
		Thread.sleep(5000);
	}
	
	public void didnotGetOTP() throws Exception {
		accountHelpAndSupportBookAnAppointmentApptRelatedIssues();
		getControl("iDidntGetOTPWhatToDoBtn").click();
	}
	
	public void myContactNumberAlreadyShowingAsRegistered() throws Exception {
		accountHelpAndSupportBookAnAppointmentApptRelatedIssues();
		getControl("myContactNoIsAlreadyShowingAsRegisteredWhatShouldBeTheNextStepBtn").click();
	}
	
	public void validIdentityProofForMeOrMyChild() throws Exception {
		accountHelpAndSupportBookAnAppointmentApptRelatedIssues();
		getControl("whatAreTheValidIdentityProofForMyselfOrMyChildForRegBtn").click();
	}
	
	public void availableDoctorsRelatedToParticularSpeciality() throws Exception {
		accountHelpAndSupportBookAnAppointmentApptRelatedIssues();
		getControl("whoAreTheAvaiDocsRelatedToAParSpecialityBtn").click();
	}
	
	public void cantCancelAppointment() throws Exception {
		accountHelpAndSupportBookAnAppointmentApptRelatedIssues();
		getControl("whyCantICancelMyAppointmentBtn").click();
	}
	
	public void cantSeeMyBookedAppointmentInApp() throws Exception {
		accountHelpAndSupportBookAnAppointmentApptRelatedIssues();
		getControl("whyCantISeeMyApptOnTheAppWhichIMadeThroughAppBtn").click();
	}
	
	public void cantSeeMPINOrMPID() throws Exception {
		accountHelpAndSupportBookAnAppointmentApptRelatedIssues();
		getControl("whyCantSeeMyMPINOrMPIDDetailsBtn").click();
	}
	
	public void seeMyNameAsInvalid() throws Exception {
		accountHelpAndSupportBookAnAppointmentApptRelatedIssues();
		getControl("whyDoISeeMyNameIsInvalidBtn").click();
	}
	
	/* Account -> Help&Support -> Miscellaneous -> Doctor Related Issues */
	public void accountHelpMiscDocRelatedIssues() throws Exception {
		getControl("accountBtn").click();
		getControl("helpAndSupportBtn").click();
		getControl("miscellaneousBtn").click();
		getControl("doctorRelatedIssuesBtn").click();
	}
	public void doctorHadLeftEarly() throws Exception {
		accountHelpMiscDocRelatedIssues();
		getControl("doctorHadLeftEarlyBtn").click();
	}
	
	public void problemWithTheDoctorBtn() throws Exception {
		accountHelpMiscDocRelatedIssues();
		getControl("problemWithTheDoctorBtn").click();
	}
	
	/* Account -> Help&Support -> Miscellaneous -> EDD & LMP */
	public void accountHelpMiscEDDandLMP() throws Exception {
		getControl("accountBtn").click();
		getControl("helpAndSupportBtn").click();
		getControl("miscellaneousBtn").click();
		getControl("eddAndLMPBtn").click();
	}
	
	public void howIsEDDCalculated() throws Exception {
		accountHelpMiscEDDandLMP();
		getControl("howIsEDDCalculatedBtn").click();
	}
	
	public void howToChangeLMP() throws Exception {
		accountHelpMiscEDDandLMP();
		getControl("howToChangeLMPBtn").click();
	}
	
	public void myBabysAgeInTheReportIsDiff() throws Exception {
		accountHelpMiscEDDandLMP();
		getControl("myBabysAgeInTheReportIsDiffBtn").click();
	}
	
	public void whatIsEDD() throws Exception {
		accountHelpMiscEDDandLMP();
		getControl("whatIsEDDBtn").click();
	}
	
	public void whatIsLMP() throws Exception {
		accountHelpMiscEDDandLMP();
		getControl("whatIsLMPBtn").click();
	}
	
	/* Account -> Help&Support -> Miscellaneous -> Feedback */
	public void accountHelpMiscFeedback() throws Exception {
		getControl("accountBtn").click();
		getControl("helpAndSupportBtn").click();
		getControl("miscellaneousBtn").click();
		getControl("feedbackBtn").click();
	}
	
	public void getYourFeedback() throws Exception {
		accountHelpMiscFeedback();
		getControl("getYourFeedbackBtn").click();
	}
	
	/* Account -> Help&Support -> Other Services */
	public void accountHelpOtherServices() throws Exception {
		getControl("accountBtn").click();
		getControl("helpAndSupportBtn").click();
		getControl("otherServicesBtn").click();
	}
	
	public void gkVale() throws Exception {
		accountHelpOtherServices();
		getControl("photographyBtn").click();
		getControl("gkValeBtn").click();
		Assert.assertEquals("Help & Support", getControl("helpAndSupportTxt").getText());
	}
	
	public void cryonineServices() throws Exception {
		accountHelpOtherServices();
		getControl("stemCellBankingBtn").click();
		getControl("cryonineServicesBtn").click();
	}
	
	public void signOutApp() throws Exception {
		getControl("accountBtn").click();
		swipeDown(1);
		getControl("signOutBtn").click();
		getControl("signMeOutBtn").click();
		Thread.sleep(3000);
	}
	
	public void inviteFriendsAndFamily() throws Exception {
		getControl("accountBtn").click();
		getControl("inviteFamilyAndFriendsBtn").click();
		getControl("inviteGmailBtn").click();
		getControl("gmailToField").enterText(testData.get("to"));
		getControl("gmailSendButton").click();
	}
}

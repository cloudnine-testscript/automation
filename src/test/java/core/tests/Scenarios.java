package core.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Scenarios extends SupportTest {
	SoftAssert sfAssert = new SoftAssert();

	@Test(enabled = false, priority = 1/*, description="Invalid Login Scenario with wrong username and password."*/)
	/*@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Login test with valid username and valid password.")
	@Story("Story Name: To check login")*/
	public void tc_LoginWithvalidMobileNo() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Login With valid MobileNo and Verify Home Page Start"));
		lp.login();
		logger.debug(this.getTestEndInfoMessage("Login With valid MobileNo and Verify Home Page End"));
	}

	@Test(enabled = false, priority = 12)
	public void tc_Account_Help_BookLabOrScan() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Book Lab Or Scan Start"));
		lp.login();
		ap.bookLabtestOrScan();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Book Lab Or Scan End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_BookThroughIOB() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Book Through IOB Start"));
		lp.login();
		ap.bookThroughIOB();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Book Through IOB End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_WhatIsBump() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> What Is Bump Start"));
		lp.login();
		ap.bump();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> What Is Bump End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_HowGynaecCalenderWorks() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> How Gynaec Calender Works Start"));
		lp.login();
		ap.gynaecCalendarHowDoesItWork();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> How Gynaec Calender Works End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_NotAbleToSeeMyCalendar() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Not Able To See My Calendar Start"));
		lp.login();
		ap.gynaecCalendarNotAbleToSeeMyCalendar();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Not Able To See My Calendar End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_WhatIsGynaecCalendar() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> What Is Gynaec Calendar Start"));
		lp.login();
		ap.gynaecCalendarWhatIsGynaecCalendar();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> What Is Gynaec Calendar End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_FindPrescriptionScanOrLabsReport() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Find Prescription Scan Or Labs Report Start"));
		lp.login();
		ap.healthRecordsHowToFindPresCriptions();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Find Prescription Scan Or Labs Report End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_HowToLoginOrSignUp() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> How To Login Or SignUp Start"));
		lp.login();
		ap.howToLoginOrSignup();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> How To Login Or SignUp End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_WhatIsMPIN() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> What Is MPIN Start"));
		lp.login();
		ap.mpin();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> What Is MPIN End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_ARI_EligibleForDiscount() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Eligible For Discount Start"));
		lp.login();
		ap.amIEligibleForDiscountAndOffers();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Eligible For Discount End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_ARI_HowDoICancelAppointment() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> How Do I Cancel Appointment Start"));
		lp.login();
		ap.howDoICancelAppointment();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> How Do I Cancel Appointment End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_ARI_ChangeInfoIfWrongTabChosen() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Change Info If Wrong Tab Chosen Start"));
		lp.login();
		ap.changeInfoIfWrongTabChosen();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Change Info If Wrong Tab Chosen End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_ARI_AvailableCloudnineLocation() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Available Cloudnine Location Start"));
		lp.login();
		ap.availableCloudnineLocation();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Available Cloudnine Location End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_ARI_RescheduleMyAppointment() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Reschedule My Appointment Start"));
		lp.login();
		ap.rescheduleMyAppointment();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Reschedule My Appointment End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_ARI_BookACabForAppointmentFromApp() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Book A Cab For Appointment From App Start"));
		lp.login();
		ap.bookACabForAppointmentFromApp();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Book A Cab For Appointment From App End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_ARI_BookApptForFollowUpVisit() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Book Appt For FollowUp Visit Start"));
		lp.login();
		ap.bookApptForFollowUpVisit();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Book Appt For FollowUp Visit End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_ARI_BookAnApptWithMyDoc() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Book An Appt With My Doc Start"));
		lp.login();
		ap.bookAnApptWithMyDoc();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Book An Appt With My Doc End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_ARI_CannotSeeAvailableSlotsForMyDoc() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Can't See Available Slots For My Doc Start"));
		lp.login();
		ap.cannotSeeAvailableSlotsForMyDoc();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Can't See Available Slots For My Doc End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_ARI_DidnotGetOTP() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Didn't Get OTP Start"));
		lp.login();
		ap.didnotGetOTP();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Didn't Get OTP End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_ARI_MyContactNumberAlreadyShowingAsRegistered() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> My Contact Number Already Showing As Registered Start"));
		lp.login();
		ap.myContactNumberAlreadyShowingAsRegistered();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> My Contact Number Already Showing As Registered End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_ARI_ValidIdentityProofForMeOrMyChild() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Valid Identity Proof For Me Or My Child Start"));
		lp.login();
		ap.validIdentityProofForMeOrMyChild();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Valid Identity Proof For Me Or My Child End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_ARI_AvailableDoctorsRelatedToParticularSpeciality() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Available Doctors Related To Particular Speciality Start"));
		lp.login();
		ap.availableDoctorsRelatedToParticularSpeciality();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Available Doctors Related To Particular Speciality End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_ARI_CantCancelAppointment() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Can't Cancel Appointment Start"));
		lp.login();
		ap.cantCancelAppointment();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Can't Cancel Appointment End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_ARI_CantSeeMyBookedAppointmentInApp() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Can't See My Booked Appointment In App Start"));
		lp.login();
		ap.cantSeeMyBookedAppointmentInApp();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Can't See My Booked Appointment In App End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_ARI_CantSeeMPINOrMPID() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Can't See MPIN Or MPID Start"));
		lp.login();
		ap.cantSeeMPINOrMPID();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Can't See MPIN Or MPID End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_ARI_SeeMyNameAsInvalid() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> See My Name As Invalid Start"));
		lp.login();
		ap.seeMyNameAsInvalid();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> See My Name As Invalid End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_Account_Help_ARI_GkVale() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> GkVale Start"));
		lp.login();
		ap.gkVale();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> GkVale End"));
	}
	
	@Test(enabled = false, priority = 4)
	public void tc_AppSignOut() throws Exception {
		logger.debug(this.getTestStartInfoMessage("App SignOut Start"));
		lp.login();
		ap.signOutApp();
		logger.debug(this.getTestEndInfoMessage("App SignOut End"));
	}
	
	@Test(enabled = false, priority = 4)
	public void tc_InviteFriendsAndFamily() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Invite Friends And Family Start"));
		lp.login();
		ap.inviteFriendsAndFamily();
		logger.debug(this.getTestEndInfoMessage("Invite Friends And Family End"));
	}
	
	@Test(enabled = false, priority = 4)
	public void tc_BookALabTestLAB() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Book A Lab Test -> LAB Start"));
		lp.login();
		hp.bookALabTestLAB();
		logger.debug(this.getTestEndInfoMessage("Book A Lab Test -> LAB End"));
	}
	
	@Test(enabled = false, priority = 4)
	public void tc_BookALabTestXray() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Book A Lab Test -> Xray Start"));
		lp.login();
		hp.bookALabTestXray();
		logger.debug(this.getTestEndInfoMessage("Book A Lab Test -> Xray End"));
	}
	
	@Test(enabled = false, priority = 4)
	public void tc_BookAScan() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Book A Scan Start"));
		lp.login();
		hp.bookAScan();
		logger.debug(this.getTestEndInfoMessage("Book A Scan End"));
	}
}

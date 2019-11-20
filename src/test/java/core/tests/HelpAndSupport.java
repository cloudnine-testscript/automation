package core.tests;

import org.testng.annotations.Test;

public class HelpAndSupport extends SupportTest {
	@Test(enabled = false, priority = 1)
	public void tc_Account_Help_BookLabOrScan() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Book Lab Or Scan Start"));
		lp.login();
		ap.bookLabtestOrScan();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Book Lab Or Scan End"));
	}

	@Test(enabled = false, priority = 2)
	public void tc_Account_Help_BookThroughIOB() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Book Through IOB Start"));
		lp.login();
		ap.bookThroughIOB();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Book Through IOB End"));
	}

	@Test(enabled = false, priority = 3)
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

	@Test(enabled = false, priority = 5)
	public void tc_Account_Help_NotAbleToSeeMyCalendar() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Not Able To See My Calendar Start"));
		lp.login();
		ap.gynaecCalendarNotAbleToSeeMyCalendar();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Not Able To See My Calendar End"));
	}

	@Test(enabled = false, priority = 6)
	public void tc_Account_Help_WhatIsGynaecCalendar() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> What Is Gynaec Calendar Start"));
		lp.login();
		ap.gynaecCalendarWhatIsGynaecCalendar();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> What Is Gynaec Calendar End"));
	}

	@Test(enabled = false, priority = 7)
	public void tc_Account_Help_FindPrescriptionScanOrLabsReport() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Find Prescription Scan Or Labs Report Start"));
		lp.login();
		ap.healthRecordsHowToFindPresCriptions();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Find Prescription Scan Or Labs Report End"));
	}

	@Test(enabled = false, priority = 8)
	public void tc_Account_Help_HowToLoginOrSignUp() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> How To Login Or SignUp Start"));
		lp.login();
		ap.howToLoginOrSignup();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> How To Login Or SignUp End"));
	}

	@Test(enabled = false, priority = 9)
	public void tc_Account_Help_WhatIsMPIN() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> What Is MPIN Start"));
		lp.login();
		ap.mpin();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> What Is MPIN End"));
	}

	@Test(enabled = false, priority = 10)
	public void tc_Account_Help_ARI_EligibleForDiscount() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Eligible For Discount Start"));
		lp.login();
		ap.amIEligibleForDiscountAndOffers();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Eligible For Discount End"));
	}

	@Test(enabled = false, priority = 11)
	public void tc_Account_Help_ARI_HowDoICancelAppointment() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> How Do I Cancel Appointment Start"));
		lp.login();
		ap.howDoICancelAppointment();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> How Do I Cancel Appointment End"));
	}

	@Test(enabled = false, priority = 12)
	public void tc_Account_Help_ARI_ChangeInfoIfWrongTabChosen() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Change Info If Wrong Tab Chosen Start"));
		lp.login();
		ap.changeInfoIfWrongTabChosen();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Change Info If Wrong Tab Chosen End"));
	}

	@Test(enabled = false, priority = 13)
	public void tc_Account_Help_ARI_AvailableCloudnineLocation() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Available Cloudnine Location Start"));
		lp.login();
		ap.availableCloudnineLocation();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Available Cloudnine Location End"));
	}

	@Test(enabled = false, priority = 14)
	public void tc_Account_Help_ARI_RescheduleMyAppointment() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Reschedule My Appointment Start"));
		lp.login();
		ap.rescheduleMyAppointment();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Reschedule My Appointment End"));
	}

	@Test(enabled = false, priority = 15)
	public void tc_Account_Help_ARI_BookACabForAppointmentFromApp() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Book A Cab For Appointment From App Start"));
		lp.login();
		ap.bookACabForAppointmentFromApp();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Book A Cab For Appointment From App End"));
	}

	@Test(enabled = false, priority = 16)
	public void tc_Account_Help_ARI_BookApptForFollowUpVisit() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Book Appt For FollowUp Visit Start"));
		lp.login();
		ap.bookApptForFollowUpVisit();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Book Appt For FollowUp Visit End"));
	}

	@Test(enabled = false, priority = 17)
	public void tc_Account_Help_ARI_BookAnApptWithMyDoc() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Book An Appt With My Doc Start"));
		lp.login();
		ap.bookAnApptWithMyDoc();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Book An Appt With My Doc End"));
	}

	@Test(enabled = false, priority = 18)
	public void tc_Account_Help_ARI_CannotSeeAvailableSlotsForMyDoc() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Can't See Available Slots For My Doc Start"));
		lp.login();
		ap.cannotSeeAvailableSlotsForMyDoc();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Can't See Available Slots For My Doc End"));
	}

	@Test(enabled = false, priority = 19)
	public void tc_Account_Help_ARI_DidnotGetOTP() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Didn't Get OTP Start"));
		lp.login();
		ap.didnotGetOTP();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Didn't Get OTP End"));
	}

	@Test(enabled = false, priority = 20)
	public void tc_Account_Help_ARI_MyContactNumberAlreadyShowingAsRegistered() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> My Contact Number Already Showing As Registered Start"));
		lp.login();
		ap.myContactNumberAlreadyShowingAsRegistered();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> My Contact Number Already Showing As Registered End"));
	}

	@Test(enabled = false, priority = 21)
	public void tc_Account_Help_ARI_ValidIdentityProofForMeOrMyChild() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Valid Identity Proof For Me Or My Child Start"));
		lp.login();
		ap.validIdentityProofForMeOrMyChild();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Valid Identity Proof For Me Or My Child End"));
	}

	@Test(enabled = false, priority = 22)
	public void tc_Account_Help_ARI_AvailableDoctorsRelatedToParticularSpeciality() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Available Doctors Related To Particular Speciality Start"));
		lp.login();
		ap.availableDoctorsRelatedToParticularSpeciality();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Available Doctors Related To Particular Speciality End"));
	}

	@Test(enabled = false, priority = 23)
	public void tc_Account_Help_ARI_CantCancelAppointment() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Can't Cancel Appointment Start"));
		lp.login();
		ap.cantCancelAppointment();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Can't Cancel Appointment End"));
	}

	@Test(enabled = false, priority = 24)
	public void tc_Account_Help_ARI_CantSeeMyBookedAppointmentInApp() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Can't See My Booked Appointment In App Start"));
		lp.login();
		ap.cantSeeMyBookedAppointmentInApp();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Can't See My Booked Appointment In App End"));
	}

	@Test(enabled = false, priority = 25)
	public void tc_Account_Help_ARI_CantSeeMPINOrMPID() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> Can't See MPIN Or MPID Start"));
		lp.login();
		ap.cantSeeMPINOrMPID();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> Can't See MPIN Or MPID End"));
	}

	@Test(enabled = false, priority = 26)
	public void tc_Account_Help_ARI_SeeMyNameAsInvalid() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> See My Name As Invalid Start"));
		lp.login();
		ap.seeMyNameAsInvalid();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> See My Name As Invalid End"));
	}

	@Test(enabled = false, priority = 27)
	public void tc_Account_Help_ARI_GkVale() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> ARI -> GkVale Start"));
		lp.login();
		ap.gkVale();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> ARI -> GkVale End"));
	}
}

package core.tests;

import org.testng.annotations.Test;

public class HelpAndSupport extends SupportTest {
	/*A Guide to it's Our baby Start*/
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
	/*A Guide to it's Our baby End*/
	
	/*Book An Appointment -> Appointment Related Issues Start*/
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
	/*Book An Appointment -> Appointment Related Issues End*/
	
	/*Miscellaneous -> Doctor Related Issues Start*/
	@Test(enabled = false, priority = 27)
	public void tc_Account_Help_Miscellaneous_DoctorLeftEarly() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Miscellaneous -> Doctor Related Issues -> Doctor Had Left Early Start"));
		lp.login();
		ap.doctorHadLeftEarly();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Miscellaneous -> Doctor Related Issues -> Doctor Had Left Early End"));
	}
	
	@Test(enabled = false, priority = 28)
	public void tc_Account_Help_Miscellaneous_ProblemWithTheDoctor() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Miscellaneous -> Doctor Related Issues -> Problem With The Doctor Start"));
		lp.login();
		ap.problemWithTheDoctor();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Miscellaneous -> Doctor Related Issues -> Problem With The Doctor End"));
	}
	/*Miscellaneous -> Doctor Related Issues End*/
	
	/*Miscellaneous -> EDD &LMP Start*/
	@Test(enabled = false, priority = 29)
	public void tc_Account_Help_Miscellaneous_HowIsEDDCalculated() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Miscellaneous -> EDD & LMP -> How Is EDD Calculated Start"));
		lp.login();
		ap.howIsEDDCalculated();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Miscellaneous -> EDD & LMP -> How Is EDD Calculated End"));
	}
	
	@Test(enabled = false, priority = 30)
	public void tc_Account_Help_Miscellaneous_HowToChangeLMP() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Miscellaneous -> EDD & LMP -> How To Change LMP Start"));
		lp.login();
		ap.howToChangeLMP();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Miscellaneous -> EDD & LMP -> How To Change LMP End"));
	}
	
	@Test(enabled = false, priority = 31)
	public void tc_Account_Help_Miscellaneous_BabyAgeDiffInScanFromPregnancy() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Miscellaneous -> EDD & LMP -> Baby Age Different In Scan From Pregnancy Start"));
		lp.login();
		ap.myBabysAgeInTheReportIsDiff();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Miscellaneous -> EDD & LMP -> Baby Age Different In Scan From Pregnancy End"));
	}
	
	@Test(enabled = false, priority = 32)
	public void tc_Account_Help_Miscellaneous_WhatISEDD() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Miscellaneous -> EDD & LMP -> What Is EDD Start"));
		lp.login();
		ap.whatIsEDD();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Miscellaneous -> EDD & LMP -> What IS EDD End"));
	}
	
	@Test(enabled = false, priority = 33)
	public void tc_Account_Help_Miscellaneous_WhatISLMP() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Miscellaneous -> EDD & LMP -> What Is LMP Start"));
		lp.login();
		ap.whatIsLMP();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Miscellaneous -> EDD & LMP -> What IS LMP End"));
	}
	/*Miscellaneous -> EDD &LMP End*/
	
	/*Miscellaneous -> Feedback Start*/
	@Test(enabled = false, priority = 34)
	public void tc_Account_Help_Miscellaneous_Feedback() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Miscellaneous -> Feedback -> Give Your Feedback Start"));
		lp.login();
		ap.getYourFeedback();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Miscellaneous -> Feedback -> Give Your Feedback End"));
	}
	/*Miscellaneous -> Feedback End*/
	
	/*Other Services Start*/
	@Test(enabled = false, priority = 35)
	public void tc_Account_Help_ARI_GkVale() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Other Services -> Photoraphy -> GkVale Start"));
		lp.login();
		ap.gkVale();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Other Services -> Photoraphy -> GkVale End"));
	}
	
	@Test(enabled = false, priority = 36)
	public void tc_Account_Help_ARI_CryonineServices() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Other Services -> Stem Cell Banking -> Cryonine Services Start"));
		lp.login();
		ap.cryonineServices();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Other Services -> Stem Cell Banking -> Cryonine Services End"));
	}
	/*Other Services End*/
	
	/*Payment Related Issues Start*/
	@Test(enabled = true, priority = 37)
	public void tc_Account_Help_PRI_CanIPayOnlineUsingVoucher() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Payment Related Issues -> How To Resolve Payment Related Issues -> Can I Pay Online using Vouchers Start"));
		lp.login();
		ap.canIPayOnlineUsingVouchers();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Payment Related Issues -> How To Resolve Payment Related Issues -> Can I Pay Online using Vouchers End"));
	}
	
	@Test(enabled = true, priority = 38)
	public void tc_Account_Help_PRI_CantFindInvoiceForMyPaymentMadeOnline() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Payment Related Issues -> How To Resolve Payment Related Issues -> Can't Find Invoice For My Payment Made Online Start"));
		lp.login();
		ap.cantFindInvoiceForMypaymentMadeOnline();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Payment Related Issues -> How To Resolve Payment Related Issues -> Can't Find Invoice For My Payment Made Online End"));
	}
	
	@Test(enabled = true, priority = 39)
	public void tc_Account_Help_PRI_PaymentSuccessfulButApptNotBooked() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Payment Related Issues -> How To Resolve Payment Related Issues -> Payment Successful But Appointment Not Booked Start"));
		lp.login();
		ap.cantFindInvoiceForMypaymentMadeOnline();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Payment Related Issues -> How To Resolve Payment Related Issues -> Payment Successful But Appointment Not Booked End"));
	}
	
	@Test(enabled = true, priority = 40)
	public void tc_Account_Help_PRI_PaymentFailedButMoneyGotDeducted() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Payment Related Issues -> How To Resolve Payment Related Issues -> Payment Failed But Money Got Deducted Start"));
		lp.login();
		ap.paymentFailedButMoneyGotDeducted();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Payment Related Issues -> How To Resolve Payment Related Issues -> Payment Failed But Money Got Deducted End"));
	}
	
	@Test(enabled = true, priority = 41)
	public void tc_Account_Help_PRI_SelectedPayAtHospital() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Payment Related Issues -> How To Resolve Payment Related Issues -> Selected Pay At Hospital Start"));
		lp.login();
		ap.selectedPayAtHospital();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Payment Related Issues -> How To Resolve Payment Related Issues -> Selected Pay At Hospital End"));
	}
	
	@Test(enabled = true, priority = 42)
	public void tc_Account_Help_PRI_WronglyChargedCancellationFees() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Payment Related Issues -> How To Resolve Payment Related Issues -> Wrongly Charged Cancellation Fees Start"));
		lp.login();
		ap.wronglyChargedCancellationFees();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Payment Related Issues -> How To Resolve Payment Related Issues -> Wrongly Charged Cancellation Fees End"));
	}
	/*Payment Related Issues End*/
}

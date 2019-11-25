package core.pages;

import java.util.Map;

import org.testng.Assert;

import agent.IAgent;
import central.Configuration;

public class HomePage extends FullPage {

	public HomePage(Configuration conf, IAgent agent, Map<String, String> testData) throws Exception {
		super(conf, agent, testData);
		assertPageLoad();
	}

	public void bookAppointment() throws Exception {
		if (getControls("upcomingApptTxt").size() > 0) {
			swipeDownTillElement("makeAnApptBtn");
			getControl("makeAnApptBtn").click();
		} else {
			getControl("makeAnApptBtn").click();
		}
		Assert.assertEquals("Whom is this appointment for?", getControl("whomIsThisAppointmentFortxt").getText());
		getControl("testPregBtn").click();
		Assert.assertEquals("Do you want to continue consultation with this doctor? ", getControl("doYouWantToContinueWithThisDoctxt").getText());
		getControl("testObgBtn").click();
		Assert.assertEquals("Select procedure", getControl("selectProcedureTxt").getText());
		getControl("consultationBtn").click();
		Assert.assertEquals("This is the earliest availability for a consultation with Dr. Testobg Oar", getControl("thisIsTheEarliestAvailabilityForAConsultationtxt").getText());
		getControl("selectDefaultTimeBtn").click();
		//		Assert.assertEquals("Total amount ", getControl("totalAmountTxt").getText());
		getControl("payAtHospitalBtn").click();
	}

	public void bookAppointmentUsingRadiologistScans() throws Exception {
		if (getControls("upcomingApptTxt").size() > 0) {
			//System.out.println("Inside IF Statement of upcoming appt.");
			swipeDownTillElement("makeAnApptBtn");
			swipeDown(1);
			getControl("makeAnApptBtn").click();
		} else {
			getControl("makeAnApptBtn").click();
		}
		//Assert.assertEquals("Whom is this appointment for?", getControl("whomIsThisAppointmentFortxt").getText());
		getControl("testPregBtn").click();
		//Assert.assertEquals("Do you want to continue consultation with this doctor? ", getControl("doYouWantToContinueWithThisDoctxt").getText());
		getControl("viewOtherDocsBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityBengaluruBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocOARBtn").click();
		//Assert.assertEquals("Select doctor type", getControl("selectDocTypeTxt").getText());
		getControl("selectDocTypeRadiologyScansBtn").click();
		//Assert.assertEquals("Search Doctors / Speciality", getControl("searchBox").getText());
		getControl("searchBox").enterText(testData.get("searchInput"));
		//Assert.assertEquals("Dr. Surekha Sanjeev Managoli", getControl("surekhaSanjeevManagoliDocCard").getText());
		getControl("surekhaSanjeevManagoliDocCard").click();
		Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		//Thread.sleep(5000);
		//Assert.assertEquals("Select procedure", getControl("selectProcedureTxt").getText());
		getControl("anomalyScanBtn").click();
		Thread.sleep(5000);
		//Assert.assertEquals("This is the earliest availability for a consultation with Dr. Surekha Sanjeev Managoli", getControl("thisIsTheEarliestAvailabilityForAConsultationtxt").getText());
		getControl("viewOtherAppointmentsBtn").click();
		swipeDown(2);
		//Assert.assertEquals("Select a Time Slot", getControl("selectATimeSlotTxt").getText());
		getControl("slotBtn").click();
		getControl("afterSlotContinueBtn").click();
		//Assert.assertEquals("Total amount ", getControl("totalAmountTxt").getText());
		getControl("payAtHospitalBtn").click();
		Assert.assertEquals("CONSULTATION SUCCESSFULLY BOOKED", getControl("consultationSuccessfullyBookedTxt").getText());
		getControl("cancelConfirmationDoneBtn").click();
	}

	public void bookAppointmentUsingRadiologistScansGurgaon() throws Exception {
		if (getControls("upcomingApptTxt").size() > 0) {
			System.out.println("Inside IF Statement of upcoming appt.");
			swipeDownTillElement("makeAnApptBtn");
			getControl("makeAnApptBtn").click();
		} else {
			getControl("makeAnApptBtn").click();
		}
		//Assert.assertEquals("Whom is this appointment for?", getControl("whomIsThisAppointmentFortxt").getText());
		getControl("testPregBtn").click();
		//Assert.assertEquals("Do you want to continue consultation with this doctor? ", getControl("doYouWantToContinueWithThisDoctxt").getText());
		getControl("viewOtherDocsBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityGurgaonBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocSector47Btn").click();
		//Assert.assertEquals("Select doctor type", getControl("selectDocTypeTxt").getText());
		getControl("selectDocTypeRadiologyScansBtn").click();
		//Assert.assertEquals("Search Doctors / Speciality", getControl("searchBox").getText());
		getControl("searchBox").enterText(testData.get("searchInput"));
		//Assert.assertEquals("Dr. Hena Bhagde", getControl("henaBhagdeDocCard").getText());
		getControl("henaBhagdeDocCard").click();
		Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		//Thread.sleep(5000);
		//Assert.assertEquals("Select procedure", getControl("selectProcedureTxt").getText());
		getControl("anomalyScanBtn").click();
		Thread.sleep(5000);
		//Assert.assertEquals("This is the earliest availability for a consultation with Dr. Hena Bhagde", getControl("thisIsTheEarliestAvailabilityForAConsultationtxt").getText());
		getControl("viewOtherAppointmentsBtn").click();
		swipeDown(2);
		//Assert.assertEquals("Select a Time Slot", getControl("selectATimeSlotTxt").getText());
		getControl("slotBtn").click();
		getControl("afterSlotContinueBtn").click();
		//			Assert.assertEquals("Total amount ", getControl("totalAmountTxt").getText());
		getControl("payAtHospitalBtn").click();
		Assert.assertEquals("CONSULTATION SUCCESSFULLY BOOKED", getControl("consultationSuccessfullyBookedTxt").getText());
		getControl("cancelConfirmationDoneBtn").click();
	}

	public void cancelAppointment() throws Exception {
		if (getControls("upcomingApptTxt").size() > 0) {
			//Assert.assertEquals("Upcoming Appointment", getControl("upcomingApptTxt").getText(),"Upcoming Appointment Is Not Visible");
			//swipeDownTillElement("3DotsImg");
			getControl("3DotsImg").click();
			//Assert.assertEquals("DISMISS", getControl("dismissBtn").getText());
			getControl("cancelBookingBtn").click();
			//Assert.assertEquals("Cancelling your appointment cannot be undone. Are you sure you would like to cancel?", getControl("cancelYourApptCannotBeUndoneTxt").getText());
			getControl("cancelConfYes").click();
			//Assert.assertEquals("Let us know why you are cancelling your appointment.", getControl("letUsKnowWhyAreYouCancellingYourApptTxt").getText());
			getControl("otherBtn").click();
		}
	}

	public void makeAnAppointment() throws Exception {
		bookAppointment();
		Assert.assertEquals("CONSULTATION SUCCESSFULLY BOOKED", getControl("consultationSuccessfullyBookedTxt").getText());
		getControl("cancelConfirmationDoneBtn").click();
	}

	public void makeAnAppointmentWithViewOtherDoctors() throws Exception {
		if (getControls("upcomingApptTxt").size() > 0) {
			System.out.println("Inside IF Statement of upcoming appt.");
			swipeDownTillElement("makeAnApptBtn");
			swipeDown(1);
			getControl("makeAnApptBtn").click();
		} else {
			getControl("makeAnApptBtn").click();
		}
		Assert.assertEquals("Whom is this appointment for?", getControl("whomIsThisAppointmentFortxt").getText());
		getControl("testPregBtn").click();
		//Assert.assertEquals("Do you want to continue consultation with this doctor? ", getControl("doYouWantToContinueWithThisDoctxt").getText());
		getControl("viewOtherDocsBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityBengaluruBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocOARBtn").click();
		//Assert.assertEquals("Select doctor type", getControl("selectDocTypeTxt").getText());
		getControl("selectDocTypeGynaecologistBtn").click();
		//Assert.assertEquals("Search Doctors / Speciality", getControl("searchBox").getText());
		getControl("searchBox").enterText(testData.get("searchInput"));
		//Assert.assertEquals("Dr. Modhulika Bhattacharya", getControl("modhulikaDocCard").getText());
		getControl("modhulikaDocCard").click();
		Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		//Thread.sleep(5000);
		//Assert.assertEquals("Select procedure", getControl("selectProcedureTxt").getText());
		getControl("consultationBtn").click();
		Thread.sleep(3000);
		Assert.assertEquals("This is the earliest availability for a consultation with Dr. Modhulika Bhattacharya", getControl("thisIsTheEarliestAvailabilityForAConsultationtxt").getText());
		getControl("viewOtherAppointmentsBtn").click();
		swipeDown(2);
		Assert.assertEquals("Select a Time Slot", getControl("selectATimeSlotTxt").getText());
		getControl("slotBtn").click();
		getControl("afterSlotContinueBtn").click();
		getControl("payAtHospitalBtn").click();
		Assert.assertEquals("CONSULTATION SUCCESSFULLY BOOKED", getControl("consultationSuccessfullyBookedTxt").getText());
		getControl("cancelConfirmationDoneBtn").click();
		//checkApptCanceled();
	}

	public void checkBookingApptFailed() throws Exception {
		bookAppointment();
		Assert.assertEquals("CONSULTATION BOOKING FAILED", getControl("apptFailedTxt").getText());
		getControl("goBackAndTryAgainBtn").click();
	}

	public void checkApptCanceled() throws Exception {
		cancelAppointment();
		System.out.println("Before DONE Assertion.");
		Assert.assertEquals("DONE", getControl("cancelConfirmationDoneBtn").getText());
		System.out.println("After DONE Assertion.");
		getControl("cancelConfirmationDoneBtn").click();
	}

	public String bookAndCancelAppt() throws Exception {
		bookAppointment();
		cancelAppointment();
		return getControl("cancelConfirmationDoneBtn").getText();
	}

	public void viewMedicalRecords() throws Exception {
		swipeDown(2);
		getControl("viewMedicalRecordsBtn").click();
		Assert.assertEquals("Health Records", getControl("healthRecordsTxt").getText());
		getControl("labsTab").click();
		getControl("scansTab").click();
		getControl("consultationsTab").click();
		getControl("changeBtn").click();
		Assert.assertEquals("Select your account", getControl("selectYourAccountTxt").getText());
		getControl("changeTestFerBtn").click();
		Assert.assertEquals("Appointments of Test_Fertility", getControl("appointmentOfTestFertilityTxt").getText());
	}

	public void weLoveToHearFromYou() throws Exception {
		getControl("").click();
	}

	public void bookALabTestLAB() throws Exception {
		if(getControls("makeAnApptBtn").size() > 0) {
			swipeDownTillElement("bookALabTestBtn");
			swipeDown(1);
			Assert.assertEquals("Book and pay for your prescribed lab tests", getControl("bookAndPayForYourPrescribedLabTestTxt").getText());
			getControl("bookALabTestBtn").click();
		}
		Assert.assertEquals("Are you looking for lab or x-rays?", getControl("areYouLookingForLabOrXrayTxt").getText());
		getControl("areYouLookingForLabBtn").click();
		Assert.assertEquals("Search", getControl("bookALabOrScanSearch").getText());
		getControl("addToCartBtn").click();
		getControl("viewCartAndProceedBtn").click();
		Assert.assertEquals("For whom this consultation is for ?", getControl("forWhomThisConsultationIsForTxt").getText());
		getControl("BASLtestPregBtn").click();
		Assert.assertEquals("Lab Payment", getControl("labPaymentTxt").getText());
		getControl("selectReferringDoctorBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("modhulikaDocCard").click();
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("Lab Payment", getControl("labPaymentTxt").getText());
		getControl("selectBookingDateBtn").click();
		Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("selectBookingDate20Btn").click();
		getControl("calendarOKBtn").click();
		Assert.assertEquals("Lab Payment", getControl("labPaymentTxt").getText());
		getControl("proceedToPayBtn").click();
		Assert.assertEquals("Payment", getControl("paymentTxt").getText());
	}

	public void bookALabTestXray() throws Exception {
		if(getControls("makeAnApptBtn").size() > 0) {
			swipeDownTillElement("bookALabTestBtn");
			swipeDown(1);
			Assert.assertEquals("Book and pay for your prescribed lab tests", getControl("bookAndPayForYourPrescribedLabTestTxt").getText());
			getControl("bookALabTestBtn").click();
		}
		Assert.assertEquals("Are you looking for lab or x-rays?", getControl("areYouLookingForLabOrXrayTxt").getText());
		getControl("areYouLookingForXrayBtn").click();
		Assert.assertEquals("Search", getControl("bookALabOrScanSearch").getText());
		getControl("addToCartBtn").click();
		getControl("viewCartAndProceedBtn").click();
		Assert.assertEquals("For whom this consultation is for ?", getControl("forWhomThisConsultationIsForTxt").getText());
		getControl("BASLtestPregBtn").click();
		Assert.assertEquals("Scan Payment", getControl("scanPaymentTxt").getText());
		getControl("proceedBtn").click();
		Assert.assertEquals("Search Doctors / Speciality", getControl("searchBox").getText());
		getControl("priyankaDocCard").click();
		getControl("searchedDocContinueBtn").click();
		swipeDown(1);
		Assert.assertEquals("Select a Time Slot", getControl("selectATimeSlotTxt").getText());
		getControl("slotBtn").click();
		getControl("afterSlotContinueBtn").click();
		Assert.assertEquals("Choose a scan", getControl("chooseAScanTxt").getText());
		getControl("anomalyScanBtn").click();
		Assert.assertEquals("Scan Payment", getControl("scanPaymentTxt").getText());
		getControl("proceedToPayBtn").click();
		Assert.assertEquals("Payment", getControl("paymentTxt").getText());
	}

	public void bookAScan() throws Exception {
		if(getControls("makeAnApptBtn").size() > 0) {
			swipeDownTillElement("bookALabTestBtn");
			swipeDown(1);
			Assert.assertEquals("Book and pay for your prescribed scan and schedule your appointment", getControl("bookAndPayForYourPrescribedScanAndScheduleYourApptTxt").getText());
			getControl("bookAScanBtn").click();
		}
		Assert.assertEquals("Search", getControl("bookALabOrScanSearch").getText());
		getControl("addToCartBtn").click();
		getControl("viewCartAndProceedBtn").click();
		Assert.assertEquals("For whom this consultation is for ?", getControl("forWhomThisConsultationIsForTxt").getText());
		getControl("BASLtestPregBtn").click();
		Assert.assertEquals("Scan Payment", getControl("scanPaymentTxt").getText());
		getControl("proceedBtn").click();
		Assert.assertEquals("Search Doctors / Speciality", getControl("searchBox").getText());
		getControl("priyankaDocCard").click();
		getControl("searchedDocContinueBtn").click();
		swipeDown(1);
		Assert.assertEquals("Select a Time Slot", getControl("selectATimeSlotTxt").getText());
		getControl("slotBtn").click();
		getControl("afterSlotContinueBtn").click();
		Assert.assertEquals("Choose a scan", getControl("chooseAScanTxt").getText());
		getControl("anomalyScanBtn").click();
		Assert.assertEquals("Scan Payment", getControl("scanPaymentTxt").getText());
		getControl("proceedToPayBtn").click();
		Assert.assertEquals("Payment", getControl("paymentTxt").getText());
	}

	public void clickGoBackAndTryAgainBtn() throws Exception {
		getControl("goBackAndTryAgainBtn").click();
	}

	public void goTillPackage() throws Exception {
		if(getControls("makeAnApptBtn").size() > 0) {
			swipeDownTillElement("packagesBtn");
			swipeDown(1);
			getControl("packagesBtn").click();
		}
	}
	
	public void goTillUpcomingEvents() throws Exception {
		if(getControls("makeAnApptBtn").size() > 0) {
			swipeDownTillElement("upcomingEventsBtn");
			swipeDown(1);
			getControl("upcomingEventsBtn").click();
		}
	}

	public void hrbrSignaturePckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("signaturePackageBtn").click();
		//Assert.assertEquals("Signature package", getControl("signaturePackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		///Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("sapnaDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}

	public void hrbrLuxuryPckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("luxuryPackageBtn").click();
		//Assert.assertEquals("Luxury package", getControl("luxuryPackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("sapnaDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}

	public void bloreMalleshwaramSignaturePckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityBengaluruBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocMalleshwaramBtn").click();
		//Assert.assertEquals("Malleshwaram", getControl("malleshwaramTxt").getText());
		getControl("signaturePackageBtn").click();
		//Assert.assertEquals("Signature package", getControl("signaturePackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("prakashKiniDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}

	public void bloreMalleshwaramLuxuryPckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityBengaluruBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocMalleshwaramBtn").click();
		//Assert.assertEquals("Malleshwaram", getControl("malleshwaramTxt").getText());
		getControl("luxuryPackageBtn").click();
		//Assert.assertEquals("Luxury package", getControl("luxuryPackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("prakashKiniDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}

	public void bloreJayanagarSignaturePckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityBengaluruBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocJayanagarBtn").click();
		//Assert.assertEquals("Jayanagar", getControl("jayanagarTxt").getText());
		getControl("signaturePackageBtn").click();
		//Assert.assertEquals("Signature package", getControl("signaturePackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("prakashKiniDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}

	public void bloreJayanagarLuxuryPckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityBengaluruBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocJayanagarBtn").click();
		//Assert.assertEquals("Jayanagar", getControl("jayanagarTxt").getText());
		getControl("luxuryPackageBtn").click();
		//Assert.assertEquals("Luxury package", getControl("luxuryPackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("prakashKiniDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}

	public void bloreWhitefieldSignaturePckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityBengaluruBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocWhitefieldBtn").click();
		//Assert.assertEquals("Whitefield", getControl("whitefieldTxt").getText());
		getControl("signaturePackageBtn").click();
		//Assert.assertEquals("Signature package", getControl("signaturePackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("meetaChawhanDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}

	public void bloreWhitefieldLuxuryPckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityBengaluruBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocWhitefieldBtn").click();
		//Assert.assertEquals("Whitefield", getControl("whitefieldTxt").getText());
		getControl("luxuryPackageBtn").click();
		//Assert.assertEquals("Luxury package", getControl("luxuryPackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("meetaChawhanDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}

	public void bloreOARSignaturePckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityBengaluruBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocOARBtn").click();
		//Assert.assertEquals("Old Airport Road", getControl("oldARTxt").getText());
		getControl("signaturePackageBtn").click();
		//Assert.assertEquals("Signature package", getControl("signaturePackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("praveenaShenoiDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}

	public void bloreOARLuxuryPckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityBengaluruBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocOARBtn").click();
		//Assert.assertEquals("Old Airport Road", getControl("oldARTxt").getText());
		getControl("luxuryPackageBtn").click();
		//Assert.assertEquals("Luxury package", getControl("luxuryPackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("praveenaShenoiDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}

	public void bloreBellandurSignaturePckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityBengaluruBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocBellandurBtn").click();
		//Assert.assertEquals("Bellandur", getControl("bellandurTxt").getText());
		getControl("signaturePackageBtn").click();
		//Assert.assertEquals("Signature package", getControl("signaturePackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("shefaliTyagiDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}

	public void mumbaiMaladSignaturePckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityMumbaiBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocMaladBtn").click();
		//Assert.assertEquals("Malad", getControl("maladTxt").getText());
		getControl("signaturePackageBtn").click();
		//Assert.assertEquals("Signature package", getControl("signaturePackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("meghanaSarvaiyaDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}

	public void mumbaiMaladLuxuryPckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityMumbaiBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocMaladBtn").click();
		//Assert.assertEquals("Malad", getControl("maladTxt").getText());
		getControl("luxuryPackageBtn").click();
		//Assert.assertEquals("Luxury package", getControl("luxuryPackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("meghanaSarvaiyaDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}

	public void mumbaiVashiSuitePckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityMumbaiBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocVashiBtn").click();
		//Assert.assertEquals("Vashi", getControl("vashiTxt").getText());
		getControl("suitePackageBtn").click();
		//Assert.assertEquals("Suite package", getControl("suitePackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("shaliniVarmaDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}

	public void mumbaiVashiDeluxePckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityMumbaiBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocVashiBtn").click();
		//Assert.assertEquals("Vashi", getControl("vashiTxt").getText());
		getControl("deluxePackageBtn").click();
		//Assert.assertEquals("Deluxe package", getControl("deluxePackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("shaliniVarmaDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}

	public void puneShivajiNagarSignaturePckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityPuneBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocShivajiNagarBtn").click();
		//Assert.assertEquals("Shivaji Nagar", getControl("shivajiNagarTxt").getText());
		getControl("signaturePackageBtn").click();
		//Assert.assertEquals("Signature package", getControl("signaturePackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("manjariKulkarniDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}

	public void puneShivajiNagarLuxuryPckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityPuneBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocShivajiNagarBtn").click();
		//Assert.assertEquals("Shivaji Nagar", getControl("shivajiNagarTxt").getText());
		getControl("luxuryPackageBtn").click();
		//Assert.assertEquals("Luxury package", getControl("luxuryPackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("manjariKulkarniDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}

	public void puneKalyaniNagarSignaturePckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityPuneBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocKalyaniNagarBtn").click();
		//Assert.assertEquals("Kalyani Nagar", getControl("kalyaniNagarTxt").getText());
		getControl("signaturePackageBtn").click();
		//Assert.assertEquals("Signature package", getControl("signaturePackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("madhuJunejaDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}

	public void puneKalyaniNagarLuxuryPckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityPuneBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocKalyaniNagarBtn").click();
		//Assert.assertEquals("Kalyani Nagar", getControl("kalyaniNagarTxt").getText());
		getControl("luxuryPackageBtn").click();
		//Assert.assertEquals("Luxury package", getControl("luxuryPackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("madhuJunejaDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}

	public void gurgaonSector47SignaturePckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityGurgaonBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocSector47Btn").click();
		//Assert.assertEquals("Sector 47", getControl("sector47Txt").getText());
		getControl("signaturePackageBtn").click();
		//Assert.assertEquals("Signature package", getControl("signaturePackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("preetyAggarwalDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}
	
	public void chennaiTNagarSignatureSuitPckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityChennaiBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocTNagarBtn").click();
		//Assert.assertEquals("Sector 47", getControl("sector47Txt").getText());
		getControl("signatureSuitPackageBtn").click();
		//Assert.assertEquals("Signature package", getControl("signaturePackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("kanimozhiDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}
	
	public void chennaiTNagarLuxurySingleRoomPckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityChennaiBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocTNagarBtn").click();
		//Assert.assertEquals("Sector 47", getControl("sector47Txt").getText());
		getControl("luxuryRoomPackageBtn").click();
		//Assert.assertEquals("Signature package", getControl("signaturePackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("kanimozhiDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}
	
	public void chandigarhSignaturePckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityChandigarhBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocChandigarhBtn").click();
		//Assert.assertEquals("Sector 47", getControl("sector47Txt").getText());
		getControl("signaturePackageBtn").click();
		//Assert.assertEquals("Signature package", getControl("signaturePackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("seemaSharmaDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}
	
	public void chandigarhLuxuryPckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityChandigarhBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocChandigarhBtn").click();
		//Assert.assertEquals("Sector 47", getControl("sector47Txt").getText());
		getControl("luxuryPackageBtn").click();
		//Assert.assertEquals("Signature package", getControl("signaturePackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("seemaSharmaDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}
	
	public void noidaSector51SignaturePckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityNoidaBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocSector51Btn").click();
		//Assert.assertEquals("Sector 47", getControl("sector47Txt").getText());
		getControl("signaturePackageBtn").click();
		//Assert.assertEquals("Signature package", getControl("signaturePackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("pratibhaSinghalDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}
	
	public void noidaSector51LuxuryPckg() throws Exception {
		goTillPackage();
		//Assert.assertEquals("HRBR/Kamanahalli", getControl("hrbrKamanahalliTxt").getText());
		getControl("changeLocationBtn").click();
		//Assert.assertEquals("Select your City", getControl("selectYourCityTxt").getText());
		getControl("selectCityNoidaBtn").click();
		//Assert.assertEquals("Select location ", getControl("selectYourLocationTxt").getText());
		getControl("selectLocSector51Btn").click();
		//Assert.assertEquals("Sector 47", getControl("sector47Txt").getText());
		getControl("luxuryPackageBtn").click();
		//Assert.assertEquals("Signature package", getControl("signaturePackageTxt").getText());
		getControl("proceedBookingBtn").click();
		//Assert.assertEquals("CANCEL", getControl("calendarCancelBtn").getText());
		getControl("goAheadBtn").click();
		//Assert.assertEquals("Bed Booking", getControl("bedBookingTxt").getText());
		getControl("pckgTestPregBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("pratibhaSinghalDocCard").click();
		//Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		Assert.assertEquals("PAY NOW", getControl("payNowBtn").getText());
	}
	
	public void bangaloreEvent() throws Exception {
		goTillUpcomingEvents();
		Assert.assertEquals("UPCOMING EVENTS", getControl("upcomingEventsTxt").getText());
		getControl("bloreEventCardBtn").click();
		Assert.assertEquals("ABOUT EVENT", getControl("aboutEventTxt").getText());
	}
	
	public void bookAnAppointmentBump() throws Exception {
		getControl("bumpBtn").click();
		getControl("makeAnApptBtn").click();
		getControl("testPregBtn").click();
		getControl("selectCityBengaluruBtn").click();
		getControl("selectLocOARBtn").click();
		getControl("selectDocTypeGynaecologistBtn").click();
		getControl("searchBox").enterText(testData.get("searchInput"));
		getControl("modhulikaDocCard").click();
		Thread.sleep(2000);
		getControl("searchedDocContinueBtn").click();
		getControl("consultationBtn").click();
		Thread.sleep(3000);
		Assert.assertEquals("This is the earliest availability for a consultation with Dr. Modhulika Bhattacharya", getControl("thisIsTheEarliestAvailabilityForAConsultationtxt").getText());
		getControl("viewOtherAppointmentsBtn").click();
		swipeDown(2);
		Assert.assertEquals("Select a Time Slot", getControl("selectATimeSlotTxt").getText());
		getControl("slotBtn").click();
		getControl("afterSlotContinueBtn").click();
		getControl("payAtHospitalBtn").click();
		Assert.assertEquals("CONSULTATION SUCCESSFULLY BOOKED", getControl("consultationSuccessfullyBookedTxt").getText());
		getControl("cancelConfirmationDoneBtn").click();
	}
	
	public void askAQueryBump() throws Exception {
		getControl("bumpBtn").click();
		getControl("askAQueryBtn").click();
		getControl("enterYourQuerytxt").enterText(testData.get("searchInput"));
		getControl("nextBtn").click();
		//Thread.sleep(2000);
		Assert.assertEquals("Thank You", getControl("thankYouToastMessageTxt").getText());
	}
}

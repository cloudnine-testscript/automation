package core.tests;

import org.testng.annotations.Test;

public class Booking extends SupportTest {
	@Test(enabled = false, priority = 1)
	/*@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Check Booking is done successfully")
	@Story("Story Name: To check booking is done")*/
	public void tc_BookAnAppointment() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Book An Appointment Start"));
		lp.login();
		hp.makeAnAppointment();
		//hp.makeAnAppointmentWithViewOtherDoctors();
		logger.debug(this.getTestEndInfoMessage("Book An Appointment End"));
	}
	
	@Test(enabled = false, priority = 2)
	public void tc_BookAnAppointmentUsingRadiologistScans() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Book An Appointment Start"));
		lp.login();
		hp.bookAppointmentUsingRadiologistScans();
		logger.debug(this.getTestEndInfoMessage("Book An Appointment End"));
	}
	
	@Test(enabled = false, priority = 3)
	public void tc_BookAnAppointmentUsingRadiologistScansGurgaon() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Book An Appointment Start"));
		lp.login();
		hp.bookAppointmentUsingRadiologistScansGurgaon();
		logger.debug(this.getTestEndInfoMessage("Book An Appointment End"));
	}

	@Test(enabled = false, priority = 4, dependsOnMethods={"tc_BookAnAppointment"})
	public void tc_CheckAppointmentFailed() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Check Appointment Failed Start"));
		lp.login();
		hp.checkBookingApptFailed();
		logger.debug(this.getTestEndInfoMessage("Check Appointment Failed End"));
	}

	@Test(enabled = false, priority = 5)
	public void tc_CancelAppointment() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Cancel Appointment Start"));
		lp.login();
		hp.checkApptCanceled();
		logger.debug(this.getTestEndInfoMessage("Cancel Appointment End"));
	}
	
	@Test(enabled = false, priority = 6)
	public void tc_MakeFutureApptAndCancel() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Make Future Appointment And Cancel Start"));
		lp.login();
		hp.makeAnAppointmentWithViewOtherDoctors();
		hp.checkApptCanceled();
		logger.debug(this.getTestEndInfoMessage("Make Future Appointment And Cancel End"));
	}

	@Test(enabled = false, priority = 7)
	public void tc_BookAndCancelAppointment() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Book And Cancel Appointment Start"));
		lp.login();
		hp.bookAndCancelAppt();
		//hp.clickConfirmationDone();
		logger.debug(this.getTestEndInfoMessage("Book And Cancel Appointment End"));
	}
	
	@Test(enabled = false, priority = 8)
	public void tc_BookALabTestLAB() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Book A Lab Test -> LAB Start"));
		lp.login();
		hp.bookALabTestLAB();
		logger.debug(this.getTestEndInfoMessage("Book A Lab Test -> LAB End"));
	}
	
	@Test(enabled = false, priority = 9)
	public void tc_BookALabTestXray() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Book A Lab Test -> Xray Start"));
		lp.login();
		hp.bookALabTestXray();
		logger.debug(this.getTestEndInfoMessage("Book A Lab Test -> Xray End"));
	}
	
	@Test(enabled = false, priority = 10)
	public void tc_BookAScan() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Book A Scan Start"));
		lp.login();
		hp.bookAScan();
		logger.debug(this.getTestEndInfoMessage("Book A Scan End"));
	}
	
	@Test(enabled = false, priority = 11)
	public void tc_BookAnAppointmentBump() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Book A Scan Start"));
		lp.login();
		hp.bookAnAppointmentBump();
		logger.debug(this.getTestEndInfoMessage("Book A Scan End"));
	}
	
	@Test(enabled = true, priority = 12)
	public void tc_AskAQueryBump() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Book A Scan Start"));
		lp.login();
		hp.askAQueryBump();
		logger.debug(this.getTestEndInfoMessage("Book A Scan End"));
	}
}

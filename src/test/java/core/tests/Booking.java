package core.tests;

import org.testng.annotations.Test;

public class Booking extends SupportTest {
	@Test(enabled = false, priority = 2)
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
	
	@Test(enabled = false, priority = 4)
	public void tc_BookAnAppointmentUsingRadiologistScans() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Book An Appointment Start"));
		lp.login();
		hp.bookAppointmentUsingRadiologistScans();
		logger.debug(this.getTestEndInfoMessage("Book An Appointment End"));
	}
	
	@Test(enabled = false, priority = 2)
	public void tc_BookAnAppointmentUsingRadiologistScansGurgaon() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Book An Appointment Start"));
		lp.login();
		hp.bookAppointmentUsingRadiologistScansGurgaon();
		logger.debug(this.getTestEndInfoMessage("Book An Appointment End"));
	}

	@Test(enabled = false, priority = 3, dependsOnMethods={"tc_BookAnAppointment"})
	public void tc_CheckAppointmentFailed() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Check Appointment Failed Start"));
		lp.login();
		hp.checkBookingApptFailed();
		logger.debug(this.getTestEndInfoMessage("Check Appointment Failed End"));
	}

	@Test(enabled = true, priority = 4)
	public void tc_CancelAppointment() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Cancel Appointment Start"));
		lp.login();
		hp.checkApptCanceled();
		logger.debug(this.getTestEndInfoMessage("Cancel Appointment End"));
	}
	
	@Test(enabled = false, priority = 4)
	public void tc_MakeFutureApptAndCancel() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Make Future Appointment And Cancel Start"));
		lp.login();
		hp.makeAnAppointmentWithViewOtherDoctors();
		hp.checkApptCanceled();
		logger.debug(this.getTestEndInfoMessage("Make Future Appointment And Cancel End"));
	}

	@Test(enabled = false, priority = 4)
	public void tc_BookAndCancelAppointment() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Book And Cancel Appointment Start"));
		lp.login();
		hp.bookAndCancelAppt();
		//hp.clickConfirmationDone();
		logger.debug(this.getTestEndInfoMessage("Book And Cancel Appointment End"));
	}
}

package core.tests;

import org.testng.annotations.Test;

public class Records extends SupportTest {
	@Test(enabled = false, priority = 6)
	public void tc_ViewMedicalRecords() throws Exception {
		logger.debug(this.getTestStartInfoMessage("View Medical Records Start"));
		lp.login();
		hp.viewMedicalRecords();
		logger.debug(this.getTestEndInfoMessage("View Medical Records End"));
	}

	@Test(enabled = false, priority = 7)
	public void tc_Account_HealthRecords() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Open Health Records Start"));
		lp.login();
		ap.clickHealthRecords();
		logger.debug(this.getTestEndInfoMessage("Open Health Records End"));
	}

	@Test(enabled = false, priority = 8)
	public void tc_Account_HealthRecords_ViewInvoiceAndPrescription() throws Exception {
		logger.debug(this.getTestStartInfoMessage("View Invoice And Prescription Start"));
		lp.login();
		ap.clickInvoiceAndPrescription();
		logger.debug(this.getTestEndInfoMessage("View Invoice And Prescription End"));
	}

	@Test(enabled = false, priority = 9)
	public void tc_Account_HealthRecords_ViewTransactions() throws Exception {
		logger.debug(this.getTestStartInfoMessage("View Transactions Start"));
		lp.login();
		ap.viewTransactions();
		logger.debug(this.getTestEndInfoMessage("View Transactions End"));
	}
}

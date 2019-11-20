package core.tests;

import org.testng.annotations.Test;

public class Events extends SupportTest {
	@Test(enabled = true, priority = 1)
	public void tc_UE_Bangalore() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Account -> Help -> Book Lab Or Scan Start"));
		lp.login();
		hp.bangaloreEvent();
		logger.debug(this.getTestEndInfoMessage("Account -> Help -> Book Lab Or Scan End"));
	}
}

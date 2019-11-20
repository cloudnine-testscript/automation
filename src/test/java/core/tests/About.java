package core.tests;

import org.testng.annotations.Test;

public class About extends SupportTest {
	@Test(enabled = true, priority = 10)
	public void tc_About_AboutCloudnine() throws Exception {
		logger.debug(this.getTestStartInfoMessage("About Cloudnine Start"));
		lp.login();
		ap.aboutCloudnine();
		logger.debug(this.getTestEndInfoMessage("About Cloudnine End"));
	}

	@Test(enabled = true, priority = 11)
	public void tc_AboutTermsAndConditions() throws Exception {
		logger.debug(this.getTestStartInfoMessage("About Terms & Conditions Start"));
		lp.login();
		ap.about_TermsAndConditions();
		logger.debug(this.getTestEndInfoMessage("About Terms & Conditions End"));
	}
}

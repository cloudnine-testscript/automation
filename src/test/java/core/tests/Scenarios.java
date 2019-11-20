package core.tests;

import org.testng.annotations.Test;


public class Scenarios extends SupportTest {
	@Test(enabled = false, priority = 1/*, description="Invalid Login Scenario with wrong username and password."*/)
	/*@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Login test with valid username and valid password.")
	@Story("Story Name: To check login")*/
	public void tc_LoginWithvalidMobileNo() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Login With valid MobileNo and Verify Home Page Start"));
		lp.login();
		logger.debug(this.getTestEndInfoMessage("Login With valid MobileNo and Verify Home Page End"));
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

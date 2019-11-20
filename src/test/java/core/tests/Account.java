package core.tests;

import org.testng.annotations.Test;

public class Account extends SupportTest {
	
	@Test(enabled = false, priority = 4)
	public void tc_InviteFriendsAndFamily() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Invite Friends And Family Start"));
		lp.login();
		ap.inviteFriendsAndFamily();
		logger.debug(this.getTestEndInfoMessage("Invite Friends And Family End"));
	}
	
	@Test(enabled = false, priority = 4)
	public void tc_AppSignOut() throws Exception {
		logger.debug(this.getTestStartInfoMessage("App SignOut Start"));
		lp.login();
		ap.signOutApp();
		logger.debug(this.getTestEndInfoMessage("App SignOut End"));
	}
}

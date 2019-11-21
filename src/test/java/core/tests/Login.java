package core.tests;

import org.testng.annotations.Test;


public class Login extends SupportTest {
	@Test(enabled = false, priority = 1/*, description="Invalid Login Scenario with wrong username and password."*/)
	/*@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Login test with valid username and valid password.")
	@Story("Story Name: To check login")*/
	public void tc_LoginWithValidMobileNoAndValidPass() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Login With valid MobileNo and Verify Home Page Start"));
		lp.login();
		logger.debug(this.getTestEndInfoMessage("Login With valid MobileNo and Verify Home Page End"));
	}
	
	@Test(enabled = true, priority = 1)
	public void tc_LoginWithValidMobileNoAndInvalidPass() throws Exception {
		logger.debug(this.getTestStartInfoMessage("Login With valid MobileNo and Verify Home Page Start"));
		lp.loginWithInvalidPass();
		logger.debug(this.getTestEndInfoMessage("Login With valid MobileNo and Verify Home Page End"));
	}
}

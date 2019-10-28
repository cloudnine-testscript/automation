package core.pages;

import java.util.Map;

import org.testng.Assert;

import agent.IAgent;
import central.Configuration;

public class LoginPage extends FullPage {

	public LoginPage(Configuration conf, IAgent agent, Map<String, String> testData) throws Exception {
		super(conf, agent, testData);
		assertPageLoad();
	}
	/*
	 * This method will verify Login with valid mobile no
	 */
	/*@Step("Loging to the app")*/
	public void login() throws Exception {
		Assert.assertEquals("Find all your needs in one place ", getControl("findAllYourNeedsInOnePlaceTxt").getText());
		getControl("skipTxt").click();
		Assert.assertEquals("We’re so glad you’re here to experience Cloudnine", getControl("weAreGladYouAreHereTxt").getText());
		getControl("loginBtn").click();
		Assert.assertEquals("Enter registered mobile number", getControl("enterRegisteredMobileNumberTxt").getText());
		getControl("mobileNoTxt").enterText(testData.get("mobileNo"));
		getControl("nextBtn").click();
		Thread.sleep(9000);
		Assert.assertEquals("Hold on, I am verifying the mobile number. Enter OTP.", getControl("enterOTPTxt").getText());
		getControl("otpTxt").enterText(testData.get("staticOTP"));
		Thread.sleep(9000);
		getControl("nextBtn").click();
		Assert.assertEquals(" SHOP ", getControl("shopTxt").getText());
		//return getControl("shopTxt").getText();
	}

}

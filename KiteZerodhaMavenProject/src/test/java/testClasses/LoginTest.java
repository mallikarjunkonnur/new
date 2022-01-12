package testClasses;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest{
 
	@Test
	public void loginToApp() {
		lp.loginWithValidInput();
		lp.enterPin();
	}
}

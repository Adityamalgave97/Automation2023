package aditya_framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GitHubTest extends BaseClass {// Inheritance

	GitHub_SignIn signIn;
	GitHub_Login login;
	GitHub_Home home;
	GitHub_SignOut signOut;

	@BeforeClass
	public void browserOpen() throws InterruptedException, IOException {
		openBrowser();
		signIn = new GitHub_SignIn(driver);
		login = new GitHub_Login(driver);
		home = new GitHub_Home(driver);
		signOut = new GitHub_SignOut(driver);
	}

	@BeforeMethod
	public void login() throws Exception, IOException {
		signIn.clickGitHubSignInButton();
		login.setGitHubLoginUsername(Utility.getTestData(0, 0));
		login.setGitHubLoginPassword(Utility.getTestData(0, 1));
		login.clickGitHubLoginBtn();
		Thread.sleep(2000);

		home.clickGitHubHomeLogOutBtn();
	}

	@Test
	public void test() throws EncryptedDocumentException, IOException {
		String expResult = Utility.getTestData(0, 2);
		String actResult = home.verifyGitHubHomePageUN();

		Assert.assertEquals(actResult, expResult, "act & exp result is different");
	}

	// ITestResult - listener, this class describes the result of a test
	@AfterMethod
	public void logOut(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			int TCID = 100;
			Utility.captureScreenshot(driver, TCID);
		}
		signOut.clickGitHubSignOutBtn();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
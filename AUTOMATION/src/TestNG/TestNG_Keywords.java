package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Keywords {

	// 1.invocationCount
	/*@Test(invocationCount = 5)
	public void TC1() {
		Reporter.log("running TC1");
	}*/
	
	@Test(priority = 2)
	public void TC2() {
	org.testng.Assert.fail();
		Reporter.log("Running TC2",true);
	}
	@Test (priority = -1,dependsOnMethods = {"TC2"}) 
	public void TC3() {
		Reporter.log("Running TC3",true);
	}
	@Test(priority = -1,enabled = false)
	public void TC4() {
		Reporter.log("Running TC4",true);
	}
	
	@Test(timeOut = 2000,dependsOnMethods = {"TC3"})
	public void TC5() throws InterruptedException {
		//Thread.sleep(4000);
		Reporter.log("Running TC5", true);
	}
	
	
	
	
	
	
	
	
	
}

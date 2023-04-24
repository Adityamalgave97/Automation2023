package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNG {

	@Test
	public void test() {
		System.out.println("Running test method");
		Reporter.log("Running Test method", false );
		Reporter.log("Running Test method", true );
	}
	
}
 
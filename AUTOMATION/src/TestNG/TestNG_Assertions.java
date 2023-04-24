package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Assertions {

	@Test
	public void test1() {
		Reporter.log("running test1 method", true);
	String expResult = "good night ";
	String actResult = "good night ";
	
	org.testng.Assert.assertEquals(actResult, expResult,"act & exp is not equal");

	}
	@Test
	public void test2() {
		Reporter.log("running test2 method", true);
		String expResult  ="good morning";
		String actResult ="good morning1";
		org.testng.Assert.assertNotEquals(actResult, expResult,"act & exp result is simler");
		
	}
	@Test
	public void test3() {
		Reporter.log("running test3 method", true);
		Boolean result = true;
		
		 org.testng.Assert.assertTrue(result,"result is false ");
		
	}
	@Test
	public void test4() {
		Reporter.log("running test4 method", true);
		boolean result = false;
		 org.testng.Assert.assertFalse(result, "result is true");
	
}
	@Test
	public void test5() {
		Reporter.log("running test5 method", true);
		String result = null;
		
		org.testng.Assert.assertNull(result, "result is not null");
	}
	
	
	@Test
	public void test6() {
		Reporter.log("running test6 method", true);
		String result = "aditya";
		
		org.testng.Assert.assertNotNull(result, "result is null");
	}
	
	@Test
	public void test7() {
		Reporter.log("running test7 method", true);
		org.testng.Assert.fail();
		
				
	
 	}
	
}
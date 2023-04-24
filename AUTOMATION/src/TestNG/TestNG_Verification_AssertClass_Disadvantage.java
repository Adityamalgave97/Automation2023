package TestNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Verification_AssertClass_Disadvantage {


	//Hard assert
	@Test
	public void test() {
	String expResult = "good morning";
	String actResult = "good night";
	Boolean  result = false;
	
	//Verification 1
	Assert.assertNotEquals(expResult, actResult, "Verification 1 act & exp result is same");
			
	//Verification 2
	Assert.assertEquals(actResult, expResult,"Verification 2 act & exp result is different");
	
	//Verification  3 
	Assert.assertTrue(result,"Verification 3 result is false");
	
	
	}
}
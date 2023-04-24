package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Verification_SoftAssert {

	@Test
	public void test() {
		String expResult = "good night";
		String actResult ="good morning";
		Boolean result = false;
		
		SoftAssert soft = new SoftAssert(); 
		
		//Verification 1 
		soft.assertNotEquals(actResult, expResult,"Verification 1 act & exp result is equal");
		
		//Verification 2
		soft.assertEquals(actResult, expResult,"Verification 2 act& exp result is Different");
		
		//Verification 3
		soft.assertTrue(result ,"Verification 3 act & exp result false");
		
		soft.assertAll();
		
		
	}
	
	
}

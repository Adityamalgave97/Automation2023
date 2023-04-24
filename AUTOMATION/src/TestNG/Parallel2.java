package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Parallel2 {

	@Test
	public void TC1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\java\\chromedriver.exe");
		 ChromeOptions option = new ChromeOptions();
		  option.addArguments("--remote-allow-origins=*");
		  
			WebDriver driver = new ChromeDriver(option);
			
			driver.manage().window().maximize();
			driver.navigate().to("https://www.facebook.com/");
			Thread.sleep(2000);
			
			driver.quit();
	}
}

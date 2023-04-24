package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTesting {
	
	@Parameters("browserName")
	@Test
	public void TC1(String browserName) throws InterruptedException  {
		WebDriver driver = null;
		
		if(browserName.equals("chrome")) {
			 System.setProperty("webdriver.chrome.driver","D:\\java\\chromedriver.exe");
			 ChromeOptions option = new ChromeOptions();
			  option.addArguments("--remote-allow-origins=*");
			  
			  driver = new ChromeDriver(option);
		}else if (browserName.equals("Edge")) {
			System.setProperty("webdriver.edge.driver","D:\\java\\edge\\msedgedriver.exe");
		    driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.quit();
	   	
	}

}

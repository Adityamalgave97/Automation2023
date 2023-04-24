package aditya_framework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

	static WebDriver driver;
	public static void openBrowser() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chrome Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		//Handling of notifications
		option.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(option);//upcasting
		
		driver.manage().window().maximize();
		
		driver.navigate().to(Utility.getPropertyFileData("url"));
		Thread.sleep(2000);
	}
}
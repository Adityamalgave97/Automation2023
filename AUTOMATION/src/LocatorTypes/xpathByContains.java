package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByContains {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();//upcasting
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("8975389483");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
	
 
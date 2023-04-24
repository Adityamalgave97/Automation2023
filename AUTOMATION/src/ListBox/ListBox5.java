package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\java\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.facebook.com/");
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("(////select[@class='_9407 _5dba _9hk6 _8esg'][1]")).click();
		  
		 WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		 Select s = new Select(day);
		 s.selectByIndex(12);
		 Thread.sleep(2000);
		s.selectByValue("6");
		Thread.sleep(2000);
		 
		s.selectByVisibleText("15");
		 
		 driver.quit();
	}

}
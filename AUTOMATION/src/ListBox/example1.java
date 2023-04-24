package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\java\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
	Thread.sleep(2000);
	
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	
	Select s = new Select(day);
	
	//s.selectByIndex(9);//10
	//s.selectByValue("20");//20
	s.selectByVisibleText("19");
	
	Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("aditya");
    
    
	
	Thread.sleep(2000);
	driver.quit();
}
	
}

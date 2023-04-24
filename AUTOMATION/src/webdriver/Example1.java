package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class Example1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		//1. SendKeys
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("adityamalgave.am@gmail.com");
		Thread.sleep(2000);
		
		//2. clear
		email.clear();
		
		//3. click
		WebElement CreateNewAcc = driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]"));
		CreateNewAcc.click();
		
		//4.get Text
		String text = CreateNewAcc.getText();
		System.out.println(text);
		
		Thread.sleep(4000);
		driver.quit();
	}

}

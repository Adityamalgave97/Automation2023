package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test2
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); 
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		
		WebElement elct = driver.findElement(By.xpath("(//img[@loading='lazy'])[5]")); //HOME
		act.moveToElement(elct).perform();
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[6]")).click();//Furniture Studio=Blankets
        Thread.sleep(3000);
        
        driver.quit();	
	}
}
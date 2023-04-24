package howToHandleDynamicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rating_Flipkart{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("asus zenfone 9");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(1000);
		
		//ratings -> o/p -> 21,936 Ratings 

		//String ratings = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[4]")).getText();
		//System.out.println(ratings);
		
		//reviews-> o/p->  4,612 Reviews
		String reviews = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]")).getText();
		System.out.println(reviews);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
package howToHandleDynamicWebElement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rating_amazon{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='nav-search-field ']//input")).sendKeys("oneplus 11");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
		
		Thread.sleep(2000);
		String reviews = driver.findElement(By.xpath("((//div[@class='a-section a-spacing-small a-spacing-top-small'])[2]//span)[7]")).getText();
		
		Thread.sleep(2000);
		System.out.println(reviews);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
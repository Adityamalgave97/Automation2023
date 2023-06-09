package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragNdrop {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\java\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dest = driver.findElement(By.xpath("//ol[@id='amt8']/li"));
		
		Actions act = new Actions(driver);
		
		//4. build
		//act.clickAndHold(src).moveToElement(dest).release().build().perform();
		
		//5. dragAndDrop
		act.dragAndDrop(src, dest);
		Thread.sleep(2000);
		
		driver.quit();
	}
}
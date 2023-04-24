package AutoSuggestions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class example2 {
	
	public static void main(String[] args) throws InterruptedException {
		String expResult ="realme 10 pro";
		System.setProperty("webdriver.chrome.driver","D:\\java\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("realme");
	    Thread.sleep(2000);
	    
	   List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	    
	    for(WebElement Option:allOptions) {
	    String actResult = Option.getText();
	    
	    if (actResult.equals(expResult)) {
			Option.click();
			break;
		}
	    }
		Thread.sleep(2000);
		driver.quit();
		
			
	}
	}
package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		  String expresult = "oneplus 11";
		
	System.setProperty("webdriver.chrome.driver", "D:\\java\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='nav-search-field ']//input")).sendKeys("oneplus");
		Thread.sleep(2000);
		
		//driver.switchTo().defaultContent();
		
		List<WebElement> vashaall  = driver.findElements(By.xpath("(//div[@class='autocomplete-results-container']/div)[2]"));
		Thread.sleep(2000);
		
		for(WebElement va: vashaall) {
			 String actResult = va.getText();
			 
			 if(actResult.equals(expresult)) {
				 va.click();
				 break;
		
}
}
		Thread.sleep(2000);
		driver.quit();
}
}	
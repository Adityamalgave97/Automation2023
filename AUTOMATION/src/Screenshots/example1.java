package Screenshots;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


import net.bytebuddy.utility.RandomString;

public class example1 {
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
 
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		Thread.sleep(2000);

		
		String random = RandomString.make(4);
		File	 dest = new File("C:\\Users\\HP\\OneDrive\\Desktop\\JAVA Automation\\screenshot\\flipkart"+random+".png");
		FileHandler.copy(src, dest);
		Thread.sleep(2000);
	//river.close();
		driver.quit();
		
		
		
	}

}

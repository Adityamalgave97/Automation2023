 package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GitHubTest {

	
	 public static void main(String[] args) throws InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver","D:\\java\\chromedriver.exe");
		 ChromeOptions option = new ChromeOptions();
		  option.addArguments("--remote-allow-origins=*");
		  
			WebDriver driver = new ChromeDriver(option);
			
			driver.manage().window().maximize();
			driver.navigate().to("https://github.com/");
			Thread.sleep(2000);
			
			GitHub_SignIn SignIn =new GitHub_SignIn(driver);
			SignIn.clickGitHubSignInBtn();
			
			Thread.sleep(4000);
			
			GitHub_Login login = new GitHub_Login(driver);
			login.setGitHubLoginUN();
			login.setGitHubLoginPWD();
			login.ClickGitHubLoginBtn();
			
			Thread.sleep(4000);
			
			GitHub_homePage home = new GitHub_homePage(driver);
			home.clickGitHubHomePageSignOutBtn();
			
			Thread.sleep(4000);
			GitHub_SignOut signOut = new GitHub_SignOut(driver);
			signOut.clickGitHubPageSignOutBtn();
			
			Thread.sleep(2000);
			
			driver.quit(); 
			 	
	}
}

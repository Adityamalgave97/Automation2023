package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_homePage {
	

		
		
		@FindBy(xpath = "(//summary[@class='Header-link'])[2]") private WebElement signOutBtn;
		public GitHub_homePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		
		public void clickGitHubHomePageSignOutBtn() {
			signOutBtn.click();
		}
				
	}



package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_SignOut {

	
	@FindBy(xpath="(//button[@type='submit'])[4]") private WebElement signOut;
	
	public GitHub_SignOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickGitHubPageSignOutBtn() {
		signOut.click();
	}
}

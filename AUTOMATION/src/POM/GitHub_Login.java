package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_Login {

	// 1)Declaration 
	@FindBy(xpath="//input[@name='login']") private WebElement UN;
	@FindBy(xpath="//input[@name='password']") private WebElement PWD;
	@FindBy(xpath="//input[@name='commit']") private WebElement loginBtn;
	
	// 2)Initalization 
	public GitHub_Login(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	 
	// 3)usage
	public void setGitHubLoginUN () {
		UN.sendKeys("adityamalgave.am@gmail.com");
	}
	
	public void setGitHubLoginPWD() {
		PWD.sendKeys("Oneplus7@123");
	}
	
	public void ClickGitHubLoginBtn() {
		loginBtn.click();
	}
}

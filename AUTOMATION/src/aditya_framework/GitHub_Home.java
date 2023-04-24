package aditya_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_Home {

	@FindBy(xpath = "(//summary[@class='Header-link'])[2]")
	private WebElement logOutBtn;
	@FindBy(xpath = "//strong[contains(text(),'Adityamalgave97')]")
	private WebElement UserName;

	public GitHub_Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickGitHubHomeLogOutBtn() throws InterruptedException {
		logOutBtn.click();
		Thread.sleep(4000);
	}

	public String verifyGitHubHomePageUN() {
		String actResult = UserName.getText();
		return actResult;

	}
}
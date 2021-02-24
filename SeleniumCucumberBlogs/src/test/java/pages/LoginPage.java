package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;

	@FindBy(id="login_field")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(name="commit")
	WebElement LoginButton;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void verifyHomepage() {
		Assert.assertTrue(driver.getTitle().contains("Sign in to GitHub"));
		System.out.println("Website has opened ... ");
	}
	
	public void verifyAccountHome() {
		Assert.assertTrue(driver.getTitle().contains("GitHub"));
		System.out.println("Successfully logged in into github");
	}
	
	public void enterUserName(String user) {
		UserName.sendKeys(user);
	}
	
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	
	public void clickLoginButton() {
		LoginButton.click();
	}
}

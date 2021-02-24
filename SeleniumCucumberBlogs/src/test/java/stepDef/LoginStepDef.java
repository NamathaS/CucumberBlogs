package stepDef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginStepDef {
	
	WebDriver driver;
	String Title, Match;
	LoginPage login;
	@Before
	public void setUp() {
		
		WebDriverManager.edgedriver().setup();
		
		driver = new EdgeDriver();	
		driver.manage().window().maximize();
		driver.get("https://github.com/login");	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Website has opened ... ");
	}


	@Given("I am on GitHub Home Page")
	public void i_am_on_git_hub_home_page() {
		login = new LoginPage(driver);
		login.verifyHomepage();
	}

	@When("I enter my {string} and {string}")
	public void i_enter_my_and(String UserName, String Password) {
		login.enterUserName(UserName);
		login.enterPassword(Password);
		login.clickLoginButton();
	}

	@Then("I should see the MyAccount page")
	public void i_should_see_the_my_account_page() {
		login.verifyAccountHome();
	}

	@After
	public void tearDown() {
		//driver.close();
		//driver.quit();
	}

}

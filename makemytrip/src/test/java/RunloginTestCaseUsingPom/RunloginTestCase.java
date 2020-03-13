package RunloginTestCaseUsingPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import loginUsingpom.login;

public class RunloginTestCase {
	
	WebDriver driver = new ChromeDriver();
	
	login lg = new login(driver);
	
	@BeforeTest
	public void openBrowser() throws InterruptedException
	{
		driver.get("https://www.makemytrip.com/");
		System.out.println("Broweser opened");
		Thread.sleep(3000L);
	}
	
	@Test
	public void loginTestPositive() throws InterruptedException
	{
		lg.clickCreateorLoginButtonXpath();
		lg.TypeEmailTextBoxXpath("test1992@test.com");
		Thread.sleep(5000L);
		lg.clickContinueButtonXpath();
		Thread.sleep(5000L);
		lg.TypePasswordTextBoxXpath("!Qwerqwer1");
		lg.clickLoginButtonXpath();
		Thread.sleep(3000L);
		lg.clickSkipVerificationPopupPageButtonXpath();
	
		
	}
	

}

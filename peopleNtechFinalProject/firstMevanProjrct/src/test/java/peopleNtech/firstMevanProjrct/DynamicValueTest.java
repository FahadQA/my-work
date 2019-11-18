package peopleNtech.firstMevanProjrct;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesOfDemo.opencart.com.HomePage;
import PagesOfDemo.opencart.com.Login;
import PagesOfDemo.opencart.com.RegistrationPage;
import PagesOfDemo.opencart.com.utils;

public class DynamicValueTest {

	
	WebDriver driver = new ChromeDriver();
	
	 
	HomePage homepage = new HomePage(driver);
	RegistrationPage regpage = new RegistrationPage(driver);
	Login login = new Login(driver);
	
	String fname = RandomStringUtils.randomAlphabetic(12); 
	String lname = RandomStringUtils.randomAlphabetic(12);
	String email = RandomStringUtils.randomAlphabetic(12)+"@mail.com";
	String phoneNo = "01"+RandomStringUtils.randomNumeric(9);
	String password;
	String conpassword;
	
	static utils testdata;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException, IOException
	{
		testdata = new utils();
		driver.get(testdata.properties.getProperty("baseUrl"));
		System.out.println("Broweser opened");
		Thread.sleep(3000L);
		
	}
	
	
	
	@Test
	public void randomvalue() throws IOException
	{
		
		System.out.println("random fname: " + fname);
		System.out.println("random lname: " + lname);
		System.out.println("random email: " + email);
		System.out.println("random phone number: " + phoneNo);
		
		System.out.println();
		
	}
	
	 
	@Test
	public void registrationSuccess()
	{
		homepage.HomepageToRegistration();
		
		regpage.provideFirstname(fname);
		regpage.provideLaststname(lname);
		regpage.provideEmail(email); //type unused email address
		regpage.provideTelephone(phoneNo);
		regpage.providePassword(password);
		regpage.provideConfirmPassword(conpassword);
		regpage.checkBoxclick();
		regpage.submitButtoClick();	
		regpage.registrationTitleMessage();
		
		
	}
}

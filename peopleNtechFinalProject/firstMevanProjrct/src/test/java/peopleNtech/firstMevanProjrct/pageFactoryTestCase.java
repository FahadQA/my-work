package peopleNtech.firstMevanProjrct;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesOfDemo.opencart.com.HomePage;
import PagesOfDemo.opencart.com.Login;
import PagesOfDemo.opencart.com.RegistrationPage;

public class pageFactoryTestCase {
	
	
	WebDriver driver = new ChromeDriver();
	
	 
	HomePage homepage = new HomePage(driver);
	RegistrationPage regpage = new RegistrationPage(driver);
	Login login = new Login(driver);
	
	
	
	@BeforeTest
	public void beforeTest() throws InterruptedException
	{
		
		driver.get("https://demo.opencart.com/");
		System.out.println("Broweser opened");
		Thread.sleep(3000L);
		
	}
	
	
	@Test
	public void registrationSuccess()
	{
		homepage.HomepageToRegistration();
		
		regpage.provideFirstname("fahad");
		regpage.provideLaststname("sabik");
		regpage.provideEmail("ka9@k.com"); //type unused email address
		regpage.provideTelephone("01954856655");
		regpage.providePassword("1234");
		regpage.provideConfirmPassword("1234");
		regpage.checkBoxclick();
		regpage.submitButtoClick();	
		regpage.registrationTitleMessage();
		
		
	}
	
	@Test
	public void registerWithExistingEmailWillNotBeRegistered()
	{
        homepage.HomepageToRegistration();
		
		regpage.provideFirstname("fahad");
		regpage.provideLaststname("sabik");
		regpage.provideEmail("ka8@k.com");//type existing email address
		regpage.provideTelephone("01954856655");
		regpage.providePassword("1234");
		regpage.provideConfirmPassword("1234");
		regpage.checkBoxclick();
		regpage.submitButtoClick();	
		regpage.existingEmailMessageShow();
	}
	
	@Test
	public void firstNameLastNameNotProvidingTest()
	{
        homepage.HomepageToRegistration();
		
		regpage.provideFirstname(""); // this feild should be blank
		regpage.provideLaststname(""); // this feild should be blank
		regpage.provideEmail("ka8@k.com");
		regpage.provideTelephone("01954856655");
		regpage.providePassword("1234");
		regpage.provideConfirmPassword("1234");
		regpage.checkBoxclick();
		regpage.submitButtoClick();	
		regpage.firstNameLastNameMessageShow();
	}
	
	@Test
	public void emailInvalidationTest()
	{
        homepage.HomepageToRegistration();    
		
		regpage.provideFirstname("fahad");
		regpage.provideLaststname("sabik");
		regpage.provideEmail("ka8@com"); //type wrong format email address
		regpage.provideTelephone("01954856655");
		regpage.providePassword("1234");
		regpage.provideConfirmPassword("1234");
		regpage.checkBoxclick();
		regpage.submitButtoClick();	
		regpage.EmailIvalidationMessageShow();
	}
	
	@Test
	public void telephoneNumberevalidationTest()
	{
        homepage.HomepageToRegistration();
		
		regpage.provideFirstname("fahad");
		regpage.provideLaststname("sabik");
		regpage.provideEmail("ka10@k.com");
		regpage.provideTelephone("11"); // type less than 3 cherecter
		regpage.providePassword("1234");
		regpage.provideConfirmPassword("1234");
		regpage.checkBoxclick();
		regpage.submitButtoClick();	
		regpage.telephoneNumberevalidationMessageShow(); 
	}
	
	@Test
	public void passwordvalidationTest()
	{
        homepage.HomepageToRegistration();
		
		regpage.provideFirstname("fahad");
		regpage.provideLaststname("sabik");
		regpage.provideEmail("ka11@k.com");
		regpage.provideTelephone("111111");
		regpage.providePassword("1"); // type less than 4 cherecter type password which is diferent from 1st password field
		regpage.provideConfirmPassword("1");
		regpage.checkBoxclick();
		regpage.submitButtoClick();	
		regpage.passwordvalidationMessageShow();   
	}
	
	@Test
	public void confirmPasswordvalidationTest()
	{
        homepage.HomepageToRegistration();
		
		regpage.provideFirstname("fahad");
		regpage.provideLaststname("sabik");
		regpage.provideEmail("ka11@k.com");
		regpage.provideTelephone("111111");
		regpage.providePassword("1234");
		regpage.provideConfirmPassword("21212");// type password which is diferent from 1st password field
		regpage.checkBoxclick();
		regpage.submitButtoClick();	
		regpage.confirmPasswordvalidationMessageShow();   
	}	
	
	@Test
	public void checkBoxIsNotClickTest()
	{
        homepage.HomepageToRegistration();
		
		regpage.provideFirstname("fahad");
		regpage.provideLaststname("sabik");
		regpage.provideEmail("ka11@k.com");
		regpage.provideTelephone("111111");
		regpage.providePassword("1234");
		regpage.provideConfirmPassword("1234");
		regpage.submitButtoClick();	// dont click on checkbox while register 
		regpage.checkBoxIsNotClickMessageShow();   
	}	
	
	@Test
	public void logInSuccesTest()
	{
	   
		homepage.HomepageToLogIn();
		
		login.provideEmail("ka8@k.com"); // type valid registered email
		login.providePassword("1234"); // type valid password
		login.clickLoginButton();
        	
	}	
	
	@Test
	public void InvalidemailLoginTest()
	{
	   
		homepage.HomepageToLogIn();
		
		login.provideEmail("ka8@kffgfd"); // type valid email
		login.providePassword("1234");
		login.clickLoginButton();
		login.invalidEmailMessage();	
	}	
	
	@Test
	public void InvalidPasswordLoginTest()
	{
	   
		homepage.HomepageToLogIn();
		
		login.provideEmail("ka8@k.com");
		login.providePassword("5424667597259187956217"); // type valid password
		login.clickLoginButton();
		login.invalidPasswordMessage();
        	
	}	
}
	
	
	


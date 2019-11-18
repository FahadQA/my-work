package PagesOfDemo.opencart.com;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
WebDriver driver;
	
	public RegistrationPage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//INPUT[@id='input-firstname']")
	WebElement firstName; 
	
	@FindBy(xpath="//INPUT[@id='input-lastname']")
	WebElement lasstName; 
	
	@FindBy(xpath="//INPUT[@id='input-email']")
	WebElement email; 
	
	@FindBy(xpath="//INPUT[@id='input-telephone']")
	WebElement telephone;
	
	
	@FindBy(xpath="//INPUT[@id='input-password']")
	WebElement password; 
	
	@FindBy(xpath="//INPUT[@id='input-confirm']")
	WebElement confirmpassword;
	
	@FindBy(xpath="//INPUT[@type='checkbox']")
	WebElement checkBoxClick; 
	
	@FindBy(xpath="//INPUT[@type='submit']")
	WebElement submitButton; 
	
	@FindBy(xpath="//H1[text()='Your Account Has Been Created!']/self::H1")
	WebElement regSuccessMessage; 
	
	
	@FindBy(xpath="//DIV[@class='alert alert-danger alert-dismissible']")
	WebElement emailExistedMessage; 
	
	@FindBy(xpath="//DIV[@class='text-danger'][text()='First Name must be between 1 and 32 characters!']")
	WebElement firstNameAllert;
	
	@FindBy(xpath="//DIV[@class='text-danger'][text()='Last Name must be between 1 and 32 characters!']")
	WebElement lastNameAllert;
	
	@FindBy(xpath="//DIV[@class='text-danger'][text()='E-Mail Address does not appear to be valid!']")
	WebElement emailValidation;
	
	@FindBy(xpath="//DIV[@class='text-danger'][text()='Telephone must be between 3 and 32 characters!']")
	WebElement telephoneNumberValidation;
	
	@FindBy(xpath="//DIV[@class='text-danger'][text()='Password must be between 4 and 20 characters!']")
	WebElement passwordValidation;
	
	@FindBy(xpath="//DIV[@class='text-danger'][text()='Password confirmation does not match password!']")
	WebElement ConfirmPasswordValidation;
	
	@FindBy(xpath="//DIV[@class='alert alert-danger alert-dismissible']")
	WebElement checkBoxClicked;
	
	
	
	
	public void provideFirstname(String firstname)
	{
		firstName.sendKeys(firstname);
	}
	
	public void provideLaststname(String lastname)
	{
		lasstName.sendKeys(lastname);
	}
	
	public void provideEmail(String emailaddress)
	{
		email.sendKeys(emailaddress);
	}
	
	public void provideTelephone(String phonenumber)
	{
		telephone.sendKeys(phonenumber);
	}
	
	public void providePassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void provideConfirmPassword(String confirmPass)
	{
		confirmpassword.sendKeys(confirmPass);
	}
	
	public void checkBoxclick()
	{
		checkBoxClick.click();
	}
	
	public void submitButtoClick()
	{
		submitButton.click();
	}
	
	
	
	public void registrationTitleMessage()
	{
		String expectedMessage = "Your Account Has Been Created!";
		String actualMesssage = regSuccessMessage.getText();
		
		assertEquals(actualMesssage, expectedMessage);
		
		System.out.println("Account created");
	}
	
	public void existingEmailMessageShow()
	{
		String expectedMessage = "Warning: E-Mail Address is already registered!";
		String actualMesssage = emailExistedMessage.getText();
		
		assertEquals(expectedMessage, actualMesssage);
		
		System.out.println("user cannot register for providing exisiting email address. the message is: "+ emailExistedMessage.getText());
		
	}
	
	public void firstNameLastNameMessageShow()
	{
		String expectedMessageFirstname = "First Name must be between 1 and 32 characters!";
		String actualMesssageFirstname = firstNameAllert.getText();
		
		assertEquals(expectedMessageFirstname, actualMesssageFirstname);
		
		System.out.println("user cannot register for not providing first name because: "+ firstNameAllert.getText() );
		
		String expectedMessagelasstname = "Last Name must be between 1 and 32 characters!";
		String actualMesssagelasstname = lastNameAllert.getText();
		
		assertEquals(expectedMessagelasstname, actualMesssagelasstname);
		
		System.out.println("user cannot register for not providing last name because: "+lastNameAllert.getText());
	}
	
	public void EmailIvalidationMessageShow()
	{
		String expectedMessageforInvalidMail = "E-Mail Address does not appear to be valid!";
		String actualMesssageforInvalidMail = emailValidation.getText();
		
		assertEquals(expectedMessageforInvalidMail, actualMesssageforInvalidMail);
		
		System.out.println("email format is invalid due to:" + emailValidation.getText());
		
	}
	
	public void telephoneNumberevalidationMessageShow()
	{
		String expectedMessageforInvalidphoneNuber = "Telephone must be between 3 and 32 characters!";
		String actualMesssageforInvalidphoneNuber = telephoneNumberValidation.getText();
		
		assertEquals(expectedMessageforInvalidphoneNuber, actualMesssageforInvalidphoneNuber);
		
		System.out.println("telephone number is invalid due to: " + telephoneNumberValidation.getText());
		
	}
	
	public void passwordvalidationMessageShow()
	{
		String expectedMessageforvalidPassword = "Password must be between 4 and 20 characters!";
		String actualMesssageforvalidPassword = passwordValidation.getText();
		
		assertEquals(expectedMessageforvalidPassword, actualMesssageforvalidPassword);
		
		System.out.println("password is invalid due to: " + passwordValidation.getText()); 
		
	}
	
	public void confirmPasswordvalidationMessageShow()
	{
		String expectedMessageforvalidConfirmPassword = "Password confirmation does not match password!";
		String actualMesssageforvalidConfirmPassword = ConfirmPasswordValidation.getText();
		
		assertEquals(expectedMessageforvalidConfirmPassword, actualMesssageforvalidConfirmPassword);
		
		System.out.println("password invalid due to: " + ConfirmPasswordValidation.getText()); 
		
	}
	
	public void checkBoxIsNotClickMessageShow()
	{
		String expectedMessageforCheckBoxIsClicked = "Warning: You must agree to the Privacy Policy!";
		String actualMesssageforcheCkBoxIsClicked = checkBoxClicked.getText();
		
		assertEquals(expectedMessageforCheckBoxIsClicked, actualMesssageforcheCkBoxIsClicked);
		
		System.out.println("user is not registered: " + checkBoxClicked.getText()); 
		
	}
	
	
	

}

package loginUsingpom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login {
	
	WebDriver driver;
	
	public login(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	By CreateorLoginButtonXpath = By.xpath("(//P[text()=' Login or Create Account'])[1]");
	By EmailTextBoxXpath = By.xpath("//INPUT[@id='username']");
	By ContinueButtonXpath = By.xpath("//SPAN[text()='Continue']");
	By PasswordTextBoxXpath = By.xpath("//INPUT[@id='password']");
	By LoginButtonXpath = By.xpath("//BUTTON[@data-cy='login']");
	By SkipVerificationPopupPageButtonXpath = By.xpath("//SPAN[@data-cy='modalClose']");
	
	By userVerification = By.xpath("//DIV[@class='makeFlex column userNameText  latoBold']");
	
	
	
	

	
	public void clickCreateorLoginButtonXpath()
	{
		driver.findElement(CreateorLoginButtonXpath).click();
		System.out.println("loginpage is appeared");
	}
	
	public void TypeEmailTextBoxXpath(String email)
	{
		driver.findElement(EmailTextBoxXpath).sendKeys(email);
		System.out.println("email is added");
	}
	public void clickContinueButtonXpath()
	{
		driver.findElement(ContinueButtonXpath).click();;
		System.out.println("navigate to password");
	}
	public void TypePasswordTextBoxXpath(String password)
	{
		driver.findElement(PasswordTextBoxXpath).sendKeys(password);
		System.out.println("password is given");
	}
	public void clickLoginButtonXpath()
	{
		driver.findElement(LoginButtonXpath).click();
		System.out.println("navigated to user account page");
	}
	
	public void clickSkipVerificationPopupPageButtonXpath()
	{
		driver.findElement(SkipVerificationPopupPageButtonXpath).click();
		
		System.out.println(((WebElement) userVerification).getText());
	}
	
	

}

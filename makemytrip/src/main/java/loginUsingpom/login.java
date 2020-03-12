package loginUsingpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	
	WebDriver driver;
	
	public login(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	By CreateorLoginButtonXpath = By.xpath("(//P[text()=' Login or Create Account'])[1]");
	
	
	public void clickCreateorLoginButtonXpath()
	{
		driver.findElement(CreateorLoginButtonXpath).click();
	}

}

package peopleNtech.firstMevanProjrct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class positiveReg {
	
 
	WebDriver driver;
	
    @BeforeTest
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Andriodtudio\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		System.out.println("Broweser opened");
	}
	
	@Test
	public void regis() throws InterruptedException
	{
       

		

		
		//home page
		driver.findElement(By.xpath("//SPAN[@class='caret']")).click();
		driver.findElement(By.xpath("//A[@href='https://demo.opencart.com/index.php?route=account/register'][text()='Register']")).click();
		
		//registration page
		driver.findElement(By.xpath("//INPUT[@id='input-firstname']")).sendKeys("hello");
		driver.findElement(By.xpath("//INPUT[@id='input-lastname']")).sendKeys("world");
		driver.findElement(By.xpath("//INPUT[@id='input-email']")).sendKeys("hello7@mail.com");
		driver.findElement(By.xpath("//INPUT[@id='input-telephone']")).sendKeys("01958632458");
		driver.findElement(By.xpath("//INPUT[@id='input-password']")).sendKeys("12345");
		driver.findElement(By.xpath("//INPUT[@id='input-confirm']")).sendKeys("12345");
		driver.findElement(By.xpath("//INPUT[@type='checkbox']")).click();
		driver.findElement(By.xpath("//INPUT[@type='submit']")).click();
		
		String expectedTitle = driver.getTitle();
		String actualTutle = "Your Account Has Been Created!";
		
		if(expectedTitle.equals(actualTutle))
		{
			System.out.println("possitive");
			
			driver.findElement(By.xpath("//SPAN[@class='caret']")).click();
			driver.findElement(By.xpath("(//A[@href='https://demo.opencart.com/index.php?route=account/logout'][text()='Logout'][text()='Logout'])[1]")).click();
			
			System.out.println("logged out");
		}
		else
		{
			System.out.println("negetive");
		}
		
		
		Thread.sleep(5000L);
		
		driver.findElement(By.xpath("//SPAN[@class='caret']")).click();
		driver.findElement(By.xpath("(//A[@href='https://demo.opencart.com/index.php?route=account/login'][text()='Login'][text()='Login'])[1]")).click();
		
		Thread.sleep(3000L);
		
		driver.findElement(By.xpath("//INPUT[@id='input-email']")).sendKeys("hello7@mail.com");
		driver.findElement(By.xpath("//INPUT[@id='input-password']")).sendKeys("12345");
		driver.findElement(By.xpath("//INPUT[@type='submit']")).click();
		
		System.out.println("logged in");
		
	}
	
	
	public void login() throws InterruptedException
	{
	
		
		
		
		
		
		
	}

}

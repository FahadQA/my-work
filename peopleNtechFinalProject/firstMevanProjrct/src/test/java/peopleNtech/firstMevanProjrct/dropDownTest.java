package peopleNtech.firstMevanProjrct;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesOfDemo.opencart.com.utils;

public class dropDownTest {
	
	WebDriver driver = new ChromeDriver();
	
	dropDownTestActions dropDownTestActions = new dropDownTestActions(driver);
	
static utils testdata;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException, IOException
	{
		testdata = new utils();
		driver.get(testdata.properties.getProperty("baseurlForFiledropDownList"));
		System.out.println("Broweser opened");
		Thread.sleep(3000L);
		
	}
	
	@Test
	public void dropDownListTest() throws InterruptedException
	{
		dropDownTestActions.clickSelectCountry();
		Thread.sleep(3000L);
		dropDownTestActions.SelectByValue("14");
		Thread.sleep(3000L);
		dropDownTestActions.SelectByIndex(2);
		Thread.sleep(3000L);
		dropDownTestActions.SelectByVisibleText("ANGOLA");
		
	}

}

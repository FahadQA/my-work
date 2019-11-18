package PagesOfDemo.opencart.com;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CountOfProduct {
	
	WebDriver driver;
	Select selenium;
	public CountOfProduct(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
		
	@FindBy(xpath = "(//INPUT[@type='text'])[2]")
	WebElement clearTextBox ;
	
	@FindBy(xpath = "(//INPUT[@type='text'])[2]")
	WebElement putNumberInTextBox ;
	
	@FindBy(xpath = "//I[@class='fa fa-refresh']")
	WebElement refreshButton ;
	
	@FindBy(name = "quantity[331666]")
	WebElement getTextFieldvaluee ;
	
	public void clearTextBoxField()
	{
		clearTextBox.clear();
	}
	
	public void putNumberInTextBoxField(String number)
	{
		putNumberInTextBox.sendKeys(number);
	}
	
	public void clickrefreshButton()
	{
		refreshButton.click();
	}
	
	public void GetTextFieldvalue()
	{
		 
		WebElement getTextFieldvalue = driver.findElement(By.name("quantity[331666]"));
		//System.out.println("the amount is: "+ele.getAttribute("value")); 
		System.out.println("the amount is: "+ getTextFieldvalue.getAttribute("value"));
	}

}

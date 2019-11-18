package peopleNtech.firstMevanProjrct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class dropDownTestActions {

WebDriver driver;
	
	public dropDownTestActions (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//SELECT[@name='country']")
	WebElement clickCountrySelectButton;
	
	public void clickSelectCountry()
	{
		clickCountrySelectButton.click();
	}

	public void SelectByValue(String string) 
	{
		Select select = new Select(clickCountrySelectButton);
		select.selectByValue(string);
	}

	public void SelectByIndex(int value) 
	{
		Select select = new Select(clickCountrySelectButton);
	    select.selectByIndex(value);	
	}

	public void SelectByVisibleText(String string)
	{
		Select select = new Select(clickCountrySelectButton);
		select.selectByVisibleText(string);
	}
}


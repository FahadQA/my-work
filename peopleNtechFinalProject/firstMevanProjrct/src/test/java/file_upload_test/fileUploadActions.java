package file_upload_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fileUploadActions {
	
WebDriver driver;
	
	public fileUploadActions (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//INPUT[@id='fileField']")
	WebElement clickFileUpload;
	
	public void fileupload(String path)
	{
		clickFileUpload.sendKeys(path);
	}

}

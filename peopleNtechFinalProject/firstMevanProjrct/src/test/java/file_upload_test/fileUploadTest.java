package file_upload_test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesOfDemo.opencart.com.utils;

public class fileUploadTest {
	
	WebDriver driver = new ChromeDriver();
	
	fileUploadActions fileuploadactions = new fileUploadActions(driver);
	
	
	static utils testdata;
	@BeforeTest
	public void beforeTest() throws InterruptedException, IOException
	{
		testdata = new utils();
		driver.get(testdata.properties.getProperty("baseurlForFileUpload"));
		System.out.println("Broweser opened");
		Thread.sleep(3000L);
		
	}
	
	@Test
	public void uploadfile() throws IOException
	{
		//testdata = new utils();
		fileuploadactions.fileupload(testdata.properties.getProperty("fileLocation"));
	}

}

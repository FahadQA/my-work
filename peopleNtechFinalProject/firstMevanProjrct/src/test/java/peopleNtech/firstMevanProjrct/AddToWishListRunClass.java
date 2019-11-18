package peopleNtech.firstMevanProjrct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import PagesOfDemo.opencart.com.AddtoWishList;

public class AddToWishListRunClass {
	
	WebDriver driver = new ChromeDriver();
	
	AddtoWishList addToWishList = new AddtoWishList(driver);
	
	@BeforeTest
	public void beforeTest() throws InterruptedException
	{
		
		driver.get("https://demo.opencart.com/");
		System.out.println("Broweser opened");
		Thread.sleep(3000L);
		
	}
	
	@Test
	public void Add_To_WishList()
	{
		addToWishList.ProvideProductNameInProductSearchingtextBox("Mac");
		addToWishList.ClickInProductSearchButton();
		addToWishList.ClickAddToWishList();
		
		//addToWishList.AddProductToWishListVerification();
	}
	

}

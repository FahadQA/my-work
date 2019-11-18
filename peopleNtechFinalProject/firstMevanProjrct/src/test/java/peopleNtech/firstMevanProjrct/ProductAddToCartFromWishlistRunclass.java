package peopleNtech.firstMevanProjrct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesOfDemo.opencart.com.Login;
import PagesOfDemo.opencart.com.ProductAddToCartFromWishlist;

public class ProductAddToCartFromWishlistRunclass {
	
	WebDriver driver = new ChromeDriver();
	
	ProductAddToCartFromWishlist productAddToCartFromWishlist = new ProductAddToCartFromWishlist(driver);
	Login login = new Login(driver);
	
	@BeforeTest
	public void beforeTest() throws InterruptedException
	{
		
		driver.get("https://demo.opencart.com/");
		System.out.println("Broweser opened");
		Thread.sleep(3000L);
		
	}
	
	@Test
	public void Add_To_Cart_From_WishList()
	{
		productAddToCartFromWishlist.ProvideProductNameInProductSearchingtextBox("Mac");
		productAddToCartFromWishlist.ClickInProductSearchButton();
		productAddToCartFromWishlist.ClickAddToWishList();
		productAddToCartFromWishlist.ClickWishListbutton();
		
		login.provideEmail("ka8@k.com");
		login.providePassword("1234");
		login.clickLoginButton();
		
		productAddToCartFromWishlist.ClickAddToCartButtonInWishListPage();
		
		//addToWishList.AddProductToWishListVerification();
	}

}

package peopleNtech.firstMevanProjrct;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesOfDemo.opencart.com.CountOfProduct;
import PagesOfDemo.opencart.com.ProductAddToCartFromProductPage;

public class CountOfProductRunclass {
	
	WebDriver driver = new ChromeDriver();
	
	ProductAddToCartFromProductPage ProductAddToCart= new ProductAddToCartFromProductPage(driver);
	CountOfProduct countOfProduct = new CountOfProduct(driver);
	
	String number = "5";
	
	@BeforeTest
	public void beforeTest() throws InterruptedException
	{
		
		driver.get("https://demo.opencart.com/");
		System.out.println("Broweser opened");
		Thread.sleep(3000L);
		
	}
	
	@Test
	public void Add_To_Cart() throws InterruptedException
	{
		ProductAddToCart.ProvideProductNameInProductSearchingtextBox("mac");
		Thread.sleep(2000L);
		ProductAddToCart.ClickInProductSearchButton();
		ProductAddToCart.ClickAddProductToCart();
		Thread.sleep(2000L);
		ProductAddToCart.ClickShoppingCartButton();
		Thread.sleep(3000L);
	}
	
	@Test
	public void Change_the_count_of_product_and_verify() throws InterruptedException
	{
		countOfProduct.clearTextBoxField();
		Thread.sleep(2000L);
		countOfProduct.putNumberInTextBoxField(number);
		Thread.sleep(2000L);
		countOfProduct.clickrefreshButton();

		countOfProduct.GetTextFieldvalue();
		
	

	}
	
	

	
	

}

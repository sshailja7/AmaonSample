package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidateItems {

	WebDriver driver;
	
	By iconCart = By.xpath("//*[@id='nav-cart-count']");
	By itemsInCart = By.xpath("//span[@class='a-size-medium sc-product-title a-text-bold']");

	public ValidateItems(WebDriver driver) {

		this.driver = driver;

	}

	public void viewCart()
	{
		driver.findElement(iconCart).click();
	}
	
	public void validateDisplayItems()
	{
		List<WebElement> listofItemsInCart = driver.findElements(itemsInCart);
		System.out.println("Number of elements:" +listofItemsInCart.size());

	    for (int i=0; i<listofItemsInCart.size();i++){
	      System.out.println("Items added in the Cart:" + listofItemsInCart.get(i).getText());
	    }
	}
}

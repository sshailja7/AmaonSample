package pageObjects;

import java.util.Iterator;
import java.util.Set;

import javax.swing.SwingUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCartPage {
WebDriver driver;
	
	By textBoxSearch = By.id("twotabsearchtextbox");
    By iconSearch = By.xpath("//*[@id='nav-search']/form/div[2]/div/input");
    By firstItem =By.xpath("//span[@class ='a-size-medium a-color-base a-text-normal']");
    By secondItem = By.xpath(("//*[@id='pdagDesktopSparkleAsinContainer1']/div[1]/div/a/div/div/img"));
    By btnAddToCart = By.id("add-to-cart-button");
    //a-autoid-0-announce
    //a-icon a-icon-cart
   

    By btnLogin = By.id("signInSubmit");
    

    public AddCartPage(WebDriver driver){

        this.driver = driver;

    }
    
    public void searchItem(){
    	
        driver.findElement(textBoxSearch).sendKeys("headphones");
        driver.findElement(iconSearch).click();
}
    
    public void addFirstItem(){
    	driver.findElement(firstItem).click();
    	String parentTab = driver.getWindowHandle();
    	Set<String> childTabs = driver.getWindowHandles();
    	Iterator<String> winHandles = childTabs.iterator();
   	
    	while(winHandles.hasNext())
    	{
    		String secWinHandle = winHandles.next();
    		if(!parentTab.equalsIgnoreCase(secWinHandle))
    		{
    			driver.switchTo().window(secWinHandle);
    			driver.findElement(btnAddToCart).click();
    		}
    	}
    	
    	driver.switchTo().window(parentTab);
    }
     public void addSecondItem(){
    	 
    	 driver.findElement(textBoxSearch).clear();
    	 driver.findElement(textBoxSearch).sendKeys("handbags");
         driver.findElement(iconSearch).click();
         driver.findElement(secondItem).click();
         driver.findElement(btnAddToCart).click();
         driver.navigate().back();
         driver.navigate().back();
         
         
      
     
}
}
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaveLater {
	
WebDriver driver;
	
	
	//By SaveLater = By.xpath("//input[@type='submit']");
	By btnSaveLater = By.xpath("//*[@class ='a-size-small sc-action-save-for-later']");
    By itemInSaveForLater = By.xpath("//input[@value='Move to Cart']");
    

	public SaveLater(WebDriver driver) {
		 this.driver= driver;
		
	}
	
	public void saveForLater(){
		
		driver.findElement(btnSaveLater).click();
	}
	
    public void verifySaveForLater(){
    	
    	Boolean text = driver.findElement(itemInSaveForLater).isDisplayed();
    	if(text){
    		System.out.println("item has moved in save for later section");
    	}
    	else
    		System.out.println("Not in save for later section");
    } 
	
}

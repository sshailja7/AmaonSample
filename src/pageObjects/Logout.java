package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Logout {

	WebDriver driver;
	By btnSignOut = By.xpath("//span[contains(text(),'Sign Out')]");
	
	public Logout(WebDriver driver) {
		this.driver = driver;
	}
	
	public void signOut(){
		Actions action = new Actions(driver);
		WebElement hoverToAccounts = driver.findElement(By.xpath("//*[@class = 'nav-a nav-a-2 nav-truncate']"));
		action.moveToElement(hoverToAccounts).perform();
		driver.findElement(btnSignOut).click();
	}

}

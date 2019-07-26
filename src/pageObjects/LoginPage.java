package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	
	By tabSignIn = By.xpath("//*[@id='nav-link-accountList']/span[2]");
    By textBoxEmail = By.id("ap_email");
    By buttonContinue =By.id("continue");
    By textBoxPassword = By.id("ap_password");
   // WebElement textLogin = driver.findElement(By.xpath("//div[contains(text(),'Login')"));

    By btnLogin = By.id("signInSubmit");

    public LoginPage(WebDriver driver){

        this.driver = driver;

    }
    
    public void clickSignIn(){

        driver.findElement(tabSignIn).click();

    }


    public void setMail(){

    	driver.findElement(textBoxEmail).sendKeys("sukrititiwari7@gmail.com");
    }
    
    public void clickContinue(){

        driver.findElement(buttonContinue).click();

    }


    public void setPassword(){

         driver.findElement(textBoxPassword).sendKeys("2019@July");

    }

    public void clickLogin(){

            driver.findElement(btnLogin).click();

    }

}

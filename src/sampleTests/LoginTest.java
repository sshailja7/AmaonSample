package sampleTests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.AddCartPage;
import pageObjects.LoginPage;
import pageObjects.Logout;
import pageObjects.SaveLater;
import pageObjects.ValidateItems;

public class LoginTest {

	WebDriver driver;
	LoginPage loginPage;
	AddCartPage addCartPage;
	ValidateItems validateItems;
	SaveLater saveLater;
	Logout logoutObject;
	
	@BeforeTest
    public void setup(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Shailja\\Eclipse Workspace\\AmazonSample\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

    }
	
	@Test(priority=0)
	public void testLogin()
	{
		loginPage = new LoginPage(driver);
		loginPage.clickSignIn();	
		loginPage.setMail();
		loginPage.clickContinue();
		loginPage.setPassword();
		loginPage.clickLogin();
		
	}
	
	@Test(priority = 1)
	public void testAddCart()
	{
		addCartPage = new AddCartPage(driver);
		
		addCartPage.searchItem();
		addCartPage.addFirstItem();
		addCartPage.addSecondItem();
	}
	
	@Test(priority = 2)
	public void testValidateItems()
	{
		validateItems = new ValidateItems(driver);
		validateItems.viewCart();
		validateItems.validateDisplayItems();
	}
	
	@Test(priority = 3)
	public void testSaveLater(){
		saveLater = new SaveLater(driver);
		saveLater.saveForLater();
		saveLater.verifySaveForLater();
		
	} 
	
	@Test(priority = 4)
	public void testLogout()
	{
		logoutObject = new Logout(driver);
		logoutObject.signOut();
		
	}
	
}

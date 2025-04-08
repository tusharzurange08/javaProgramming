package module_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ass_01_TestNG_SauceDemo {
 
	WebDriver driver;

  
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	
	
	@Test
	public void loginsaucedemo() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
		
		String exp_title="Swag Labs";
		String act_title= driver.getTitle();
		
		if(exp_title.equals(act_title))
		{
			System.out.println("Test case is passed:Login successfull");
		}
		else
		{
			System.out.println("Test case is failed:Login unsucessfull");
		}
		Thread.sleep(2000);
	  
  }
}

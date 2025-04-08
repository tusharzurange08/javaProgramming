package module_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Ass_01_a__Locator_Facebook_ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("firstname")).sendKeys("XYZ");
		Thread.sleep(1000);
		
		driver.findElement(By.name("lastname")).sendKeys("ABC");
		Thread.sleep(1000);
		
		 Select date =new Select(driver.findElement(By.name("birthday_day")));
		  date.selectByValue("8");
		  Thread.sleep(1000);
		  
		  Select month = new Select(driver.findElement(By.name("birthday_month")));
		  month.selectByVisibleText("Feb");
		  Thread.sleep(1000);
		  
		  Select year = new Select(driver.findElement(By.id("year")));
		  year.selectByValue("1999");
		  Thread.sleep(1000);
		  
		  By maleRB =  RelativeLocator.with(By.tagName("input")).below(By.id("month"));
		  driver.findElement(maleRB).click();
		  Thread.sleep(1000);
		  
		  driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		  Thread.sleep(1000);
		  
		 driver.findElement(By.name("reg_passwd__")).sendKeys("Pass@123");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.linkText("Sign Up")).click();
		  Thread.sleep(1000);
		  
		  //driver.close();
		  }

}

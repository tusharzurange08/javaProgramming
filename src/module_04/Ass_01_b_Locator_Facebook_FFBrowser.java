package module_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass_01_b_Locator_Facebook_FFBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.firefox.driver", "C:\\\\msedgedriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Create new account")).click();
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
		  
		  driver.close();	
		
	}

}

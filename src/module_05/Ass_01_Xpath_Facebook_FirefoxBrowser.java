package module_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Ass_01_Xpath_Facebook_FirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.firefox.driver", "C:\\msedgedriver.exe");
		
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("ABC");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("XYZ");
		Thread.sleep(3000);
		
		Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		day.selectByValue("8");
		Thread.sleep(3000);
		
		Select month = new Select(driver.findElement(By.xpath("//*[@id='month']")));
		month.selectByVisibleText("Feb");
		Thread.sleep(3000);
		
		Select year = new Select(driver.findElement(By.xpath("//*[@id='year']")));
		year.selectByValue("1999");
		Thread.sleep(3000);
		
		By maleRB = RelativeLocator.with(By.id("sex")).below(By.id("month"));
		driver.findElement(maleRB).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("example@gmail.com");
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//*[@id='password_step_input']")).sendKeys("Pass@1223");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@name='websubmit']")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}

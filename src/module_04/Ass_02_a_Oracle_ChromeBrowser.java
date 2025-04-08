package module_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass_02_a_Oracle_ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='sView1:r1:0:email']")).sendKeys("example@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='sView1:r1:0:password']")).sendKeys("Password@123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='sView1:r1:0:retypePassword']")).sendKeys("Password@123");
		Thread.sleep(1000);
		
		Select country = new Select(driver.findElement(By.xpath("//select[@name='sView1:r1:0:country']")));
		country.selectByVisibleText("Angola");
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("First or Given Name")).sendKeys("ABC");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='sView1:r1:0:lastName']")).sendKeys("XYZ");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='sView1:r1:0:jobTitle']")).sendKeys("QA Engineer");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='sView1:r1:0:workPhone']")).sendKeys("9874563210");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='sView1:r1:0:companyName']")).sendKeys("QA India PVT LTD");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='sView1:r1:0:address1::content']")).sendKeys("Vimannagar Pune");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='sView1:r1:0:city::content']")).sendKeys("Pune");
		Thread.sleep(1000);
		
		Select city = new Select(driver.findElement(By.xpath("//select[@name='sView1:r1:0:state']")));
		city.selectByVisibleText("Maharashtra");
		Thread.sleep(1000);
		
		
		driver.findElement(By.partialLinkText("ZIP/Postal Code")).sendKeys("412308");
		Thread.sleep(1000);
		
		// driver.findElement(By.partialLinkText("Create Account")).click();
		Thread.sleep(2000);
		
		driver.close();		

	}

}

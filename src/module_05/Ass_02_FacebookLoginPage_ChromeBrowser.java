package module_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_02_FacebookLoginPage_ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("tusharzurange88@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Tushar151");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@name='login']")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}

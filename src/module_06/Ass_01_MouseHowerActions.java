package module_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass_01_MouseHowerActions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement fashion =driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions a = new Actions(driver);
		a.moveToElement(fashion).build().perform();
		Thread.sleep(3000);
		
		WebElement woomen_footwear=driver.findElement(By.xpath("//a[text()='Women Footwear']"));
		a.moveToElement(woomen_footwear).build().perform();
		
		
		driver.findElement(By.xpath("//a[text()='Women Casual Shoes']")).click();
		Thread.sleep(3000);
		
		driver.close();
	}
		
		
		
		

}

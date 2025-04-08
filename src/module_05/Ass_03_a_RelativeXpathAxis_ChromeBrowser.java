package module_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_03_a_RelativeXpathAxis_ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//*[contains(text(),'Facebook helps')])/following::*[9]")).sendKeys("tusharzurange88@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//*[contains(text(),'Facebook helps')])/following::*[12]")).sendKeys("Tushar@123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()=\"Forgotten password?\"]/preceding::*[1]")).click();
		Thread.sleep(3000);
		
		driver.close();
	
	}

}

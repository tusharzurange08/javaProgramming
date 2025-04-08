package module_07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ass_02_FileDownloadJavaRobot {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.firefox.driver", "C:\\msedgedriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//p[text()='Java']/following::*[2]")).click();
		Thread.sleep(10000);
		
		driver.close();
		
		
		
		
	
	
	
	
	
	
	
	}
		
		
}

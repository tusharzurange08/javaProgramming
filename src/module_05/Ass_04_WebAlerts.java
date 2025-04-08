package module_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ass_04_WebAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.firefox.driver", "C:\\msedgedriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		
		

	}

}

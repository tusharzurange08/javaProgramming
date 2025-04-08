package module_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_05_ClearInput_ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(3000);
		
		 driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Tushar");
		 Thread.sleep(3000);
		 
		 driver.switchTo().activeElement().clear();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Tushar");
		 Thread.sleep(3000);
		 
		 String name = driver.switchTo().activeElement().getText();
		 System.out.println("Name:"+name);
		 Thread.sleep(3000);
		 
		 driver.close();

	}

}

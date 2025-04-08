package module_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_06_SwitchingOneFrameToAnotherFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("//*[text()='This is a sample page']")).getText();
		 System.out.println(text);
			Thread.sleep(3000);
			
			
	driver.close();	 
	}

}

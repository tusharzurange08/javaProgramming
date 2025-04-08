package module_03;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_02_SwitchingWindows2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(3000);
		
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(3000);
		
		 String text =driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		driver.close();
		Thread.sleep(3000);
		
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(3000);
		
		String old_window_title=driver.getTitle();
		System.out.println("old_window_title:"+old_window_title);
		driver.close();
		
	}

}

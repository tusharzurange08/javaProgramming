package module_03;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ass_04_FFBrowser_SwitchingTabs {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.firefox.driver", "C:\\\\msedgedriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String Title_of_first_page = driver.getTitle();
		System.out.println("Title_of_first_page:"+Title_of_first_page);
		Thread.sleep(3000);
		
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(3000);
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(3000);
		
		String text =driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("text:"+text);
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(3000);
		
		driver.getTitle();
		System.out.println("Title:"+Title_of_first_page);
		Thread.sleep(3000);
		
		driver.close();
			
	}

}

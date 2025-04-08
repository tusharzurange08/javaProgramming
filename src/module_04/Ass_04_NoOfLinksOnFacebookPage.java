package module_04;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_04_NoOfLinksOnFacebookPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Create new account")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.linkText("Learn more")).click();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String first_link = driver.getCurrentUrl();
		System.out.println("First link:"+first_link);
		
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(3000);
		
		driver.findElement(By.id("terms-link")).click();
		Thread.sleep(3000);
		
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(2));
		Thread.sleep(3000);
		
		String second_link = driver.getCurrentUrl();
		System.out.println("Second link:"+second_link);
		Thread.sleep(3000);
		
		driver.switchTo().window(tabs1.get(0));
		driver.findElement(By.id("privacy-link")).click();
		Thread.sleep(3000);
		
		ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(3));
		String third_link = driver.getCurrentUrl();
		System.out.println("Third_link:"+third_link);
		Thread.sleep(3000);
		
		driver.switchTo().window(tabs3.get(0));
		Thread.sleep(3000);
		driver.findElement(By.id("cookie-use-link")).click();
		Thread.sleep(3000);
		
		ArrayList<String> tabs4 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs4.get(4));
		String fourth_link = driver.getCurrentUrl();
		System.out.println("Fourth_link:"+fourth_link);
		Thread.sleep(3000);
		
		driver.quit();

		
		
	}

}

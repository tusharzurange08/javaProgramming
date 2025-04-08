package module_03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_05_Navigation_ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {

			System.getProperty("webdriver,chrome.driver", "C:\\\\chromedriver-win64\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com");
			Thread.sleep(3000);
			
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			String url_first_page= driver.getCurrentUrl();
			System.out.println("URL of First Page:"+url_first_page);
			Thread.sleep(3000);
			
			driver.get("https://www.selenium.dev/");
			Thread.sleep(3000);
			
			String url_second_page=driver.getCurrentUrl();
			System.out.println("URL of Second Page:"+url_second_page);
			Thread.sleep(3000);
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			driver.getCurrentUrl();
			System.out.println("Url:"+url_first_page);
			Thread.sleep(3000);
			
			driver.navigate().forward();
			System.out.println("Url:"+url_second_page);
			Thread.sleep(3000);
			
			driver.navigate().refresh();
			Thread.sleep(3000);
			
			System.out.println("Url_again:"+url_second_page);
			Thread.sleep(3000);
			
			driver.quit();
			
			
	}

}

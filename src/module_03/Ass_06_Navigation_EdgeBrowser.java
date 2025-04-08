package module_03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass_06_Navigation_EdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String url1 =driver.getCurrentUrl();
		System.out.println("URL of First Page:"+url1);
		Thread.sleep(2000);
		
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		String url2 = driver.getCurrentUrl();
		System.out.println("URL of Second Page:"+url2);
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		System.out.println("URL of First Page:"+url);
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		String url3 = driver.getCurrentUrl();
		System.out.println("URL of Second Page:"+url3);
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		String url_after_refresh = driver.getCurrentUrl();
		System.out.println("URL of Second Page:"+url_after_refresh);
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}

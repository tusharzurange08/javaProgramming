package Module_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ass_01_OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		
			
  // Test Script for chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();		// Launch Chrome browser
			Thread.sleep(2000);
			driver.get("http://www.flipkart.com/");    // Open URL
			Thread.sleep(3000);
			driver.close();
			
// Test Script for Firefox browser	
			
			System.setProperty("webdriver.firefox.driver", "C:\\msedgedriver.exe");
			WebDriver driver1 = new FirefoxDriver();  // launch firefox browser
			Thread.sleep(3000);
			driver1.get("http://www.flipkart.com");   //open test url
			Thread.sleep(3000);
			driver1.close();
			
// Test Script for Edge browser			
			System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
			WebDriver driver2 = new EdgeDriver();		//launch edge browser
			Thread.sleep(3000);
			driver2.get("http://flipkart.com"); 		// open test url
			Thread.sleep(3000);	
			driver2.close();
			
			}

}

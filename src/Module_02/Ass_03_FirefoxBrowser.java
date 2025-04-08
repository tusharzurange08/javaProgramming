package Module_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ass_03_FirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.firefox.driver","C:\\\\msedgedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		String Page_Title=driver.getTitle();
		System.out.println("Title of Page:"+Page_Title);
		driver.close();
	}

}

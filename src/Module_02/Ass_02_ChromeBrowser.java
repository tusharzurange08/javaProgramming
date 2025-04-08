package Module_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

public class Ass_02_ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		String page_title=driver.getTitle();
		System.out.println("Title of Page:"+page_title);
		driver.close();

	}

}

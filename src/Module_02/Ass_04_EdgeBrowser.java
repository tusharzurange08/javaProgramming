package Module_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass_04_EdgeBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		String Page_Title=driver.getTitle();
		System.out.println("Title of Page:"+Page_Title);
		driver.close();
		
	
	
	
	
	
	
	
	}

}

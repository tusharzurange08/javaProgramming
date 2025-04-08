package module_07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ass_04_PlainText {

	@Test
	public void printtext() throws InterruptedException {
	
	//public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver", "C:\\msedgedriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String text1 =driver.findElement(By.xpath("//p[text()='Java']")).getText();
		System.out.println(text1);
		Thread.sleep(3000);
		
		String text2 =driver.findElement(By.xpath("//p[text()='Python']")).getText();
		System.out.println(text2);
		Thread.sleep(3000);
		
		driver.close();
	}

}

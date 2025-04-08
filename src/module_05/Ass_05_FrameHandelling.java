
package module_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ass_05_FrameHandelling {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.firefox.driver", "C:\\\\msedgedriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		Thread.sleep(3000);
		
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().sendKeys("Tushar");
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		Thread.sleep(3000);

		String text = driver.switchTo().alert().getText();
		System.out.println("text:"+text);
		Thread.sleep(3000);
		
		
		driver.quit();
	}

}
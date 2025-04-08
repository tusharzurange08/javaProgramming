package module_08;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_03_WebDriverWait_UploadFile {

	//public static void main(String[] args) {
		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://smallpdf.com/word-to-pdf");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
			Thread.sleep(3000);
			
			StringSelection s=new StringSelection("C:\\Users\\Admin\\Desktop\\QA Learning\\Python Operators.docx");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
			
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			Thread.sleep(3000);
			
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			//webdriver wait 
			driver.wait(12000);
		
			driver.findElement(By.xpath("//span[text()='Download']")).click();
			Thread.sleep(3000);
			
			driver.close();

	}

}

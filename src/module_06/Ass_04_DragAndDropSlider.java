package module_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass_04_DragAndDropSlider {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement slider=driver.findElement(By.xpath("//*[@id='slider']"));
		Actions a=new Actions(driver);
		
		a.dragAndDropBy(slider, 50, 0).build().perform();
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}

}

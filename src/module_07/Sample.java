package module_07;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {

	WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void teardown() 
	{
		driver.close();
	}
	
	@Test(priority=1)
	public void verifydownloadpage() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[text()='Downloads']")).click();
		String expected_page = "Below is where";
		Thread.sleep(3000);
	    String actual_page = driver.findElement(By.xpath("//*[contains(text(),'Below is where')]")).getText();
	    
	    if(actual_page.equals(expected_page))
	    {
	    	System.out.println("Test case is passed:Download page is displayed");
	    }
	    else
	    {
	    	System.out.println("Test cases is failed:Another page is displayed");
	    }
		
	}
		@Test(priority=2)
		public void verifydocumentationpage() throws InterruptedException
		{
			driver.findElement(By.xpath("//*[text()='Documentation']")).click();
			Thread.sleep(3000);
			
			String actual_url=driver.getCurrentUrl();
			String expected_url="https://www.selenium.dev/documentation/";
			
			if(actual_url.equals(expected_url))
			{
				System.out.println("Test case is passed:Documentaion page is dispayed");
				Thread.sleep(3000);
			}
			else
			{
				System.out.println("Test case is failed :someother page is dispayed");
			}
		}
		
			@Test(priority=3)
			public void verifyprojectpage() throws InterruptedException
			{
				driver.findElement(By.xpath("//*[text()='Projects']")).click();
				Thread.sleep(3000);
				
				String actual_title=driver.getTitle();
				String expected_title="Projects | Selenium";
				
				if(actual_title.equals(expected_title))
				{
					System.out.println("Test case is passed:Project page is dispayed");
				}
				else
				{
					System.out.println("Test case is failed:Another page is displayed");
				}
			}

			
			@Test(priority=4)
			public void verifysupportpage() throws InterruptedException
			{
				driver.findElement(By.xpath("//*[text()='Support']")).click();
				Thread.sleep(3000);
				
				String actual_result=driver.findElement(By.xpath("//h1[text()='Getting Help']")).getText();
				String expected_result="Getting Help";
				if(actual_result.equals(expected_result))
				{
					System.out.println("Test case is passed:Support page is opened");
				}
				else
				{
					System.out.println("Test Case is failed:Someother page is opened");
				}
			}
	
			@Test(priority=5)
			public void  verifyblogpage() throws InterruptedException {
				driver.findElement(By.xpath("//span[text()='Blog']")).click();
				Thread.sleep(3000);
				
				
				String title=driver.getTitle();
				String exp_title="Blog | Selenium";
				
				if(title.endsWith(exp_title))
				{
					System.out.println("Test case is passed:Title page is opened");
				}
				else
				{
					System.out.println("Test case is Failed:Someother page is opened");
				}
			}
		
		

	

}

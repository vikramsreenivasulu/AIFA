package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long StartTime;
	long EndTime;
	
	@BeforeSuite()
	public void LaunchBrowser() {
		 StartTime = System.currentTimeMillis();
		 driver = new ChromeDriver();
		
	}
	
	@Test()
	public void OpenGoogle() {
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test()
	public void OpenBing() {
		
	
		driver.get("https://www.bing.com/?toWww=1&redig=6FE5B7D5CB184F8F94743AFEBFEFF03A");
		driver.manage().window().maximize();
	}
	
	@Test()
	public void OpentestLeaf() {

		driver.get("https://www.testleaf.com/");
		driver.manage().window().maximize();
		
		
			}
	
	
	@AfterSuite()
	public void BrowserClose() {
		
		driver.quit();
		EndTime = System.currentTimeMillis();
		long TotalTime = EndTime - StartTime;
		System.out.println("total time taken"+ TotalTime);

	}
}

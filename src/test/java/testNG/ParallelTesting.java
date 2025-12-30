package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {

	@Test()
	public void OpenChrome() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
	}
	
	@Test()
	public void OpenTestleaf() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/?toWww=1&redig=6FE5B7D5CB184F8F94743AFEBFEFF03A");
		driver.quit();
	}
}

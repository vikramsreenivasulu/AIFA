package PracticePurpose;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExe {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor jse =  (JavascriptExecutor) driver;	//downcasting
		
		WebElement Element = driver.findElement(By.xpath("//span[text()='Element']"));
		jse.executeScript("arguments[0].click()", Element);
		Thread.sleep(3000);
		
		WebElement Table = driver.findElement(By.xpath("(//li[@id='menuform:j_idt41']//a)[1]"));
		jse.executeScript("arguments[0].click()", Table);
		
		
		
		
		
		
		
		
		
		System.out.println("JavaScriptExe");
	}

}

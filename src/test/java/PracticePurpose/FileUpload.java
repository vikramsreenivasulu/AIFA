package PracticePurpose;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/file.xhtml;jsessionid=node0o7i8jnzrf7ys1igp99xj3af6q12439640.node0");
		
		driver.findElement(By.id("j_idt88")).click();
		
		System.out.println("it is working");
		
		//driver.close();
	}
	
	
}

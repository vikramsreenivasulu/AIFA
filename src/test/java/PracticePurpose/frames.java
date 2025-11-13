package PracticePurpose;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frames {

		
	
	
		@Test
		
		public void Nk () throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node012hxr742dw4r613qtgl6a3s1mc8446758.node0");
		// singleframe	
		Thread.sleep(3000);
		WebElement insideframe = driver.findElement(By.xpath("//iframe[@src='default.xhtml']"));
		driver.switchTo().frame(insideframe);
		Thread.sleep(3000);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		
		
		// double frame	
		WebElement Nestedframe = driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
		driver.switchTo().frame(Nestedframe);
		Thread.sleep(3000);
		driver.switchTo().frame("frame2");
		Thread.sleep(3000);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		
		
		 driver.findElement(By.xpath("//input [@placeholder='Search...']")).sendKeys("hgvjcjgf");
		
		
		
		
		System.out.println("sdhbibvksdvkjsd done ");
		driver.wait();
		
		
		
		}
	
}

package PracticePurpose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFrames {

	
	
	public static void main(String[] args) throws InterruptedException {
		
			//browser Launch
			WebDriver driver =  new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Frames.html");
			
			//single frame
			WebElement SingleIframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
			driver.switchTo().frame(SingleIframe);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vikram fdygd");
			driver.switchTo().defaultContent();
			
			
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
			
			//nested frame
			WebElement NestedFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
			driver.switchTo().frame(NestedFrame);
			
			Thread.sleep(3000);
			WebElement InsideNested = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
			driver.switchTo().frame(InsideNested);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vikram erripooku");
			driver.switchTo().defaultContent();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//a[@href='SwitchTo.html'])[2]")).click();
			Thread.sleep(3000);
			
			
		
			
			System.out.println("webfwhjbfvwuledliweu");
			driver.quit();
	}
}

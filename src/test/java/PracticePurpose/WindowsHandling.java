package PracticePurpose;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml#");
		Thread.sleep(3000);
			String oldwindow = driver.getWindowHandle();
			
			WebElement firstbutton = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]"));
			Thread.sleep(3000);
			Thread.sleep(3000);
			firstbutton.click();
			
			Set<String> handles = driver.getWindowHandles();
			
			for (String NewWindow : handles) {
				if (!NewWindow.equals(oldwindow)) {
					driver.switchTo().window(NewWindow);
					driver.close();
					driver.switchTo().window(oldwindow);
				}
			}
			Thread.sleep(3000);
			WebElement editbox = driver.findElement(By.xpath("(//li[@id='menuform:j_idt40']//a)[1]"));
			Thread.sleep(3000);
			Thread.sleep(3000);
			editbox.click();
			Thread.sleep(3000);
			driver.switchTo().window(oldwindow);    
			
			//open multiple windows
			WebElement OpenWindow = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]"));
			Thread.sleep(3000);
			OpenWindow.click();
			int NoofWindows = driver.getWindowHandles().size();
			System.out.println(NoofWindows);
			
			//donot close me 
			WebElement CloseWindows = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]"));
			Thread.sleep(3000);
			CloseWindows.click();
			
			Set<String> CloseNewWindow = driver.getWindowHandles();
			
			for (String AllWindow : CloseNewWindow) {
				if(!AllWindow.equals(oldwindow)) {
				driver.switchTo().window(AllWindow);
				Thread.sleep(3000);
				driver.close();
				}
			}
			
			driver.quit();
			
			System.out.println("window handling is working");
	}

}

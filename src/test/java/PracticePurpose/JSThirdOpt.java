package PracticePurpose;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSThirdOpt {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml");
		driver.manage().window().maximize();
		
		 WebElement xpath = driver.findElement(By.id("j_idt106:auto-complete_input"));
		 xpath.sendKeys("dsbfjbhwu6te", Keys.ENTER);
		 

		 
		
		
		System.out.println("it is working crt");
	}

}

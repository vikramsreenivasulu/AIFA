package PracticePurpose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	
	
	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/radio.xhtml");
		
		
		WebElement Safari = driver.findElement(By.xpath("(//input[@type='radio'])[21]"));
		
		
			if (Safari.isSelected()) 
			{
			    System.out.println("Safari radio button is selected by default.");
			} else 
			{
			    System.out.println("Safari button is not selected");
			}
		
		System.out.println("is working");
		//driver.quit();
	}
}

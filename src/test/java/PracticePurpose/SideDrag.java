package PracticePurpose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SideDrag {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		
		WebElement Source = driver.findElement(By.xpath("(//div[contains(@class,'ui-panel ui-widget')])[1]"));
		
		Actions a = new Actions(driver);
		a.dragAndDropBy(Source, 200, 0).perform();
		a.dragAndDropBy(Source, -100, 0).perform();
		
		
		System.out.println("side drag is working ");
	}

}

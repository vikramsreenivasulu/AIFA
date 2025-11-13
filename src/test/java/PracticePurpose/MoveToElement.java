package PracticePurpose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement movetoelement = driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(movetoelement).build().perform(); 
		// here seq arrange for using build kaani perform maatrame iste kooda work avthundhi 
		
		
		
		System.out.println("Move to Element is working");
		driver.wait();
	}

}

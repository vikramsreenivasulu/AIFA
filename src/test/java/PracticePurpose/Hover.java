package PracticePurpose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {

	
	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://leafground.com/menu.xhtml;jsessionid=node019g67v6vtokyb2yxm6i6pi2813021831.node0#");
		driver.manage().window().maximize();
		
		WebElement ClickCustomers = driver.findElement(By.xpath("(//ul//li//span[@class='ui-icon ui-icon-triangle-1-s'])[1]"));
		ClickCustomers.click();
		
		
		Actions hover = new Actions(driver);
		WebElement hovervalue = driver.findElement(By.xpath("(//li[@class='ui-widget ui-menuitem ui-corner-all ui-menu-parent'])[1]"));
		hovervalue.getAttribute("class");
		hover.moveToElement(hovervalue).build().perform();
		
		
		
		//driver.close();
		System.out.println("it is working");
	}
	
	
}

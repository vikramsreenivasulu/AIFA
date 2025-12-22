package PracticePurpose;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws AWTException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=5284638664402316176&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061994&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		
		WebElement Mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		Actions a = new Actions(driver);
		a.contextClick(Mobile).perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);  
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		System.out.println("Context click is working ");
	}

}

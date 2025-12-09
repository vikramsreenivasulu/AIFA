package PracticePurpose;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLeaf_Waits {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/waits.xhtml;jsessionid=node0eyw2clihnldq10us6jmpqs5h29455306.node0");
		driver.manage().window().maximize();
		
		//WaitforVisibility
		WebElement WaitforVisibility = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]"));
		WaitforVisibility.click();
				
		WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'I am here')]")));
				
		
		
		//WaitforClickability
		WebElement WaitforClickability = driver.findElement(By.xpath("//span[text()='Click First Button']"));
		WaitforClickability.click();

		WebElement ClickSecondBtn = driver.findElement(By.xpath("//span[text()='Click Second']"));

		Thread.sleep(5000);
		WebDriverWait w2 = new WebDriverWait(driver, Duration.ofSeconds(90));
		w2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='ui-growl-message']")));
		WebElement btn = w2.until(ExpectedConditions.elementToBeClickable(ClickSecondBtn));
		btn.click();
		Thread.sleep(2000);
		
		//WaitforInvisibility 
		WebElement WaitforInvisibility = driver.findElement(By.xpath("(//span[contains(text(),'Click')])[2]"));
		WaitforInvisibility.click();
		By disappearingElement = By.xpath("//button[contains(.,'I am about to hide')]");
		WebDriverWait w4 = new WebDriverWait(driver,Duration.ofSeconds(30));
		w4.until(ExpectedConditions.invisibilityOfElementLocated(disappearingElement));
		
		//Wait for Text Change
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		By message = By.xpath("(//span[contains(@class,'ui-button-text')])[7]");
		driver.findElement(By.xpath("(//span[contains(text(),'Click')])[5]")).click();
		wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(message, "I am going to change!")));
		String newText = driver.findElement(message).getText();
		System.out.println("Text changed to: " + newText);
		
		
		System.out.println("It is working ");
	}
}

package PracticePurpose;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class explicit_FluentWait {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			WebElement btn = driver.findElement(By.id("timerAlertButton"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", btn);
			
			FluentWait f = new FluentWait(driver);
			f.withTimeout(Duration.ofSeconds(7)).pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class).until(ExpectedConditions.alertIsPresent());
			
			driver.switchTo().alert().accept();
			System.out.println("Explicit Fluentwait is working");
	}
}

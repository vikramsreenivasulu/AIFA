package PracticePurpose;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		WebElement SignUp = driver.findElement(By.id("timerAlertButton"));
//		SignUp.click();
		
		WebElement btn = driver.findElement(By.id("timerAlertButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", btn);
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(7));
		w.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
		System.out.println("waits is working ");
	}

}

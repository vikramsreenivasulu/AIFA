package PracticePurpose;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {

	
	public static void main(String[] args) throws IOException {
		
		
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.manage().window().maximize();
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File Start = ts.getScreenshotAs(OutputType.FILE);
		
		File End  = new File("C:\\Users\\vikram.sreenivasulu\\eclipse-workspace\\PraticeProject\\ScreenShot\\Login.png");
		
		FileHandler.copy(Start, End);
	}
}

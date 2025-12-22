package PracticePurpose;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().window().maximize();
		
		
		WebElement Forget = driver.findElement(By.xpath("//a[normalize-space(text())='Forgot Password?']"));
		Forget.click();
		
		//TakeScreenShot
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File Start = ts.getScreenshotAs(OutputType.FILE);
		
		File End = new File("C:\\Users\\vikram.sreenivasulu\\eclipse-workspace\\PraticeProject\\ScreenShot\\forgotpassword.png");
		
		FileHandler.copy(Start,End);
		
		
		
		System.out.println("it is working ");
		driver.close();
	}

}

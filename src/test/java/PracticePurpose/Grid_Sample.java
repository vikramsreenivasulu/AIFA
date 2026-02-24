package PracticePurpose;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grid_Sample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/grid.xhtml;jsessionid=node0141c3wjo3pxhj10224dplzq58l12589594.node0");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement element = driver
				.findElement(By.xpath("//input[@id='form:j_idt92_input']"));

		String FileName = "redtape sneakers.png";
		element.sendKeys("D:\\leafground\\".concat(FileName));

		System.out.println("it is working fine");
		
	}
}

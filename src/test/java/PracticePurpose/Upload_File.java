package PracticePurpose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_File {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml;jsessionid=node01b4fw1gnckgr15ah242clqwrx12465319.node0");
		driver.manage().window().maximize();

		WebElement singleFileInput = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt89_input']"));

		String fileName = "TestLeaf Logo.png";

		singleFileInput.sendKeys("D:\\TestFolder\\".concat(fileName));
		
		
		Thread.sleep(3000); 
		
		WebElement singleFileInput1 = driver.findElement(By.xpath("//input[@id='j_idt97:j_idt98_input']"));

		String fileName1 = "TestLeaf Logo.png";
		String fileName2 = "TestLeaf Logo2.png";
	
		singleFileInput1.sendKeys("D:\\TestFolder\\" + fileName1 + "\n" +"D:\\TestFolder\\" + fileName2);
		
		System.out.println("jdbfasbueirhvineluiah");
	}
}

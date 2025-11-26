package PracticePurpose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml;jsessionid=node0a70i8dg52qq41put0vvw00dtj9087621.node0");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement UIAuto = driver.findElement(By.xpath("(//div[@class='col-12']//select)[1]"));
		Select s = new Select(UIAuto);
			s.selectByIndex(2);
			
		
			WebElement Country = driver.findElement(By.id("j_idt87:country"));
			Country.click();
			WebElement option = driver.findElement(By.xpath("//li[@data-label='India']"));
			option.click();
			Thread.sleep(3000);
			
			WebElement City = driver.findElement(By.id("j_idt87:city_label"));
			City.click();
			WebElement option1 = driver.findElement(By.xpath("//li[@data-label='Chennai']"));
			option1.click();
			Thread.sleep(3000);
			
			
			
			
			
			WebElement Language = driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']"));
			Language.click();
			WebElement option3= driver.findElement(By.xpath("//li[@data-label='English']"));
			option3.click();
			Thread.sleep(3000);
			
			WebElement languagechosen = driver.findElement(By.xpath("//label[@id='j_idt87:value_label']"));
			languagechosen.click();
			WebElement option4= driver.findElement(By.xpath("//li[@data-label='Three']"));
			option4.click();
			Thread.sleep(3000);
			
			WebElement Course = driver.findElement(By.xpath("//button[@aria-label='Show Options']"));
			Course.click();
			Thread.sleep(1000);
			WebElement option5= driver.findElement(By.xpath("//li[@data-item-value='AWS']"));
			option5.click();
			Course.click();
			
//			WebElement Course1 = driver.findElement(By.xpath("//button[@aria-label='Show Options']"));
//			Course1.click();
//			
//			Thread.sleep(1000);
//			WebElement option6= driver.findElement(By.xpath("//li[@data-item-value='Appium']"));
//			//Course.click();
//			option6.click();
			
//			Select a = new Select(Course);
//			a.selectByVisibleText("Course");

			Thread.sleep(3000);
			
//			WebElement MultipleSelect = driver.findElement(By.xpath("//span[@class='ui-button-text']"));
//			MultipleSelect.click();
//			Select Multi = new Select(MultipleSelect);
//			Multi.selectByIndex(0);
//			Multi.selectByValue("Selenium WebDriver");
//			Multi.selectByVisibleText("JMeter");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Thread.sleep(10000);
		System.out.println("it is working");
		//driver.quit();
	}

}

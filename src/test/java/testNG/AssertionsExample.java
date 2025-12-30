package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {

	
	String name = "Aadhi";
	
	boolean value = false;
	
	@Test()
	public void CheckName() {
		
//		if(name.equals("Aadhi"))
//		{
//			System.out.println("name is equals");
//		}else{
//			System.out.println("name is not equals");
//		}
		
		Assert.assertNotEquals(name, "aadhi");
		Assert.assertFalse(value, "it is not true");
	}
}

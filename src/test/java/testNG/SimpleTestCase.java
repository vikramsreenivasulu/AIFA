package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTestCase {
	
	@Test
	public void FirstTestCase() {
		System.out.println("first test case");
		Assert.assertEquals(true, true);
	}
	
	/*
	 * @Test public void SecondTestCase() { System.out.println("Second test case"); }
	 * 
	 * @Test public void ThirdTestCase() { System.out.println("third test case"); }
	 */
	
}

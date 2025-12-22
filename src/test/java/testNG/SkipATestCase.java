package testNG;

import org.testng.annotations.Test;

public class SkipATestCase {

	@Test(priority = 0)
	public void StartACar() {
		System.out.println("car starts");
	}
	
	@Test(priority = 1)
	public void FirstGear() {
		System.out.println("turn into 1st fear");
	}
	
	@Test(priority = 6, enabled = false)
	public void TurnOnMusic() {
		System.out.println("Music turned onnnnn");
	}
	
	@Test(priority = 3)
	public void SecondGear() {
		System.out.println("turn into 2st fear");
	}
	
	@Test(priority = 4)
	public void ThirdGear() {
		System.out.println("turn into 3st fear");
	}
	
	@Test(priority = 5)
	public void ForthGear() {
		System.out.println("turn into 4st fear");
	}
}

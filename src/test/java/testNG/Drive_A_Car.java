package testNG;

import org.testng.annotations.Test;

public class Drive_A_Car {

	@Test(priority=0)
	public void StarttheCar()
	{
		System.out.println("start the car");
	}
	@Test(priority = 1)
	public void firstGear() {
		System.out.println("1st gear ");
	}
	@Test(priority = 2)
	public void SecondGear() {
		System.out.println("2nd gear ");
	}
	@Test(priority = 3)
	public void ThirdGear() {
		System.out.println("3rd gear ");
	}
	@Test(priority = 4 )
	public void FourthGear() {
		System.out.println("4th gear ");
	}
}

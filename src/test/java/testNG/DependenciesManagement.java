package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement {
	
	@Test(enabled = true)
	public void SSC() {
		System.out.println("Studied 10th class");
	}
	
	@Test(dependsOnMethods = "SSC")
	public void Intermediate() {
		System.out.println("Studied 11th and 12th");
	}
	
	
	@Test(dependsOnMethods = "Intermediate")
	public void Btech() {
		System.out.println("Studied Engineering");
	}
}

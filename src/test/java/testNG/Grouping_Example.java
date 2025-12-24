package testNG;

import org.testng.annotations.Test;

public class Grouping_Example {

	@Test(groups = {"Apple"})
	public void Apple1() {
		System.out.println("Apple testing one");
	}
	
	@Test(groups = {"Apple"})
	public void Apple2() {
		System.out.println("Apple testing two");
	}

	@Test(groups = {"Moto"})
	public void Moto1() {
		System.out.println("Moto Testing one");
	}
	
	@Test(groups = {"Moto"})
	public void Moto2() {
		System.out.println("Moto Testing Two");
	}

	@Test(groups = {"Vivo"})
	public void Vivo1() {
		System.out.println("Vivo Testing one");	
	}

	@Test(groups = {"Vivo"})
	public void Vivo2() {
		System.out.println("Vivo Testing Two");
	}

	@Test(groups = {"Lenovo"})
	public void Lenovo1() {
		System.out.println("Lenovo Testing one");
	}
	
	@Test(groups = {"Lenovo"})
	public void Lenovo2() {
		System.out.println("Lenovo Testing two");
	}
}

package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsHierachyExample {
  @Test
  public void f() {
	  System.out.println("Iam test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("iam before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("iam after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("iam before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Iam after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Iam before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Iam after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Iam before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Iam after suite");
  }

}

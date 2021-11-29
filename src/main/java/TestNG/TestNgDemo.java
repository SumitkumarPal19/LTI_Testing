package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo {
	/* Running Execution Sequence
	* BeforeSuite
	* BeforeTest
	* BeforeClass
	* BeforeMethod
	* Test
	* AfterMethod
	* AfterClass
	* AfterTest
	* AfterSuite*/
	@BeforeMethod
	public void launchapplication( ) {
	System.out.println("BeforeMethod");
	}
	@Test
	public void password() {
	System.out.println("Password");
	}
	@Test(priority = 1)
	public void login() {
	System.out.println("Login");
	}

	@AfterMethod
	public void closeapplication() {
	System.out.println("AfterMethod");
	}
	@Test
	public void homepagevalidation() {
	System.out.println("Validating Home Page");
	}

}

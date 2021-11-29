package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;



public class TestngAssignment {
	
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	/*@Test
	public void  validateTitle() {
		
	}*/

	@Test (priority=1)
	public void validateUserName() {
	boolean userName = driver.findElement(By.id("txtUsername")).isDisplayed();
	Assert.assertTrue(userName);
	}
	
	@Test (priority=2)
	public void validateLoginPanel() {
		boolean login = driver.findElement(By.id("logInPanelHeading")).isDisplayed();
		Assert.assertTrue(login);
		
	}
	
	@Test (priority=3)
	public void noRecord() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_Job")).click();
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Ajay");
		driver.findElement(By.id("searchBtn")).click();
		boolean norecord = driver.findElement(By.id("searchSystemUser_userName")).isDisplayed();
		System.out.println("no record found");
		Assert.assertTrue(norecord);
	}
	
	@Test (priority=4)
	public void displayRecord() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_Job")).click();
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Aravind");
		driver.findElement(By.id("searchBtn")).click();
		boolean displayrecord = driver.findElement(By.id("searchSystemUser_userName")).isDisplayed();
		System.out.println("We got the result...");
		Assert.assertTrue(displayrecord);
		
	}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}

}

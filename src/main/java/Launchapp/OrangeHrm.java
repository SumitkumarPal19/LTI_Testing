package Launchapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_Job")).click();
		driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("Software Developer");
		driver.findElement(By.id("jobTitle_jobDescription")).sendKeys("Producing clean, efficient code based on specifications. Testing and deploying programs and systems. Fixing and improving existing software.");
		driver.findElement(By.id("jobTitle_note")).sendKeys("Candidate must have a Bachelor's degree in Engineering");
		driver.findElement(By.id("btnSave")).click();

		
		

	}

}

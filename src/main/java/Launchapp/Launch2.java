package Launchapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		//driver.findElement(By.linkText("Forgot your password")).click();
		//driver.findElement(By.partialLinkText("Forgot your ")).click();
		//driver.quit();
		
	}

}

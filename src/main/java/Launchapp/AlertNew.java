package Launchapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertNew {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		driver.switchTo().alert().accept();
		//driver.findElement(By.id("timerAlertButton")).click();
		//driver.switchTo().alert().accept();
		//driver.findElement(By.id("C")).click();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.id("promtButton")).click();
		driver.findElement(By.id("promtButton")).sendKeys("Sunmit Kumar Pal");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		

	}

}

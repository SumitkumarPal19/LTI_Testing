package Launchapp;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Assignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
		//*[@id='resultTable']/tbody/tr[13]/td[2]/a
		int rowSize=rows.size();
		String before_xpath="//*[@id='resultTable']/tbody/tr[";
		String after_xpath="]/td[2]/a";
		
		for(int i=1;i<rowSize;i++) {
			String name=driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			if(name.equalsIgnoreCase("Aravind")) {
				driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td[1]/input")).click();
			}
		}
	}
}


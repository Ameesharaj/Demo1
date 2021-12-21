package genericlib;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Baseclasses {
	WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
	}
	 
	
@BeforeMethod
public void loginbrowser() {
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
}
@Test
public void  organization() {
	driver.findElement(By.xpath("(//a [text()='Organizations'])[1]")).click();
	driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();


	
}
@AfterMethod
public void logoutbrowser() {
	WebElement ele=driver.findElement(By.xpath("//span[@class='userName']/following::img[1]"));
	Actions a=new Actions(driver);
	a.moveToElement(ele).click().build().perform();
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	
	
}
@AfterClass
public void closethebrowser() {
	driver.close();
	
}
}

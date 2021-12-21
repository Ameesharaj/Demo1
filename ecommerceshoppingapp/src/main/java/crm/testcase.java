package crm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class testcase {
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("http://localhost:8888/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void signIn() {
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.xpath("(//a [text()='Organizations'])[1]")).click();
	driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	WebElement ele=driver.findElement(By.name("industry"));
	Select s=new Select(ele);
	//s.selectByIndex(3);
	
	}
	
	@AfterMethod
	public void closeApp() {
	driver.close();
	}
}















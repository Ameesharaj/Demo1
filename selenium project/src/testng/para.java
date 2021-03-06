package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class para {
	public WebDriver driver;
	@Parameters({"browsername"})
	@Test
public void demo(String browser) {
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("email")).sendKeys("hjhj");
	driver.findElement(By.id("pass")).sendKeys("fgygy");
	driver.findElement(By.name("login")).click();
	String title = driver.getTitle();
	Reporter.log(title,true);


	String url = driver.getCurrentUrl();
	Reporter.log(url,true);

	}
	@AfterMethod
	public void closeapp() {
		driver.close();
	}
}

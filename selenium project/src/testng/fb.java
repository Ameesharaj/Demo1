package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class fb {
public WebDriver driver;
@BeforeMethod
public void openapp() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
@Test
public void tc1() {
	driver.findElement(By.id("email")).sendKeys("hjhj");
	driver.findElement(By.id("pass")).sendKeys("fgygy");
	driver.findElement(By.name("login")).click();
	String title = driver.getTitle();
	//assert assertequals(title,"hghghg");
	SoftAssert a=new SoftAssert();
	a.assertEquals(title,"facebook-login or signup");
	Reporter.log(title,true);
	a.assertAll();
	String url = driver.getCurrentUrl();
	Reporter.log(url,true);
}
private boolean assertequals(String title, String string) {
	// TODO Auto-generated method stub
	return false;
}
@AfterMethod
public void closeapp() {
	driver.close();
}

}

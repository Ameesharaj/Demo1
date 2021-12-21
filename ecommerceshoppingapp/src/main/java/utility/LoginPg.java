package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPg {
	public WebDriver driver;
public void log(WebDriver driver) {
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
}
}

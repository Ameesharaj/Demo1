package locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class skill {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.skillrary.com/user/login");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.id("email")).sendKeys("ghghgh");
driver.findElement(By.name("password")).sendKeys("gfvgh");
driver.findElement(By.xpath("//button[@type='submit']")).click();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.close();


		
}
	}



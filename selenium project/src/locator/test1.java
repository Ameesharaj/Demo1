package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver ();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement( By.id("email")).sendKeys("tydtfyuglu");
		driver.findElement(By.name("pass")).sendKeys("fgfhgihgiu");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("login")).click();
		
		
		
	
		
		

	}

}

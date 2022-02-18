package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver ();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.findElement(By.name("username")).sendKeys("gyf");
		driver.findElement(By.name("password")).sendKeys("gfhg");
		driver.findElement(By.xpath(""))


	}

}

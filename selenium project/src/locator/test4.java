package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElements(By.cssSelector("input[type='text'])")).sendkeys("ghf")
		
		driver.findElements(By.cssSelector("input[id='pass']")).sendkeys("gfyfygyu");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		
	}
}


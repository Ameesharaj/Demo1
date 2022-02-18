package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test9 {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("ughug");
		driver.findElement(By.name("pass")).sendKeys("hgh");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	 String title=driver.getTitle();
	 System.out.println(title);
	 if(title.equals("Facebook – log in or sign up")) {
		 System.out.println("pass=home page is displayed");
	 }
	 else
	 {
		System.out.println("fail;home is not displayed");

	}
String url=driver.getCurrentUrl();
System.out.println(url);
driver.close();
}
}

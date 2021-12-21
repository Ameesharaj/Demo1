package fileutilitytest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.proputility;

public class loginvtusingprop {
	
	public static void main (String args[])throws IOException {
		proputility po=new proputility();
		String url=po.readdata("url");
		String un=po.readdata("username");
		String pwd=po.readdata("password");
		WebDriver driver= new ChromeDriver();
		driver.findElement(By.name("user_name")).sendKeys(un);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();
		
		
	}

}

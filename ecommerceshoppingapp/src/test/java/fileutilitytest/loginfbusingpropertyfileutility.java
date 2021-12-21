package fileutilitytest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.propertyutilityfile;

public class loginfbusingpropertyfileutility {
	public static void main (String[]args) throws IOException {
		
	
	propertyutilityfile ref=new propertyutilityfile();
	String URL=ref.readdata("url");
	String UN=ref.readdata("username");
	String pwd=ref.readdata("password");
	WebDriver driver=new ChromeDriver();
	driver.get(URL);
	driver.findElement(By.name("email")).sendKeys(UN);
	driver.findElement(By.name("pass")).sendKeys(pwd);
	driver.findElement(By.name("login")).click();

}
}
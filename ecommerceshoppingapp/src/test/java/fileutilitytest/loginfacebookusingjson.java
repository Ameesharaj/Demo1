package fileutilitytest;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.jsonutility;

public class loginfacebookusingjson {
	public static void main(String[]args) throws IOException, ParseException {
	
		//System.setProperty("webdriver.chrome.driver", "C:\\drive\\chromedriver.exe");
		jsonutility ref=new jsonutility();
		String url = ref.readdata("url");
		String user = ref.readdata("un");
		String pass = ref.readdata("pwd");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("email")).sendKeys(user);
		driver.findElement(By.name("pass")).sendKeys(pass);
		driver.findElement(By.id("login")).click();
				
	}
	

}

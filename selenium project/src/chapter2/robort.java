package chapter2;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robort {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Robot r=new Robot();
	r.key
	
	
	
	
		
		

	}

}

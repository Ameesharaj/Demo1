package chapter2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class assign {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
WebElement	ele=driver.findElement(By.id("month"));
	Select s=new Select(ele);
	List<WebElement> alloptions = s.getOptions();
			System.out.println(alloptions.size());
			for(WebElement ob:alloptions){
			System.out.println(ob.getText());
			}
			driver.close();
			

	
	}
}


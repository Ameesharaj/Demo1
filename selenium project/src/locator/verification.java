package locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verification {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement email = driver.findElement(By.name("email"));
		if(email.isDisplayed()) {
			System.out.println("pass:element is displayed");
			email.sendKeys("ffy");
		
		}
		else
		{
			System.out.println("fail:element is not displayed");
		}
		WebElement account=driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']"));
	if(account.isEnabled()) {
		System.out.println("pass:element is enabled");
		account.click();
	}
	else
	{
		System.out.println("fail:element is not enabled ");
	}
	WebElement select=driver.findElement(By.name("sex"));
	if(select.isSelected());
	{
		System.out.println("pass:element is selected");
	}
	else 

	{
		System.out.println("fail:element is not selected");
	}
	driver.close();
	}
	
	
			
			
			
		
		}

	}



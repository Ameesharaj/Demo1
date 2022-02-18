package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop {

	

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement	ele=driver.findElement(By.xpath("//select[@name='url']"));
		Select s=new Select(ele);
		s.selectByIndex(3);
		s.selectByValue("search-alias=automotive-intl-ship");
		s.selectByVisibleText("Computers");
		
		List<WebElement> alloptions = s.getOptions();
		System.out.println(alloptions.size());
			
		for(WebElement opt:alloptions){
			System.out.println(opt.getText());
			
			
		}

driver.close();
	
		

	}

}

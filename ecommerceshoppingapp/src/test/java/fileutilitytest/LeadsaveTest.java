package fileutilitytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.Baseclass;

public class LeadsaveTest extends Baseclass {
	WebDriver driver;
	@Test(groups= {"smoketest"})
	public void save() {
		driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt=\"Create Lead...\"]")).click();
		driver.findElement(By.xpath("//body[@class='small']")).click();
		
		
	}

}

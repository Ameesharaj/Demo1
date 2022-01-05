package fileutilitytest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import utility.Baseclass;

//@Listeners(com.crm.vtiger.dataprovider.Listner.class)
public class CreateOrgTest  extends Baseclass {
	WebDriver driver;
	
	@Test
		
	public void createorganization() {
		driver.findElement(By.xpath("(//a [text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	}
	

}

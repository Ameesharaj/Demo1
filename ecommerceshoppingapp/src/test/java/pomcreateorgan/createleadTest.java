package pomcreateorgan;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.objectrepository.HomePage;

import utility.Baseclass;


/**
//@Listeners(com.crm.vtiger.dataprovider.Listner.class)
public class createleadTest extends Baseclass {
	//WebDriver driver;
	
	@Test
	public void lead() {
		
		HomePage hp = new HomePage(swd);
		hp.clickleads();
		driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt=\"Create Lead...\"]"));
		
		
		
	}

}
**/
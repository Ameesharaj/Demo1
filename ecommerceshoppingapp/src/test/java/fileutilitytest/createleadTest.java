package fileutilitytest;

import org.testng.annotations.Test;

import com.crm.objectrepository.HomePage;

import utility.Baseclass;

public class createleadTest extends Baseclass {
	//WebDriver driver;
	
	@Test
	public void lead() {
		
		HomePage hp = new HomePage(driver);
		hp.clickleads();
		//driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();
		//driver.findElement(By.xpath("//img[@alt=\"Create Lead...\"]"));
		
		
		
	}

}

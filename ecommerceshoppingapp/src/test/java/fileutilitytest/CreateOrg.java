package fileutilitytest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.crm.objectrepository.HomePage;
import com.crm.objectrepository.OrganizationObjectRepository;

import utility.Baseclass;

public class CreateOrg extends Baseclass{

WebDriver driver;
@Test
public void clickOrgLink() throws Exception 
{
	OrganizationObjectRepository oor=new OrganizationObjectRepository(driver);
	HomePage hp = new HomePage(driver);
	hp.getorganizationlnk();

	Thread.sleep(3000);
	//oor.getOrgPlus().click();

  
  
  

}
}

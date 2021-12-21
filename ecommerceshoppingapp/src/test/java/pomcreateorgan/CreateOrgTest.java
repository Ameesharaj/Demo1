package pomcreateorgan;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.crm.objectrepository.HomePage;
import com.crm.objectrepository.OrganizationObjectRepository;

import utility.Baseclass;

public class CreateOrgTest extends Baseclass{

//WebDriver driver;
@Test
public void clickOrgLink() throws Exception 
{
	OrganizationObjectRepository oor=new OrganizationObjectRepository(driver);
	HomePage hp = new HomePage(driver);
	hp.clickOrganization();

	Thread.sleep(3000);
	//oor.getOrgPlus().click();

  
  
  

}
}

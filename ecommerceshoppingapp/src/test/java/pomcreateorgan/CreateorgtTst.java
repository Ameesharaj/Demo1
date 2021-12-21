package pomcreateorgan;

import org.testng.annotations.Test;

import com.com.vtiger.webdriverutilities.WebDriverUtilities;
import com.crm.objectrepository.HomePage;
import com.crm.objectrepository.OrganizationObjectRepository;

import utility.Baseclass;

public class CreateorgtTst extends Baseclass {
	

	//WebDriverUtilities wu=new WebDriverUtilities();
	
	
	
	@Test
	public void clickOrgLink() {
		
		HomePage hp = new HomePage(driver);
		OrganizationObjectRepository oor=new  OrganizationObjectRepository(driver);
		hp.clickOrganization();
		oor.getOrgPlus().click();
		WebDriverUtilities wu=new WebDriverUtilities();
		
	
		
		
		oor.selectindustry("Healthcare");
		
	}

}


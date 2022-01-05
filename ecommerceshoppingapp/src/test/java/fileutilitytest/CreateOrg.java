package fileutilitytest;

import org.testng.annotations.Test;

import com.crm.objectrepository.HomePage;

import utility.Baseclass;

public class CreateOrg extends Baseclass{

//WebDriver driver;
@Test
public void clickOrgLink() throws Exception 
{
	HomePage hp = new HomePage(driver);
	hp.getorganizationlnk().click();

	Thread.sleep(3000);
	//oor.getOrgPlus().click();

  
  
  

}
}

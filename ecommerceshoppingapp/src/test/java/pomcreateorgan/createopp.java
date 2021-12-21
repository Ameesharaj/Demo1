package pomcreateorgan;

import org.testng.annotations.Test;

import com.crm.objectrepository.HomePage;

import utility.Baseclass;

public class createopp extends Baseclass {
@Test
public void opportunity() {
	HomePage hp=new HomePage(driver);
	hp.getOpportuniteslnk().click();
	//hp.clickopportunities();
}

}

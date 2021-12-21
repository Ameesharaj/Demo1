package genericlib;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Baseclassutility {
	Baseclasses BCUtil=new Baseclasses();
	


	@BeforeClass
	public void browser() {
		BCUtil.openBrowser();
	}
		
@BeforeMethod
public void openBrowser() {
	BCUtil.loginbrowser();
	
}
@Test
public void createorganization() {
	BCUtil.organization();
}
@AfterMethod
public void signout() {
	BCUtil.logoutbrowser();
}
@AfterClass
public void closebrowser() {
	BCUtil.closethebrowser();
	
}

}

package utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
/**
public class bass {
	
	public WebDriver driver;
	propertyutilityfile pfile=new propertyutilityfile();
	LoginPg in=new LoginPg();
	Logout out=new Logout();
	


@BeforeClass
public void launchbrowser() throws IOException {
	System.out.println("launch browser");

	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(pfile.readdata("url"));
}
@BeforeMethod
public void createlogin() {
	in.log(driver);
}
@AfterMethod
public void close() {
	out.logout(driver);
}
@AfterClass
public void signout() {
	driver.close();
}
}
**/

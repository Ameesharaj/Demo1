package utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.crm.objectrepository.Loginpom;
import com.crm.objectrepository.logoutpom;

public class FireClass {
	 public WebDriver driver;
	propertyutilityfile pfile=new propertyutilityfile();
	
@Parameters("browser")	
@BeforeClass
public void launchTheBrowser() throws IOException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\Downloads\\chromedriver_win32 (1).zip\\chromedriver.exe");
		//System.out.println("launch the browser");
		String browser = pfile.readdata("brw");
			driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(pfile.readdata("url"));
		
		
	}




	@BeforeMethod
	public void login() throws IOException {
	//lp.log(driver);	
		Loginpom lo=new Loginpom(driver);
		String un=pfile.readdata("username");
		String pwd=pfile.readdata("password");
		lo.login(un,pwd);
	}
	
	@AfterMethod
	public void logout() {
		//out.logout(driver);
		logoutpom oo=new logoutpom(driver);
		oo.adminstration();
		oo.signout();
		
	}
@AfterClass
public void closebrowser() {
	driver.close();
}


}

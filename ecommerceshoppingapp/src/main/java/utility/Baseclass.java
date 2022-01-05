
package utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.com.vtiger.webdriverutilities.WebDriverUtilities;
import com.crm.objectrepository.Loginpom;
import com.crm.objectrepository.logoutpom;

public class Baseclass 

{
	 public WebDriver driver;
	//public static WebDriver swd; 
	
	public propertyutilityfile pfile=new propertyutilityfile();
	public WebDriverUtilities web=new WebDriverUtilities();
	public javautility ju = new javautility();
	
 //  @Parameters("browser")	
//@BeforeClass
//public void launchTheBrowser(String browser) throws IOException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\Downloads\\chromedriver_win32 (1).zip\\chromedriver.exe");
	// System.out.println("launch the browser");
	//	 browser = pfile.readdata("brw");
	//	if (browser.equalsIgnoreCase("chrome"))
		
	//		driver=new ChromeDriver();
		
	//	else if (browser.equalsIgnoreCase("firefox"))
		
//			driver=new FirefoxDriver();
		
		//swd=driver;
	//	driver.manage().window().maximize();
	//	driver.get(pfile.readdata("url"));
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	//}




	@BeforeMethod
	public void login() throws IOException {
	WebDriverUtilities web=new WebDriverUtilities();
		
	//lp.log(driver);	
		Loginpom lo=new Loginpom(driver);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
			
		driver.get("http://localhost:8888/index.php?module=Accounts&action=index");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		
		//String un=pfile.readdata("username");
		//String pwd=pfile.readdata("password");
		//lo.login(un,pwd);
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
	//swd.close();
	driver.close();
}
}

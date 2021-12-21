package pomcreateorgan;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.Baseclass;
@Listeners(com.crm.vtiger.dataprovider.Listner.class)
public class leads extends Baseclass {  
	
	@Test(retryAnalyzer =com.crm.vtiger.dataprovider.Retryanalyser.class)
	public void testcase (){
		driver.findElement(By.xpath("//a[text()='eads']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
		driver.findElement(By.name("lastname")).sendKeys("raj");
		Assert.assertTrue(false);

	}

}


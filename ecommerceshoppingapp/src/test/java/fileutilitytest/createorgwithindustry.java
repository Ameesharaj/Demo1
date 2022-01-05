package fileutilitytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utility.Baseclass;

public class createorgwithindustry extends Baseclass {
	@Test(groups= {"smoke","regression"})
	public void createorgindus (){
		driver.findElement(By.xpath("(//a [text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
              WebElement ele  =driver.findElement(By.name("industry"));
              Select industry=new Select(ele);
              industry.selectByVisibleText("Healthcare");
        
		
	}
	

}

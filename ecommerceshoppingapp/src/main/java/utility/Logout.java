package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Logout {
	public void logout(WebDriver driver) {
		WebElement ele=driver.findElement(By.xpath("//span[@class='userName']/following::img[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).click().build().perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']"));
		
		
	}

}

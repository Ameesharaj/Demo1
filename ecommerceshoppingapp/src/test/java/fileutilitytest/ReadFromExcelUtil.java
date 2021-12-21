package fileutilitytest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.excelutility;

public class ReadFromExcelUtil {
	public void readdata()throws IOException { 

        excelutility eutil=new excelutility();
		String Url = eutil.readdata("Sheet1", 1, 0);
		String un = eutil.readdata("Sheet1", 1, 1);
		String pwd = eutil.readdata("Sheet1", 1, 2);
		System.out.println(Url);
		System.out.println(un);
		System.out.println(pwd);
		
		WebDriver driver=new ChromeDriver();

		
		driver.get(Url);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
        
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
        driver.findElement(By.id("submitButton")).click();
	}
}

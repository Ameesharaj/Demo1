package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.com.vtiger.webdriverutilities.WebDriverUtilities;

import utility.Baseclass;

public class Loginpom extends Baseclass {
	WebDriver driver;
	public Loginpom(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	
@FindBy(name="user_name")
private WebElement un;

public WebElement getusername() {
	return un;
	
}



@FindBy(name="user_password")
private WebElement pwd;

public WebElement getpassword() {
	return pwd;
	
}

@FindBy(id="submitButton")
private WebElement sb;

public WebElement getsubmit() {
	return sb;
}

	

public void login(String user,String pass)
{
	un.sendKeys(user);
	pwd.sendKeys(pass);
	sb.click();
}

  
	 
 }


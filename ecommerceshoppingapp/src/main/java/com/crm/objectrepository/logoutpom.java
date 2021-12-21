package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.com.vtiger.webdriverutilities.WebDriverUtilities;

public class logoutpom  extends WebDriverUtilities {
	WebDriver driver;
	public logoutpom (WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
@FindBy(xpath="//span[@class='userName']/following::img[1]")
private WebElement mousehover;

 public WebElement log() {
	 return mousehover;
 }
 public void adminstration()
 {
	 WebDriverUtilities we=new  WebDriverUtilities();
	 we.mouseOver(driver, mousehover);
			 
 }
 
 @FindBy(xpath="//a[text()='Sign Out']")
 private WebElement sign;
 public WebElement out() {
	 return sign;
 }
 public void signout() {
 sign.click();
}
}
 
 
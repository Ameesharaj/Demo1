package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.com.vtiger.webdriverutilities.WebDriverUtilities;

public class OrganizationObjectRepository {
	WebDriver driver;
	WebDriverUtilities wu=new WebDriverUtilities();
	
	public  OrganizationObjectRepository(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement orgPlus;
	
	public WebElement getOrgPlus()
	{
		
		return orgPlus;
	}
	
	@FindBy(name="industry")
	private WebElement dropDown;
	
	public WebElement getDropDown()
	{
		return dropDown;
	}
	
	public void selectindustry(String industry) {
		wu.selectDropdownVisibleText(dropDown, industry);
		
	}	
	
	}


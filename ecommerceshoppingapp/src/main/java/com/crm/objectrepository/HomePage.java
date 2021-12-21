
package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.com.vtiger.webdriverutilities.WebDriverUtilities;

public class HomePage extends WebDriverUtilities {

	public WebDriver driver;
	
	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[text()='Organizations'])[1]")
	private WebElement organizationlnk;

	@FindBy(xpath = ("(//a[text()='Leads'])[1]"))
	private WebElement leads;

	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactslnk;

	@FindBy(xpath = "(//a[text()='Opportunities'])[1]")
	private WebElement opportuniteslnk;

	@FindBy(xpath = "//a[text()='Products']")
	private WebElement productslnk;

	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement createorg;

	// @FindBy(name="industry")
	// private WebElement dropindus;

	public WebElement getorganizationlnk() 
	{
		return organizationlnk;
		

	}
	public WebElement getleads()
	{
		return leads;
	}
	public void clickleads() {
		leads.click();
	}
	
	public void clickOrganization()
	{
		//WebDriverUtilities wb = new WebDriverUtilities();

		//wb.waitForTheElement(driver, organizationlnk);
		
		organizationlnk.click();
	}

public WebElement getOpportuniteslnk() {
		return opportuniteslnk;
	}
public void clkorgan(WebElement org) {
		
		org.click();
}
	

	
		
	}



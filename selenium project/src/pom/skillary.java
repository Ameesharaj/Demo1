`package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillary {
	@FindBy(xpath="//a[text()='LOGIN']")
	private WebElement loginbt;
	
	@FindBy(id="email")
	private WebElement usernametb;
	
	@FindBy(id="password")
	private WebElement passwordtb;
	
	@FindBy(name="login")
	private WebElement submittb;
	
	public skillary (WebDriver driver) {
	PageFactory.initElements( driver,this);}

	public void loginbutton() {
		loginbt.click();
		
	}
	public void email(String product) {
		usernametb.sendKeys("sudu");
		
	}
	public void pass(String pass) {
		passwordtb.sendKeys("ammu");
	}
	public void sub() {
		submittb.click();
		
		
	}
}

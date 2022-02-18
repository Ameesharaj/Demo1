package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class google {
	@FindBy(name="q")
	private WebElement searchbox;
	
	public google(WebDriver driver) {
		PageFactory.initElements( driver,this);}
		
		public void searchtextbox(String product) {
			searchbox.sendKeys(product);
			
		}
		
	}
	



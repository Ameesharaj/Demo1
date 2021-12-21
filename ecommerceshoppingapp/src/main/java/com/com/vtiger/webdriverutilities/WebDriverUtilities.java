package com.com.vtiger.webdriverutilities;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

import com.google.common.io.Files;

/**
 * in this class all the webdriver utilities are present
 * 
 * @author 91956
 *
 */

public class WebDriverUtilities {

	/**
	 * this method is used for implicit wait t
	 * 
	 * @param driver
	 */
	public void waitUntilPageLoads(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	/**
	 * this method is used for explicit wait
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForTheElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}

	/**
	 * this method is to perform double click
	 * 
	 * @param driver
	 */
	public void doubleClick(WebDriver driver) {

		Actions a = new Actions(driver);
		a.doubleClick();
	}

	/**
	 * to perform clickaction
	 * 
	 * @param driver
	 */
	public void click(WebDriver driver, WebElement ele) {

		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}

	/**
	 * this method is to perform mouseover
	 * 
	 * @param driver
	 */
	public void mouseOver(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}

	/**
	 * this method is used to perform acceptalert
	 * 
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();

	}

	/**
	 * this method is to perform cancelalert
	 * 
	 * @param driver
	 */
	public void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();

	}

	/**
	 * this method is used to perform
	 */
	public void selectDropdownbyindex(WebElement ele, int index) {
		Select s = new Select(ele);
		s.selectByIndex(index);
	}

	public void selectDropdownbyvalue(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByValue(value);
	}

	public void selectDropdownVisibleText(WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}

	public void takeScreenshot(WebDriver driver, String screenshotName) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\91956\\eclipse-workspace\\ecommerceshoppingapp\\photo\\" + screenshotName + ".PNG");
		Files.copy(src, dest);

	}

	public void scrollToWebElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int y = element.getLocation().getY();
		js.executeScript("window.scrollBy(0," + y + ")", element);

	}

	public void switchFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public void switchFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	public void switchFrame(WebDriver driver, String idOrName) {
		driver.switchTo().frame(idOrName);
	}

	public void switchToWindow(WebDriver driver, String partialWinTitle) {
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		while (it.hasNext()) {
			String winId = it.next();
			String title = driver.switchTo().window(winId).getTitle();
			if (title.contains(partialWinTitle)) {
				break;
			}

		}

	}

	public void waitAndClick(WebElement element) throws InterruptedException {
		int count = 0;
		while (count < 20) {
			try {
				element.click();
				break;
			} catch (Throwable e) {
				Thread.sleep(1000);
				count++;
			}
		}

	}

}

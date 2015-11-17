package webdriver_selendroid_chrome_mvn_eclipse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class View_01_launcher extends BaseTest {

	
	@Before
	  public void setUp() throws Exception {
		super.setUp("http://stagemapi2.canadiantire.ca/");
		}

	@Override
	@After
	  public void tearDown() throws Exception {
	   super.tearDown();
	}
	
	
	@Test
	public void startWebDriver(){	
		driver.get(baseUrl + "/autopartfinder/#/config/0022/en/0050563FFFED");
	    driver.findElement(By.cssSelector("span.launcher-button-text.ng-binding")).click();
	    new Select(driver.findElement(By.id("catEN"))).selectByVisibleText("BATTERY");
	    new Select(driver.findElement(By.id("year"))).selectByVisibleText("2003");
	    new Select(driver.findElement(By.id("make"))).selectByVisibleText("ACURA");
	    new Select(driver.findElement(By.id("model"))).selectByVisibleText("RSX");
	    new Select(driver.findElement(By.id("engine"))).selectByVisibleText("4-1998 2.0L DOHC");
	    driver.findElement(By.xpath("//button[@type='search']")).click();
	    driver.findElement(By.cssSelector("div.inner-align")).click();
	    driver.findElement(By.linkText("BACK")).click();
	    driver.findElement(By.cssSelector("img.pull-left.center-icon")).click();	
	}
	


}

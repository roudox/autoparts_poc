package webdriver_selendroid_chrome_mvn_eclipse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class View_01_launcher extends BaseTest {

	
	@Before
	  public void setUp() throws Exception {
		super.setUp("http://autopartfinder.cantire.net/#/config/0022/en/00912383");
		}

	@Override
	@After
	  public void tearDown() throws Exception {
	   super.tearDown();
	}
	
	
	@Test
	public void startWebDriver(){	
		driver.get(baseUrl);
	    driver.findElement(By.cssSelector("span.launcher-button-text.ng-binding")).click();
	    new Select(driver.findElement(By.id("catEN"))).selectByVisibleText("BATTERY");
	    new Select(driver.findElement(By.id("year"))).selectByVisibleText("2003");
	    new Select(driver.findElement(By.id("make"))).selectByVisibleText("ACURA");
	    new Select(driver.findElement(By.id("model"))).selectByVisibleText("RSX");
	    new Select(driver.findElement(By.id("engine"))).selectByVisibleText("4-1998 2.0L DOHC");
	    driver.findElement(By.cssSelector(".search-button")).click();
	    driver.findElement(By.cssSelector("div.eye-icon")).click();
	    driver.findElement(By.cssSelector("li.pdp-label.ng-isolate-scope.active")).click();
	    driver.findElement(By.cssSelector("li.pdp-label.ng-isolate-scope")).click();
	    driver.findElement(By.cssSelector(".pdp-close-button-content")).click();
	    driver.findElement(By.cssSelector("img.pull-left.center-icon")).click();
	}
	


}

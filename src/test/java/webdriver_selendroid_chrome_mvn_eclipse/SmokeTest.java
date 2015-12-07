package webdriver_selendroid_chrome_mvn_eclipse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SmokeTest extends BaseTest {

	
	private Data data=new Data();
	
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
	    driver.findElement(Elements.Start_Button).click();
	    
	    AutopartsData vehicle=data.getNext();
	    System.out.println(vehicle);
	    new Select(driver.findElement(By.id("catEN"))).selectByVisibleText(vehicle.getCatalog());
	    new Select(driver.findElement(By.id("year"))).selectByVisibleText(vehicle.getYear());
	    new Select(driver.findElement(By.id("make"))).selectByVisibleText(vehicle.getMake());
	    new Select(driver.findElement(By.id("model"))).selectByVisibleText(vehicle.getModel());
	    new Select(driver.findElement(By.id("engine"))).selectByVisibleText(vehicle.getEngine());
	    driver.findElement(By.cssSelector(".search-button")).click();
	    driver.findElement(By.cssSelector("div.eye-icon")).click();
	    driver.findElement(By.cssSelector("li.pdp-label.ng-isolate-scope.active")).click();
	    driver.findElement(By.cssSelector("li.pdp-label.ng-isolate-scope")).click();
	    driver.findElement(By.cssSelector(".pdp-close-button-content")).click();
	    driver.findElement(By.cssSelector("img.pull-left.center-icon")).click();
	}
	


}

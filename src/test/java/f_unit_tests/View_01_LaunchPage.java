package f_unit_tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;

import a_setup.BaseTest;
import c_locators.Elements;
import d_helpers.Helpers;

public class View_01_LaunchPage extends BaseTest {
	
	private StringBuffer verificationErrors = new StringBuffer();
	
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
	    
	    try {
	    	// text above web buttons is: SELECT YOUR AUTO PART
	
	    	Helpers.test(driver);
	    	
	    	
//	    	assertEquals("SELECT YOUR AUTO PART:", driver.findElement(Elements.Launcher_Title).getText());
//	      
//	    	// FR web button is present at top left corner
//	    	assertTrue(isElementPresent(By.cssSelector("div>img")));
//	    	
//	    	// launcher icon is a battery
//	    	assertTrue(isElementPresent(By.cssSelector(".launcher-icon-image")));
//	    	
//	    	// big intro tile is set to battery on page load
//	    	assertEquals("FIND THE RIGHT BATTERY FOR YOUR VEHICLE", driver.findElement(By.cssSelector(".big-intro-title.ng-binding")).getText());
//	    	
//	    	// small intro title is: Select your vehicle year, make and model to find the right fit
//	    	assertEquals("Select your vehicle year, make and model to find the right fit.", driver.findElement(By.cssSelector(".alt-title.ng-binding")).getText());
//	    	
//	    	// 6 web buttons (battery, carriers & racks, filter, light bulbs, spark plugs, wiper blades) are present
//	    	
//	    	assertEquals("BATTERY", driver.findElement(By.xpath("//li[1]/div/span")).getText());
//	    	assertEquals("CARRIERS & RACKS", driver.findElement(By.xpath("//li[2]/div/span")).getText());
//	    	assertEquals("FILTER", driver.findElement(By.xpath("//li[3]/div/span")).getText());
//	    	assertEquals("LIGHT BULBS", driver.findElement(By.xpath("//li[4]/div/span")).getText());
//	    	assertEquals("SPARK PLUGS", driver.findElement(By.xpath("//li[5]/div/span")).getText());
//	    	assertEquals("WIPER BLADES", driver.findElement(By.xpath("//li[6]/div/span")).getText());
//	    	
//	    	// start french tests
//	    	// french - open autoparts french url
//	    	driver.findElement(By.cssSelector("div>img")).click();	    	
	    	
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }

//	    // start french tests
//	    // french - open autoparts french url
//	    driver.get("http://stagemapi2.canadiantire.ca/autopartfinder/#/config/0022/fr/0050563FFFED");
//	    // text above web buttons is: SELECT YOUR AUTO PART
//	    try {
//	      assertEquals("FR_SELECT YOUR AUTO PART:", driver.findElement(By.cssSelector(".launcher-title.ng-binding")).getText());
//	    } catch (Error e) {
//	      verificationErrors.append(e.toString());
//	    }
//	    // FR web button is present at top left corner
//	    try {
//	      assertTrue(isElementPresent(By.cssSelector("div>img")));
//	    } catch (Error e) {
//	      verificationErrors.append(e.toString());
//	    }
//	    // launcher icon is a battery
//	    try {
//	      assertTrue(isElementPresent(By.cssSelector(".launcher-icon-image")));
//	    } catch (Error e) {
//	      verificationErrors.append(e.toString());
//	    }
//	    // big intro tile is set to battery on page load
//	    try {
//	      assertEquals("TROUVEZ LA BONNE BATTERIE POUR VOTRE VÉHICULE", driver.findElement(By.xpath("//div[2]/div[2]")).getText());
//	    } catch (Error e) {
//	      verificationErrors.append(e.toString());
//	    }
//	    // small intro title is: Select your vehicle year, make and model to find the right fit.
//	    try {
//	      assertEquals("Sélectionnez l’année, la marque et le modèle de votre véhicule pour trouver les articles qui conviennent", driver.findElement(By.xpath("//div[4]")).getText());
//	    } catch (Error e) {
//	      verificationErrors.append(e.toString());
//	    }
//	    // 6 web buttons (battery, carriers & racks, filter, light bulbs, spark plugs, wiper blades) are present
//	    try {
//	      assertEquals("BATTERIE", driver.findElement(By.xpath("//li[1]/div/span[2]")).getText());
//	    } catch (Error e) {
//	      verificationErrors.append(e.toString());
//	    }
//	    try {
//	      assertEquals("COFFRES ET PORTE-BAGAGES", driver.findElement(By.xpath("//li[2]/div/span[2]")).getText());
//	    } catch (Error e) {
//	      verificationErrors.append(e.toString());
//	    }
//	    try {
//	      assertEquals("FILTRE", driver.findElement(By.xpath("//li[3]/div/span[2]")).getText());
//	    } catch (Error e) {
//	      verificationErrors.append(e.toString());
//	    }
//	    try {
//	      assertEquals("AMPOULES", driver.findElement(By.xpath("//li[4]/div/span[2]")).getText());
//	    } catch (Error e) {
//	      verificationErrors.append(e.toString());
//	    }
//	    try {
//	      assertEquals("BOUGIES D’ALLUMAGE", driver.findElement(By.xpath("//li[5]/div/span[2]")).getText());
//	    } catch (Error e) {
//	      verificationErrors.append(e.toString());
//	    }
//	    try {
//	      assertEquals("BALAIS D'ESSUIE-GLACE", driver.findElement(By.xpath("//li[6]/div/span[2]")).getText());
//	    } catch (Error e) {
//	      verificationErrors.append(e.toString());
//	    }
//	    // ERROR: Caught exception [unknown command []]
	    
	}
	
	  private boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
	  }

}

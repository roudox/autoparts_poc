package d_helpers;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import b_data.AutopartsData;
import b_data.Data;
import c_locators.Elements;


public class Helpers  {


private static Data data=new Data();


	public static void test( WebDriver driver) {
		assertEquals("SELECT YOUR AUTO PART:", driver.findElement(Elements.Launcher_Title).getText());
	
	
		driver.findElement(Elements.Start_Button).click();
	    
	    AutopartsData vehicle=data.getNext();
	    System.out.println(vehicle);
	    
	    new Select(driver.findElement(By.id("catEN"))).selectByVisibleText(vehicle.getCatalog());
	    new Select(driver.findElement(By.id("year"))).selectByVisibleText(vehicle.getYear());
	    new Select(driver.findElement(By.id("make"))).selectByVisibleText(vehicle.getMake());
	    new Select(driver.findElement(By.id("model"))).selectByVisibleText(vehicle.getModel());
	    new Select(driver.findElement(By.id("engine"))).selectByVisibleText(vehicle.getEngine());
	    driver.findElement(By.cssSelector(".search-button")).click();
	
	}

}

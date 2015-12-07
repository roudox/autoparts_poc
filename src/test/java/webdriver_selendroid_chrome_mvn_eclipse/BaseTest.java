package webdriver_selendroid_chrome_mvn_eclipse;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseTest {

	protected WebDriver driver;
	protected String baseUrl;

	public void setUp(String initialurl) throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("androidPackage", "com.android.chrome");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		URL url = new URL("http://localhost:9515");

		driver = new RemoteWebDriver(url, capabilities);
		baseUrl = initialurl;
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	
	public void finalize(){
		try {
			tearDown();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void tearDown() throws Exception {
		driver.quit();
	}

}

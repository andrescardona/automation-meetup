package driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebDriver {

	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		if (driver == null) {
			driver = new FirefoxDriver();
			driver.get("http://nibbler.silktide.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return driver;
	}

	public static void destroyDriver() {
		driver.quit();
		driver = null;
	}
}

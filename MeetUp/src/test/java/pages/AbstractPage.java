package pages;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import driver.TestWebDriver;

public class AbstractPage {

	/** The finder. */
	protected static ElementLocatorFactory finder;

	/** The builder. */
	protected static Actions builder;

	public AbstractPage() {
		finder = new AjaxElementLocatorFactory(TestWebDriver.getDriver(), 10);
		PageFactory.initElements(finder, this);
		builder = new Actions(TestWebDriver.getDriver());
	}
}

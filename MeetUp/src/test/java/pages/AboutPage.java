package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Getter;

public class AboutPage extends AbstractPage {
	@Getter
	@FindBy(className = "contentheader")
	private WebElement header;
}

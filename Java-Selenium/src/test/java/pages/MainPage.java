package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Getter;

public class MainPage extends AbstractPage {
	@Getter
	@FindBy(linkText =  "About")
	private WebElement aboutLink;
}

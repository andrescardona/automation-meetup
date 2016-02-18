package helpers;
import pages.AboutPage;
import pages.MainPage;

public class Helper {
	private MainPage mainPage;
	private AboutPage aboutPage;

	public Helper() {
		mainPage = new MainPage();
		aboutPage = new AboutPage();
	}

	public void openAboutPage() {
		mainPage.getAboutLink().click();
	}

	public boolean isExpectedPage(final String expectedHeaderText) {
		return expectedHeaderText.equalsIgnoreCase(aboutPage.getHeader().getText());
	}
}

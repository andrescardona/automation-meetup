package tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import driver.TestWebDriver;
import helpers.Helper;

public class MeetUpTest {

	private Helper helper;

	@Before
	public void setup() {
		helper = new Helper();
	}

	@Test
	public void test() {
		helper.openAboutPage();
		assertTrue(helper.isExpectedPage("About Nibbler"));
	}

	@After
	public void tearDown() {
		TestWebDriver.destroyDriver();
	}
}

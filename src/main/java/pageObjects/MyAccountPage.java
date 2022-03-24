package pageObjects;

import static org.junit.Assert.assertEquals;

import commonMethods.CommonMethods;

public class MyAccountPage extends CommonMethods {

	public static void checkTitle(String title) {
		assertEquals(driver.getTitle(), (title));

	}

	// Quits the driver
	public static void quit() {
		closeDriver();

	}

}

package pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import commonMethods.CommonMethods;

public class LoginPage extends CommonMethods {
	
	//enter username
	public static void enterUsername(String username) {
		enterText(By.id("username"), username);

	}

	//enter password
	public static void enterPassword(String password) {
		enterText(By.id("password"), password);

	}

	//Press login button for invalid combination
	public static void pressLoginButton() {
		Click(By.xpath("//button[@name='login']"));

	}
	
	
	//check the error message is received
	public static void checkLoginErrorMessage() {
		assertEquals(driver.findElement(By.cssSelector(".woocommerce-error>li>a")).getText(), ("Lost Your Password?"));

	}

	// Quits the driver
	public static void quit() {
		closeDriver();

	}

	//Press the login button for a valid combination
	public static MyAccountPage LoginButton() {
		Click(By.xpath("//button[@name='login']"));

		return new MyAccountPage();

	}

	/*
	 * public static MyAccountPage checkTitle (String title) {
	 * assertEquals(driver.getTitle(), (title));
	 * 
	 * return new MyAccountPage();
	 * 
	 * }
	 */

	public static void CheckUrl() {
		String URL = "https://offbeatdonuts.com/my-account/";
		String Actual = driver.getCurrentUrl();
		assertEquals(Actual, URL);

	}

}

package pageObjects;

import org.openqa.selenium.By;

import commonMethods.CommonMethods;

public class HomePage extends CommonMethods {
	
	//Open the website
	public static void openWebsite() {

		setDriver();
		navigateToHomePage();

	}

	//Accept cookies
	public static void acceptCookies() {
		WaitForElementToBePresent(By.id("cookiescript_accept"));
		// Thread.sleep(2000);
		Click(By.id("cookiescript_accept"));

	}
	
	//Select the OrderNow button
	public static OrderNowPage selectOrderNow() {
		Click(By.xpath("//*[@id='navbarNavDropdown']//a[text()='order now']"));
		waitForPageLoaded(driver);
		return new OrderNowPage();

	}

	//Select the Login button
	public static LoginPage selectLoginLink() {

		Click(By.linkText("Login"));

		return new LoginPage();

	}

}

package pageMethods;

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
		
		if (isElementPresent(By.xpath("//div[@data-testid='POPUP']")))
			Click(By.xpath("//button[text()='NO THANKS']"));
		if (isElementPresent(By.id("cookiescript_accept")))
			Click(By.id("cookiescript_accept"));	
		
		/*
		 * WaitForElementToBePresent(By.id("cookiescript_accept")); //
		 * Thread.sleep(2000); Click(By.id("cookiescript_accept"));
		 */
	}
	
	//Select the OrderNow button
	public static OrderNowPage selectOrderNow() {
		Click(By.xpath("//*[@id='navbarNavDropdown']//a[text()='order now']"));
		waitForPageLoaded(driver);
		return new OrderNowPage();

	}

	

}

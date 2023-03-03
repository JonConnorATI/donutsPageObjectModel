package pageObjects;

import org.testng.*;

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
		WaitForElementToBePresent(By.xpath("//ul[@role='alert']//a"));
		Assert.assertEquals(driver.findElement(By.xpath("//ul[@role='alert']//a")).getText(), ("Lost Your Password?"));

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
		System.out.println("Expected is: " + URL + " - Actual is: " + Actual);
		Assert.assertEquals(Actual, URL);

	}

	public static void CheckLogInButtonPresent(String string) {
		checkForPresenceOfText(By.xpath("//button[@name='login']"),string);
		
	}
	
	public static void checkBrowserOpens() {
		
		navigateToHomePage();
		waitForPageLoaded(driver);
		
	}

}

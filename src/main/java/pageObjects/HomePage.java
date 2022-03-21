package pageObjects;

import org.openqa.selenium.By;


import commonMethods.CommonMethods;

public class HomePage extends CommonMethods {
	
public static void openWebsite() {
		
		setDriver();
		navigateToHomePage();
		
	}

public static void acceptCookies()  {
	WaitForElementToBePresent(By.id("cookiescript_accept"));
	//Thread.sleep(2000);
	Click(By.id("cookiescript_accept"));

}

public static OrderNowPage selectOrderNow() {
	Click(By.xpath("//*[@id='navbarNavDropdown']//a[text()='order now']"));
	waitForPageLoaded(driver);
	return new OrderNowPage();

}
	
	

}

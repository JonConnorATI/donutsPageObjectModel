package pageObjects;

import org.openqa.selenium.By;

import commonMethods.CommonMethods;

public class ShoppingCartPage extends CommonMethods {

	public static void CheckEconomyCartText(String string, String donuts, String string2) {
		checkForPresenceOfText(By.cssSelector(".entry-title"), string);
		checkForPresenceOfText(By.cssSelector("td.product-name > a:nth-child(1)"), donuts);
		checkForPresenceOfText(By.cssSelector("span.product-remove:nth-child(3) > a.remove"), string2);

	}

	// Quits the driver
	public static void quit() {
		closeDriver();

	}

	// checks the items in the Hungry Cart
	public static void CheckHungryCartText(String string, String donuts, String string2, String string3, String string4,
			String string5, String string6, String string7) {

		checkForPresenceOfText(By.cssSelector(".entry-title"), string);
		checkForPresenceOfText(By.cssSelector("td.product-name > a:nth-child(1)"), donuts);
		checkForPresenceOfText(By.xpath("(//span[@class='product-remove'])[1]"), string2);
		checkForPresenceOfText(By.xpath("(//td[@class='product-name']/a)[2]"), string3);
		checkForPresenceOfText(By.xpath("(//span[@class='product-remove'])[2]"), string4);
		checkForPresenceOfText(By.xpath("(//td[@class='product-name']/a)[3]"), string5);
		checkForPresenceOfText(By.xpath("(//dd[@class='variation-Selection']/p)[2]"), string6);
		checkForPresenceOfText(By.xpath("(//span[@class='product-remove'])[3]"), string7);

	}

}

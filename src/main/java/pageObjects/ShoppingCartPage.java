package pageObjects;

import org.openqa.selenium.By;

import commonMethods.CommonMethods;

public class ShoppingCartPage extends CommonMethods {

	public static void CheckEconomyCartText(String string, String donuts, String string2) {
		checkForPresenceOfText(By.cssSelector(".entry-title"), string);
		checkForPresenceOfText(By.cssSelector("td.product-name > a:nth-child(1)"), donuts);
		checkForPresenceOfText(By.cssSelector("span.product-remove:nth-child(3) > a.remove"), string2);

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

	public static void CheckLuxuryCartText(String string, String donuts, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8, String string9, String string10,
			String string11, String string12, String string13, String string14) {
		
		checkForPresenceOfText(By.cssSelector(".entry-title"), string);
		checkForPresenceOfText(By.cssSelector("td.product-name > a:nth-child(1)"), donuts);
		checkForPresenceOfText(By.xpath("(//span[@class='product-remove'])[1]"), string2);
		checkForPresenceOfText(By.xpath("(//td[@class='product-name']/a)[2]"), string3);
		checkForPresenceOfText(By.xpath("(//span[@class='product-remove'])[2]"), string4);
		checkForPresenceOfText(By.xpath("(//td[@class='product-name']/a)[3]"), string5);
		checkForPresenceOfSomeText(By.xpath("//p[contains(text(),'Card Type:')]"), string6);
		checkForPresenceOfSomeText(By.xpath("//p[contains(text(),'Card Type:')]"), string7);
		checkForPresenceOfText(By.xpath("(//span[@class='product-remove'])[3]"), string8);
		checkForPresenceOfText(By.xpath("(//td[@class='product-name']/a)[4]"), string9);
		checkForPresenceOfText(By.xpath("(//dd[@class='variation-Selection']/p)[3]"), string10);
		checkForPresenceOfText(By.xpath("(//span[@class='product-remove'])[4]"), string11);
		checkForPresenceOfText(By.xpath("(//td[@class='product-name']/a)[5]"), string12);
		checkForPresenceOfText(By.xpath("(//dd[@class='variation-Selection']/p)[4]"), string13);
		checkForPresenceOfText(By.xpath("(//span[@class='product-remove'])[5]"), string14);
		//checkForPresenceOfText(By.xpath("(//td[@class='product-name']/a)[6]"), string15);
		//checkForPresenceOfSomeText(By.xpath("(//dd[@class='variation-Selection']/p)[5]"), string16);
		//checkForPresenceOfText(By.xpath("(//span[@class='product-remove'])[6]"), string17);
		
		
		
	}


}

package testMethodDevelopment.DevTests;

import org.testng.annotations.Test;

import basePage.BasePage;
import pageObjects.HomePage;
import pageObjects.OrderNowPage;
import pageObjects.ShoppingCartPage;

public class OrderNowDonuts extends BasePage {

	@Test
	public void pickDonutsEconomy() throws InterruptedException {
		/*
		 * Pick Classic Glazed Dozen, add to cart, then check cart has everything //
		 * ordered included.
		 */
		String donuts = "Classic Glazed Dozen";

		try {

			HomePage.openWebsite();
			HomePage.acceptCookies();
			HomePage.selectOrderNow();

			OrderNowPage.pickFromOffBeatDozen(donuts);
			OrderNowPage.checkButtonQuantity("1", donuts);
			OrderNowPage.selectNextSteps(1);
			OrderNowPage.checkItemsArePresent(donuts, "Box status: 12 / 12", "Remove box");
			OrderNowPage.selectAddToCart();
			OrderNowPage.checkPopUpItemsArePresent("Your box was added to cart", "VIEW CART", "Start another box");
			OrderNowPage.selectViewCart();

			ShoppingCartPage.CheckEconomyCartText("my cart (1 items)", donuts, "Remove");

		}

		finally {

			ShoppingCartPage.quit();
		}

	}

	@Test
	public void pickDonutsHungry() throws InterruptedException {
		/*
		 * Pick an offbeat dozen, with 12 different varieties, add candles, add a
		 * message, add to cart then check cart has everything.
		 */
		String donuts = "Offbeat Dozen";

		try {

			HomePage.openWebsite();
			HomePage.acceptCookies();
			HomePage.selectOrderNow();

			OrderNowPage.pickFromOffBeatDozen(donuts);
			OrderNowPage.checkButtonQuantity("1", donuts);
			OrderNowPage.selectNextSteps(1);
			OrderNowPage.checkItemsArePresent(donuts, "Box status: 0 / 12", "Remove box");
			OrderNowPage.pickDonuts(12);
			OrderNowPage.addCandles();
			OrderNowPage.addMessage("Just For You");
			OrderNowPage.selectAddToCart();
			OrderNowPage.checkPopUpItemsArePresent("Your box was added to cart", "VIEW CART", "Start another box");
			OrderNowPage.selectViewCart();

			ShoppingCartPage.CheckHungryCartText("my cart (3 items)", donuts, "Remove", "Candles", "Remove",
					"Piped name", "\"Just For You\"", "Remove");
		}

		finally {

			ShoppingCartPage.quit();
		}

	}

}

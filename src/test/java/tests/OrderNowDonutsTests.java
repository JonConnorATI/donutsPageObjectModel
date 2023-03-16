package tests;

import org.testng.annotations.Test;

import basePage.BasePage;
import pageMethods.HomePage;
import pageMethods.OrderNowPage;
import pageMethods.ShoppingCartPage;

public class OrderNowDonutsTests extends BasePage {

	@Test
	public void pickDonutsEconomy() throws Exception {
		/*
		 * Pick Classic Glazed Dozen, add to cart, then check cart has everything //
		 * ordered included.
		 */
		String donuts = "Classic Glazed Dozen";
		String thisTest = "pickDonutsEconomy";

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

		catch (AssertionError e1) {
			// Do whatever you wish to do here
			System.out.println("Take Screen Shot");
			takeSnapShot(driver, "test-output/Assertions/" + thisTest + "/test.png");
			// Now throw the exception back to the system
			System.out.println("Throw the error back to the system");
			throw (e1);
		}

		catch (Exception e) {
			// Do whatever you wish to do here
			System.out.println("Take Screen Shot");
			takeSnapShot(driver, "test-output/Exceptions/" + thisTest + "/test.png");
			// Now throw the exception back to the system
			System.out.println("Throw the error back to the system");
			throw (e);
		}

		finally {

			closeDriver();
		}

	}
	

	@Test
	public void pickDonutsHungry() throws Exception {
		/*
		 * Pick an offbeat dozen, with 12 different varieties, add candles, add a
		 * message, add to cart then check cart has everything.
		 */
		String donuts = "Offbeat Dozen";
		String thisTest = "pickDonutsHungry";

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

		catch (AssertionError e1) {
			// Do whatever you wish to do here
			System.out.println("Take Screen Shot");
			takeSnapShot(driver, "test-output/Assertions/" + thisTest + "/test.png");
			// Now throw the exception back to the system
			System.out.println("Throw the error back to the system");
			throw (e1);
		}

		catch (Exception e) {
			// Do whatever you wish to do here
			System.out.println("Take Screen Shot");
			takeSnapShot(driver, "test-output/Exceptions/" + thisTest + "/test.png");
			// Now throw the exception back to the system
			System.out.println("Throw the error back to the system");
			throw (e);
		}

		finally {

			closeDriver();
		}

	}

	@Test
	public void pickDonutsLuxury() throws Exception {
		/*
		 * Pick an offbeat dozen, with 12 different varieties, add candles, add a
		 * message, add to cart then check cart has everything. Took out photo as issues with path of the file
		 */
		String donuts = "Birthday Double Dozen";
		String thisTest = "pickDonutsLuxury";

		try {

			HomePage.openWebsite();
			HomePage.acceptCookies();
			HomePage.selectOrderNow();

			OrderNowPage.pickFromOffBeatDozen(donuts);
			OrderNowPage.checkButtonQuantity("1", donuts);
			OrderNowPage.selectNextSteps(1);
			OrderNowPage.checkItemsArePresent(donuts, "Box status: 1 / 12", "Remove box");
			OrderNowPage.autoPickDonuts();
			OrderNowPage.addCandles();
			OrderNowPage.addGreetingCard("Happy Birthday", "All the best on your special day");
			OrderNowPage.addBow("Pink");
			OrderNowPage.addMessage("Just For You");
			//OrderNowPage.addPhoto();
			OrderNowPage.selectAddToCart();
			OrderNowPage.checkPopUpItemsArePresent("Your box was added to cart", "VIEW CART", "Start another box");
			OrderNowPage.selectViewCart();

			ShoppingCartPage.CheckLuxuryCartText("my cart (5 items)", donuts, "Remove", "Candles", "Remove", "Card",
					"Happy Birthday", "All the best on your special day", "Remove", "Bow", "\"Pink\"", "Remove",
					"Piped name", "\"Just For You\"", "Remove");

		}

		catch (AssertionError e1) {
			// Do whatever you wish to do here
			System.out.println("Take Screen Shot");
			takeSnapShot(driver, "test-output/Assertions/" + thisTest + "/test.png");
			// Now throw the exception back to the system
			System.out.println("Throw the error back to the system");
			throw (e1);
		}

		catch (Exception e) {
			// Do whatever you wish to do here
			System.out.println("Take Screen Shot");
			takeSnapShot(driver, "test-output/Exceptions/" + thisTest + "/test.png");
			// Now throw the exception back to the system
			System.out.println("Throw the error back to the system");
			throw (e);
		}

		finally {

			closeDriver();
		}

	}

}

package testMethodDevelopment.DevTests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import basePage.BasePage;
import pageObjects.HomePage;
import pageObjects.OrderNowPage;
import pageObjects.ShoppingCartPage;

public class OrderNowDonutsTests extends BasePage {

	@Test
	public void pickDonutsEconomy() throws InterruptedException, IOException {
		/*
		 * Pick Classic Glazed Dozen, add to cart, then check cart has everything //
		 * ordered included.
		 */
		String donuts = "Classic Glazed Dozen";
		String test = "pickDonutsEconomy";

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

		catch (Exception e) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File file = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("./ScreenShot_Fails/" + test + ".png"));
			System.out.println("There has been an error, see screenshot. The error is: " + e);

		}

		finally {

			closeDriver();
			
		}

	}

	@Test
	public void pickDonutsHungry() throws InterruptedException, IOException {
		/*
		 * Pick an offbeat dozen, with 12 different varieties, add candles, add a
		 * message, add to cart then check cart has everything.
		 */
		String donuts = "Offbeat Dozen";
		String test = "pickDonutsHungry";

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

		catch (Exception e) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File file = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("./ScreenShot_Fails/" + test + ".png"));
			System.out.println("There has been an error, see screenshot. The error is: " + e);

		}

		finally {

			closeDriver();
		}

	}

	@Test
	public void pickDonutsLuxury() throws InterruptedException, IOException {
		/*
		 * Pick an offbeat dozen, with 12 different varieties, add candles, add a
		 * message, add to cart then check cart has everything.
		 */
		String donuts = "Birthday Double Dozen";
		String test = "pickDonutsLuxury";

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
			OrderNowPage.addPhoto();
			OrderNowPage.selectAddToCart();
			OrderNowPage.checkPopUpItemsArePresent("Your box was added to cart", "VIEW CART", "Start another box");
			OrderNowPage.selectViewCart();

			ShoppingCartPage.CheckLuxuryCartText("my cart (6 items)", donuts, "Remove", "Candles", "Remove", "Card",
					"Happy Birthday", "All the best on your special day", "Remove", "Bow", "\"Pink\"", "Remove",
					"Piped name", "\"Just For You\"", "Remove", "Personalised discs", "cucumber.jpg", "Remove");

		}

		catch (Exception e) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File file = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("./ScreenShot_Fails/" + test + ".png"));
			System.out.println("There has been an error, see screenshot. The error is: " + e);

		}

		finally {

			closeDriver();
		}

	}

}

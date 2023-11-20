package pageMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonMethods.CommonMethods;

public class OrderNowPage extends CommonMethods {

	// pick the donuts desired from the OffBeatDozen varieties
	public static void pickFromOffBeatDozen(String string) throws InterruptedException {
		scrollMenuIntoView();
		clickArrowUntilDonutIsInView(string);
		Click(By.xpath("//h3[text() ='" + string + "']//following-sibling::div[@class='btn select']"));

	}

	// Scrolls the donut selection menu into view
	private static void scrollMenuIntoView() {
		WebElement Element = driver.findElement(By.xpath("//a[@data-tab='offbeat-dozen']"));
		Element.isEnabled();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
	}

	// Clicks the side arrow until the donuts desired are visible on screen
	private static void clickArrowUntilDonutIsInView(String string) throws InterruptedException {

		String xpath = "//h3[text() ='" + string + "']//following-sibling::div[@class='btn select']";

		while (!isElementDisplayed(By.xpath(xpath))) {

			System.out.println("Button isn't visible");
			Click(By.xpath("//*[@class='swiper-button-next next_offbeat-dozen']"));
			Thread.sleep(1000);

		}
		System.out.println("Button IS visible");

	}

	// click the nth Next steps button
	public static void selectNextSteps(int i) {
		Click(By.xpath("(//div[@class='next_step'])[" + i + "]"));
		waitForPageLoaded(driver);

	}

	// Checks the quantity number in the button
	public static void checkButtonQuantity(String string, String string2) {
		checkForPresenceOfText(By.xpath("//h3[text() ='" + string2 + "']//following-sibling::div[@class='qty']/span"),
				string);

	}

	// checks the items are present in the summary list
	public static void checkItemsArePresent(String donuts, String string, String string2) {
		checkForPresenceOfText(By.xpath("(//*[@class='box_title'])[1]"), donuts);
		checkForPresenceOfText(By.xpath("(//*[@class='box_status'])[1]"), string);
		checkForPresenceOfText(By.xpath("(//*[@class='box_remove'])[1]"), string2);
		waitForPageLoaded(driver);

	}

	// Clicks the Add to cart button
	public static void selectAddToCart() throws InterruptedException {
		Thread.sleep(1000);
		String button = "(//button[contains(text(),'Add to Cart')])[1]";
		String css = ".extras_wrap";
		WebElement Element = driver.findElement(By.cssSelector(css));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Click(By.xpath(button));
		waitForPageLoaded(driver);

	}

	// wait for the pop up
	private static void waitForPopUp() {
		String xpath = "//div[@class='modal-body']//a[@class='view_cart btn btn-primary']";
		WebElement Element = driver.findElement(By.xpath(xpath));
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(Element));

	}

	// Check the items are present in the pop up
	public static void checkPopUpItemsArePresent(String string, String string2, String string3) {
		waitForPopUp();
		checkForPresenceOfText(By.xpath("(//*[@class='modal-body']/h3)[2]"), string);
		checkForPresenceOfText(By.cssSelector(".view_cart.btn.btn-primary"), string2);
		checkForPresenceOfText(By.cssSelector(".start_new"), string3);

	}

	// Clicks the View cart button
	public static ShoppingCartPage selectViewCart() {
		Click(By.xpath("//div[@class='modal-body']//a[@class='view_cart btn btn-primary']"));
		waitForPageLoaded(driver);

		return new ShoppingCartPage();
	}

	public static void pickDonuts(int i) {

		WebElement Element = driver.findElement(By.xpath("//p[contains(text(),'All')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);

		int count = 0;
		int index = 1;

		Click(By.linkText("Clear Selection"));

		while (count < i) {
			Click(By.xpath("(//*[@id='donuts']//*[@class='btn select'])[" + index + "]"));
			count = count + 1;
			index = index + 1;

		}

	}

	// add candles
	public static void addCandles() {
		WebElement Element = driver.findElement(By.cssSelector("div[data-section='three']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);

		WebElement candleCheckBox = driver.findElement(By.xpath("(//h4[text() ='Add Candles'])[1]"));
		new WebDriverWait(driver, Duration.ofSeconds(60))
				.until(ExpectedConditions.elementToBeClickable(candleCheckBox));
		candleCheckBox.click();

	}
	
	// add candles
		public static void addLuxuryCandles() {
			WebElement Element = driver.findElement(By.cssSelector("div[data-section='three']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", Element);

			WebElement candleCheckBox = driver.findElement(By.xpath("(//h4[text() ='Add Candles'])[last()]"));
			new WebDriverWait(driver, Duration.ofSeconds(60))
					.until(ExpectedConditions.elementToBeClickable(candleCheckBox));
			candleCheckBox.click();

		}

	// add a message
	public static void addLuxuryMessage(String string) {
		Click(By.xpath("(//h4[text() ='Add Message To A Donut:'])[last()]"));
		enterText(By.xpath("(//div[@data-extra-type='pipped_name']//input[@type='text'])[last()]"), string);

	}
	
	public static void addMessage(String string) {
		Click(By.xpath("(//h4[text() ='Add Message To A Donut:'])[1]"));
		enterText(By.xpath("(//div[@data-extra-type='pipped_name']//input[@type='text'])[1]"), string);

	}

	// auto pick donuts
	public static void autoPickDonuts() {
		WebElement Element = driver.findElement(By.xpath("//p[contains(text(),'All')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);

		Click(By.linkText("Clear Selection"));

		Click(By.cssSelector("div[class='box_editor ui-droppable active'] a[class='box_autofill']"));

	}

	// Add a card, specify the type, add a greeting
	public static void addGreetingCard(String string, String string2) {
		// select add card
		Click(By.xpath("(//h4[text() ='Add A Card:'])[last()]"));
		// select type of card
		Click(By.xpath("(//label[contains(text(),'" + string + "')])[last()]"));
		// add greeting
		enterText(By.xpath("(//div[@class='customise']//textarea)[last()]"), string2);

	}

	// adds a bow of the selected colour
	public static void addBow(String string) {
		Click(By.xpath("(//h4[text() ='Add A Bow:'])[last()]"));
		Click(By.xpath("(//label[contains(text(),'" + string + "')])[last()]"));

	}

	// adds a jpg from the Resources folder
	public static void addPhoto() {

		String path = "C:\\Users\\JonCo\\git\\donutsPageObjectModel\\Resources\\cucumber.jpg";

		Click(By.xpath("(//h4[text() ='Add 30 Personalised Sugar Discs:'])[1]"));
		uploadFile(By.xpath("(//input[@type='file'])[1]"), path);

	}

}

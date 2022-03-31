package pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import commonMethods.CommonMethods;

public class MyAccountPage extends CommonMethods {

	public static void checkTitle(String title) {
		assertEquals(driver.getTitle(), (title));

	}

	public static void checkWelcomeMessage(String string) {
		checkForPresenceOfText(By.cssSelector(".woocommerce-MyAccount-content>p:first-of-type"),string);
		
	}

	public static void checkInstructionalText(String string) {
		checkForPresenceOfText(By.cssSelector(".woocommerce-MyAccount-content>p:nth-of-type(2)"),string);
		
	}

	public static void checkLinksInSentance(int i, String string) {
		checkForPresenceOfText(By.xpath("(//*[@class='woocommerce-MyAccount-content']//a)[" + i + "]"),string);
		
	}

	public static void checkNavigationLink(int i, String string) {
		checkForPresenceOfText(By.cssSelector(".list-group>a:nth-of-type(" + i + ")"),string);
		
	}

	public static void clickNavLink(String string) {
		Click(By.linkText(string));
		
	}

	public static void ordersCheckButton(String string) {
		checkForPresenceOfText(By.cssSelector("a.btn.btn-outline-primary"),string);
		
	}

	public static void ordersCheckText(String string) {
		checkForPresenceOfText(By.cssSelector(".woocommerce-message.woocommerce-message--info"),string);
		
	}

	public static void downloadsCheckButton(String string) {
		checkForPresenceOfText(By.cssSelector("a.btn.btn-outline-primary"),string);
		
	}

	public static void downloadsCheckText(String string) {
		checkForPresenceOfText(By.cssSelector(".woocommerce-Message.woocommerce-Message--info.woocommerce-info"),string);
		
	}

	public static void couponsCheckText(String string) {
		checkForPresenceOfText(By.cssSelector("#woo_mstore_accordion>div>p"),string);
		
	}

	public static void addressCheckButton(int i, String string) {
		checkForPresenceOfText(By.xpath("(//div[@class='cus_menu']//button)[" + i + "]"),string);
		
	}

	public static void addressCheckText(String string) {
		checkForPresenceOfText(By.cssSelector(".woocommerce-MyAccount-content>p"),string);
		
	}

	public static void paymentsCheckButton(int i, String string) {
		checkForPresenceOfText(By.cssSelector("a.button:nth-of-type(" + i + ")"),string);
		
	}

	public static void paymentsCheckText(String string) {
		checkForPresenceOfText(By.cssSelector("p.woocommerce-Message.woocommerce-Message--info.woocommerce-info"),string);
		
	}

	public static void accDetailsCheckFieldLabel(int i, String string) {
		checkForPresenceOfText(By.xpath("(//*[@class='woocommerce-EditAccountForm edit-account']//label)[" + i + "]"),string);
		
	}

	public static void accDetailsCheckText(String string) {
		checkForPresenceOfText(By.xpath("//*[@class='woocommerce-EditAccountForm edit-account']//em"),string);
		
	}

	public static void accDetailsCheckButton(int i, String string) {
		checkForPresenceOfText(By.cssSelector(".btn.btn-outline-primary:nth-of-type(" + i + ")"),string);
		
	}

	public static LoginPage LogOut() {
		Click(By.linkText("Logout"));
		
		
		return new LoginPage();
	}

	public static void enterCurrentPassword(String string) {
		clearText(By.xpath("//input[@name='password_current']"));
		enterText(By.xpath("//input[@name='password_current']"),string);
		
	}

	public static void enterNewPassword(String string) {
		enterText(By.xpath("//input[@name='password_1']"),string);
		
	}

	public static void confirmNewPassword(String string) {
		enterText(By.xpath("//input[@name='password_2']"),string);
		
	}

	public static void saveChanges() {
		Click(By.xpath("//button[@name='save_account_details']"));
		
	}

	public static void checkConfirmationMsg(String string) {
		WaitForElementToBePresent(By.cssSelector(".woocommerce-message"));
		checkForPresenceOfText(By.cssSelector(".woocommerce-message"),string);
		
	}

	public static void changeDisplayName(String string) {
		clearText(By.xpath("//input[@name='account_display_name']"));
		enterText(By.xpath("//input[@name='account_display_name']"),string);
		
	}

	public static void checkDisplayName(String string) {
		checkForPresenceOfText(By.cssSelector(".woocommerce-MyAccount-content>p:first-of-type"),string);
		
	}
	
	

	

}

package testMethodDevelopment.DevTests;

import org.testng.annotations.Test;

import basePage.BasePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class AccountTests extends BasePage {

	@Test
	public void accountSection() throws Exception {
		String thisTest = "accountSection";

		try {

			HomePage.openWebsite();
			HomePage.acceptCookies();
			HomePage.selectLoginLink();

			LoginPage.enterUsername("jondonuttest@sharklasers.com"); // Valid username
			LoginPage.enterPassword("Cloggtwo!"); // Valid password
			LoginPage.LoginButton();

			MyAccountPage.checkTitle("My account - Offbeat Donuts");
			MyAccountPage.checkWelcomeMessage("Hello Jon Test 1 (not Jon Test 1? Log out)");
			MyAccountPage.checkInstructionalText("From your account dashboard you can view your recent orders, "
					+ "manage your shipping and billing addresses, " + "and edit your password and account details.");
			MyAccountPage.checkLinksInSentance(1, "Log out");
			MyAccountPage.checkLinksInSentance(2, "recent orders");
			MyAccountPage.checkLinksInSentance(3, "shipping and billing addresses");
			MyAccountPage.checkLinksInSentance(4, "edit your password and account details");
			MyAccountPage.checkNavigationLink(1, "Dashboard");
			MyAccountPage.checkNavigationLink(2, "Orders");
			MyAccountPage.checkNavigationLink(3, "Downloads");
			MyAccountPage.checkNavigationLink(4, "Coupons");
			MyAccountPage.checkNavigationLink(5, "Address Book");
			MyAccountPage.checkNavigationLink(6, "Payment methods");
			MyAccountPage.checkNavigationLink(7, "Account details");
			MyAccountPage.checkNavigationLink(8, "Logout");

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
	public void ordersSection() throws Exception {
		String thisTest = "ordersSection";

		try {

			HomePage.openWebsite();
			HomePage.acceptCookies();
			HomePage.selectLoginLink();

			LoginPage.enterUsername("jondonuttest@sharklasers.com"); // Valid username
			LoginPage.enterPassword("Cloggtwo!"); // Valid password
			LoginPage.LoginButton();

			MyAccountPage.clickNavLink("Orders");
			MyAccountPage.ordersCheckButton("Go shop");
			MyAccountPage.ordersCheckText("Go shop No order has been made yet.");

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
	public void downloadsSection() throws Exception {
		String thisTest = "downloadsSection";

		try {

			HomePage.openWebsite();
			HomePage.acceptCookies();
			HomePage.selectLoginLink();

			LoginPage.enterUsername("jondonuttest@sharklasers.com"); // Valid username
			LoginPage.enterPassword("Cloggtwo!"); // Valid password
			LoginPage.LoginButton();

			MyAccountPage.clickNavLink("Downloads");
			MyAccountPage.downloadsCheckButton("Go shop");
			MyAccountPage.downloadsCheckText("Go shop No downloads available yet.");

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
	public void couponsSection() throws Exception {
		String thisTest = "couponsSection";

		try {

			HomePage.openWebsite();
			HomePage.acceptCookies();
			HomePage.selectLoginLink();

			LoginPage.enterUsername("jondonuttest@sharklasers.com"); // Valid username
			LoginPage.enterPassword("Cloggtwo!"); // Valid password
			LoginPage.LoginButton();

			MyAccountPage.clickNavLink("Coupons");
			MyAccountPage.couponsCheckText("List of coupons which are valid & available for use. "
					+ "Click on the coupon to use it. "
					+ "The coupon discount will be visible only when at least one product is present in the cart.");

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
	public void addressSection() throws Exception {
		String thisTest = "addressSection";

		try {

			HomePage.openWebsite();
			HomePage.acceptCookies();
			HomePage.selectLoginLink();

			LoginPage.enterUsername("jondonuttest@sharklasers.com"); // Valid username
			LoginPage.enterPassword("Cloggtwo!"); // Valid password
			LoginPage.LoginButton();

			MyAccountPage.clickNavLink("Address Book");
			MyAccountPage.addressCheckButton(1,"ADD BILLING ADDRESS");
			MyAccountPage.addressCheckButton(2,"ADD SHIPPING ADDRESS");
			MyAccountPage.addressCheckText("The following addresses will be used on the checkout page by default.");

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
	public void paymentsSection() throws Exception {
		String thisTest = "paymentsSection";

		try {

			HomePage.openWebsite();
			HomePage.acceptCookies();
			HomePage.selectLoginLink();

			LoginPage.enterUsername("jondonuttest@sharklasers.com"); // Valid username
			LoginPage.enterPassword("Cloggtwo!"); // Valid password
			LoginPage.LoginButton();

			MyAccountPage.clickNavLink("Payment methods");
			MyAccountPage.paymentsCheckButton(1,"ADD PAYMENT METHOD");
			MyAccountPage.paymentsCheckText("No saved methods found.");

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
	public void accountDetailsSection() throws Exception {
		String thisTest = "accountDetailsSection";

		try {

			HomePage.openWebsite();
			HomePage.acceptCookies();
			HomePage.selectLoginLink();

			LoginPage.enterUsername("jondonuttest@sharklasers.com"); // Valid username
			LoginPage.enterPassword("Cloggtwo!"); // Valid password
			LoginPage.LoginButton();

			MyAccountPage.clickNavLink("Account details");
			MyAccountPage.accDetailsCheckFieldLabel(1,"First name *");
			MyAccountPage.accDetailsCheckFieldLabel(2,"Last name *");
			MyAccountPage.accDetailsCheckFieldLabel(3,"Display name *");
			MyAccountPage.accDetailsCheckFieldLabel(4,"Email address *");
			MyAccountPage.accDetailsCheckFieldLabel(5,"Current password (leave blank to leave unchanged)");
			MyAccountPage.accDetailsCheckFieldLabel(6,"New password (leave blank to leave unchanged)");
			MyAccountPage.accDetailsCheckFieldLabel(7,"Confirm new password");	
			MyAccountPage.accDetailsCheckText("This will be how your name will be displayed in the account section and in reviews");
			MyAccountPage.accDetailsCheckButton(1,"Save changes");

			
			
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
	public void logOut() throws Exception {
		String thisTest = "logOut";

		try {

			HomePage.openWebsite();
			HomePage.acceptCookies();
			HomePage.selectLoginLink();

			LoginPage.enterUsername("jondonuttest@sharklasers.com"); // Valid username
			LoginPage.enterPassword("Cloggtwo!"); // Valid password
			LoginPage.LoginButton();

			MyAccountPage.LogOut();
			
			LoginPage.CheckLogInButtonPresent("LOG IN");
			
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

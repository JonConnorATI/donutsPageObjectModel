package testMethodDevelopment.DevTests;

import org.testng.annotations.Test;

import basePage.BasePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class ChangePasswordTests extends BasePage {

	@Test
	public void changePassword() throws Exception {

		String thisTest = "changePassword";
		String currentPassword = "Cloggtwo!";
		String newPassword = "JonNewPassword";

		try {

			HomePage.openWebsite();
			HomePage.acceptCookies();
			HomePage.selectLoginLink();

			LoginPage.enterUsername("jondonuttest@sharklasers.com"); // Valid username
			LoginPage.enterPassword(currentPassword); // valid password
			LoginPage.LoginButton();
			
			MyAccountPage.checkTitle("My account - Offbeat Donuts");
			MyAccountPage.clickNavLink("Account details");
			MyAccountPage.enterCurrentPassword(currentPassword);
			MyAccountPage.enterNewPassword(newPassword);
			MyAccountPage.confirmNewPassword(newPassword);
			MyAccountPage.saveChanges();
			MyAccountPage.checkConfirmationMsg("Account details changed successfully.");
			

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

	@Test(dependsOnMethods = "changePassword")
	public void changeUsername() throws Exception {

		String thisTest = "changeUsername";
		String newPassword = "JonNewPassword";
		String newDisplayName = "DisplayJon2";

		try {
			
			HomePage.openWebsite();
			HomePage.acceptCookies();
			HomePage.selectLoginLink();

			LoginPage.enterUsername("jondonuttest@sharklasers.com"); // Valid username
			LoginPage.enterPassword(newPassword); // valid password
			LoginPage.LoginButton();
			
			MyAccountPage.checkTitle("My account - Offbeat Donuts");
			MyAccountPage.clickNavLink("Account details");
			MyAccountPage.changeDisplayName(newDisplayName);
			MyAccountPage.saveChanges();
			MyAccountPage.checkConfirmationMsg("Account details changed successfully.");
			MyAccountPage.clickNavLink("Dashboard");
			MyAccountPage.checkDisplayName("Hello DisplayJon2 (not DisplayJon2? Log out)");

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
	
	@Test(dependsOnMethods = "changeUsername")
	public void revertPasswordUsername() throws Exception {

		String thisTest = "revertPasswordUsername";
		String currentPassword = "JonNewPassword";
		String revertPassword = "Cloggtwo!";
		String revertDisplayName = "Jon Test 1";

		try {
			
			HomePage.openWebsite();
			HomePage.acceptCookies();
			HomePage.selectLoginLink();

			LoginPage.enterUsername("jondonuttest@sharklasers.com"); // Valid username
			LoginPage.enterPassword(currentPassword); // valid password
			LoginPage.LoginButton();
			
			MyAccountPage.checkTitle("My account - Offbeat Donuts");
			MyAccountPage.clickNavLink("Account details");
			MyAccountPage.changeDisplayName(revertDisplayName);
			MyAccountPage.enterCurrentPassword(currentPassword);
			MyAccountPage.enterNewPassword(revertPassword);
			MyAccountPage.confirmNewPassword(revertPassword);
			MyAccountPage.saveChanges();
			MyAccountPage.checkConfirmationMsg("Account details changed successfully.");
			MyAccountPage.clickNavLink("Dashboard");
			MyAccountPage.checkDisplayName("Hello Jon Test 1 (not Jon Test 1? Log out)");

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

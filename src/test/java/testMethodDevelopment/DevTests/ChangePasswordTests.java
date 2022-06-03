package testMethodDevelopment.DevTests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import basePage.BasePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class ChangePasswordTests extends BasePage {

	@Test
	public void changePassword() throws IOException {

		String test = "changePassword";
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

	@Test(dependsOnMethods = "changePassword")
	public void changeUsername() throws IOException {

		String test = "changeUsername";
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
			//MyAccountPage.checkDisplayName("Hello DisplayJon2 (not DisplayJon2? Log out)");

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
	
	@Test(dependsOnMethods = "changeUsername")
	public void revertPasswordUsername() throws IOException {

		String test = "revertPasswordUsername";
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
			//MyAccountPage.checkDisplayName("Hello Jon Test 1 (not Jon Test 1? Log out)");

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

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

public class LoginTests extends BasePage {

	@Test
	public void invalidPassword() throws IOException {
		
		String test = "invalidPassword";
		

		try {

			HomePage.openWebsite();
			HomePage.acceptCookies();
			HomePage.selectLoginLink();
			
			LoginPage.enterUsername("jondonuttest@sharklasers.com"); //Valid username
			LoginPage.enterPassword("Cloggone"); //Invalid password
			LoginPage.pressLoginButton();
			LoginPage.checkLoginErrorMessage();
			

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
	public void invalidUsername() throws IOException {
		
		String test = "invalidUsername";
		

		try {

			HomePage.openWebsite();
			HomePage.acceptCookies();
			HomePage.selectLoginLink();
			
			LoginPage.enterUsername("jondonuttesttw@sharklasers.com"); //Invalid username
			LoginPage.enterPassword("Cloggtwo!"); //valid password
			LoginPage.pressLoginButton();
			LoginPage.checkLoginErrorMessage();
			

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
	public void validUsernamePassword() throws IOException {
		
		String test = "validUsernamePassword";
		

		try {

			HomePage.openWebsite();
			HomePage.acceptCookies();
			HomePage.selectLoginLink();
			
			LoginPage.enterUsername("jondonuttest@sharklasers.com"); //Valid username
			LoginPage.enterPassword("Cloggtwo!"); //valid password
			LoginPage.LoginButton();
			
			MyAccountPage.checkTitle("My account - Offbeat Donuts");
			

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

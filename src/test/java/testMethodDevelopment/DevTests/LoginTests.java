package testMethodDevelopment.DevTests;

import org.testng.annotations.Test;

import basePage.BasePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class LoginTests extends BasePage {

	@Test
	public void invalidPassword() throws Exception {
		
		String thisTest = "invalidPassword";
		

		try {

			HomePage.openWebsite();
			HomePage.acceptCookies();
			HomePage.selectLoginLink();
			
			LoginPage.enterUsername("jondonuttest@sharklasers.com"); //Valid username
			LoginPage.enterPassword("Cloggone"); //Invalid password
			LoginPage.pressLoginButton();
			LoginPage.checkLoginErrorMessage();
			

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
	public void invalidUsername() throws Exception {
		
		String thisTest = "invalidUsername";
		

		try {

			HomePage.openWebsite();
			HomePage.acceptCookies();
			HomePage.selectLoginLink();
			
			LoginPage.enterUsername("jondonuttesttw@sharklasers.com"); //Invalid username
			LoginPage.enterPassword("Cloggtwo!"); //valid password
			LoginPage.pressLoginButton();
			LoginPage.checkLoginErrorMessage();
			

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
	public void validUsernamePassword() throws Exception {
		
		String thisTest = "validUsernamePassword";
		

		try {

			HomePage.openWebsite();
			HomePage.acceptCookies();
			HomePage.selectLoginLink();
			
			LoginPage.enterUsername("jondonuttest@sharklasers.com"); //Valid username
			LoginPage.enterPassword("Cloggtwo!"); //valid password
			LoginPage.LoginButton();
			
			MyAccountPage.checkTitle("My account - Offbeat Donuts");
			

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

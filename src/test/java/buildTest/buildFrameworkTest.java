package buildTest;

import org.testng.annotations.Test;

import basePage.BasePage;
import pageObjects.HomePage;


public class buildFrameworkTest extends BasePage {
	
	@Test
	public void openBrowserTest() {
		
		HomePage.openWebsite();
		closeDriver();
	}
	

}

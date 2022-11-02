package basePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BasePage {
	
	

	// Write here what browser you want to test with
	private static String browser = /* write browser here ---> */ "chrome";

	// Declare the web driver
	public static WebDriver driver;

	// Set the web driver that all scenarios use
	public static WebDriver setDriver() {

		try {

			String browserName = browser;

			switch (browserName) {

			// fire fox setup
			case "firefox":
				if (null == driver) {

					/*
					 * System.setProperty("webdriver.gecko.driver",
					 * "C:\\Users\\JonCo\\git\\donutsPageObjectModel\\Drivers\\geckodriver.exe");
					 * driver = new FirefoxDriver();
					 */
					WebDriverManager.firefoxdriver().setup();

					driver = new FirefoxDriver();
				}
				break;

			// chrome setup
			case "chrome":
				if (null == driver) {

					ChromeOptions ops = new ChromeOptions();
					ops.addArguments("--disable-notifications"); 
					ops.addArguments("--headless");
					ops.addArguments("--no-sandbox");
					ops.addArguments("--disable-dev-shm-usage");
					ops.addArguments("--window-size=1920,1080");
					ops.addArguments("--disable-extensions");
					ops.addArguments("--proxy-server='direct://'");
					ops.addArguments("--proxy-bypass-list=*");
					ops.addArguments("--disable-gpu");
					ops.addArguments("--ignore-certificate-errors");
					ops.addArguments("--start-maximized");
					WebDriverManager.chromedriver().setup(); 
					driver = new ChromeDriver(ops);
					
					/*
					 * System.setProperty("webdriver.chrome.driver",
					 * "C:\\Users\\JonCo\\git\\donutsPageObjectModel\\Drivers\\chromedriver.exe");
					 * driver = new ChromeDriver();
					 */
					
					
				}
				break;

			// Edge setup
			case "edge":
				if (null == driver) {


					/*
					 * System.setProperty("webdriver.edge.driver",
					 * "C:\\Users\\JonCo\\git\\donutsPageObjectModel\\Drivers\\msedgedriver.exe");
					 * driver = new EdgeDriver();
					 */
					
					WebDriverManager.edgedriver().setup();

					driver = new EdgeDriver();
				}
				break;
			}
		} catch (Exception e) {
			System.out.println("Unable to load browser! - Exception: " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}
		return driver;
	}

	// open the url
	public static void navigateToHomePage() {
		driver.manage().window().maximize();
		// driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		String homePage = "https://offbeatdonuts.com/";
		driver.get(homePage);

	}

	// close the web driver and clear cookies

	public static void closeDriver()  {
		
		try {
			if (driver != null) {
				driver.manage().deleteAllCookies();
				driver.quit();
				driver = null;
			}
		} catch (Exception e) {
			
			System.out.println("Method Failed: Exception: " + e.getMessage());
			
		}
	}
	
	
}

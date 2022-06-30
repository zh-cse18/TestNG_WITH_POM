package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.HomePage;
import pages.LoginPage;


public class Login_TC1 {

	@Test(enabled=true)
	public static void login() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-103.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa1.orbundsis.com/einstein-freshair/administrator_frameset.jsp");

		//Creating object of home page
//		HomePage home = new HomePage(driver);

		//Creating object of Login page
		LoginPage login = new LoginPage(driver);

		//Creating object of Dashboard
//		Dashboard dashboard = new Dashboard(driver);

//		//Click on Login button
//		home.clickLogin();

		//Enter username & password
		login.enterUsername("test.admin41");
		login.enterPassword("test41-hassan");
		login.enterType();


		//Click on login button
		login.clickLogin();
		Thread.sleep(3000);


		//Capture the page heading and print on console
//		System.out.println("The page heading is --- " +dashboard.getHeading());
//
//		//Click on Logout button
//		dashboard.clickLogout();

		//Close browser instance
		driver.quit();
	}

}
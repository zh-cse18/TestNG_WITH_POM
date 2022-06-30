package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	//Locator for username field
	By uName = By.xpath("//input[@name='username']");

	//Locator for password field
	By pswd = By.xpath("//input[@name='password']");

	//Locator for type field
	By type = By.xpath("//*[@id=\"frmlogin\"]/div/table/tbody/tr[3]/td[2]/select/option[4]");

	//Locator for login button
	By loginBtn = By.name("B3");


	//Method to enter username
	public void enterUsername(String user) {
		driver.findElement(uName).sendKeys(user);
	}

	//Method to enter password
	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys(pass);
	}
	//Method to enter type
	public void enterType() {
		driver.findElement(type).click();
	}

	//Method to click on Login button
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}
}
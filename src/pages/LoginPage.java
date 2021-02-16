package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	//list of elements used by this class
	WebElement emailField;
	WebElement passwordField;
	WebElement submitButton;
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//email
	public WebElement getEmailField() {
		return driver.findElement(By.xpath("//input[@type='email']"));
	}
	public void insertEmail(String email) {
		getEmailField().sendKeys(email);
	}
	//password
	public WebElement getPasswordField() {
		return driver.findElement(By.xpath("//input[@type='password']"));
	}
	public void insertPassword(String password) {
		getPasswordField().sendKeys(password);
	}
	//submit
	public WebElement getSubmitBtn() {
		return driver.findElement(By.xpath("//button[@type='submit']"));
	}
	public void clickSubmitBtn() {
		getSubmitBtn().click();
	}
	
}

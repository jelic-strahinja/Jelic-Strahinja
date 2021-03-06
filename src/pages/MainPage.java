package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	//list of elements used by this class
	WebElement useCaseCard;
	WebElement logOutButton;
	
	WebDriver driver;
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	//Use case card 
	public WebElement getUseCaseBtn() {
		return driver.findElement(By.xpath("//a[@href='/use-cases']"));
	}
	public void clickUseCase() {
		getUseCaseBtn().click();
	}
	//logout button
	public WebElement getLogoutButton() {
		return driver.findElement(By.xpath("//a[@href='#top']"));
	}
	public void clickLogout() {
		getLogoutButton().click();
	}
	
	
}

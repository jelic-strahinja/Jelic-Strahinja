package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	//list of elements used by this class
	WebElement useCase;
	
	
	WebDriver driver;
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getUseCaseBtn() {
		return driver.findElement(By.xpath("//a[@href='/use-cases']"));
	}
	public void clickUseCase() {
		getUseCaseBtn().click();
	}
}

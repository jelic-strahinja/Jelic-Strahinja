package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UseCaseTest extends BaseTest{
	
	@BeforeMethod
	public void beforeMethod() {
		driver.navigate().to("https://qa-sandbox.apps.htec.rs/login");
		loginPage.insertEmail("strahinja.jelic1995@gmail.com");
		loginPage.insertPassword("StrahinjaJelic1.");
		loginPage.clickSubmitBtn();
	}
	
	//@Test
	public void validMinReqUseCase() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/use-cases']")));
		mainPage.clickUseCase();
		useCasePage.clickCreateUseCaseBtn();
		useCasePage.insertTitle("Valid");
		useCasePage.insertDescription("");
		useCasePage.insertExpectedResaults("Valid");
		useCasePage.clickToggleButton();
		useCasePage.insertCaseInputField("1");
		useCasePage.clickAddStepButton();
		useCasePage.clickSubmitCaseButton();
		
	}
	@Test
	public void invalidMinReqUseCase() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/use-cases']")));
		mainPage.clickUseCase();
		useCasePage.clickCreateUseCaseBtn();
		useCasePage.insertTitle("Valid");
		useCasePage.insertDescription("");
		useCasePage.insertExpectedResaults("Valid");
		useCasePage.clickToggleButton();
		useCasePage.insertCaseInputField("");
		useCasePage.clickAddStepButton();
		useCasePage.clickSubmitCaseButton();
		Thread.sleep(100000);
		
	}
		
	@AfterMethod
	public void afterMethod() {
		
	}
}

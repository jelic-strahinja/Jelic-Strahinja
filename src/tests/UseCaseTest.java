package tests;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UseCaseTest extends BaseTest{
	
	@BeforeMethod
	public void beforeMethod() {
		driver.navigate().to(reader.getData("TC1-Login", 3, 3));
		loginPage.insertEmail(reader.getData("TC1-Login", 4, 3));
		loginPage.insertPassword(reader.getData("TC1-Login", 5, 3));
		loginPage.clickSubmitBtn();
	}
	
	@Test (priority = 5)
	public void validMinReqTitle() throws InterruptedException {
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/use-cases']")));
		mainPage.clickUseCase();
	//	Thread.sleep(500);
		int forAssert = useCasePage.getListOfCreatedCases().size();
	//	Thread.sleep(500);
		useCasePage.clickCreateUseCaseBtn();
	//	Thread.sleep(500);
		useCasePage.insertTitle(reader.getData("TC2-UseCases", 5, 3));
	//	Thread.sleep(500);
		useCasePage.insertDescription(reader.getData("TC2-UseCases", 6, 3));
	//	Thread.sleep(500);
		useCasePage.insertExpectedResaults(reader.getData("TC2-UseCases", 7, 3));
	//	Thread.sleep(500);
		useCasePage.insertCaseInputField(reader.getData("TC2-UseCases", 8, 3), 0);
	//	Thread.sleep(500);
		useCasePage.clickSubmitCaseButton();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("invalid-feedback")));
		Assert.assertTrue(useCasePage.getErrorMessage().isDisplayed());
		useCasePage.getExpectedResaults().clear();
	//	Thread.sleep(500);
		useCasePage.insertExpectedResaults(reader.getData("TC2-UseCases", 10, 3));
	//	Thread.sleep(500);
		useCasePage.clickSubmitCaseButton();
		wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe("https://qa-sandbox.apps.htec.rs/create-usecase")));
	//	Thread.sleep(500);
		
		Assert.assertEquals(useCasePage.getListOfCreatedCases().size(), forAssert + 1);
	}
	
	@Test (priority = 10)
	public void secondMethod() throws InterruptedException {
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/use-cases']")));
		mainPage.clickUseCase();	
	//	Thread.sleep(500);
		int forAssert = useCasePage.getListOfCreatedCases().size();
		useCasePage.clickCreateUseCaseBtn();
	//	Thread.sleep(500);
		useCasePage.insertTitle(reader.getData("TC2-UseCases", 17, 3));
	//	Thread.sleep(500);
		useCasePage.insertDescription(minMaxNumbers(256));
	//	Thread.sleep(500);
		useCasePage.insertExpectedResaults(minMaxNumbers(255));
		useCasePage.clickToggleButton();
		for(int i = 0; i<9; i++) {
			useCasePage.clickAddStepButton();
		}
		for(int i = 1; i<10; i++) {
			useCasePage.insertCaseInputField("this is " + i + "case step", i);
		}
	//	Thread.sleep(500);
		useCasePage.clickSubmitCaseButton();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("invalid-feedback")));
		Assert.assertTrue(useCasePage.getErrorMessage().isDisplayed());
		
		scrollTo(useCasePage.getTitleField());
	//	Thread.sleep(500);
		useCasePage.getTitleField().clear();
	//	Thread.sleep(500);
		useCasePage.insertTitle(minMaxNumbers(255));
		scrollTo(useCasePage.getSubmitCaseButton());
	//	Thread.sleep(500);
		useCasePage.clickSubmitCaseButton();
	
		wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe("https://qa-sandbox.apps.htec.rs/create-usecase")));
	//	Thread.sleep(500);
		
		Assert.assertEquals(useCasePage.getListOfCreatedCases().size(), forAssert + 1);
	}

	@Test (priority = 15)
	public void validNumberImput() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/use-cases']")));
		mainPage.clickUseCase();
	//	Thread.sleep(500);
		int forAssert = useCasePage.getListOfCreatedCases().size();
	//	Thread.sleep(500);
		useCasePage.clickCreateUseCaseBtn();
	//	Thread.sleep(500);
		useCasePage.insertTitle(reader.getData("TC2-UseCases", 32, 3));
	//	Thread.sleep(500);
		useCasePage.insertDescription(reader.getData("TC2-UseCases", 33, 3));
	//	Thread.sleep(500);
		useCasePage.insertExpectedResaults(minMaxNumbers(256));
		useCasePage.clickToggleButton();
	//	Thread.sleep(500);
		useCasePage.insertCaseInputField(minMaxLetters(255), 0);
	//	Thread.sleep(500);
		scrollTo(useCasePage.getSubmitCaseButton());
	//	Thread.sleep(500);
		useCasePage.clickSubmitCaseButton();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("invalid-feedback")));
		Assert.assertTrue(useCasePage.getErrorMessage().isDisplayed());
		
	//	Thread.sleep(500);
		useCasePage.getExpectedResaults().clear();
	//	Thread.sleep(500);
		useCasePage.insertExpectedResaults(reader.getData("TC2-UseCases", 38, 3));
	//	Thread.sleep(500);
		useCasePage.clickSubmitCaseButton();
		wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe("https://qa-sandbox.apps.htec.rs/create-usecase")));
	//	Thread.sleep(500);
		
		Assert.assertEquals(useCasePage.getListOfCreatedCases().size(), forAssert + 1);
	}
	
	@Test (priority = 20)
	public void titleCharOverAllowed() throws InterruptedException {
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/use-cases']")));
		mainPage.clickUseCase();
	//	Thread.sleep(500);
		int forAssert = useCasePage.getListOfCreatedCases().size();
	//	Thread.sleep(500);
		useCasePage.clickCreateUseCaseBtn();
	//	Thread.sleep(500);
		useCasePage.insertTitle(minMaxLetters(256));
	//	Thread.sleep(500);
		useCasePage.insertDescription(reader.getData("TC2-UseCases", 46, 3));
	//	Thread.sleep(500);
		useCasePage.insertExpectedResaults(reader.getData("TC2-UseCases", 47, 3));
		useCasePage.clickToggleButton();
	//	Thread.sleep(500);
		useCasePage.insertCaseInputField(reader.getData("TC2-UseCases", 48, 3), 0);
	//	Thread.sleep(500);
		scrollTo(useCasePage.getSubmitCaseButton());
	//	Thread.sleep(500);
		useCasePage.clickSubmitCaseButton();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("invalid-feedback")));
		Assert.assertTrue(useCasePage.getErrorMessage().isDisplayed());
		
	//	Thread.sleep(500);
		scrollTo(useCasePage.getTitleField());
	//	Thread.sleep(500);
		useCasePage.getTitleField().clear();
	//	Thread.sleep(500);
		useCasePage.insertTitle(reader.getData("TC2-UseCases", 50, 3));
	//	Thread.sleep(500);
		scrollTo(useCasePage.getSubmitCaseButton());	
	//	Thread.sleep(500);
		useCasePage.clickSubmitCaseButton();
	//	Thread.sleep(500);
	//	wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe("https://qa-sandbox.apps.htec.rs/create-usecase")));
	//	Thread.sleep(500);
		
		Assert.assertEquals(useCasePage.getListOfCreatedCases().size(), forAssert + 1);
	}
	
	@Test (priority = 25)
	public void convertingLengthOfFields() throws InterruptedException {
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/use-cases']")));
		mainPage.clickUseCase();
	//	Thread.sleep(500);
		int numberOfCases = useCasePage.getListOfCreatedCases().size();
		for(int i = 0; i<numberOfCases; i++) {
	//		Thread.sleep(500);
			useCasePage.getListOfCreatedCases().get(i).click();
	//		wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe("https://qa-sandbox.apps.htec.rs/use-cases")));
	//		Thread.sleep(500);
			lengthOfString(useCasePage.getTitleField());
	//		Thread.sleep(500);
			lengthOfString(useCasePage.getDescriptionField());
	///		Thread.sleep(500);
			lengthOfString(useCasePage.getExpectedResaults());	
			for(int j = 0; j < useCasePage.getListCaseInputField().size(); j++) {
				lengthOfString(useCasePage.getSingleCaseInputField(j));
			}
			useCasePage.clickSubmitCaseButton();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/use-cases']")));
	//		Thread.sleep(2000);
		}
	}
	
		
	@AfterMethod
	public void afterMethod() {
		mainPage.clickLogout();
	}
	
	
	public String minMaxLetters(int length) {
		char[] sequenceTen = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
		char[] allChars = new char[length];
		for(int i = 0; i<length; i++) {
			allChars[i] = sequenceTen[i%sequenceTen.length];
		}
		String s = String.valueOf(allChars);
		return s;
	}
	public String minMaxNumbers(int length) {
		int[] sequenceTen = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 0};
		int[] allChars = new int[length];
		for(int i = 0; i<length; i++) {
			allChars[i] = sequenceTen[i%sequenceTen.length];
		}
		String s = Arrays.toString(allChars).replaceAll("\\[|\\]|,|\\s", "");
		return s;
	}
	
	
	public void lengthOfString(WebElement element) {
		int numOfChars = element.getAttribute("value").length();
		element.clear();
		String s = "This field previously had " + numOfChars + " characters";
		element.sendKeys(s);
		Assert.assertEquals(element.getAttribute("value"), s);
	}
	public void scrollTo(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
	
}

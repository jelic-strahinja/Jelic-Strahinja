package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UseCasePage {
	
	WebElement createUseCaseBtn;
	WebElement title;
	WebElement description;
	WebElement expectedResaults;
	WebElement toggleBtnYesNo;
	WebElement caseStep;
	WebElement addStep;
	WebElement caseSubmitBtn;
	WebElement listOfCreatedCases;
	WebElement errorMessage;
	
	WebDriver driver;
	
	public UseCasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getCreateUseCaseBtn() {
		return driver.findElement(By.className("float-right"));
	}
	public void clickCreateUseCaseBtn() {
		getCreateUseCaseBtn().click();
	}
	//Title getters
	public WebElement getTitleField() {
		return driver.findElement(By.xpath("//input[@placeholder='* Title']"));
	}
	public void insertTitle(String title) {
		getTitleField().sendKeys(title);
	}
	//Description getters
	public WebElement getDescriptionField() {
		return driver.findElement(By.xpath("//textarea[@placeholder='Description']"));
	}
	public void insertDescription(String description) {
		getDescriptionField().sendKeys(description);
	}
	//Expected resaults getters
	public WebElement getExpectedResaults() {
		return driver.findElement(By.xpath("//input[@placeholder='* Expected Result']"));
	}
	public void insertExpectedResaults(String expectedResaults) {
		getExpectedResaults().sendKeys(expectedResaults);
	}
	//Yes No toggle button
	public WebElement getToggleButton() {
		return driver.findElement(By.xpath("//label[@class='pt-1 ml-2']"));
	}
	public void clickToggleButton() {
		getToggleButton().click();
	}
	//Case step input field
	public List<WebElement> getListCaseInputField() {
		return driver.findElements(By.xpath("//input[starts-with(@name,'testStepId')]"));
	}
	public WebElement getSingleCaseInputField(int index) {
		return getListCaseInputField().get(index);
	}
	public void insertCaseInputField(String caseText, int index) {
		getSingleCaseInputField(index).sendKeys(caseText);
	}
	//Add test step button
	public WebElement getAddTestStepButton() {
		return driver.findElement(By.xpath("//button[@data-testid='add_step_btn']"));
	}
	public void clickAddStepButton() {
		getAddTestStepButton().click();
	}
	//submit test case button
	public WebElement getSubmitCaseButton() {
		return driver.findElement(By.xpath("//button[@type='submit']"));
	}
	public void clickSubmitCaseButton() {
		getSubmitCaseButton().click();
	}
	//list of created cases
	public List<WebElement> getListOfCreatedCases() {
		return driver.findElements(By.xpath("//a[starts-with(@href,'/use-cases/')]"));
	}
	public WebElement getSingleCreatedCase(int index) {
		return getListCaseInputField().get(index);
	}
	public void clickCreatedCase(int index) {
		getSingleCreatedCase(index).click();
	}
	//error message
	public WebElement getErrorMessage() {
		return driver.findElement(By.className("invalid-feedback"));
	}
	
}

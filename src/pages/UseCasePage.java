package pages;

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
		return driver.findElement(By.xpath("//input[@name='title']"));
	}
	public void insertTitle(String title) {
		getTitleField().sendKeys(title);
	}
	//Description getters
	public WebElement getDescriptionField() {
		return driver.findElement(By.xpath("//textarea[@name='description']"));
	}
	public void insertDescription(String description) {
		getDescriptionField().sendKeys(description);
	}
	//Expected resaults getters
	public WebElement getExpectedResaults() {
		return driver.findElement(By.xpath("//input[@name='expected_result']"));
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
	public WebElement getCaseInputField() {
		return driver.findElement(By.xpath("//input[starts-with(@name,'testStepId')]"));
	}
	public void insertCaseInputField(String caseText) {
		getCaseInputField().sendKeys(caseText);
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
		return driver.findElement(By.xpath("//button[@data-testid='submit_btn']"));
	}
	public void clickSubmitCaseButton() {
		getSubmitCaseButton().click();
	}
}

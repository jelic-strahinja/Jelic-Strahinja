package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.ExcelReader;
import pages.LoginPage;
import pages.MainPage;
import pages.UseCasePage;

public class BaseTest {
	//pages
	LoginPage loginPage;
	MainPage mainPage;
	UseCasePage useCasePage;
	ExcelReader reader;
	
	//other
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	@BeforeClass
	public void beforeClass() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		this.driver = new ChromeDriver();
		this.wait = new WebDriverWait(driver,30);
		js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//pages
		this.loginPage = new LoginPage(driver);
		this.mainPage = new MainPage(driver);
		this.useCasePage = new UseCasePage(driver);
		this.reader = new ExcelReader("data\\testCases.xlsx");
		
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
	
	
}

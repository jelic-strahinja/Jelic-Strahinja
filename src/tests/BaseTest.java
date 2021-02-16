package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.LoginPage;
import pages.MainPage;
import pages.UseCasePage;

public class BaseTest {
	//pages
	LoginPage loginPage;
	MainPage mainPage;
	UseCasePage useCasePage;
	
	//other
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void beforeClass() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		this.driver = new ChromeDriver();
		this.wait = new WebDriverWait(driver,10);
		//pages
		this.loginPage = new LoginPage(driver);
		this.mainPage = new MainPage(driver);
		this.useCasePage = new UseCasePage(driver);
		
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}

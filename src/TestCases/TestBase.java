package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public abstract class TestBase {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Erdogan\\Desktop\\Youtube Test\\YoutubeSmoke\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	}

	@Test
	public void f() {

	}

	@AfterClass
	public void afterClass() {

		driver.close();
	}

}

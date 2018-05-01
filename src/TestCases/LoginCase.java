package TestCases;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;

public class LoginCase extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	// LoginPage loginPage;

	@Test
	public void f() throws InterruptedException {
		homePage.openHomePage("http://youtube.com");

		homePage.clickOnSignInButton();

		loginPage.enterEmailPhone("o.can.cosar");

		loginPage.clickOnEmailNext();

		loginPage.inputPassword("01189998819991197253NIKITAhvatary2325");

		loginPage.clickOnPasswordNext();
		
		loginPage.waitForLoad();

	}

	@BeforeMethod
	public void beforeMethod() {
		homePage = new HomePage(driver, wait);
		loginPage = new LoginPage(driver, wait);
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException{
		
		homePage.clickOnAvatarButton();
		homePage.clickOnSignOutOption();
		homePage.waitForLoad();
		// driver.quit();
	}

}

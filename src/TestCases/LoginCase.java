package TestCases;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


public class LoginCase extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	
  @Test
  public void f() {
	  homePage.openHomePage("http://youtube.com");
	  homePage.clickOnSignInButton();
	  loginPage.waitLoginPage();
	  loginPage.enterEmailorPhone("webdriverpumpteam");
  }
  @BeforeMethod
  public void beforeMethod() {
	  loginPage= new LoginPage(driver,wait);
	  homePage = new HomePage(driver,wait);
  }

  @AfterMethod
  public void afterMethod() {
  }

}

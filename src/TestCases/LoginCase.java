package TestCases;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


public class LoginCase extends TestBase {
	HomePage homePage;
	//LoginPage loginPage;
	
  @Test
  public void f() {
	  homePage.openHomePage("http://youtube.com");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  homePage = new HomePage(driver,wait);
  }

  @AfterMethod
  public void afterMethod() {
  }

}

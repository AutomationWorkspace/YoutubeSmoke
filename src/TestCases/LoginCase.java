package TestCases;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;


public class LoginCase extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	//LoginPage loginPage;
	
  @Test
  public void f() throws InterruptedException{
	  homePage.openHomePage("http://youtube.com");
	  
	  homePage.clickOnSignInButton(); 
	  TimeUnit.SECONDS.sleep(1000);
	  
	  
	  loginPage.enterEmailPhone("o.can.cosar");
	  
	  loginPage.clickOnNext();  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  homePage = new HomePage(driver,wait);
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
  }

}

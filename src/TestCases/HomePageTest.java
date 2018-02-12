package TestCases;
//dnemee
import org.testng.annotations.Test;

import Pages.HomePage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class HomePageTest extends TestBase{
	HomePage homePage;

@Test
  public void f() {
	homePage.openHomePage("http://youtube.com");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  homePage = new HomePage(driver, wait);
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}

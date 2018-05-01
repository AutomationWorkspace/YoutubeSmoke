package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	WebDriver driver;
	WebDriverWait wait;
	final String URL = "https://youtube.com";

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		this.driver = driver;
		this.wait = wait;
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@type='email']")
	WebElement getEmail_phone;

	@FindBy(css = "button[type='button'][jsname='Cuz2Ue']")
	WebElement ForgotEmail;

	@FindBy(xpath= "(//div[@jscontroller='cUYNmd'][@class='IMH1vc lUHSR Hj2jlf']")
	WebElement MoreOptions;
	
	@FindBy(css = "div[class='ZFr60d CeoRYc']")
	WebElement Next;
	
	@FindBy(css = "a[href='https://support.google.com/accounts?hl=en'][target='_blank']")
	WebElement Help;
	

	public void enterEmailPhone(String value) throws InterruptedException {
		getEmail_phone.click();
		TimeUnit.SECONDS.sleep(1000);
		getEmail_phone.sendKeys(value);

	}
	
	public void clickOnNext() {
		
		Next.click();
		waitForLoad();
		
	}
	
}

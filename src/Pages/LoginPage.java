package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
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

	@FindBy(xpath = "(//div[@jscontroller='cUYNmd'][@class='IMH1vc lUHSR Hj2jlf']")
	WebElement MoreOptions;

	@FindBy(css = "div[id='identifierNext']")
	WebElement emailNext;

	@FindBy(css = "a[href='https://support.google.com/accounts?hl=en'][target='_blank']")
	WebElement Help;

	@FindBy(xpath = "//input[@type='password']")
	WebElement passwordBox;
	@FindBy(xpath = "//div[@id='passwordNext']")
	WebElement passwordNext;

	public void waitForLoad() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		TimeUnit.SECONDS.sleep(3); 

	}

	public void enterEmailPhone(String value) throws InterruptedException {
		getEmail_phone.click();
		getEmail_phone.sendKeys(value);

	}

	public void clickOnEmailNext() throws InterruptedException {

		emailNext.click();
		waitForLoad();
		//TimeUnit.SECONDS.sleep(2);
	}

	public void inputPassword(String value) {

		passwordBox.click();
		passwordBox.sendKeys(value);
	}

	public void clickOnPasswordNext() throws InterruptedException {
		passwordNext.click();
		waitForLoad();
	}
}

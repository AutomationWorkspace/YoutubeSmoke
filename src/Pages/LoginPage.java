package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
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
	
	@FindBy(css = "div[id='identifierNext']")
	WebElement Next;
	
	@FindBy(css = "a[href='https://support.google.com/accounts?hl=en'][target='_blank']")
	WebElement Help;
	
	@FindBy(css = "a[href='https://accounts.google.com/TOS?loc=TR&hl=en&privacy=true'][target='_blank']")
	WebElement Privacy;
	
	@FindBy(css = "a[href='https://accounts.google.com/TOS?loc=TR&hl=en'][target='_blank']")
	WebElement Terms;	
	
	public boolean waitLoginPage() {
		try {
			System.out.println("Login Page Open Successfully");
			wait.until(ExpectedConditions.elementToBeClickable(getEmail_phone));
			return true;
		}
		catch(Exception e){
			return false;
		}
	}
	
	public void enterEmailorPhone(String emailorphone) {
		System.out.println("Writing Email or Phone Number ");
		getEmail_phone.sendKeys(emailorphone); 
		Next.click();
		System.out.println("Next Page Opened!");
	}
}

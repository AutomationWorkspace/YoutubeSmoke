package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	WebDriver driver;
	WebDriverWait wait;
	final String URL = "https://youtube.com";

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		this.driver = driver;
		this.wait = wait;
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "(//yt-icon[@id='guide-icon'])[1]")
	WebElement guideIcon;

	@FindBy(css = "input[id='search']")
	WebElement searchInput;

	@FindBy(css="button[id='search-icon-legacy']")
	WebElement searchIcon;
	
	public void openHomePage(String URL) {
		driver.get(URL);

	}
	
	public void searchInputKeyWord(String keyWord)
	{
		
		searchInput.sendKeys(keyWord);
	}
	
	public void clickOnSearchButton()
	{
		
		searchIcon.click();
	}

}

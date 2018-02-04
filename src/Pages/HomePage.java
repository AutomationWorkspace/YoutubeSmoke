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
	
	@FindBy(xpath = "")
	WebElement searchBox;
		
	@FindBy(xpath = "")
	WebElement signInButton;
	
	@FindBy(xpath = "")
	WebElement homeLink;
	
	@FindBy(xpath = "")
	WebElement trendingLink;
	
	@FindBy(xpath = "")
	WebElement historyLink;
	
	@FindBy(xpath = "")
	WebElement musicLink;
	
	@FindBy(xpath = "")
	WebElement sportsLink;
	
	@FindBy(xpath = "")
	WebElement 	gamingLink;
	
	@FindBy(xpath = "")
	WebElement moviesLink;
	
	@FindBy(xpath = "")
	WebElement newsLink;
	
	@FindBy(xpath = "")
	WebElement threeHundredSixtyLink;
	
	@FindBy(xpath = "")
	WebElement browseChannelsLink;
	
	@FindBy(xpath = "")
	WebElement settingsLink;
	
	@FindBy(xpath = "")
	WebElement helpLink;
	
	@FindBy(xpath = "")
	WebElement sendFeedbackLink;
	
	@FindBy(xpath = "")
	WebElement signInLink;
	
	
	
	
	
	
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

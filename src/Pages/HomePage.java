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

	@FindBy(css = "input[id='search']")
	WebElement searchBox;

	@FindBy(xpath = "//a[@rel='nofollow']//yt-formatted-string//text()[. = 'Sign in']")
	WebElement signInButton;

	@FindBy(xpath = "//div[@id='guide-content']//a[@id='endpoint']//text()[. = 'Home']")
	WebElement homeLink;

	@FindBy(xpath = "//div[@id='guide-content']//a[@id='endpoint']//text()[. = 'Trending']")
	WebElement trendingLink;

	@FindBy(xpath = "//div[@id='guide-content']//a[@id='endpoint']//text()[. = 'History']")
	WebElement historyLink;

	@FindBy(xpath = "//div[@id='guide-content']//a[@id='endpoint']//text()[. = 'Music']")
	WebElement musicLink;

	@FindBy(xpath = "//div[@id='guide-content']//a[@id='endpoint']//text()[. = 'Sports']")
	WebElement sportsLink;

	@FindBy(xpath = "//div[@id='guide-content']//a[@id='endpoint']//text()[. = 'Gaming']")
	WebElement 	gamingLink;

	@FindBy(xpath = "//div[@id='guide-content']//a[@id='endpoint']//text()[. = 'News']")
	WebElement moviesLink;

	@FindBy(xpath = "//div[@id='guide-content']//a[@id='endpoint']//text()[. = 'Live']")
	WebElement newsLink;

	@FindBy(xpath = "//div[@id='guide-content']//a[@id='endpoint']//span[contains(text(), '360')]")
	WebElement threeHundredSixtyLink;

	@FindBy(xpath = "//div[@id='guide-content']//a[@id='endpoint']//span//text()[. = 'Browse channels']")
	WebElement browseChannelsLink;

	@FindBy(xpath = "//div[@id='guide-content']//a[@id='endpoint']//text()[. = 'Settings']")
	WebElement settingsLink;

	@FindBy(xpath = "//div[@id='guide-content']//a[@id='endpoint']//text()[. = 'Help']")
	WebElement helpLink;

	@FindBy(xpath = "//div[@id='guide-content']//a[@id='endpoint']//span[contains(text(),'feedback')]")
	WebElement sendFeedbackLink;

	@FindBy(xpath = "//div[@id='guide-content']//a[@is='yt-endpoint']//text()[. = 'Sign in']")
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

	public void clickOnSignInButton(){

		signInButton.click();
	}

	public void clickOnGuideIcon(){
		guideIcon.click();
	}

	public void clickOnSignInLink(){

		clickOnGuideIcon();
		signInLink.click();

	}

	public void clickOnSettingsLink(){

		clickOnGuideIcon();
		settingsLink.click();

	}

}

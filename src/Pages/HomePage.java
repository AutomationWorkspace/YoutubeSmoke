package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

	@FindBy(xpath = "//ytd-topbar-menu-button-renderer[2]//div[@id='waves']']")
	WebElement settingsForGuestUser;

	@FindBy(xpath = "//div[@id='end']//div[@id='buttons']//ytd-button-renderer//a")
	WebElement signInButton;

	@FindBy(xpath = "//button[@aria-label='YouTube apps']")
	WebElement youtubeAppsButton;

	@FindBy(xpath = "//button[@aria-label='Upload']")

	WebElement uploadButton;

	@FindBy(xpath = "(//div[@id='guide-content']//a[@id='endpoint'])[1]")
	WebElement homeLink;

	@FindBy(xpath = "(//div[@id='guide-content']//a[@id='endpoint'])[2]")
	WebElement trendingLink;

	@FindBy(xpath = "(//div[@id='guide-content']//a[@id='endpoint'])[3]")
	WebElement historyLink;

	@FindBy(xpath = "(//div[@id='guide-content']//a[@id='endpoint'])[4]")
	WebElement musicLink;

	@FindBy(xpath = "(//div[@id='guide-content']//a[@id='endpoint'])[5]")
	WebElement sportsLink;

	@FindBy(xpath = "(//div[@id='guide-content']//a[@id='endpoint'])[6]")
	WebElement 	gamingLink;

	@FindBy(xpath = "(//div[@id='guide-content']//a[@id='endpoint'])[7]")
	WebElement moviesLink;

	@FindBy(xpath = "(//div[@id='guide-content']//a[@id='endpoint'])[8]")
	WebElement newsLink;

	@FindBy(xpath = "(//div[@id='guide-content']//a[@id='endpoint'])[9]")
	WebElement threeHundredSixtyLink;

	@FindBy(xpath = "(//div[@id='guide-content']//a[@id='endpoint'])[10]")
	WebElement browseChannelsLink;

	@FindBy(xpath = "(//div[@id='guide-content']//a[@id='endpoint'])[11]")
	WebElement settingsLink;

	@FindBy(xpath = "(//div[@id='guide-content']//a[@id='endpoint'])[12]")
	WebElement helpLink;

	@FindBy(xpath = "(//div[@id='guide-content']//a[@id='endpoint'])[13]")
	WebElement sendFeedbackLink;

	@FindBy(xpath = "//div[@id='guide-content']//a[@is='yt-endpoint']")
	WebElement signInLink;


	//After Login

	@FindBy(xpath = "//button[@id='avatar-btn']//img[@id='img']")
	WebElement avatarButton;

	@FindBy(xpath = "//button[@aria-label='Notifications']")

	WebElement notificationsButton;


	public void openHomePage(String URL) {
		driver.get(URL);
		waitForLoad();
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
		waitForLoad();
	}

	public void clickOnYoutubeAppsButton(){

		youtubeAppsButton.click();

	}

	public void clickOnUploadButton(){
		uploadButton.click();

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
	
	public boolean isElementExist() {
		
	if((driver.findElements(By.cssSelector("")).size() != 0)) {
			
		return true;
			
		}
	else if(driver.findElements(By.cssSelector("")).size() == 0) {
			return false;
	}
	else {
	return false;
	
	}
	}

	//After Login

	public void clickOnAvatarButton(){
		avatarButton.click();
	}

	public void clickOnNotificationsButton(){

		notificationsButton.click();

	}
	


}

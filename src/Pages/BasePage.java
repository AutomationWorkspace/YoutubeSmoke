package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public  abstract class BasePage {
	WebDriver driver;
	WebDriverWait wait;
	
	public BasePage(WebDriver driver,WebDriverWait wait)
	{
		this.driver=driver;
		this.wait=wait;	
        PageFactory.initElements(driver, this);

	}
	
	public void waitForLoad() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
	
}

package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class HomePage extends BaseClass{
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//li[@class='dropdown open']")
	WebElement MyAccountDropDown;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'My Account')]")
	WebElement myAccount;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'Order History')]")
	WebElement orderHistory;
		
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'Logout')]")
	WebElement logout;
	
	@FindBy(xpath = "//nav[@id='menu']//a[contains(text(),'Desktops')]")
	public WebElement desktopsBtn;
	
	@FindBy(xpath = "//nav[@id='menu']//a[contains(text(),'Desktops')]/parent::li//a[contains(text(),'Mac')]")
	public WebElement categoryMacDesktop;
	
	@FindBy(xpath = "//nav[@id='menu']//a[contains(text(),'Components')]/parent::div")
	public WebElement componentsBtn;
	
	@FindBy(xpath = "//nav[@id='menu']//a[contains(text(),'Components')]/parent::li//a[contains(text(),'Monitors')]")
	public WebElement categoryMonitors;
	
	@FindBy(xpath = "//nav[@id='menu']//a[contains(text(),'Tablets')]")
	public WebElement categoryTablet;
	
	@FindBy(xpath = "//nav[@id='menu']//a[contains(text(),'Desktops')]/parent::li//a[contains(text(),'Show All Desktops')]")
	public WebElement categoryAllDesktops;
	
	
	@FindBy(xpath = "//nav[@id='menu']//a[contains(text(),'MP3 Players')]/parent::li")
	public WebElement mp3PlayersBtn;
	
	@FindBy(xpath = "//nav[@id='menu']//a[contains(text(),'MP3 Players')]/parent::li//a[contains(text(),'Show All MP3 Players')]")
	public WebElement categoryMP3Players;
	
	
	public void wishlistProduct(String productName) {
		WebElement wishlistBtn = driver.findElement(By.xpath("//a[contains(text(),'"+productName+"')]/ancestor::div[@class='product-thumb']//button[@data-original-title='Add to Wish List']"));
		wishlistBtn.click();
	}
	
	

}

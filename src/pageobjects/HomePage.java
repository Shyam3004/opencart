package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
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
	

}

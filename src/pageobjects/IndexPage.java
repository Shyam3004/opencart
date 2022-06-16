package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class IndexPage extends BaseClass {

	
	public IndexPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//a[@title='My Account']")
	WebElement indexMyAccountDropDown;

	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'Register')]")
	WebElement register;

	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'Login')]")
	WebElement login;
	
	public void register() {
		indexMyAccountDropDown.click();
		register.click();
	}
	public void login() {
		indexMyAccountDropDown.click();
		login.click();
	}

}

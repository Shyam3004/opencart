package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-email")
	WebElement emailInputBox;

	@FindBy(id = "input-password")
	WebElement passwordInputBox;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginBtn;

	public void userLogin(String userName, String password) {
		emailInputBox.sendKeys(userName);
		passwordInputBox.sendKeys(password);
		loginBtn.click();
	}

}

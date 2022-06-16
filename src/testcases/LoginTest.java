package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageobjects.IndexPage;
import pageobjects.LoginPage;
import pageobjects.MyAccountPage;

public class LoginTest extends BaseClass {
	
	IndexPage indexObj;
	LoginPage loginObj;
	MyAccountPage accountobj;
	
	
	@Test(priority = 1)
	public void loginTest() {
		
		String username = config.getProperty("username");
		String password = config.getProperty("password");
		
		indexObj = new IndexPage(driver);
		loginObj = new LoginPage(driver);
		
		//Navigating to login page from index
		indexObj.login();
		
		//Performing Login Activity
		loginObj.userLogin(username, password);
	}
	
	@Test(priority = 2)
	public void navigatingHomePage() {
		accountobj = new MyAccountPage(driver);
		accountobj.homeBtn.click();
		Assert.assertEquals("Your Store" , driver.getTitle());
	}
	
	

}

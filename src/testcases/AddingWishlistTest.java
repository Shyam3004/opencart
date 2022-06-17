package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageobjects.HomePage;

public class AddingWishlistTest extends BaseClass{
	
	HomePage homeObj;
	
	@Test
	public void wishlistByCategories() {
		homeObj = new HomePage(driver);
		homeObj.desktopsBtn.click();
		homeObj.categoryAllDesktops.click();
		homeObj.wishlistProduct("MacBook Air");
		homeObj.wishlistProduct("HTC Touch HD");
		homeObj.wishlistProduct("iPhone");
		homeObj.componentsBtn.click();
		homeObj.categoryMonitors.click();
		homeObj.wishlistProduct("Apple Cinema 30\"");
		homeObj.categoryTablet.click();
		homeObj.wishlistProduct("Samsung Galaxy Tab 10.1");
		homeObj.desktopsBtn.click();
		homeObj.categoryMacDesktop.click();
		homeObj.wishlistProduct("iMac");
		homeObj.mp3PlayersBtn.click();
		homeObj.categoryMP3Players.click();
		homeObj.wishlistProduct("iPod Classic");
		homeObj.wishlistProduct("iPod Touch");
	}
	
	
}

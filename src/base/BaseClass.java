package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {


	public static WebDriver driver;
	public static Properties config;
	public static FileInputStream configFile;

	@BeforeSuite
	public void browserLauncher() throws IOException {
		configFile = new FileInputStream(System.getProperty("user.dir")+"/properties/config.properties");
		if(driver==null) {
			configProperties(configFile);
		}

		if (config.getProperty("browser").equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (config.getProperty("browser").equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get(config.getProperty("siteURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}

	public void configProperties(FileInputStream configFile) throws IOException {
		config = new Properties();
		config.load(configFile);
	}

	@AfterSuite
	public void tearDown() {
//		driver.quit();
	}


}

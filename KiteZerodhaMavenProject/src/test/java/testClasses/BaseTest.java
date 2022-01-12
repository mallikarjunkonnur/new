package testClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class BaseTest {
	
	 static WebDriver driver;
	 
	 LoginPage lp;
	
	 
	 static Properties prop ;
	 
	 
	@BeforeSuite
	public void launchBrowser() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		options.addArguments("--start-maximized");
		
		 driver= new ChromeDriver(options);
		 
		// driver.manage().window().maximize();
		 
		  prop = new Properties();
		 
		 String path = System.getProperty("user.dir")+"\\config.properties";
		 
		 FileInputStream fis = new FileInputStream(path);
		 
		 prop.load(fis);
		 
		 //redirecting the URL in browser
		 driver.get(prop.getProperty("url"));
	}
	
	@BeforeClass
	public void object() throws IOException {
		
		 lp = new LoginPage(driver);
		 
		 
	}

}

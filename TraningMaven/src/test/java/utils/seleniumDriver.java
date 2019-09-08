package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class seleniumDriver {
	
	static WebDriver driver;
	
	public seleniumDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/rengarm/Desktop/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();  
		options.addArguments("--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");  
		options.setExperimentalOption("useAutomationExtension", false);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}

}

package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.locatorFile;
import utils.seleniumDriver;

public class actionClass {
	locatorFile locat = new locatorFile();
	
	public void EntertheURL()
	{
		seleniumDriver.getDriver().get("https://www.google.com");
	}
	
	public void EnterURLFromArg(String url)
	{
		seleniumDriver.getDriver().get(url);
	}

	
	public void EnterValue()
	{
		
		WebDriverWait wait = new WebDriverWait(seleniumDriver.getDriver(),30);
		wait.until(ExpectedConditions.visibilityOf(locat.searchBox));
		locat.searchBox.sendKeys("Hello Abee");
		seleniumDriver.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		seleniumDriver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
}

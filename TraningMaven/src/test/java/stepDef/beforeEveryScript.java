package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.seleniumDriver;

public class beforeEveryScript {
	
	@Before
	public void startBrowser()
	{
		System.out.println("Start Browser >>>>>>>>>>>>>>>");
		seleniumDriver dri = new seleniumDriver();
	}
	
	@After
	public void closeBrowser()
	{
		seleniumDriver.getDriver().quit();
		System.out.println("Browser Clossed >>>>>>>>>>>");
	}

}

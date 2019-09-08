package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.seleniumDriver;

public class locatorFile {

	@FindBy(name="q")
	public WebElement searchBox;
	
	public locatorFile()
	{
		PageFactory.initElements(seleniumDriver.getDriver(), this);
	}
}

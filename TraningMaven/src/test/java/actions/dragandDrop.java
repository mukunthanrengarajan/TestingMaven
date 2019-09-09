package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class dragandDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/rengarm/Desktop/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();  
		options.addArguments("--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");  
		options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		System.out.println(driver.findElement(By.xpath("//div[@id='draggable']")).getText());
		
		WebElement dest = driver.findElement(By.id("droppable"));
		WebElement src = driver.findElement(By.id("draggable"));
		
		Actions a = new Actions(driver);
	
		a.dragAndDrop(src, dest).build().perform();

	}

}

package runner;

import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "feature", glue = "stepDef", tags="@2")

public class runnerFile extends AbstractTestNGCucumberTests {
	
	@BeforeSuite
	public void startSuiteTestCase()
	{
		System.out.println("Before All the Test cases");
	}

}

package stepDef;

import actions.actionClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class step {
	actionClass actioncl = new actionClass();
	
	@Given("URL is launched")
	public void url_is_launched() {
	  System.out.println("Launching URL");
	  actioncl.EntertheURL();
	}

	@When("i Enter value")
	public void i_Enter_value() {
	   System.out.println("Enter the value");
	   actioncl.EnterValue();
	}
	
	@Given("Launch the {string}")
	public void launch_the(String URL) {
	   
		System.out.println(URL);
		actioncl.EnterURLFromArg(URL);
		
	}

}

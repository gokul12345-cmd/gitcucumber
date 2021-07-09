package StepDefinations;






import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitions {

	@Given("User in on landing page login")
	public void user_in_on_landing_page_login() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("user login into application with {string} and {string}")
	public void user_login_into_application_with_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string);
	    System.out.println(string2);
	}

	@Then("Home page is open")
	public void home_page_is_open() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Home page are display in all details")
	public void home_page_are_display_in_all_details() {
	    // Write code here that turns the phrase above into concrete actions
	
	}

   

}
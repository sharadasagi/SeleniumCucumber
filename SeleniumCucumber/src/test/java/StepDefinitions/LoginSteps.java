package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("User is on login page")
	public void user_is_on_login_page() {
	    System.out.println("User is on login page");
	}

	@When("user eneters valid user name and password")
	public void user_eneters_valid_user_name_and_password() {
		System.out.println("user eneters valid user name and password");	
		}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("user eneters valid user name and password");
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
		System.out.println("user eneters valid user name and password");
	}


}

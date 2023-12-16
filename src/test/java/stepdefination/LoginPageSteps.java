package stepdefination;

import helper.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginPageSteps extends Base{
	
	LoginPage login= new LoginPage();
	
	
	
	@Given("user launch site url")
	public void user_launch_site_url() {
	  setup();
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	 login.user_enter_username_and_password();
	}

	@Given("user click on login button")
	public void user_click_on_login_button() {
		login.user_click_on_login_button();
	}

	@Then("Validate user logged in successfully")
	public void validate_user_logged_in_successfully() {
	   login.validate_user_logged_in_successfully();
	}




}

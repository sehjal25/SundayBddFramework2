package bdd.stepDef;

import bdd.newtours.PageActions.NewtoursHomePageAction;
import bdd.newtours.PageActions.RegisterConfrPageAction;
import bdd.newtours.PageActions.RegisterPageAction;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewtoursRegisterSteps {
	
	NewtoursHomePageAction homePageAction = new NewtoursHomePageAction();
	RegisterPageAction newtourRegisterConfrPageAction = new RegisterPageAction();
	RegisterConfrPageAction registerConfrPageActionobj = new RegisterConfrPageAction ();

	@Given("^Browse to Newtours homepage$")
	public void browse_to_Newtours_homepage() throws Throwable {
		homePageAction.LaunchNewtoursHomepage();
	}

	@When("^Navigate to Register page$")
	public void navigate_to_Register_page() throws Throwable {
	   homePageAction.NavigateToRegisterPage();
	}

	@When("^Fill form with some basic information$")
	public void fill_form_with_some_basic_information() throws Throwable {
		newtourRegisterConfrPageAction.fillUpContactInfo();
		newtourRegisterConfrPageAction.fillUpMailingInfo();
		newtourRegisterConfrPageAction.fillUpUserInfo(null);
		
	    
	}

	@When("^Complete creating account with \"([^\"]*)\"$")
	public void complete_creating_account_with(String UserName) throws Throwable {
		newtourRegisterConfrPageAction.fillUpUserInfo(UserName);
		newtourRegisterConfrPageAction.submitForm();
	    
	}

	@Then("^Verify account created successfully$")
	public void verify_account_created_successfully() throws Throwable {
		registerConfrPageActionobj.ThankYouConfirmation();
	}
}

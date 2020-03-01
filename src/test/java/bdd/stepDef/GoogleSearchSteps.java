package bdd.stepDef;

import bdd.google.pageActions.GoogleSearchPageAction;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {
	GoogleSearchPageAction GoogleSearchPageActionObj= new GoogleSearchPageAction();
	
	
	@Given("^Browse to Google homepage$")
	public void browse_to_Google_homepage() throws Throwable {
		GoogleSearchPageActionObj.BrowseGoogleHomepage();
	    
	}
	
	@When("^Search by \"([^\"]*)\"$")
	public void search_by(String keyword) throws Throwable {
		GoogleSearchPageActionObj.searchbyKeyword(keyword);
	}
	
	@Then("^Verify search result appear$")
	public void verify_search_result_appear() throws Throwable {
		System.out.println("test complete");
	
	}

}

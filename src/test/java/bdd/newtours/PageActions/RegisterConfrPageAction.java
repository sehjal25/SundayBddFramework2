package bdd.newtours.PageActions;

import org.testng.Assert;

import bdd.newtours.PageElements.RegisterConfrPageLocators;

public class RegisterConfrPageAction {
	
	RegisterConfrPageLocators registerConfrPageLocatorsobj = new RegisterConfrPageLocators();
	
	public void ThankYouConfirmation(){
		String confMsg = registerConfrPageLocatorsobj.TxtThankYou.getText();
		Assert.assertEquals(confMsg, "Thank You for registering");
		
		
		
	}
}

package bdd.newtours.PageActions;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;

import bdd.newtours.PageElements.RegisterPageLocators;
import bdd.utilities.ReadExcelSheetData;

public class RegisterPageAction { 
	
	 RegisterPageLocators newtoursRegisterPageLocators = new RegisterPageLocators();
	 ReadExcelSheetData ExcelData = new ReadExcelSheetData();

	public void fillUpContactInfo() throws Exception{
		newtoursRegisterPageLocators.firstName.sendKeys(ReadExcelSheetData.getMapData("FirstName"));
		newtoursRegisterPageLocators.lastName.sendKeys("kaur");
		newtoursRegisterPageLocators.phone.sendKeys("7184157828");
		newtoursRegisterPageLocators.email.sendKeys("sehjal25@aol.com");
	}
	
	public void fillUpMailingInfo(){
		newtoursRegisterPageLocators.AddressLine1.sendKeys("1150 wolf st");
		newtoursRegisterPageLocators.AddressLine2.sendKeys("");
		newtoursRegisterPageLocators.city.sendKeys("ValleyStream");
		newtoursRegisterPageLocators.State.sendKeys("NY");
		newtoursRegisterPageLocators.postalCode.sendKeys("11580");
		
		Select mydrpdwn = new Select(newtoursRegisterPageLocators.country);
		mydrpdwn.selectByVisibleText("UNITED STATES");	
	
	}
	
	public void fillUpUserInfo(String UserName ){
		newtoursRegisterPageLocators.username.sendKeys("sehjal25");
		newtoursRegisterPageLocators.password.sendKeys("12345");
		newtoursRegisterPageLocators.confirmPassword.sendKeys("12345");
	}
	
	public void submitForm(){
		newtoursRegisterPageLocators.SubmitButton.click();
		
	}
}

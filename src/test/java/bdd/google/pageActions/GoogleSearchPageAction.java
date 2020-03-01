package bdd.google.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.google.PageElements.GoogleHomePageLocators;
import bdd.utilities.SetupDrivers;

public class GoogleSearchPageAction {

	GoogleHomePageLocators GoogleHomePageLocatorsObj;
	
	public GoogleSearchPageAction(){
		GoogleHomePageLocatorsObj = new GoogleHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, GoogleHomePageLocatorsObj);
	}
	
	
	public void BrowseGoogleHomepage(){
		SetupDrivers.driver.get("https://www.google.com/");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void searchbyKeyword(String keyword) throws Exception{
		Thread.sleep(5000);
		GoogleHomePageLocatorsObj.txtbxSearch.sendKeys(keyword);
		GoogleHomePageLocatorsObj.txtbxSearch.click();
		
	}
}

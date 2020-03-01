package bdd.newtours.PageActions;

import java.util.concurrent.TimeUnit;

import bdd.newtours.PageElements.HomePageLocators;
import bdd.utilities.ReadExcelSheetData;
import bdd.utilities.SetupDrivers;

public class NewtoursHomePageAction {
	
	HomePageLocators newtoursHomePageLocators = new HomePageLocators();
		

	public void LaunchNewtoursHomepage() throws Exception{
		System.out.println(ReadExcelSheetData.getMapData("FirstName"));
		SetupDrivers.driver.get("http://newtours.demoaut.com/");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void NavigateToRegisterPage(){
		newtoursHomePageLocators.RegisterButton.click();
		
	}
}

package bdd.google.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePageLocators {
	@FindBy(xpath="//*[@title='Search']")
	public WebElement txtbxSearch;	
	
	@FindBy(xpath="//*[@value= 'Google Search']")
	public WebElement Searchbutton;
}

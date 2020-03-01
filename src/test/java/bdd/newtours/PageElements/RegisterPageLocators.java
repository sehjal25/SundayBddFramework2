package bdd.newtours.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageLocators {

	
	@FindBy(xpath="//input[@name='firstName']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@name='phone']")
	public WebElement phone;
	
	@FindBy(xpath="//input[@name='userName']")
	public WebElement email;
	//Page factory Example- WebElement phone
	
		@FindBy(xpath="//input[@name='address1']")
		public WebElement AddressLine1;
		
		@FindBy(xpath="//input[@name='address2']")
		public WebElement AddressLine2;
		
		@FindBy(xpath="//input[@name='city']")
		public WebElement city;
		
		@FindBy(xpath="//input[@name='state']")
		public WebElement State;
		
		@FindBy(xpath="//input[@name='postalCode']")
		public WebElement postalCode;
		
		@FindBy(xpath="//input[@='country']")
		public WebElement country;
		
		@FindBy(xpath="//input[@id='email']")
		public WebElement username;

		@FindBy(xpath="//input[@name='password']")
		public WebElement password;
		
		
		@FindBy(xpath="//input[@name='confirmPassword']")
		public WebElement confirmPassword;
		
		@FindBy(xpath="//input[@name='register']")
		public WebElement SubmitButton;
		
	
		
}

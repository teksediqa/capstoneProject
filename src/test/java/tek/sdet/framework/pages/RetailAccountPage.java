package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{ 
	public RetailAccountPage() { 
		PageFactory.initElements(getDriver(), this); 
	} 
	
	@FindBy(css= "#profileImage") 
	public WebElement accountProfilePicture;  
	
	@FindBy(xpath="//a[@id='accountLink']")
	public WebElement accountLink;
	 
	
	@FindBy(id="nameInput")
	public WebElement updateAccountNameField;  
	
	@FindBy(css="#personalPhoneInput")
	public WebElement updatephonFeild; 
	
	@FindBy(xpath="//button[@id='personalUpdateBtn']")
	public WebElement updateButton ;  
	
	
	@FindBy(css="#previousPasswordInput")
	public WebElement updatePrevoiusPassField; 
	
	@FindBy(xpath="//input[@id='newPasswordInput']") 
	public WebElement updateNewPassField; 
	
	@FindBy(css="#confirmPasswordInput")
	public WebElement updateConfirmPassField; 
	
	@FindBy(id="credentialsSubmitBtn")
	public WebElement changePasswordBtn;  
	
	@FindBy(xpath="//div[contains(text(),'Personal Information Updated Successfully')]") 
	public WebElement personalInfoUpdateMassage; 
	
	@FindBy(xpath="//div[text()='Password Updated Successfully']")
	public WebElement passwordUpdatedSuccessfully; 
	
	@FindBy(xpath=" //p[contains(text(),'Add a payment method')]") 
	public WebElement addPaymentMethod; 
	
	@FindBy(xpath=" //input[@id='cardNumberInput']")
	public WebElement cardNumInput; 
	
	@FindBy(css="#nameOnCardInput")
	public WebElement nameOnTheCard; 
	
	@FindBy(xpath="//select[@id='expirationMonthInput']") 
	public WebElement expMonthInput; 
	
	@FindBy(xpath="//select[@id='expirationYearInput']")
	public WebElement expYearInput; 
	
	@FindBy(xpath=" //input[@id='securityCodeInput']")
	public WebElement securityCode;  
	
	@FindBy(xpath=" //button[@id='paymentSubmitBtn']")
	public WebElement paymentBtn; 
	
	

}

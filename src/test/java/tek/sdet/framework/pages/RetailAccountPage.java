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
	
	@FindBy(xpath="//img[@id='profileImage']")
	public WebElement proFileimage; 
	
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
	
	@FindBy(xpath="//div[contains(text(),'Payment Method added sucessfully')]") 
	public WebElement paymentAddedSuccessfully;  
	
	@FindBy(xpath="//img[contains(@alt,'Master Card')] ")
	public WebElement cardImage;  
//	@FindBy(xpath ="//p[contains(@class, 'account')] ") 
	//public WebElement masterCard;
	
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	public WebElement editbutton; 
	
	@FindBy(xpath="//input[@id='cardNumberInput']")
	public WebElement cardNumber; 
	
	@FindBy(xpath="//input[@id='nameOnCardInput']") 
	public WebElement namecard; 
	
	@FindBy(xpath=" //select[@id='expirationMonthInput']")
	public WebElement expirationMonth; 
	
	@FindBy(xpath=" //select[@id='expirationYearInput']")
	public WebElement expirationYear; 
	
	@FindBy(xpath="//input[@id='securityCodeInput']") 
	public WebElement codeInput; 
	
	@FindBy(xpath=" //button[@id='paymentSubmitBtn']")
	public WebElement updateCard; 
	
	@FindBy(xpath="//div[contains(text(),'Payment Method updated Successfully')]")
	public WebElement updateSuccessfully;  
	
	// --------------------------------------------------
	
	@FindBy(xpath ="//img[contains(@class, 'w-full undefined')]") 
	public WebElement masterCardPicture;
	
	@FindBy(xpath="//button[(text()='remove')]") 
	public WebElement removeButton; 
	
	//------------------------------------------------ 
	
	@FindBy(xpath ="//p[text()='Add Address']") 
	public WebElement addAddress; 
	
	@FindBy(xpath="//select[@id='countryDropdown']") 
	public WebElement counrtyDb; 
	
	@FindBy(css=" #fullNameInput") 
	public WebElement addressNameField; 
	
	@FindBy(xpath="//input[@id='phoneNumberInput']") 
	public WebElement addressphoneField; 
	
	@FindBy(xpath=" //input[@id='streetInput']") 
	public WebElement streetField;  
	
	@FindBy(css=" #apartmentInput") 
	public WebElement apartField;  
	
	@FindBy(xpath=" //input[@id='cityInput']")  
	

	public WebElement cityField; 
	
	@FindBy(xpath="//select[contains(@name, 'state')]") 
	public WebElement stateField;  
	
	
	@FindBy(xpath="//input[@id='zipCodeInput']") 
	public WebElement zipCodField;  
	
	@FindBy(xpath="//button[@id='addressBtn']")
	public WebElement addressBtn; 
	
	@FindBy(xpath="//div[contains(text(),'Address Added Successfully')]") 
	public WebElement addressAddedSuccessfully; 
	
	//---------------------------------------------- 
	
	@FindBy(xpath=" //button[contains(text(),'Edit')]") 
	public WebElement editAddressButton; 
	
	@FindBy(xpath="//select[@id='countryDropdown']") 
	public WebElement editCountryDb; 
	
	@FindBy(xpath="//input[@id='fullNameInput']") 
	public WebElement editFullName; 
	
	@FindBy(xpath="//input[@id='phoneNumberInput']") 
	public WebElement editPhoneNum; 
	
	@FindBy(xpath=" //input[@id='streetInput']") 
	public WebElement editAddressStreet; 
	
	@FindBy(xpath=" //input[@id='apartmentInput']") 
	public WebElement editapaartment; 
	
	@FindBy(xpath=" //input[@id='cityInput']") 
	public WebElement editCity; 
	
	@FindBy(xpath="//select[contains(@name, 'state')] ") 
	
	public WebElement editStateAddress; 
	
	@FindBy(xpath=" //input[@id='zipCodeInput']") 
	public WebElement editZipcode; 
	
	@FindBy(xpath=" //button[@id='addressBtn']") 
	public WebElement editaddressBtn; 
	
	@FindBy(xpath="//div[contains(text(),'Address Updated Successfully')]") 
	public WebElement addressUpdatedSuccessfully;
	
	@FindBy(xpath="//button[contains(text(),'Remove')]") 
	public WebElement addressRemoveBtn;
	
	
	
	
	
	
	
	
	
	
	
	

}

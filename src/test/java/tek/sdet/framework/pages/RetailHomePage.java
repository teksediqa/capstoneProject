package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		// we are implementing PageFactory Class to initialize the UI elements 
		// using @FindBy annotation of PageFactory. 
		PageFactory.initElements(getDriver(), this);
	} 

	// syntax for storing UI elements using @FindBy annotations
	// @FindBy(locatorType = "locator Value")
	// public WebElement nameOfElement
	
	@FindBy(linkText = "TEKSCHOOL") // this is same as driver.findElement() 
	public WebElement tekschoolLogo;
	
	@FindBy(id = "searchInput")  
	public WebElement searchBarInput;
	
	@FindBy(id = "searchBtn")
	public WebElement searchButton;
	
	@FindBy(xpath ="//img[contains(@alt,'Pokemon')]")
	public WebElement pokemonImage;
	
	@FindBy(id ="signinLink")
	public WebElement signInOption;
	
	@FindBy(xpath ="//a[text()='Account']")
	public WebElement accountOption; 
	
	@FindBy(xpath="//span[contains(text(),'All')]") 
	public WebElement AllElements;   
	
	@FindBy(xpath="//span[contains(text(),'Electronics')]") 
	public WebElement electronics; 
	
	@FindBy(xpath="//span[contains(text(),'Computers')]")  
	public WebElement computers;   
	
	@FindBy(xpath="//select[@id='search']") 
	public WebElement dropDown; 
	
	@FindBy(xpath="//img[contains(@alt, 'Plugs and Outlets')] ") 
	public WebElement smartImage; 
	
	@FindBy(xpath="(//div[contains(@class, 'sidebar_content-item')]) [3] ")  
	public WebElement smartHomeCategory;   
	
	@FindBy(xpath="//img[contains(@alt,'Kasa Outdoor Smart Plug')]") 
	public WebElement KasaSamrtPlug; 
	
	@FindBy(xpath="//select[contains(@class, 'product__select')]") 
	public WebElement quantity;   
	
	@FindBy(xpath="//button[@id='addToCartBtn']")
	public WebElement addToCardBtn;
	
	@FindBy(xpath="//p[contains(text(),'Cart')]")  
	public WebElement cart;  
	
	@FindBy(xpath=" //span[@id='cartQuantity']")
	public WebElement cartQuantity; 
	
	@FindBy(xpath= "//span[contains(text(),'Sports')]") 
	public WebElement sports; 
	
	@FindBy(xpath="//span[contains(text(),'Automative')]") 
	
	public WebElement automative; 
	
	@FindBy(xpath="//div[@class='sidebar_content-item']//span") 
	public List<WebElement> sideBar;  
	
	
	
	@FindBy(xpath="//p[contains(text(),'Order Placed, Thanks')]")
	public WebElement orderPlaced;
	
	@FindBy(xpath="//p[contains(text(),'Cart')]") 
	public WebElement cartOption; 
	
	@FindBy(xpath="//button[@id='proceedBtn']") 
	public WebElement proceedBtn; 
	
	@FindBy(xpath="//button[@id='addAddressBtn']") 
	public WebElement orderAddressbtn; 
	
	@FindBy(xpath="//button[@id='addPaymentBtn']") 
	public WebElement orderPaymentBtn; 
	
	@FindBy(xpath="//button[text()='Place Your Order']") 
	public WebElement placeOrderBtn; 
	
	@FindBy(xpath="//div[contains(text(),'Order Placed Successfully')]") 
	public WebElement orderplacedsuccessfully;    
	
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
	
	@FindBy(xpath="//a[@id='orderLink']") 
	public WebElement orderButton;  
	
	@FindBy(xpath="//img[contains(@alt, 'Apex Legends - 1,000 Apex Coins')]") 
	public WebElement apexLegendsPicture;
}

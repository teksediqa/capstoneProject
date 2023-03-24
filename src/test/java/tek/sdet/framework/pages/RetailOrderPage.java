package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup { 
	
	public RetailOrderPage() { 
		PageFactory.initElements(getDriver(), this);
	} 
	
	@FindBy(xpath="//a[@id='orderLink']") 
	public WebElement orderButton;  
	
	@FindBy(xpath="//button[text()= 'Cancel The Order']")
	public WebElement orderCancel; 
	
	
	@FindBy(xpath="//div[contains(@data-id, '4173')]")
	public WebElement headerOne; 
	
	@FindBy(xpath ="//select[@id='reasonInput']") 
	public WebElement orderReason; 
	
	@FindBy(xpath="//button[@id='orderSubmitBtn']") 
	public WebElement orderSubmitBtn;  
	
	@FindBy(xpath="//p[contains(text(),'Your Order Has Been Cancelled')]")
	public WebElement orderCancelMessage;  
	
	@FindBy(xpath="//div[contains(@data-id,'4175')]")
	public WebElement returnheaderOne; 
	
	@FindBy(xpath="//div[@class= 'order']") 
	public WebElement firstOrder;  
	
	@FindBy(xpath="//button[@id='returnBtn']") 
	public WebElement returnBtn; 
	
	@FindBy(xpath="//select[@id='dropOffInput']") 
	public WebElement dropOffInput; 
	
	@FindBy(xpath="//button[@id='orderSubmitBtn']") 
	public WebElement orderReturnSubmit;  
	
	@FindBy(xpath="//select[@id='reasonInput']") 
	public WebElement returnReason;  
	
	@FindBy(xpath = " //p[contains(text(),'Return was successfull')]") 
	public WebElement orderReturnSuccessfully; 
	
	@FindBy(xpath =" //p[contains(text(),'Return was successfull')]") 
	public WebElement returnSuccessfully;  
	
	//Review-------------------------------  
	
	@FindBy(xpath="//div[contains(@data-id,'4176')]") 
	public WebElement reviewHeader;
	
	@FindBy(xpath="//button[@id='reviewBtn']")
	public WebElement reviewBtn; 
	
	@FindBy(xpath =" //input[@id='headlineInput']")
	public WebElement headLineInput; 
	
	@FindBy(xpath="//textarea[@id='descriptionInput']") 
	public WebElement commentInput;  
	
	@FindBy(xpath = "//button[@id='reviewSubmitBtn']")
	public WebElement reviewSubmitBtn;  
	
	@FindBy(xpath= "//div[contains(text(),'Your review was added successfully')]") 
	public WebElement reviewAddedSuccessfully; 

}

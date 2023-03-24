package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility{ 
	POMFactory factory = new POMFactory(); 
	
	
	@When("User click on All section")
	public void userClickOnAllSection() { 
		click(factory.homePage().AllElements); 
		logger.info("User click on All section link");
		
	}  
	
	
	@Then("below options are present in Shop by Department sidebar")
    public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable options) {
        List<List<String>> optionsToDisplay = options.asLists(String.class);
        Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//span[text() = '" + optionsToDisplay.get(0).get(0) + "']" ))));
               logger.info(" Electronics, Computers, Smart Home, Sports and Automative are present");
	}
	
	
	
	
	
	@And("User on {string}")
	public void userOnDepartment(String department) { 
		List<WebElement> dept = factory.homePage().sideBar; 
		for(WebElement element: dept) { 
			if(element.getText().equals(department)) { 
				element.click();
				break; 
			}  
		}
		
	} 
	
	@Then("below options are persent in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) { 
		List<List<String>> departmentSection = dataTable.asLists(String.class); 
		List<WebElement> dept = factory.homePage().sideBar; 
		for(int i = 0; i<departmentSection.get(0).size(); i++) { 
			for(WebElement element: dept) { 
		 if(element.getText().equals(departmentSection.get(0).get(i))){ 
			 Assert.assertTrue(element.isDisplayed()); 
			 logger.info(element.getText()+"The item is persent");
			 
		 }
				
			
			
		}
	}

}  
	
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String category) { 
		click(factory.homePage().dropDown);
		selectByVisibleText(factory.homePage().dropDown, category); 
		//click(factory.homePage().smartHomeCategory);
		logger.info("uuser changed category to smartHome");
	    
	}  
	
	
	@When("User search for an item {string}")
	public void userSearchForAnItem(String value) {
		sendText(factory.homePage().searchBarInput, value); 
		click(factory.homePage().searchButton);
		logger.info("User searched for item");
	} 
	
	
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchButton); 
	} 
	
	@When("User click on item")
	public void userClickOnItem() { 
		click(factory.homePage().KasaSamrtPlug); 
		logger.info("user clicked on ithem");
	   
	} 
	
	
	@When("User select quantity {string}")
	public void userSelectQuantity(String qty) {  
		selectByVisibleText(factory.homePage().quantity, qty); 
		logger.info("user selected quantity");
		
	   
	} 
	
	
	@When("User click add to Cart button")
	public void userClickAddToCartButton() { 
		click(factory.homePage().addToCardBtn); 
		logger.info("user clicked add to cart button");
	   
	} 
	
	
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String qty) {  
		String actualQuantity = qty;
		String expectedQuantity = "2";
		Assert.assertEquals(actualQuantity,expectedQuantity );
		//Assert.assertTrue(isElementDisplayed(factory.homePage().tekschoolLogo));
		Assert.assertTrue(isElementDisplayed(factory.homePage().cartQuantity)); 
		logger.info("cart quantity icone is changed");
	   
	} 
	
	@And("User click on Cart option")
	public void userClickOnCartOption() { 
		click(factory.homePage().cartOption);
		logger.info("user clicked on cart option");
	    
	}
	@And("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	   click(factory.homePage().proceedBtn); 
	   logger.info("user clicked on proceed checkout button");
	}
	@And("User click Add a new address for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
	   click(factory.homePage().orderAddressbtn); 
	   logger.info("user clicked on new address link for shipping address");
	} 
	
	 @And("User fill new address form information")
	 public void userFillNewAddressFormWithInformation(DataTable dataTable) {  
		 List<Map<String, String>> address = dataTable.asMaps(String.class,String.class); 
		  selectByVisibleText(factory.accountPage().counrtyDb, address.get(0).get("country")); 
		  sendText(factory.accountPage().addressNameField, address.get(0).get("fullName")); 
		  sendText(factory.accountPage().addressphoneField, address.get(0).get("phoneNumber")); 
		  sendText(factory.accountPage().streetField, address.get(0).get("streetAddress"));  
		  sendText(factory.accountPage().apartField, address.get(0).get("apt"));  
		  sendText(factory.accountPage().cityField, address.get(0).get("city")); 
		  selectByVisibleText(factory.accountPage().stateField, address.get(0).get("state")); 
		  sendText(factory.accountPage().zipCodField, address.get(0).get("zipCode")); 
		  logger.info("user feild address information");
		
		 
	 }  
	 
	 @And("User click Add  Address button") 
	 public void userClickAddAddressButton() {  
		 click(factory.accountPage().addressBtn); 
		
		 logger.info("user clicked address button");
		 
	 }
	@And("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() { 
		clickElementWithJS(factory.homePage().orderPaymentBtn); 
	    logger.info("user clicked add new cridet cart for payment method");
	} 
	 @And("User fill Debit card information") 
	 public void userFillDebitCardInformation(DataTable dataTable) {  
		 List<Map<String, String>> orderCard = dataTable.asMaps(String.class,String.class); 
		 sendText(factory.accountPage().cardNumInput, orderCard.get(0).get("cardNumber")); 
		 sendText(factory.accountPage().nameOnTheCard, orderCard.get(0).get("nameOnCard")); 
		 selectByVisibleText(factory.accountPage().expMonthInput, orderCard.get(0).get("expirationMonth"));
		 selectByVisibleText(factory.accountPage().expYearInput, orderCard.get(0).get("expirationYear")); 
		 sendText(factory.accountPage().securityCode, orderCard.get(0).get("securityCode")); 
		 logger.info("user filled  order card information");
		 
	 } 
	 @And("User click on Add card button") 
	 public void userClickOnAddCardButton() {  
		 click(factory.homePage().paymentBtn); 
		 logger.info("user clicked on add card button");
		 
	 }
	@And("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
	   click(factory.homePage().placeOrderBtn); 
	   logger.info("user clicked place your order");
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String message) {  
		String actualMessage = message;
		String expectedMessage = "Order Placed, Thanks";
		Assert.assertEquals(actualMessage, expectedMessage );
		Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedMessage)); 	
		logger.info("message displyed");
		
	    
	}

}

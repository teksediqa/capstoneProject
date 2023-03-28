package tek.sdet.framework.steps;



import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;



public class AccountSteps extends CommonUtility{ 
	
	POMFactory factory = new POMFactory(); 
	
	@When("User click on Account option")
	public void userClickOnAccountOption() { 
		click(factory.homePage().accountOption);
	} 
	
	
	//Update Account Information-------------------------
	 
	@And("User update Name {string} and Phone {string}") 
	public void userUpdateNameAndPhone(String NameValue, String PhoneValue  ) { 
		clearTextUsingSendKeys(factory.accountPage().updateAccountNameField);
		sendText(factory.accountPage().updateAccountNameField,NameValue); 
		clearTextUsingSendKeys(factory.accountPage().updatephonFeild);
		sendText(factory.accountPage().updatephonFeild,PhoneValue );
		logger.info("user updated phone number");
	}

	
	
	@And("User click on Update button") 
	public void userClickOnUpdateButton() {  
		click(factory.accountPage().updateButton); 
		logger.info("user clicked on update button");
		
	} 
	
	@Then("User profile information should be updated")
	
	public void userProfileInformationShouldBeUpdated() {  
		waitTillPresence(factory.accountPage().personalInfoUpdateMassage); 
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateMassage));
		String actualMessage = factory.accountPage().personalInfoUpdateMassage.getText();
		String expectedMessage = "Personal Information Updated Successfully"; 
		Assert.assertEquals(expectedMessage, actualMessage ); 
		logger.info("User Profile Information Updated");
	}  
	
	//update password---------------------------
	
	@And("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {  
		List<Map<String, String>> pass = dataTable.asMaps(String.class,String.class); 
		sendText(factory.accountPage().updatePrevoiusPassField, pass.get(0).get("previousPassword")); 
		sendText(factory.accountPage().updateNewPassField, pass.get(0).get("newPassword")); 
		sendText(factory.accountPage().updateConfirmPassField, pass.get(0).get("confirmPassword"));
		logger.info("user entered below information");
	} 
	
	@And("User click on Change Password button")
	public void userclickOnChangePasswordButton() {  
		click(factory.accountPage().changePasswordBtn);  
		logger.info("user clicked on change password button"); 
		
		
	}  
	
	 
	@Then("a message should be displayed ‘Password Updated Successfully")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() {
	    // Write code here that turns the phrase above into concrete actions
		waitTillPresence(factory.accountPage().passwordUpdatedSuccessfully);
		logger.info("message displayed");
	}
	
	//Add Payment Method-------------------------------- 
	
	
	 @And("User click on Add a payment method link") 
	 public void userClickOnAddAPaymentMethodLink() { 
		 click(factory.accountPage().addPaymentMethod); 
		 logger.info("user clicked on payment method");
			 
	 } 
	 
	 @And("User fill Debit or credit card information")
	 public void userFillDebitOrCreditCardInformation(DataTable dataTable) {  
		 List<Map<String, String>> card = dataTable.asMaps(String.class,String.class); 
		 sendText(factory.accountPage().cardNumInput, card.get(0).get("cardNumber")); 
		 sendText(factory.accountPage().nameOnTheCard, card.get(0).get("nameOnCard")); 
		 selectByVisibleText(factory.accountPage().expMonthInput, card.get(0).get("expirationMonth"));
		 selectByVisibleText(factory.accountPage().expYearInput, card.get(0).get("expirationYear")); 
		 sendText(factory.accountPage().securityCode, card.get(0).get("securityCode")); 
		 logger.info("user filled card information");
		 
		 
	 } 
	 
	 @And("User click on Add your card button") 
	  public void userClickOnAddYourCardbutton() { 
		click(factory.accountPage().paymentBtn); 
		logger.info("user clicked on add card payment");
		 
	 }  
	 
	 @Then("a message should be displayed ‘Payment Method added successfully")
	 public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() { 
		 waitTillPresence(factory.accountPage().paymentAddedSuccessfully); 
		 logger.info("message displyed");
	     
	   
	 }   
	 
	 
	 // Edit Payment method---------------- 
	 
	 
	 @And("User click on master card image") 
	 public void userClickeOnMasterCardImage() { 
		 click(factory.accountPage().cardImage); 
		 logger.info("user clicked on master card");
	 }
	 
	 @And("User click on Edit option of card section")
	 public void userClickOnEditOptionOfCardSection() { 
		 click(factory.accountPage().editbutton); 
		 clearTextUsingSendKeys(factory.accountPage().cardNumber); 
		 clearTextUsingSendKeys(factory.accountPage().namecard);
		 clearTextUsingSendKeys(factory.accountPage().codeInput);
		 logger.info("uer clicked on edite button");
		 
	 } 
	 
	 @And("User edit information with below data")
	 public void userEditInformationWithBelowData(DataTable dataTable) { 
		 List<Map<String, String>> editCard = dataTable.asMaps(String.class,String.class);
		 sendText(factory.accountPage().cardNumber, editCard.get(0).get("cardNumber")); 
		 sendText(factory.accountPage().namecard, editCard.get(0).get("nameOnCard")); 
		 selectByVisibleText(factory.accountPage().expirationMonth, editCard.get(0).get("expirationMonth")); 
		 selectByVisibleText(factory.accountPage().expirationYear, editCard.get(0).get("expirationYear")); 
		 sendText(factory.accountPage().codeInput, editCard.get(0).get("securityCode")); 
		 logger.info("user edited card information");	  
	 } 
	 
	 @And("User click on Update Your Card button") 
	 public void userClickOnUpdateYourCardButton() { 
		 click(factory.accountPage().updateCard); 
		 logger.info("user clicked on update button"); 
	 }
	 
	 @Then("a message should be displayed ‘Payment Method updated Successfully")
	 public void aMessageShoudBeDisplyedPaymentMethodUpdatedSuccessfully() { 
		 waitTillPresence(factory.accountPage().updateSuccessfully); 
		 logger.info("message diplyed update successfullly");
	 }  
	 
	// Remove car Information-------------------------------------------
	 
	 @When("User click on card option")
	 public void userClickOnMasterCardPicture() { 
		 click(factory.accountPage().masterCardPicture); 
		 logger.info("user clicked card");
	 } 
	 
	 @And("User click on remove option of card section") 
	 public void userClickedOnRemoveOptionOfCardSection() { 
		 click(factory.accountPage().removeButton); 
		 logger.info("user clicked on remove button");
		 
	 } 
	 
	  @Then("Payment details should be removed") 
	  public void paymentDetailsShouldBeRemoved() {  
		 // Assert.assertTrue(isElementDisplayed(factory.accountPage().removeButton));
		//  isElementDisplayed(factory.accountPage().removeButton);  
		  waitTillPresence(factory.accountPage().removeButton); 
		  logger.info("payment details is removed");
		  
	  }
	 
		  
	  
	// Add Addresss-------------------------------------------
	  
	  @And("User click on Add address option") 
	  public void userClickOnAddAddressOption() {  
		  click(factory.accountPage().addAddress); 
		  logger.info("user clicked add address option");
		  
	  } 
	  
	  @And("User fill new address form with below information")
	    public void userFillNewAddressFromwithBelowInformation(DataTable dataTable) { 
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
	    
	  @And("User click Add Your Address button") 
	  public void userClickAddYourAddressButton() {  
		  click(factory.accountPage().addressBtn); 
		  logger.info("user clicked on address button");
		  
	  }
	  @Then("a message should be displayed ‘Address Added Successfully")
	  public void aMessageSouldBeDisplyedAddressAddedSuccessfully() {  
		  waitTillPresence(factory.accountPage().addressAddedSuccessfully); 
		  logger.info("address added successfully");
		  
	  }
	  
	  // Edit Address-------------------------------------------------- 
	  
	  @And("User click on edit address option")
	  public void userClickOnEditAddressOption() {   
		  click(factory.accountPage().editAddressButton); 
		  logger.info("user clicked on edit address"); 
		  
		  
	  }
	    @And("User update new address form with below information")
	    public void userUpdateNewAddressFormWithBelowInformation(DataTable dataTable) {  
	   List<Map<String, String>> editaddress = dataTable.asMaps(String.class,String.class);  
		  clearTextUsingSendKeys(factory.accountPage().editFullName); 
		  clearTextUsingSendKeys(factory.accountPage().editPhoneNum);  
		  clearTextUsingSendKeys(factory.accountPage().editAddressStreet);  
		  clearTextUsingSendKeys(factory.accountPage().editapaartment);  
		  clearTextUsingSendKeys(factory.accountPage().editCity);    
		  clearTextUsingSendKeys(factory.accountPage().editZipcode);  
	   selectByVisibleText(factory.accountPage().editCountryDb, editaddress.get(0).get("country")); 
	   sendText(factory.accountPage().editFullName, editaddress.get(0).get("fullName")); 
		  sendText(factory.accountPage().editPhoneNum, editaddress.get(0).get("phoneNumber")); 
		  sendText(factory.accountPage().editAddressStreet, editaddress.get(0).get("streetAddress"));  
		  sendText(factory.accountPage().editapaartment, editaddress.get(0).get("apt"));  
		  sendText(factory.accountPage().editCity, editaddress.get(0).get("city")); 
		  selectByVisibleText(factory.accountPage().editStateAddress, editaddress.get(0).get("state"));
		  sendText(factory.accountPage().editZipcode, editaddress.get(0).get("zipCode")); 
		  logger.info("user filled new address information");
	    } 
	    
	   @And("User click update Your Address button")
	   public void userClickupdateYourAddressButton() {  
		   click(factory.accountPage().editaddressBtn);
		   logger.info("user clicked update button");
		   
		   
	   }
	   @Then("a message should be displayed ‘Address Updated Successfully") 
	   public void aMessageShouldBeDisplyedAddressUpdatedSuccessfull() { 
		   waitTillPresence(factory.accountPage().addressUpdatedSuccessfully); 
			  logger.info("address updated successfully");
	   } 
	   
	   //Remove address------------------------------------------ 
	   
	   
	   @And("User click on remove option of Address section")
	   public void userClickOnRemoveOptionOfAddressSection() {  
		   click(factory.accountPage().addressRemoveBtn); 
		   logger.info("user removed address details");
		   
	   }
	    @Then("Address details should be removed") 
	    public void addressDetialsShouldBeRemoved() { 
	    	isElementDisplayed(factory.accountPage().addressRemoveBtn); 
	    	logger.info("address is removed");
	    	
	    }

}
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
	
	 
	@Then("a message should be displayed ‘Password Updated Successfully'")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(isElementDisplayed(factory.accountPage().passwordUpdatedSuccessfully));
		String actualMessage = factory.accountPage().passwordUpdatedSuccessfully.getText(); 
		String expectedMessage = "Password Updated Successfully"; 
		Assert.assertEquals(expectedMessage, actualMessage ); ;
		logger.info("message displayed");
	}
	
	
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
		 selectByIndex(factory.accountPage().expMonthInput.(""));
		 sendText(factory.accountPage().expMonthInput, card.get(0).get("expirationMonth")) ; 
		 sendText(factory.accountPage().expYearInput, card.get(0).get("expirationYear")); 
		 sendText(factory.accountPage().securityCode, card.get(0).get("securityCode")); 
		 logger.info("user filled debit card information");
		 
		 
	 } 
	 
	 @And("User click on Add your card button") 
	  public void userClickOnAddYourCardbutton() { 
		click(factory.accountPage().paymentBtn); 
		logger.info("user clicked on add card payment");
		 
	 }  
	 
	 @Then("a message should be displayed ‘Payment Method added successfully")
	 public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
	     
	   
	 } 
	
	 
}
